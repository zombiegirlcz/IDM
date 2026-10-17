package mmm;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import gcm.y3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import le.u1;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements k, j, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0 f207265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f207266b;

    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f207267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f207268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n0 f207269c;
        public byte[] e;
        public long d = -1;
        public int f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f207270g = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f207267a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f207267a = null;
            this.f207269c = null;
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.f207270g = -1;
        }

        public final void d(long j2) {
            h hVar = this.f207267a;
            if (hVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f207268b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j3 = hVar.f207266b;
            if (j2 <= j3) {
                if (j2 < 0) {
                    throw new IllegalArgumentException(p.a.m(j2, "newSize < 0: ").toString());
                }
                long j5 = j3 - j2;
                while (true) {
                    if (j5 <= 0) {
                        break;
                    }
                    n0 n0Var = hVar.f207265a;
                    Intrinsics.h(n0Var);
                    n0 n0Var2 = n0Var.f207294g;
                    Intrinsics.h(n0Var2);
                    int i = n0Var2.f207293c;
                    long j16 = i - n0Var2.f207292b;
                    if (j16 > j5) {
                        n0Var2.f207293c = i - ((int) j5);
                        break;
                    } else {
                        hVar.f207265a = n0Var2.a();
                        o0.a(n0Var2);
                        j5 -= j16;
                    }
                }
                this.f207269c = null;
                this.d = j2;
                this.e = null;
                this.f = -1;
                this.f207270g = -1;
            } else if (j2 > j3) {
                long j22 = j2 - j3;
                int i2 = 1;
                boolean z = true;
                for (long j42 = 0; j22 > j42; j42 = 0) {
                    n0 n0VarU = hVar.u(i2);
                    int iMin = (int) Math.min(j22, 8192 - n0VarU.f207293c);
                    int i3 = n0VarU.f207293c + iMin;
                    n0VarU.f207293c = i3;
                    j22 -= (long) iMin;
                    if (z) {
                        this.f207269c = n0VarU;
                        this.d = j3;
                        this.e = n0VarU.f207291a;
                        this.f = i3 - iMin;
                        this.f207270g = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            hVar.f207266b = j2;
        }

        public final int f(long j2) {
            h hVar = this.f207267a;
            if (hVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j2 >= -1) {
                long j3 = hVar.f207266b;
                if (j2 <= j3) {
                    if (j2 == -1 || j2 == j3) {
                        this.f207269c = null;
                        this.d = j2;
                        this.e = null;
                        this.f = -1;
                        this.f207270g = -1;
                        return -1;
                    }
                    n0 n0Var = hVar.f207265a;
                    n0 n0Var2 = this.f207269c;
                    long j5 = 0;
                    if (n0Var2 != null) {
                        long j16 = this.d - ((long) (this.f - n0Var2.f207292b));
                        if (j16 > j2) {
                            n0Var2 = n0Var;
                            n0Var = n0Var2;
                            j3 = j16;
                        } else {
                            j5 = j16;
                        }
                    } else {
                        n0Var2 = n0Var;
                    }
                    if (j3 - j2 > j2 - j5) {
                        while (true) {
                            Intrinsics.h(n0Var2);
                            long j22 = ((long) (n0Var2.f207293c - n0Var2.f207292b)) + j5;
                            if (j2 < j22) {
                                break;
                            }
                            n0Var2 = n0Var2.f;
                            j5 = j22;
                        }
                    } else {
                        while (j3 > j2) {
                            Intrinsics.h(n0Var);
                            n0Var = n0Var.f207294g;
                            Intrinsics.h(n0Var);
                            j3 -= (long) (n0Var.f207293c - n0Var.f207292b);
                        }
                        n0Var2 = n0Var;
                        j5 = j3;
                    }
                    if (this.f207268b) {
                        Intrinsics.h(n0Var2);
                        if (n0Var2.d) {
                            byte[] bArr = n0Var2.f207291a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                            n0 n0Var3 = new n0(bArrCopyOf, n0Var2.f207292b, n0Var2.f207293c, false, true);
                            if (hVar.f207265a == n0Var2) {
                                hVar.f207265a = n0Var3;
                            }
                            n0Var2.b(n0Var3);
                            n0 n0Var4 = n0Var3.f207294g;
                            Intrinsics.h(n0Var4);
                            n0Var4.a();
                            n0Var2 = n0Var3;
                        }
                    }
                    this.f207269c = n0Var2;
                    this.d = j2;
                    Intrinsics.h(n0Var2);
                    this.e = n0Var2.f207291a;
                    int i = n0Var2.f207292b + ((int) (j2 - j5));
                    this.f = i;
                    int i2 = n0Var2.f207293c;
                    this.f207270g = i2;
                    return i2 - i;
                }
            }
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "offset=", " > size=");
            sbV.append(hVar.f207266b);
            throw new ArrayIndexOutOfBoundsException(sbV.toString());
        }
    }

    public final void A(int i) {
        n0 n0VarU = u(2);
        byte[] bArr = n0VarU.f207291a;
        int i2 = n0VarU.f207293c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        n0VarU.f207293c = i2 + 2;
        this.f207266b += 2;
    }

    public final void B(OutputStream out, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        b.b(this.f207266b, 0L, j2);
        n0 n0Var = this.f207265a;
        long j3 = j2;
        while (j3 > 0) {
            Intrinsics.h(n0Var);
            int iMin = (int) Math.min(j3, n0Var.f207293c - n0Var.f207292b);
            out.write(n0Var.f207291a, n0Var.f207292b, iMin);
            int i = n0Var.f207292b + iMin;
            n0Var.f207292b = i;
            long j5 = iMin;
            this.f207266b -= j5;
            j3 -= j5;
            if (i == n0Var.f207293c) {
                n0 n0VarA = n0Var.a();
                this.f207265a = n0VarA;
                o0.a(n0Var);
                n0Var = n0VarA;
            }
        }
    }

    public final void C(int i, int i2, String string) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(a0.d.n("beginIndex < 0: ", i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a0.d.g(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > string.length()) {
            StringBuilder sbW = a0.d.w(i2, "endIndex > string.length: ", " > ");
            sbW.append(string.length());
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                n0 n0VarU = u(1);
                byte[] bArr = n0VarU.f207291a;
                int i3 = n0VarU.f207293c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i5 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i5;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i5 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i6 = n0VarU.f207293c;
                int i21 = (i3 + i) - i6;
                n0VarU.f207293c = i6 + i21;
                this.f207266b += (long) i21;
            } else {
                if (cCharAt2 < 2048) {
                    n0 n0VarU2 = u(2);
                    byte[] bArr2 = n0VarU2.f207291a;
                    int i22 = n0VarU2.f207293c;
                    bArr2[i22] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i22 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    n0VarU2.f207293c = i22 + 2;
                    this.f207266b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    n0 n0VarU3 = u(3);
                    byte[] bArr3 = n0VarU3.f207291a;
                    int i32 = n0VarU3.f207293c;
                    bArr3[i32] = (byte) ((cCharAt2 >> '\f') | BERTags.FLAGS);
                    bArr3[i32 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i32 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    n0VarU3.f207293c = i32 + 3;
                    this.f207266b += 3;
                } else {
                    int i33 = i + 1;
                    char cCharAt3 = i33 < i2 ? string.charAt(i33) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        w(63);
                        i = i33;
                    } else {
                        int i43 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        n0 n0VarU4 = u(4);
                        byte[] bArr4 = n0VarU4.f207291a;
                        int i59 = n0VarU4.f207293c;
                        bArr4[i59] = (byte) ((i43 >> 18) | 240);
                        bArr4[i59 + 1] = (byte) (((i43 >> 12) & 63) | 128);
                        bArr4[i59 + 2] = (byte) (((i43 >> 6) & 63) | 128);
                        bArr4[i59 + 3] = (byte) ((i43 & 63) | 128);
                        n0VarU4.f207293c = i59 + 4;
                        this.f207266b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // mmm.k
    public final h C5() {
        return this;
    }

    public final void D(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        C(0, string.length(), string);
    }

    public final void E(int i) {
        if (i < 128) {
            w(i);
            return;
        }
        if (i < 2048) {
            n0 n0VarU = u(2);
            byte[] bArr = n0VarU.f207291a;
            int i2 = n0VarU.f207293c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            n0VarU.f207293c = i2 + 2;
            this.f207266b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            w(63);
            return;
        }
        if (i < 65536) {
            n0 n0VarU2 = u(3);
            byte[] bArr2 = n0VarU2.f207291a;
            int i3 = n0VarU2.f207293c;
            bArr2[i3] = (byte) ((i >> 12) | BERTags.FLAGS);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            n0VarU2.f207293c = i3 + 3;
            this.f207266b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.d(i)));
        }
        n0 n0VarU3 = u(4);
        byte[] bArr3 = n0VarU3.f207291a;
        int i5 = n0VarU3.f207293c;
        bArr3[i5] = (byte) ((i >> 18) | 240);
        bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i5 + 3] = (byte) ((i & 63) | 128);
        n0VarU3.f207293c = i5 + 4;
        this.f207266b += 4;
    }

    @Override // mmm.k
    public final int G2(f0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iD = nmm.a.d(this, options, false);
        if (iD == -1) {
            return -1;
        }
        skip(options.f207263a[iD].d());
        return iD;
    }

    @Override // mmm.k
    public final byte[] H3() {
        return o(this.f207266b);
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j I8(m mVar) {
        v(mVar);
        return this;
    }

    @Override // mmm.k
    public final boolean J() {
        return this.f207266b == 0;
    }

    @Override // mmm.k
    public final long K9(h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.f207266b;
        if (j2 > 0) {
            sink.write(this, j2);
        }
        return j2;
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j L5(int i) {
        E(i);
        return this;
    }

    @Override // mmm.k
    public final long M7(m targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return l(0L, targetBytes);
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j N9(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    @Override // mmm.j
    public final long R8(s0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = 0;
        while (true) {
            long j3 = source.read(this, FileAppender.DEFAULT_BUFFER_SIZE);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
        }
    }

    @Override // mmm.k
    public final short S2() throws EOFException {
        short s2 = readShort();
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    @Override // mmm.k
    public final void T7(h sink, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j3 = this.f207266b;
        if (j3 >= j2) {
            sink.write(this, j2);
        } else {
            sink.write(this, j3);
            throw new EOFException();
        }
    }

    @Override // mmm.k
    public final long W3(m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        byte[] bArr = nmm.a.f217392a;
        return nmm.a.a(this, bytes, 0L, Long.MAX_VALUE, bytes.d());
    }

    @Override // mmm.j
    public final OutputStream W9() {
        return new y3(this, 1);
    }

    @Override // mmm.k
    public final InputStream Z9() {
        return new i(this, 0);
    }

    @Override // mmm.k
    public final boolean a(long j2) {
        return this.f207266b >= j2;
    }

    @Override // mmm.k
    public final void b(long j2) throws EOFException {
        if (this.f207266b < j2) {
            throw new EOFException();
        }
    }

    @Override // mmm.k
    public final m c(long j2) throws EOFException {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount: ").toString());
        }
        if (this.f207266b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new m(o(j2));
        }
        m mVarT = t((int) j2);
        skip(j2);
        return mVarT;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, mmm.q0
    public final void close() {
    }

    @Override // mmm.k
    public final String e(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "limit < 0: ").toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long jK = k((byte) 10, 0L, j3);
        if (jK != -1) {
            return nmm.a.c(this, jK);
        }
        if (j3 < this.f207266b && j(j3 - 1) == 13 && j(j3) == 10) {
            return nmm.a.c(this, j3);
        }
        h hVar = new h();
        i(hVar, 0L, Math.min(32, this.f207266b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f207266b, j2) + " content=" + hVar.c(hVar.f207266b).e() + (char) 8230);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        long j2 = this.f207266b;
        h hVar = (h) obj2;
        if (j2 != hVar.f207266b) {
            return false;
        }
        if (j2 == 0) {
            return true;
        }
        n0 n0Var = this.f207265a;
        Intrinsics.h(n0Var);
        n0 n0Var2 = hVar.f207265a;
        Intrinsics.h(n0Var2);
        int i = n0Var.f207292b;
        int i2 = n0Var2.f207292b;
        long j3 = 0;
        while (j3 < this.f207266b) {
            long jMin = Math.min(n0Var.f207293c - i, n0Var2.f207293c - i2);
            long j5 = 0;
            while (j5 < jMin) {
                int i3 = i + 1;
                int i5 = i2 + 1;
                if (n0Var.f207291a[i] != n0Var2.f207291a[i2]) {
                    return false;
                }
                j5++;
                i = i3;
                i2 = i5;
            }
            if (i == n0Var.f207293c) {
                n0Var = n0Var.f;
                Intrinsics.h(n0Var);
                i = n0Var.f207292b;
            }
            if (i2 == n0Var2.f207293c) {
                n0Var2 = n0Var2.f;
                Intrinsics.h(n0Var2);
                i2 = n0Var2.f207292b;
            }
            j3 += jMin;
        }
        return true;
    }

    public final void f() throws EOFException {
        skip(this.f207266b);
    }

    @Override // mmm.j, mmm.q0, java.io.Flushable
    public final void flush() {
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        h hVar = new h();
        if (this.f207266b == 0) {
            return hVar;
        }
        n0 n0Var = this.f207265a;
        Intrinsics.h(n0Var);
        n0 n0VarC = n0Var.c();
        hVar.f207265a = n0VarC;
        n0VarC.f207294g = n0VarC;
        n0VarC.f = n0VarC;
        for (n0 n0Var2 = n0Var.f; n0Var2 != n0Var; n0Var2 = n0Var2.f) {
            n0 n0Var3 = n0VarC.f207294g;
            Intrinsics.h(n0Var3);
            Intrinsics.h(n0Var2);
            n0Var3.b(n0Var2.c());
        }
        hVar.f207266b = this.f207266b;
        return hVar;
    }

    @Override // mmm.k, mmm.j
    public final h getBuffer() {
        return this;
    }

    public final long h() {
        long j2 = this.f207266b;
        if (j2 == 0) {
            return 0L;
        }
        n0 n0Var = this.f207265a;
        Intrinsics.h(n0Var);
        n0 n0Var2 = n0Var.f207294g;
        Intrinsics.h(n0Var2);
        int i = n0Var2.f207293c;
        return (i >= 8192 || !n0Var2.e) ? j2 : j2 - ((long) (i - n0Var2.f207292b));
    }

    public final int hashCode() {
        n0 n0Var = this.f207265a;
        if (n0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = n0Var.f207293c;
            for (int i3 = n0Var.f207292b; i3 < i2; i3++) {
                i = (i * 31) + n0Var.f207291a[i3];
            }
            n0Var = n0Var.f;
            Intrinsics.h(n0Var);
        } while (n0Var != this.f207265a);
        return i;
    }

    public final void i(h out, long j2, long j3) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j5 = j2;
        b.b(this.f207266b, j5, j3);
        if (j3 == 0) {
            return;
        }
        out.f207266b += j3;
        n0 n0Var = this.f207265a;
        while (true) {
            Intrinsics.h(n0Var);
            long j16 = n0Var.f207293c - n0Var.f207292b;
            if (j5 < j16) {
                break;
            }
            j5 -= j16;
            n0Var = n0Var.f;
        }
        n0 n0Var2 = n0Var;
        long j22 = j3;
        while (j22 > 0) {
            Intrinsics.h(n0Var2);
            n0 n0VarC = n0Var2.c();
            int i = n0VarC.f207292b + ((int) j5);
            n0VarC.f207292b = i;
            n0VarC.f207293c = Math.min(i + ((int) j22), n0VarC.f207293c);
            n0 n0Var3 = out.f207265a;
            if (n0Var3 == null) {
                n0VarC.f207294g = n0VarC;
                n0VarC.f = n0VarC;
                out.f207265a = n0VarC;
            } else {
                n0 n0Var4 = n0Var3.f207294g;
                Intrinsics.h(n0Var4);
                n0Var4.b(n0VarC);
            }
            j22 -= (long) (n0VarC.f207293c - n0VarC.f207292b);
            n0Var2 = n0Var2.f;
            j5 = 0;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte j(long j2) {
        b.b(this.f207266b, j2, 1L);
        n0 n0Var = this.f207265a;
        if (n0Var == null) {
            Intrinsics.h(null);
            throw null;
        }
        long j3 = this.f207266b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                n0Var = n0Var.f207294g;
                Intrinsics.h(n0Var);
                j3 -= (long) (n0Var.f207293c - n0Var.f207292b);
            }
            return n0Var.f207291a[(int) ((((long) n0Var.f207292b) + j2) - j3)];
        }
        long j5 = 0;
        while (true) {
            int i = n0Var.f207293c;
            int i2 = n0Var.f207292b;
            long j16 = ((long) (i - i2)) + j5;
            if (j16 > j2) {
                return n0Var.f207291a[(int) ((((long) i2) + j2) - j5)];
            }
            n0Var = n0Var.f;
            Intrinsics.h(n0Var);
            j5 = j16;
        }
    }

    public final long k(byte b4, long j2, long j3) {
        n0 n0Var;
        long j5 = 0;
        if (0 > j2 || j2 > j3) {
            throw new IllegalArgumentException(("size=" + this.f207266b + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        long j16 = this.f207266b;
        if (j3 > j16) {
            j3 = j16;
        }
        if (j2 == j3 || (n0Var = this.f207265a) == null) {
            return -1L;
        }
        if (j16 - j2 < j2) {
            while (j16 > j2) {
                n0Var = n0Var.f207294g;
                Intrinsics.h(n0Var);
                j16 -= (long) (n0Var.f207293c - n0Var.f207292b);
            }
            while (j16 < j3) {
                byte[] bArr = n0Var.f207291a;
                int iMin = (int) Math.min(n0Var.f207293c, (((long) n0Var.f207292b) + j3) - j16);
                for (int i = (int) ((((long) n0Var.f207292b) + j2) - j16); i < iMin; i++) {
                    if (bArr[i] == b4) {
                        return ((long) (i - n0Var.f207292b)) + j16;
                    }
                }
                j16 += (long) (n0Var.f207293c - n0Var.f207292b);
                n0Var = n0Var.f;
                Intrinsics.h(n0Var);
                j2 = j16;
            }
            return -1L;
        }
        while (true) {
            long j22 = ((long) (n0Var.f207293c - n0Var.f207292b)) + j5;
            if (j22 > j2) {
                break;
            }
            n0Var = n0Var.f;
            Intrinsics.h(n0Var);
            j5 = j22;
        }
        while (j5 < j3) {
            byte[] bArr2 = n0Var.f207291a;
            int iMin2 = (int) Math.min(n0Var.f207293c, (((long) n0Var.f207292b) + j3) - j5);
            for (int i2 = (int) ((((long) n0Var.f207292b) + j2) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b4) {
                    return ((long) (i2 - n0Var.f207292b)) + j5;
                }
            }
            j5 += (long) (n0Var.f207293c - n0Var.f207292b);
            n0Var = n0Var.f;
            Intrinsics.h(n0Var);
            j2 = j5;
        }
        return -1L;
    }

    public final long l(long j2, m targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "fromIndex < 0: ").toString());
        }
        n0 n0Var = this.f207265a;
        if (n0Var == null) {
            return -1L;
        }
        long j5 = this.f207266b;
        if (j5 - j2 < j2) {
            while (j5 > j2) {
                n0Var = n0Var.f207294g;
                Intrinsics.h(n0Var);
                j5 -= (long) (n0Var.f207293c - n0Var.f207292b);
            }
            if (targetBytes.d() == 2) {
                byte bK = targetBytes.k(0);
                byte bK2 = targetBytes.k(1);
                while (j5 < this.f207266b) {
                    byte[] bArr = n0Var.f207291a;
                    int i = n0Var.f207293c;
                    for (int i2 = (int) ((((long) n0Var.f207292b) + j2) - j5); i2 < i; i2++) {
                        byte b4 = bArr[i2];
                        if (b4 == bK || b4 == bK2) {
                            return ((long) (i2 - n0Var.f207292b)) + j5;
                        }
                    }
                    j5 += (long) (n0Var.f207293c - n0Var.f207292b);
                    n0Var = n0Var.f;
                    Intrinsics.h(n0Var);
                    j2 = j5;
                }
            } else {
                byte[] bArrI = targetBytes.i();
                while (j5 < this.f207266b) {
                    byte[] bArr2 = n0Var.f207291a;
                    int i3 = n0Var.f207293c;
                    for (int i5 = (int) ((((long) n0Var.f207292b) + j2) - j5); i5 < i3; i5++) {
                        byte b5 = bArr2[i5];
                        for (byte b7 : bArrI) {
                            if (b5 == b7) {
                                return ((long) (i5 - n0Var.f207292b)) + j5;
                            }
                        }
                    }
                    j5 += (long) (n0Var.f207293c - n0Var.f207292b);
                    n0Var = n0Var.f;
                    Intrinsics.h(n0Var);
                    j2 = j5;
                }
            }
            return -1L;
        }
        while (true) {
            long j16 = ((long) (n0Var.f207293c - n0Var.f207292b)) + j3;
            if (j16 > j2) {
                break;
            }
            n0Var = n0Var.f;
            Intrinsics.h(n0Var);
            j3 = j16;
        }
        if (targetBytes.d() == 2) {
            byte bK3 = targetBytes.k(0);
            byte bK4 = targetBytes.k(1);
            while (j3 < this.f207266b) {
                byte[] bArr3 = n0Var.f207291a;
                int i6 = n0Var.f207293c;
                for (int i21 = (int) ((((long) n0Var.f207292b) + j2) - j3); i21 < i6; i21++) {
                    byte b13 = bArr3[i21];
                    if (b13 == bK3 || b13 == bK4) {
                        return ((long) (i21 - n0Var.f207292b)) + j3;
                    }
                }
                j3 += (long) (n0Var.f207293c - n0Var.f207292b);
                n0Var = n0Var.f;
                Intrinsics.h(n0Var);
                j2 = j3;
            }
        } else {
            byte[] bArrI2 = targetBytes.i();
            while (j3 < this.f207266b) {
                byte[] bArr4 = n0Var.f207291a;
                int i22 = n0Var.f207293c;
                for (int i32 = (int) ((((long) n0Var.f207292b) + j2) - j3); i32 < i22; i32++) {
                    byte b15 = bArr4[i32];
                    for (byte b17 : bArrI2) {
                        if (b15 == b17) {
                            return ((long) (i32 - n0Var.f207292b)) + j3;
                        }
                    }
                }
                j3 += (long) (n0Var.f207293c - n0Var.f207292b);
                n0Var = n0Var.f;
                Intrinsics.h(n0Var);
                j2 = j3;
            }
        }
        return -1L;
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j l3(long j2) {
        x(j2);
        return this;
    }

    public final boolean m(int i, long j2, m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (i >= 0 && j2 >= 0 && ((long) i) + j2 <= this.f207266b && i <= bytes.d()) {
            return i == 0 || nmm.a.a(this, bytes, j2, j2 + 1, i) != -1;
        }
        return false;
    }

    @Override // mmm.k
    public final String m4(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return p(this.f207266b, charset);
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j m9(int i, int i2, String str) {
        C(i, i2, str);
        return this;
    }

    public final a n(a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = nmm.a.f217392a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == b.f207248a) {
            unsafeCursor = new a();
        }
        if (unsafeCursor.f207267a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f207267a = this;
        unsafeCursor.f207268b = true;
        return unsafeCursor;
    }

    public final byte[] o(long j2) throws EOFException {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount: ").toString());
        }
        if (this.f207266b < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        readFully(bArr);
        return bArr;
    }

    public final String p(long j2, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount: ").toString());
        }
        if (this.f207266b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        n0 n0Var = this.f207265a;
        Intrinsics.h(n0Var);
        int i = n0Var.f207292b;
        if (((long) i) + j2 > n0Var.f207293c) {
            return new String(o(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(n0Var.f207291a, i, i2, charset);
        int i3 = n0Var.f207292b + i2;
        n0Var.f207292b = i3;
        this.f207266b -= j2;
        if (i3 == n0Var.f207293c) {
            this.f207265a = n0Var.a();
            o0.a(n0Var);
        }
        return str;
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j p0(String str) {
        D(str);
        return this;
    }

    @Override // mmm.k
    public final l0 peek() {
        return u1.c(new i0(this));
    }

    public final String q() {
        return p(this.f207266b, Charsets.UTF_8);
    }

    public final int r() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f207266b == 0) {
            throw new EOFException();
        }
        byte bJ = j(0L);
        if ((bJ & 128) == 0) {
            i = bJ & Ascii.DEL;
            i3 = 0;
            i2 = 1;
        } else if ((bJ & ISO7816.INS_CREATE_FILE) == 192) {
            i = bJ & Ascii.US;
            i2 = 2;
            i3 = 128;
        } else if ((bJ & 240) == 224) {
            i = bJ & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bJ & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bJ & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j2 = i2;
        if (this.f207266b < j2) {
            StringBuilder sbW = a0.d.w(i2, "size < ", ": ");
            sbW.append(this.f207266b);
            sbW.append(" (to read code point prefixed 0x");
            sbW.append(b.c(bJ));
            sbW.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            throw new EOFException(sbW.toString());
        }
        for (int i5 = 1; i5 < i2; i5++) {
            long j3 = i5;
            byte bJ2 = j(j3);
            if ((bJ2 & ISO7816.INS_GET_RESPONSE) != 128) {
                skip(j3);
                return 65533;
            }
            i = (i << 6) | (bJ2 & 63);
        }
        skip(j2);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // mmm.s0
    public final long read(h sink, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        long j3 = this.f207266b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        sink.write(this, j2);
        return j2;
    }

    @Override // mmm.k
    public final byte readByte() throws EOFException {
        if (this.f207266b == 0) {
            throw new EOFException();
        }
        n0 n0Var = this.f207265a;
        Intrinsics.h(n0Var);
        int i = n0Var.f207292b;
        int i2 = n0Var.f207293c;
        int i3 = i + 1;
        byte b4 = n0Var.f207291a[i];
        this.f207266b--;
        if (i3 != i2) {
            n0Var.f207292b = i3;
            return b4;
        }
        this.f207265a = n0Var.a();
        o0.a(n0Var);
        return b4;
    }

    @Override // mmm.k
    public final void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // mmm.k
    public final int readInt() throws EOFException {
        if (this.f207266b < 4) {
            throw new EOFException();
        }
        n0 n0Var = this.f207265a;
        Intrinsics.h(n0Var);
        int i = n0Var.f207292b;
        int i2 = n0Var.f207293c;
        if (i2 - i < 4) {
            return ((readByte() & UnsignedBytes.MAX_VALUE) << 24) | ((readByte() & UnsignedBytes.MAX_VALUE) << 16) | ((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE);
        }
        byte[] bArr = n0Var.f207291a;
        int i3 = i + 3;
        int i5 = ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8);
        int i6 = i + 4;
        int i21 = (bArr[i3] & UnsignedBytes.MAX_VALUE) | i5;
        this.f207266b -= 4;
        if (i6 != i2) {
            n0Var.f207292b = i6;
            return i21;
        }
        this.f207265a = n0Var.a();
        o0.a(n0Var);
        return i21;
    }

    @Override // mmm.k
    public final long readLong() throws EOFException {
        if (this.f207266b < 8) {
            throw new EOFException();
        }
        n0 n0Var = this.f207265a;
        Intrinsics.h(n0Var);
        int i = n0Var.f207292b;
        int i2 = n0Var.f207293c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & ((long) readInt()));
        }
        byte[] bArr = n0Var.f207291a;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i5 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.f207266b -= 8;
        if (i5 != i2) {
            n0Var.f207292b = i5;
            return j3;
        }
        this.f207265a = n0Var.a();
        o0.a(n0Var);
        return j3;
    }

    @Override // mmm.k
    public final short readShort() throws EOFException {
        if (this.f207266b < 2) {
            throw new EOFException();
        }
        n0 n0Var = this.f207265a;
        Intrinsics.h(n0Var);
        int i = n0Var.f207292b;
        int i2 = n0Var.f207293c;
        if (i2 - i < 2) {
            return (short) (((readByte() & UnsignedBytes.MAX_VALUE) << 8) | (readByte() & UnsignedBytes.MAX_VALUE));
        }
        byte[] bArr = n0Var.f207291a;
        int i3 = i + 1;
        int i5 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 8;
        int i6 = i + 2;
        int i21 = (bArr[i3] & UnsignedBytes.MAX_VALUE) | i5;
        this.f207266b -= 2;
        if (i6 == i2) {
            this.f207265a = n0Var.a();
            o0.a(n0Var);
        } else {
            n0Var.f207292b = i6;
        }
        return (short) i21;
    }

    public final m s() {
        long j2 = this.f207266b;
        if (j2 <= 2147483647L) {
            return t((int) j2);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f207266b).toString());
    }

    @Override // mmm.k
    public final void skip(long j2) throws EOFException {
        while (j2 > 0) {
            n0 n0Var = this.f207265a;
            if (n0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, n0Var.f207293c - n0Var.f207292b);
            long j3 = iMin;
            this.f207266b -= j3;
            j2 -= j3;
            int i = n0Var.f207292b + iMin;
            n0Var.f207292b = i;
            if (i == n0Var.f207293c) {
                this.f207265a = n0Var.a();
                o0.a(n0Var);
            }
        }
    }

    public final m t(int i) {
        if (i == 0) {
            return m.d;
        }
        b.b(this.f207266b, 0L, i);
        n0 n0Var = this.f207265a;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i3 < i) {
            Intrinsics.h(n0Var);
            int i6 = n0Var.f207293c;
            int i21 = n0Var.f207292b;
            if (i6 == i21) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i6 - i21;
            i5++;
            n0Var = n0Var.f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        n0 n0Var2 = this.f207265a;
        int i22 = 0;
        while (i2 < i) {
            Intrinsics.h(n0Var2);
            bArr[i22] = n0Var2.f207291a;
            i2 += n0Var2.f207293c - n0Var2.f207292b;
            iArr[i22] = Math.min(i2, i);
            iArr[i22 + i5] = n0Var2.f207292b;
            n0Var2.d = true;
            i22++;
            n0Var2 = n0Var2.f;
        }
        return new p0(bArr, iArr);
    }

    @Override // mmm.k
    public final int t9() throws EOFException {
        int i = readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return v0.d;
    }

    public final String toString() {
        return s().toString();
    }

    public final n0 u(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        n0 n0Var = this.f207265a;
        if (n0Var == null) {
            n0 n0VarB = o0.b();
            this.f207265a = n0VarB;
            n0VarB.f207294g = n0VarB;
            n0VarB.f = n0VarB;
            return n0VarB;
        }
        n0 n0Var2 = n0Var.f207294g;
        Intrinsics.h(n0Var2);
        if (n0Var2.f207293c + i <= 8192 && n0Var2.e) {
            return n0Var2;
        }
        n0 n0VarB2 = o0.b();
        n0Var2.b(n0VarB2);
        return n0VarB2;
    }

    public final void v(m byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.w(this, byteString.d());
    }

    public final void w(int i) {
        n0 n0VarU = u(1);
        byte[] bArr = n0VarU.f207291a;
        int i2 = n0VarU.f207293c;
        n0VarU.f207293c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f207266b++;
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j write(byte[] bArr) {
        m3801write(bArr);
        return this;
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j writeByte(int i) {
        w(i);
        return this;
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j writeInt(int i) {
        z(i);
        return this;
    }

    @Override // mmm.j
    public final /* bridge */ /* synthetic */ j writeShort(int i) {
        A(i);
        return this;
    }

    public final void x(long j2) {
        boolean z;
        if (j2 == 0) {
            w(48);
            return;
        }
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                D("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = nmm.a.f217392a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j2)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j2 > nmm.a.f217393b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        n0 n0VarU = u(i);
        byte[] bArr2 = n0VarU.f207291a;
        int i2 = n0VarU.f207293c + i;
        while (j2 != 0) {
            long j3 = 10;
            i2--;
            bArr2[i2] = nmm.a.f217392a[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        n0VarU.f207293c += i;
        this.f207266b += (long) i;
    }

    @Override // mmm.k
    public final m x4() {
        return c(this.f207266b);
    }

    public final void y(long j2) {
        if (j2 == 0) {
            w(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j5 = j3 | (j3 >>> 2);
        long j16 = j5 | (j5 >>> 4);
        long j22 = j16 | (j16 >>> 8);
        long j42 = j22 | (j22 >>> 16);
        long j46 = j42 | (j42 >>> 32);
        long j47 = j46 - ((j46 >>> 1) & 6148914691236517205L);
        long j57 = ((j47 >>> 2) & 3689348814741910323L) + (j47 & 3689348814741910323L);
        long j58 = ((j57 >>> 4) + j57) & 1085102592571150095L;
        long j65 = j58 + (j58 >>> 8);
        long j69 = j65 + (j65 >>> 16);
        int i = (int) ((((j69 & 63) + ((j69 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        n0 n0VarU = u(i);
        byte[] bArr = n0VarU.f207291a;
        int i2 = n0VarU.f207293c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = nmm.a.f217392a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        n0VarU.f207293c += i;
        this.f207266b += (long) i;
    }

    @Override // mmm.k
    public final boolean y3(long j2, m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m(bytes.d(), j2, bytes);
    }

    public final void z(int i) {
        n0 n0VarU = u(4);
        byte[] bArr = n0VarU.f207291a;
        int i2 = n0VarU.f207293c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        n0VarU.f207293c = i2 + 4;
        this.f207266b += 4;
    }

    @Override // mmm.q0
    public final void write(h source, long j2) {
        n0 n0VarB;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.b(source.f207266b, 0L, j2);
        while (j2 > 0) {
            n0 n0Var = source.f207265a;
            Intrinsics.h(n0Var);
            int i = n0Var.f207293c;
            n0 n0Var2 = source.f207265a;
            Intrinsics.h(n0Var2);
            long j3 = i - n0Var2.f207292b;
            int i2 = 0;
            if (j2 < j3) {
                n0 n0Var3 = this.f207265a;
                n0 n0Var4 = n0Var3 != null ? n0Var3.f207294g : null;
                if (n0Var4 != null && n0Var4.e) {
                    if ((((long) n0Var4.f207293c) + j2) - ((long) (n0Var4.d ? 0 : n0Var4.f207292b)) <= FileAppender.DEFAULT_BUFFER_SIZE) {
                        n0 n0Var5 = source.f207265a;
                        Intrinsics.h(n0Var5);
                        n0Var5.d(n0Var4, (int) j2);
                        source.f207266b -= j2;
                        this.f207266b += j2;
                        return;
                    }
                }
                n0 n0Var6 = source.f207265a;
                Intrinsics.h(n0Var6);
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > n0Var6.f207293c - n0Var6.f207292b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    n0VarB = n0Var6.c();
                } else {
                    n0VarB = o0.b();
                    byte[] bArr = n0Var6.f207291a;
                    byte[] bArr2 = n0VarB.f207291a;
                    int i5 = n0Var6.f207292b;
                    zhm.p.j(bArr, bArr2, 0, i5, i5 + i3, 2);
                }
                n0VarB.f207293c = n0VarB.f207292b + i3;
                n0Var6.f207292b += i3;
                n0 n0Var7 = n0Var6.f207294g;
                Intrinsics.h(n0Var7);
                n0Var7.b(n0VarB);
                source.f207265a = n0VarB;
            }
            n0 n0Var8 = source.f207265a;
            Intrinsics.h(n0Var8);
            long j5 = n0Var8.f207293c - n0Var8.f207292b;
            source.f207265a = n0Var8.a();
            n0 n0Var9 = this.f207265a;
            if (n0Var9 == null) {
                this.f207265a = n0Var8;
                n0Var8.f207294g = n0Var8;
                n0Var8.f = n0Var8;
            } else {
                n0 n0Var10 = n0Var9.f207294g;
                Intrinsics.h(n0Var10);
                n0Var10.b(n0Var8);
                n0 n0Var11 = n0Var8.f207294g;
                if (n0Var11 == n0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.h(n0Var11);
                if (n0Var11.e) {
                    int i6 = n0Var8.f207293c - n0Var8.f207292b;
                    n0 n0Var12 = n0Var8.f207294g;
                    Intrinsics.h(n0Var12);
                    int i21 = 8192 - n0Var12.f207293c;
                    n0 n0Var13 = n0Var8.f207294g;
                    Intrinsics.h(n0Var13);
                    if (!n0Var13.d) {
                        n0 n0Var14 = n0Var8.f207294g;
                        Intrinsics.h(n0Var14);
                        i2 = n0Var14.f207292b;
                    }
                    if (i6 <= i21 + i2) {
                        n0 n0Var15 = n0Var8.f207294g;
                        Intrinsics.h(n0Var15);
                        n0Var8.d(n0Var15, i6);
                        n0Var8.a();
                        o0.a(n0Var8);
                    }
                }
            }
            source.f207266b -= j5;
            this.f207266b += j5;
            j2 -= j5;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        n0 n0Var = this.f207265a;
        if (n0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), n0Var.f207293c - n0Var.f207292b);
        sink.put(n0Var.f207291a, n0Var.f207292b, iMin);
        int i = n0Var.f207292b + iMin;
        n0Var.f207292b = i;
        this.f207266b -= (long) iMin;
        if (i == n0Var.f207293c) {
            this.f207265a = n0Var.a();
            o0.a(n0Var);
        }
        return iMin;
    }

    public final int read(byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        b.b(sink.length, i, i2);
        n0 n0Var = this.f207265a;
        if (n0Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, n0Var.f207293c - n0Var.f207292b);
        byte[] bArr = n0Var.f207291a;
        int i3 = n0Var.f207292b;
        zhm.p.e(i, bArr, i3, sink, i3 + iMin);
        int i5 = n0Var.f207292b + iMin;
        n0Var.f207292b = i5;
        this.f207266b -= (long) iMin;
        if (i5 == n0Var.f207293c) {
            this.f207265a = n0Var.a();
            o0.a(n0Var);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            n0 n0VarU = u(1);
            int iMin = Math.min(i, 8192 - n0VarU.f207293c);
            source.get(n0VarU.f207291a, n0VarU.f207293c, iMin);
            i -= iMin;
            n0VarU.f207293c += iMin;
        }
        this.f207266b += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m3801write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        write(source, 0, source.length);
    }

    public final void write(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = i2;
        b.b(source.length, i, j2);
        int i3 = i2 + i;
        while (i < i3) {
            n0 n0VarU = u(1);
            int iMin = Math.min(i3 - i, 8192 - n0VarU.f207293c);
            int i5 = i + iMin;
            zhm.p.e(n0VarU.f207293c, source, i, n0VarU.f207291a, i5);
            n0VarU.f207293c += iMin;
            i = i5;
        }
        this.f207266b += j2;
    }
}
