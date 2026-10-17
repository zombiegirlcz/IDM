package uw;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends InputStream {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelFileDescriptor f283494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParcelFileDescriptor.AutoCloseInputStream f283495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileChannel f283496c;
    public long d;

    public b(ParcelFileDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f283494a = descriptor;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
        this.f283495b = autoCloseInputStream;
        this.f283496c = autoCloseInputStream.getChannel();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f283495b.close();
    }

    public final int d(int i, int i2, byte[] bArr) throws ErrnoException, InterruptedIOException {
        int iPread = Os.pread(this.f283494a.getFileDescriptor(), bArr, i, i2, this.d);
        if (iPread != 0) {
            return iPread;
        }
        return this.f283496c.read(ByteBuffer.wrap(bArr, i, i2), this.d);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] buffer, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (i < 0 || i2 < 0 || i2 > buffer.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        try {
            int iD = d(i, i2, buffer);
            if (iD <= 0) {
                return -1;
            }
            this.d += (long) iD;
            return iD;
        } catch (ErrnoException e) {
            throw new IOException("Failed to read from parcel file descriptor", e);
        } catch (IOException e2) {
            throw new IOException("Failed to read from parcel file descriptor", e2);
        }
    }
}
