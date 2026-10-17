package androidx.media3.exoplayer.util;

import a0.d;
import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SntpClient {
    private static long elapsedRealtimeOffsetMs = 0;
    private static boolean isInitialized = false;
    private static long lastUpdateElapsedRealtime = -9223372036854775807L;
    private static long maxElapsedTimeUntilUpdateMs = -9223372036854775807L;
    private static int timeoutMs = 1000;
    private static String ntpHost = "time.android.com";
    private static final Object loaderLock = new Object();
    private static final Object valueLock = new Object();

    public interface InitializationCallback {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    public static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        private final InitializationCallback callback;

        public NtpTimeCallback(InitializationCallback initializationCallback) {
            this.callback = initializationCallback;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long j2, long j3, boolean z) {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long j2, long j3) {
            if (this.callback != null) {
                if (SntpClient.isInitialized()) {
                    this.callback.onInitialized();
                } else {
                    this.callback.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j2, long j3, IOException iOException, int i) {
            InitializationCallback initializationCallback = this.callback;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }
    }

    public static final class NtpTimeLoadable implements Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws IOException {
            synchronized (SntpClient.loaderLock) {
                synchronized (SntpClient.valueLock) {
                    if (SntpClient.isInitialized) {
                        return;
                    }
                    long jLoadNtpTimeOffsetMs = SntpClient.loadNtpTimeOffsetMs();
                    synchronized (SntpClient.valueLock) {
                        long unused = SntpClient.lastUpdateElapsedRealtime = SystemClock.elapsedRealtime();
                        long unused2 = SntpClient.elapsedRealtimeOffsetMs = jLoadNtpTimeOffsetMs;
                        boolean unused3 = SntpClient.isInitialized = true;
                    }
                }
            }
        }
    }

    private static void checkValidServerReply(byte b4, byte b5, int i, long j2) throws IOException {
        if (b4 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b5 != 4 && b5 != 5) {
            throw new IOException(d.n("SNTP: Untrusted mode: ", b5));
        }
        if (i == 0 || i > 15) {
            throw new IOException(d.n("SNTP: Untrusted stratum: ", i));
        }
        if (j2 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j2;
        synchronized (valueLock) {
            try {
                j2 = isInitialized ? elapsedRealtimeOffsetMs : -9223372036854775807L;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return j2;
    }

    public static String getNtpHost() {
        String str;
        synchronized (valueLock) {
            str = ntpHost;
        }
        return str;
    }

    public static int getTimeoutMs() {
        int i;
        synchronized (valueLock) {
            i = timeoutMs;
        }
        return i;
    }

    public static void initialize(Loader loader, InitializationCallback initializationCallback) {
        if (isInitialized()) {
            if (initializationCallback != null) {
                initializationCallback.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.startLoading(new NtpTimeLoadable(), new NtpTimeCallback(initializationCallback), 1);
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (valueLock) {
            try {
                if (lastUpdateElapsedRealtime != -9223372036854775807L && maxElapsedTimeUntilUpdateMs != -9223372036854775807L) {
                    isInitialized = isInitialized && SystemClock.elapsedRealtime() - lastUpdateElapsedRealtime < maxElapsedTimeUntilUpdateMs;
                }
                z = isInitialized;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(getTimeoutMs());
            InetAddress[] allByName = InetAddress.getAllByName(getNtpHost());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i], 123);
                bArr[0] = Ascii.ESC;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                writeTimestamp(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j2 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b4 = bArr[0];
                    int i3 = bArr[1] & UnsignedBytes.MAX_VALUE;
                    long timestamp = readTimestamp(bArr, 24);
                    long timestamp2 = readTimestamp(bArr, 32);
                    long timestamp3 = readTimestamp(bArr, 40);
                    checkValidServerReply((byte) ((b4 >> 6) & 3), (byte) (b4 & 7), i3, timestamp3);
                    long j3 = (j2 + (((timestamp3 - j2) + (timestamp2 - timestamp)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j3;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e;
                    } else {
                        socketTimeoutException.addSuppressed(e);
                    }
                    int i5 = i2 + 1;
                    if (i2 >= 10) {
                        throw ((SocketTimeoutException) Preconditions.checkNotNull(socketTimeoutException));
                    }
                    i++;
                    i2 = i5;
                }
            }
            throw ((SocketTimeoutException) Preconditions.checkNotNull(socketTimeoutException));
        } catch (Throwable th10) {
            try {
                datagramSocket.close();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    private static long read32(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i5 = bArr[i + 2];
        int i6 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & CertificateBody.profileType) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & CertificateBody.profileType) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & CertificateBody.profileType) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & CertificateBody.profileType) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i5) << 8) + ((long) i6);
    }

    private static long readTimestamp(byte[] bArr, int i) {
        long j2 = read32(bArr, i);
        long j3 = read32(bArr, i + 4);
        if (j2 == 0 && j3 == 0) {
            return 0L;
        }
        return ((j3 * 1000) / 4294967296L) + ((j2 - 2208988800L) * 1000);
    }

    private static void writeTimestamp(byte[] bArr, int i, long j2) {
        if (j2 == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j3 = j2 / 1000;
        long j5 = j2 - (j3 * 1000);
        bArr[i] = (byte) (r2 >> 24);
        bArr[i + 1] = (byte) (r2 >> 16);
        bArr[i + 2] = (byte) (r2 >> 8);
        bArr[i + 3] = (byte) (j3 + 2208988800L);
        long j16 = (j5 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j16 >> 24);
        bArr[i + 5] = (byte) (j16 >> 16);
        bArr[i + 6] = (byte) (j16 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }
}
