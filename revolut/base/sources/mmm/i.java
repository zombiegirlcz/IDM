package mmm;

import ch.qos.logback.core.FileAppender;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f207274b;

    public /* synthetic */ i(k kVar, int i) {
        this.f207273a = i;
        this.f207274b = kVar;
    }

    private final void d() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f207273a) {
            case 0:
                jMin = Math.min(((h) this.f207274b).f207266b, Integer.MAX_VALUE);
                break;
            default:
                l0 l0Var = (l0) this.f207274b;
                if (l0Var.f207284c) {
                    throw new IOException("closed");
                }
                jMin = Math.min(l0Var.f207283b.f207266b, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f207273a) {
            case 0:
                break;
            default:
                ((l0) this.f207274b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f207273a) {
            case 0:
                h hVar = (h) this.f207274b;
                if (hVar.f207266b > 0) {
                    return hVar.readByte() & UnsignedBytes.MAX_VALUE;
                }
                return -1;
            default:
                l0 l0Var = (l0) this.f207274b;
                h hVar2 = l0Var.f207283b;
                if (l0Var.f207284c) {
                    throw new IOException("closed");
                }
                if (hVar2.f207266b == 0 && l0Var.f207282a.read(hVar2, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1;
                }
                return hVar2.readByte() & UnsignedBytes.MAX_VALUE;
        }
    }

    public final String toString() {
        switch (this.f207273a) {
            case 0:
                return ((h) this.f207274b) + ".inputStream()";
            default:
                return ((l0) this.f207274b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream out) throws IOException {
        switch (this.f207273a) {
            case 1:
                Intrinsics.checkNotNullParameter(out, "out");
                l0 l0Var = (l0) this.f207274b;
                h hVar = l0Var.f207283b;
                if (l0Var.f207284c) {
                    throw new IOException("closed");
                }
                long j2 = 0;
                while (true) {
                    if (hVar.f207266b == 0 && l0Var.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return j2;
                    }
                    long j3 = hVar.f207266b;
                    j2 += j3;
                    hVar.B(out, j3);
                }
                break;
            default:
                return super.transferTo(out);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i, int i2) throws IOException {
        switch (this.f207273a) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                return ((h) this.f207274b).read(sink, i, i2);
            default:
                Intrinsics.checkNotNullParameter(sink, "data");
                l0 l0Var = (l0) this.f207274b;
                h hVar = l0Var.f207283b;
                if (!l0Var.f207284c) {
                    b.b(sink.length, i, i2);
                    if (hVar.f207266b == 0 && l0Var.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                    return hVar.read(sink, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
