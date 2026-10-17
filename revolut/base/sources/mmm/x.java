package mmm;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes13.dex */
public final class x implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f207312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f207313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f207314c;
    public final a0 d;
    public final CRC32 e;

    public x(k source) {
        Intrinsics.checkNotNullParameter(source, "source");
        l0 l0Var = new l0(source);
        this.f207313b = l0Var;
        Inflater inflater = new Inflater(true);
        this.f207314c = inflater;
        this.d = new a0(l0Var, inflater);
        this.e = new CRC32();
    }

    public static void d(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbL = v0.a.l(str, ": actual 0x");
        sbL.append(kotlin.text.d0.b0(b.d(i2), 8, '0'));
        sbL.append(" != expected 0x");
        sbL.append(kotlin.text.d0.b0(b.d(i), 8, '0'));
        throw new IOException(sbL.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void f(h hVar, long j2, long j3) {
        n0 n0Var = hVar.f207265a;
        Intrinsics.h(n0Var);
        while (true) {
            int i = n0Var.f207293c;
            int i2 = n0Var.f207292b;
            if (j2 < i - i2) {
                break;
            }
            j2 -= (long) (i - i2);
            n0Var = n0Var.f;
            Intrinsics.h(n0Var);
        }
        while (j3 > 0) {
            int i3 = (int) (((long) n0Var.f207292b) + j2);
            int iMin = (int) Math.min(n0Var.f207293c - i3, j3);
            this.e.update(n0Var.f207291a, i3, iMin);
            j3 -= (long) iMin;
            n0Var = n0Var.f;
            Intrinsics.h(n0Var);
            j2 = 0;
        }
    }

    @Override // mmm.s0
    public final long read(h sink, long j2) throws IOException {
        x xVar = this;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        byte b4 = xVar.f207312a;
        CRC32 crc32 = xVar.e;
        l0 l0Var = xVar.f207313b;
        if (b4 == 0) {
            l0Var.b(10L);
            h hVar = l0Var.f207283b;
            byte bJ = hVar.j(3L);
            boolean z = ((bJ >> 1) & 1) == 1;
            if (z) {
                xVar.f(hVar, 0L, 10L);
            }
            d(8075, l0Var.readShort(), "ID1ID2");
            l0Var.skip(8L);
            if (((bJ >> 2) & 1) == 1) {
                l0Var.b(2L);
                if (z) {
                    f(hVar, 0L, 2L);
                }
                long jS2 = hVar.S2() & HPKE.aead_EXPORT_ONLY;
                l0Var.b(jS2);
                if (z) {
                    f(hVar, 0L, jS2);
                }
                l0Var.skip(jS2);
            }
            if (((bJ >> 3) & 1) == 1) {
                long jD = l0Var.d((byte) 0, 0L, Long.MAX_VALUE);
                if (jD == -1) {
                    throw new EOFException();
                }
                if (z) {
                    f(hVar, 0L, jD + 1);
                }
                l0Var.skip(jD + 1);
            }
            if (((bJ >> 4) & 1) == 1) {
                long jD2 = l0Var.d((byte) 0, 0L, Long.MAX_VALUE);
                if (jD2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    xVar = this;
                    xVar.f(hVar, 0L, jD2 + 1);
                } else {
                    xVar = this;
                }
                l0Var.skip(jD2 + 1);
            } else {
                xVar = this;
            }
            if (z) {
                d(l0Var.S2(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            xVar.f207312a = (byte) 1;
        }
        if (xVar.f207312a == 1) {
            long j3 = sink.f207266b;
            long j5 = xVar.d.read(sink, j2);
            if (j5 != -1) {
                xVar.f(sink, j3, j5);
                return j5;
            }
            xVar.f207312a = (byte) 2;
        }
        if (xVar.f207312a == 2) {
            d(l0Var.t9(), (int) crc32.getValue(), "CRC");
            d(l0Var.t9(), (int) xVar.f207314c.getBytesWritten(), "ISIZE");
            xVar.f207312a = (byte) 3;
            if (!l0Var.J()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f207313b.f207282a.timeout();
    }
}
