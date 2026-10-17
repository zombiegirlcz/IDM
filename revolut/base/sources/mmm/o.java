package mmm;

import java.io.EOFException;
import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f207295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f207296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f207297c;
    public final h d;
    public boolean e;
    public boolean f;

    public o(l0 source, Cipher cipher) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f207295a = source;
        this.f207296b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f207297c = blockSize;
        this.d = new h();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f = true;
        this.f207295a.close();
    }

    @Override // mmm.s0
    public final long read(h sink, long j2) throws BadPaddingException, IllegalBlockSizeException, EOFException, ShortBufferException {
        h hVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return 0L;
        }
        while (true) {
            hVar = this.d;
            if (hVar.f207266b != 0 || this.e) {
                break;
            }
            l0 l0Var = this.f207295a;
            boolean zJ = l0Var.J();
            Cipher cipher = this.f207296b;
            if (zJ) {
                this.e = true;
                int outputSize = cipher.getOutputSize(0);
                if (outputSize != 0) {
                    n0 n0VarU = hVar.u(outputSize);
                    int iDoFinal = cipher.doFinal(n0VarU.f207291a, n0VarU.f207292b);
                    int i = n0VarU.f207293c + iDoFinal;
                    n0VarU.f207293c = i;
                    hVar.f207266b += (long) iDoFinal;
                    if (n0VarU.f207292b == i) {
                        hVar.f207265a = n0VarU.a();
                        o0.a(n0VarU);
                    }
                }
            } else {
                n0 n0Var = l0Var.f207283b.f207265a;
                Intrinsics.h(n0Var);
                int i2 = n0Var.f207293c - n0Var.f207292b;
                int i3 = i2;
                int outputSize2 = cipher.getOutputSize(i2);
                while (true) {
                    if (outputSize2 > 8192) {
                        int i5 = this.f207297c;
                        if (i3 <= i5) {
                            this.e = true;
                            byte[] bArrDoFinal = cipher.doFinal(l0Var.H3());
                            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                            hVar.m3801write(bArrDoFinal);
                            break;
                        }
                        i3 -= i5;
                        outputSize2 = cipher.getOutputSize(i3);
                    } else {
                        n0 n0VarU2 = hVar.u(outputSize2);
                        int iUpdate = cipher.update(n0Var.f207291a, n0Var.f207292b, i3, n0VarU2.f207291a, n0VarU2.f207292b);
                        l0Var.skip(i3);
                        int i6 = n0VarU2.f207293c + iUpdate;
                        n0VarU2.f207293c = i6;
                        hVar.f207266b += (long) iUpdate;
                        if (n0VarU2.f207292b == i6) {
                            hVar.f207265a = n0VarU2.a();
                            o0.a(n0VarU2);
                        }
                    }
                }
            }
        }
        return hVar.read(sink, j2);
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f207295a.f207282a.timeout();
    }
}
