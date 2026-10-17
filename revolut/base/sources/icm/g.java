package icm;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mmm.l0;
import mmm.s0;
import mmm.v0;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f160325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f160326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f160327c;
    public int d;
    public int e;
    public short f;

    public g(l0 l0Var) {
        this.f160325a = l0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // mmm.s0
    public final long read(mmm.h hVar, long j2) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.e;
            l0 l0Var = this.f160325a;
            if (i3 == 0) {
                l0Var.skip(this.f);
                this.f = (short) 0;
                if ((this.f160327c & 4) == 0) {
                    i = this.d;
                    int iA = k.a(l0Var);
                    this.e = iA;
                    this.f160326b = iA;
                    byte b4 = (byte) (l0Var.readByte() & UnsignedBytes.MAX_VALUE);
                    this.f160327c = (byte) (l0Var.readByte() & UnsignedBytes.MAX_VALUE);
                    Logger logger = k.f160337a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(h.a(true, this.d, this.f160326b, b4, this.f160327c));
                    }
                    i2 = l0Var.readInt() & Integer.MAX_VALUE;
                    this.d = i2;
                    if (b4 != 9) {
                        k.c("%s != TYPE_CONTINUATION", Byte.valueOf(b4));
                        throw null;
                    }
                }
            } else {
                long j3 = l0Var.read(hVar, Math.min(j2, i3));
                if (j3 != -1) {
                    this.e -= (int) j3;
                    return j3;
                }
            }
            return -1L;
        } while (i2 == i);
        k.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f160325a.f207282a.timeout();
    }
}
