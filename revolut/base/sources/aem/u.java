package aem;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class u extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3782b;

    public /* synthetic */ u(Object obj2, int i) {
        this.f3781a = i;
        this.f3782b = obj2;
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.f3781a) {
            case 0:
                return ((InputStream) this.f3782b).available();
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f3781a) {
            case 0:
                super.close();
                ((InputStream) this.f3782b).close();
                break;
            default:
                io.ktor.utils.io.n0.a((io.ktor.utils.io.t) this.f3782b);
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        switch (this.f3781a) {
            case 0:
                return ((InputStream) this.f3782b).read();
            default:
                io.ktor.utils.io.t tVar = (io.ktor.utils.io.t) this.f3782b;
                if (!tVar.e()) {
                    if (tVar.c().J()) {
                        skm.e0.E(kotlin.coroutines.g.f186406a, new wem.a(tVar, (Continuation) null, 0));
                    }
                    if (!tVar.e()) {
                        return tVar.c().readByte() & UnsignedBytes.MAX_VALUE;
                    }
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] b4, int i, int i2) throws Throwable {
        switch (this.f3781a) {
            case 0:
                Intrinsics.checkNotNullParameter(b4, "b");
                return ((InputStream) this.f3782b).read(b4, i, i2);
            default:
                Intrinsics.checkNotNullParameter(b4, "b");
                io.ktor.utils.io.t tVar = (io.ktor.utils.io.t) this.f3782b;
                if (!tVar.e()) {
                    if (tVar.c().J()) {
                        skm.e0.E(kotlin.coroutines.g.f186406a, new wem.a(tVar, (Continuation) null, 0));
                    }
                    Intrinsics.checkNotNullParameter(tVar, "<this>");
                    jlm.a aVarC = tVar.c();
                    aVarC.getClass();
                    int iU5 = tVar.c().u5(i, Math.min((int) aVarC.f175871c, i2) + i, b4);
                    if (iU5 >= 0) {
                        return iU5;
                    }
                    if (!tVar.e()) {
                        return 0;
                    }
                }
                return -1;
        }
    }
}
