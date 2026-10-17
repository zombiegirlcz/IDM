package mmm;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f207288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f207289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f207290c;
    public boolean d;

    public n(k0 sink, Cipher cipher) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f207288a = sink;
        this.f207289b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f207290c = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.d) {
            return;
        }
        this.d = true;
        Cipher cipher = this.f207289b;
        int outputSize = cipher.getOutputSize(0);
        k0 k0Var = this.f207288a;
        Throwable th10 = null;
        if (outputSize != 0) {
            if (outputSize > 8192) {
                try {
                    byte[] bArrDoFinal = cipher.doFinal();
                    Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                    k0Var.write(bArrDoFinal);
                } catch (Throwable th11) {
                    th10 = th11;
                }
            } else {
                h hVar = k0Var.f207280b;
                n0 n0VarU = hVar.u(outputSize);
                try {
                    int iDoFinal = cipher.doFinal(n0VarU.f207291a, n0VarU.f207293c);
                    n0VarU.f207293c += iDoFinal;
                    hVar.f207266b += (long) iDoFinal;
                } catch (Throwable th12) {
                    th10 = th12;
                }
                if (n0VarU.f207292b == n0VarU.f207293c) {
                    hVar.f207265a = n0VarU.a();
                    o0.a(n0VarU);
                }
            }
        }
        try {
            k0Var.close();
        } catch (Throwable th13) {
            if (th10 == null) {
                th10 = th13;
            }
        }
        if (th10 != null) {
            throw th10;
        }
    }

    @Override // mmm.q0, java.io.Flushable
    public final void flush() {
        this.f207288a.flush();
    }

    @Override // mmm.q0
    public final v0 timeout() {
        return this.f207288a.f207279a.timeout();
    }

    @Override // mmm.q0
    public final void write(h source, long j2) throws ShortBufferException {
        int i;
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.f207266b, 0L, j2);
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        for (long j3 = j2; j3 > 0; j3 -= (long) i) {
            n0 n0Var = source.f207265a;
            Intrinsics.h(n0Var);
            int iMin = (int) Math.min(j3, n0Var.f207293c - n0Var.f207292b);
            k0 k0Var = this.f207288a;
            h hVar = k0Var.f207280b;
            Cipher cipher = this.f207289b;
            int outputSize = cipher.getOutputSize(iMin);
            i = iMin;
            while (true) {
                if (outputSize > 8192) {
                    int i2 = this.f207290c;
                    if (i <= i2) {
                        byte[] bArrUpdate = cipher.update(source.o(j3));
                        Intrinsics.checkNotNullExpressionValue(bArrUpdate, "update(...)");
                        k0Var.write(bArrUpdate);
                        i = (int) j3;
                        break;
                    }
                    i -= i2;
                    outputSize = cipher.getOutputSize(i);
                } else {
                    n0 n0VarU = hVar.u(outputSize);
                    int iUpdate = cipher.update(n0Var.f207291a, n0Var.f207292b, i, n0VarU.f207291a, n0VarU.f207293c);
                    int i3 = n0VarU.f207293c + iUpdate;
                    n0VarU.f207293c = i3;
                    hVar.f207266b += (long) iUpdate;
                    if (n0VarU.f207292b == i3) {
                        hVar.f207265a = n0VarU.a();
                        o0.a(n0VarU);
                    }
                    k0Var.d();
                    source.f207266b -= (long) i;
                    int i5 = n0Var.f207292b + i;
                    n0Var.f207292b = i5;
                    if (i5 == n0Var.f207293c) {
                        source.f207265a = n0Var.a();
                        o0.a(n0Var);
                    }
                }
            }
        }
    }
}
