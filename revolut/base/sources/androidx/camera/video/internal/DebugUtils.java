package androidx.camera.video.internal;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public abstract class DebugUtils {
    public static String byteBufferToHex(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int iPosition = byteBuffer.position();
        try {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return bytesToHexString(bArr);
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static String bytesToHexString(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb6 = new StringBuilder();
        for (byte b4 : bArr) {
            sb6.append(String.format("%02X ", Byte.valueOf(b4)));
        }
        return sb6.toString().trim();
    }

    private static String formatInterval(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j2);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j2 - timeUnit2.toMillis(hours));
        long millis = j2 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j2 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static String getCsdHex(MediaFormat mediaFormat) {
        StringBuilder sb6 = new StringBuilder("{csd-0 = ");
        sb6.append(byteBufferToHex(mediaFormat.getByteBuffer("csd-0")));
        if (mediaFormat.containsKey("csd-1")) {
            sb6.append(", csd-1 = ");
            sb6.append(byteBufferToHex(mediaFormat.getByteBuffer("csd-1")));
        }
        if (mediaFormat.containsKey("csd-2")) {
            sb6.append(", csd-2 = ");
            sb6.append(byteBufferToHex(mediaFormat.getByteBuffer("csd-2")));
        }
        sb6.append("}");
        return sb6.toString();
    }

    public static String readableMs(long j2) {
        return formatInterval(j2);
    }

    public static String readableUs(long j2) {
        return readableMs(TimeUnit.MICROSECONDS.toMillis(j2));
    }
}
