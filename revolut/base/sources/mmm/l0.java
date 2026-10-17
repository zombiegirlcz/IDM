package mmm;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import le.u1;

/* JADX INFO: loaded from: classes13.dex */
public final class l0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f207282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f207283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f207284c;

    public l0(s0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f207282a = source;
        this.f207283b = new h();
    }

    @Override // mmm.k
    public final h C5() {
        return this.f207283b;
    }

    @Override // mmm.k
    public final int G2(f0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f207284c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            h hVar = this.f207283b;
            int iD = nmm.a.d(hVar, options, true);
            if (iD != -2) {
                if (iD != -1) {
                    hVar.skip(options.f207263a[iD].d());
                    return iD;
                }
            } else if (this.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // mmm.k
    public final byte[] H3() {
        s0 s0Var = this.f207282a;
        h hVar = this.f207283b;
        hVar.R8(s0Var);
        return hVar.o(hVar.f207266b);
    }

    @Override // mmm.k
    public final boolean J() {
        if (this.f207284c) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f207283b;
        return hVar.J() && this.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1;
    }

    @Override // mmm.k
    public final long K9(h sink) {
        h hVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = 0;
        while (true) {
            s0 s0Var = this.f207282a;
            hVar = this.f207283b;
            if (s0Var.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                break;
            }
            long jH = hVar.h();
            if (jH > 0) {
                j2 += jH;
                sink.write(hVar, jH);
            }
        }
        long j3 = hVar.f207266b;
        if (j3 <= 0) {
            return j2;
        }
        long j5 = j2 + j3;
        sink.write(hVar, j3);
        return j5;
    }

    @Override // mmm.k
    public final long M7(m targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f207284c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            h hVar = this.f207283b;
            long jL = hVar.l(jMax, targetBytes);
            if (jL != -1) {
                return jL;
            }
            long j2 = hVar.f207266b;
            if (this.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j2);
        }
    }

    @Override // mmm.k
    public final short S2() throws EOFException {
        b(2L);
        return this.f207283b.S2();
    }

    @Override // mmm.k
    public final void T7(h sink, long j2) throws EOFException {
        h hVar = this.f207283b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            b(j2);
            hVar.T7(sink, j2);
        } catch (EOFException e) {
            sink.R8(hVar);
            throw e;
        }
    }

    @Override // mmm.k
    public final long W3(m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return nmm.o.d(this, bytes);
    }

    @Override // mmm.k
    public final InputStream Z9() {
        return new i(this, 1);
    }

    @Override // mmm.k
    public final boolean a(long j2) {
        h hVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        if (this.f207284c) {
            throw new IllegalStateException("closed");
        }
        do {
            hVar = this.f207283b;
            if (hVar.f207266b >= j2) {
                return true;
            }
        } while (this.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) != -1);
        return false;
    }

    @Override // mmm.k
    public final void b(long j2) throws EOFException {
        if (!a(j2)) {
            throw new EOFException();
        }
    }

    @Override // mmm.k
    public final m c(long j2) throws EOFException {
        b(j2);
        return this.f207283b.c(j2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f207284c) {
            return;
        }
        this.f207284c = true;
        this.f207282a.close();
        this.f207283b.f();
    }

    public final long d(byte b4, long j2, long j3) {
        if (this.f207284c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j3) {
            throw new IllegalArgumentException(p.a.m(j3, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j3) {
            h hVar = this.f207283b;
            byte b5 = b4;
            long j5 = j3;
            long jK = hVar.k(b5, jMax, j5);
            if (jK != -1) {
                return jK;
            }
            long j16 = hVar.f207266b;
            if (j16 >= j5 || this.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                break;
            }
            jMax = Math.max(jMax, j16);
            b4 = b5;
            j3 = j5;
        }
        return -1L;
    }

    @Override // mmm.k
    public final String e(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "limit < 0: ").toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long jD = d((byte) 10, 0L, j3);
        h hVar = this.f207283b;
        if (jD != -1) {
            return nmm.a.c(hVar, jD);
        }
        if (j3 < Long.MAX_VALUE && a(j3) && hVar.j(j3 - 1) == 13 && a(j3 + 1) && hVar.j(j3) == 10) {
            return nmm.a.c(hVar, j3);
        }
        h hVar2 = new h();
        hVar.i(hVar2, 0L, Math.min(32, hVar.f207266b));
        throw new EOFException("\\n not found: limit=" + Math.min(hVar.f207266b, j2) + " content=" + hVar2.c(hVar2.f207266b).e() + (char) 8230);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r1 = new mmm.h();
        r1.x(r8);
        r1.w(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r2 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.q()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mmm.l0.f():long");
    }

    public final long g() throws EOFException {
        b(8L);
        long j2 = this.f207283b.readLong();
        return ((j2 & 255) << 56) | (((-72057594037927936L) & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }

    @Override // mmm.k, mmm.j
    public final h getBuffer() {
        return this.f207283b;
    }

    public final String h(long j2) throws EOFException {
        b(j2);
        h hVar = this.f207283b;
        hVar.getClass();
        return hVar.p(j2, Charsets.UTF_8);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f207284c;
    }

    @Override // mmm.k
    public final String m4(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        s0 s0Var = this.f207282a;
        h hVar = this.f207283b;
        hVar.R8(s0Var);
        return hVar.m4(charset);
    }

    @Override // mmm.k
    public final l0 peek() {
        return u1.c(new i0(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        h hVar = this.f207283b;
        if (hVar.f207266b == 0 && this.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
            return -1;
        }
        return hVar.read(sink);
    }

    @Override // mmm.k
    public final byte readByte() throws EOFException {
        b(1L);
        return this.f207283b.readByte();
    }

    @Override // mmm.k
    public final void readFully(byte[] sink) throws EOFException {
        h hVar = this.f207283b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            b(sink.length);
            hVar.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j2 = hVar.f207266b;
                if (j2 <= 0) {
                    throw e;
                }
                int i2 = hVar.read(sink, i, (int) j2);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // mmm.k
    public final int readInt() throws EOFException {
        b(4L);
        return this.f207283b.readInt();
    }

    @Override // mmm.k
    public final long readLong() throws EOFException {
        b(8L);
        return this.f207283b.readLong();
    }

    @Override // mmm.k
    public final short readShort() throws EOFException {
        b(2L);
        return this.f207283b.readShort();
    }

    @Override // mmm.k
    public final void skip(long j2) throws EOFException {
        if (this.f207284c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            h hVar = this.f207283b;
            if (hVar.f207266b == 0 && this.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, hVar.f207266b);
            hVar.skip(jMin);
            j2 -= jMin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[LOOP:2: B:22:0x0071->B:38:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t5() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mmm.l0.t5():long");
    }

    @Override // mmm.k
    public final int t9() throws EOFException {
        b(4L);
        return this.f207283b.t9();
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f207282a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f207282a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // mmm.k
    public final m x4() {
        s0 s0Var = this.f207282a;
        h hVar = this.f207283b;
        hVar.R8(s0Var);
        return hVar.c(hVar.f207266b);
    }

    @Override // mmm.k
    public final boolean y3(long j2, m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int iD = bytes.d();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f207284c) {
            throw new IllegalStateException("closed");
        }
        if (iD >= 0 && iD <= bytes.d()) {
            return iD == 0 || nmm.o.c(this, bytes, iD, 1L) != -1;
        }
        return false;
    }

    @Override // mmm.s0
    public final long read(h sink, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 >= 0) {
            if (!this.f207284c) {
                h hVar = this.f207283b;
                if (hVar.f207266b == 0) {
                    if (j2 == 0) {
                        return 0L;
                    }
                    if (this.f207282a.read(hVar, FileAppender.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1L;
                    }
                }
                return hVar.read(sink, Math.min(j2, hVar.f207266b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
    }
}
