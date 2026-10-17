package l8;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class c0 extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f192723a;

    public c0(ByteBuffer byteBuffer) {
        this.f192723a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f192723a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f192723a;
        if (j2 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j2);
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
