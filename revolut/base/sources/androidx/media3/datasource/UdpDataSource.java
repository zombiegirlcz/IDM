package androidx.media3.datasource;

import android.net.Uri;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.common.base.Preconditions;
import grl.b4;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes15.dex */
public final class UdpDataSource extends BaseDataSource {
    private InetAddress address;
    private MulticastSocket multicastSocket;
    private boolean opened;
    private final DatagramPacket packet;
    private final byte[] packetBuffer;
    private int packetRemaining;
    private DatagramSocket socket;
    private final int socketTimeoutMillis;

    /* JADX INFO: renamed from: uri, reason: collision with root package name */
    private Uri f7469uri;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th10, int i) {
            super(th10, i);
        }
    }

    public UdpDataSource() {
        this(b4.EXPIRED_OR_INVALID_KEY_VALUE);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.f7469uri = null;
        MulticastSocket multicastSocket = this.multicastSocket;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) Preconditions.checkNotNull(this.address));
            } catch (IOException unused) {
            }
            this.multicastSocket = null;
        }
        DatagramSocket datagramSocket = this.socket;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.socket = null;
        }
        this.address = null;
        this.packetRemaining = 0;
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.f7469uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws UdpDataSourceException {
        Uri uri2 = dataSpec.f7466uri;
        this.f7469uri = uri2;
        String str = (String) Preconditions.checkNotNull(uri2.getHost());
        int port = this.f7469uri.getPort();
        transferInitializing(dataSpec);
        try {
            this.address = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.address, port);
            if (this.address.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.multicastSocket = multicastSocket;
                multicastSocket.joinGroup(this.address);
                this.socket = this.multicastSocket;
            } else {
                this.socket = new DatagramSocket(inetSocketAddress);
            }
            this.socket.setSoTimeout(this.socketTimeoutMillis);
            this.opened = true;
            transferStarted(dataSpec);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(e2, 2006);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.packetRemaining == 0) {
            try {
                ((DatagramSocket) Preconditions.checkNotNull(this.socket)).receive(this.packet);
                int length = this.packet.getLength();
                this.packetRemaining = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = this.packet.getLength();
        int i3 = this.packetRemaining;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.packetBuffer, length2 - i3, bArr, i, iMin);
        this.packetRemaining -= iMin;
        return iMin;
    }

    public UdpDataSource(int i) {
        this(i, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.socketTimeoutMillis = i2;
        byte[] bArr = new byte[i];
        this.packetBuffer = bArr;
        this.packet = new DatagramPacket(bArr, 0, i);
    }
}
