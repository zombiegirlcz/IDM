package jlm;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import java.io.EOFException;
import java.io.Flushable;
import kotlin.jvm.internal.Intrinsics;
import zhm.p;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements k, AutoCloseable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f175869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f175870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f175871c;

    @Override // jlm.k
    public final boolean J() {
        return this.f175871c == 0;
    }

    @Override // jlm.k
    public final boolean a(long j2) {
        if (j2 >= 0) {
            return this.f175871c >= j2;
        }
        throw new IllegalArgumentException(p.a.n(j2, "byteCount: ", " < 0").toString());
    }

    @Override // jlm.k
    public final void b(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount: ").toString());
        }
        if (this.f175871c >= j2) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f175871c + ", required: " + j2 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(a sink, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.n(j2, "byteCount (", ") < 0").toString());
        }
        long j3 = this.f175871c;
        if (j3 >= j2) {
            sink.l(this, j2);
        } else {
            sink.l(this, j3);
            throw new EOFException(a0.d.j(this.f175871c, " bytes were written.", com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "Buffer exhausted before writing ", " bytes. Only ")));
        }
    }

    public final void f() {
        i iVar = this.f175869a;
        Intrinsics.h(iVar);
        i iVar2 = iVar.f;
        this.f175869a = iVar2;
        if (iVar2 == null) {
            this.f175870b = null;
        } else {
            iVar2.f175884g = null;
        }
        iVar.f = null;
        j.a(iVar);
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    public final /* synthetic */ void g() {
        i iVar = this.f175870b;
        Intrinsics.h(iVar);
        i iVar2 = iVar.f175884g;
        this.f175870b = iVar2;
        if (iVar2 == null) {
            this.f175869a = null;
        } else {
            iVar2.f = null;
        }
        iVar.f175884g = null;
        j.a(iVar);
    }

    @Override // jlm.k
    public final a getBuffer() {
        return this;
    }

    public final long h(d source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = 0;
        while (true) {
            long jJ2 = source.j2(this, FileAppender.DEFAULT_BUFFER_SIZE);
            if (jJ2 == -1) {
                return j2;
            }
            j2 += jJ2;
        }
    }

    public final long i(a sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.f175871c;
        if (j2 > 0) {
            sink.l(this, j2);
        }
        return j2;
    }

    public final /* synthetic */ i j(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        i iVar = this.f175870b;
        if (iVar == null) {
            i iVarB = j.b();
            this.f175869a = iVarB;
            this.f175870b = iVarB;
            return iVarB;
        }
        if (iVar.f175883c + i <= 8192 && iVar.e) {
            return iVar;
        }
        i iVarB2 = j.b();
        iVar.e(iVarB2);
        this.f175870b = iVarB2;
        return iVarB2;
    }

    @Override // jlm.d
    public final long j2(a sink, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.n(j2, "byteCount (", ") < 0").toString());
        }
        long j3 = this.f175871c;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        sink.l(this, j2);
        return j2;
    }

    public final void k(int i, byte[] src2) {
        Intrinsics.checkNotNullParameter(src2, "source");
        int i2 = 0;
        l.a(src2.length, 0, i);
        while (i2 < i) {
            i iVarJ = j(1);
            int iMin = Math.min(i - i2, iVarJ.a()) + i2;
            Intrinsics.checkNotNullParameter(src2, "src");
            p.e(iVarJ.f175883c, src2, i2, iVarJ.f175881a, iMin);
            iVarJ.f175883c = (iMin - i2) + iVarJ.f175883c;
            i2 = iMin;
        }
        this.f175871c += (long) i;
    }

    public final void l(a source, long j2) {
        i iVarB;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        long j3 = source.f175871c;
        if (0 > j3 || j3 < j2 || j2 < 0) {
            throw new IllegalArgumentException(a0.d.j(j3, "))", com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "offset (0) and byteCount (", ") are not within the range [0..size(")));
        }
        while (j2 > 0) {
            Intrinsics.h(source.f175869a);
            int i = 0;
            if (j2 < r0.b()) {
                i iVar = this.f175870b;
                if (iVar != null && iVar.e) {
                    long j5 = ((long) iVar.f175883c) + j2;
                    l lVar = iVar.d;
                    if (j5 - ((long) ((lVar == null || ((g) lVar).f175880b <= 0) ? iVar.f175882b : 0)) <= FileAppender.DEFAULT_BUFFER_SIZE) {
                        i iVar2 = source.f175869a;
                        Intrinsics.h(iVar2);
                        iVar2.g(iVar, (int) j2);
                        source.f175871c -= j2;
                        this.f175871c += j2;
                        return;
                    }
                }
                i iVar3 = source.f175869a;
                Intrinsics.h(iVar3);
                int i2 = (int) j2;
                if (i2 <= 0 || i2 > iVar3.f175883c - iVar3.f175882b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i2 >= 1024) {
                    iVarB = iVar3.f();
                } else {
                    iVarB = j.b();
                    byte[] bArr = iVar3.f175881a;
                    byte[] bArr2 = iVarB.f175881a;
                    int i3 = iVar3.f175882b;
                    p.j(bArr, bArr2, 0, i3, i3 + i2, 2);
                }
                iVarB.f175883c = iVarB.f175882b + i2;
                iVar3.f175882b += i2;
                i iVar4 = iVar3.f175884g;
                if (iVar4 != null) {
                    iVar4.e(iVarB);
                } else {
                    iVarB.f = iVar3;
                    iVar3.f175884g = iVarB;
                }
                source.f175869a = iVarB;
            }
            i iVar5 = source.f175869a;
            Intrinsics.h(iVar5);
            long jB = iVar5.b();
            i iVarD = iVar5.d();
            source.f175869a = iVarD;
            if (iVarD == null) {
                source.f175870b = null;
            }
            if (this.f175869a == null) {
                this.f175869a = iVar5;
                this.f175870b = iVar5;
            } else {
                i iVar6 = this.f175870b;
                Intrinsics.h(iVar6);
                iVar6.e(iVar5);
                i iVar7 = iVar5.f175884g;
                if (iVar7 == null) {
                    throw new IllegalStateException("cannot compact");
                }
                if (iVar7.e) {
                    int i5 = iVar5.f175883c - iVar5.f175882b;
                    Intrinsics.h(iVar7);
                    int i6 = 8192 - iVar7.f175883c;
                    i iVar8 = iVar5.f175884g;
                    Intrinsics.h(iVar8);
                    l lVar2 = iVar8.d;
                    if (lVar2 == null || ((g) lVar2).f175880b <= 0) {
                        i iVar9 = iVar5.f175884g;
                        Intrinsics.h(iVar9);
                        i = iVar9.f175882b;
                    }
                    if (i5 <= i6 + i) {
                        i iVar10 = iVar5.f175884g;
                        Intrinsics.h(iVar10);
                        iVar5.g(iVar10, i5);
                        if (iVar5.d() != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        j.a(iVar5);
                        iVar5 = iVar10;
                    }
                }
                this.f175870b = iVar5;
                if (iVar5.f175884g == null) {
                    this.f175869a = iVar5;
                }
            }
            source.f175871c -= jB;
            this.f175871c += jB;
            j2 -= jB;
        }
    }

    public final void m(byte b4) {
        i iVarJ = j(1);
        byte[] bArr = iVarJ.f175881a;
        int i = iVarJ.f175883c;
        iVarJ.f175883c = i + 1;
        bArr[i] = b4;
        this.f175871c++;
    }

    @Override // jlm.k
    public final e peek() {
        c cVar = new c(this);
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new e(cVar);
    }

    @Override // jlm.k
    public final byte readByte() throws EOFException {
        i iVar = this.f175869a;
        if (iVar == null) {
            throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f175871c + ", required: 1" + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        int iB = iVar.b();
        if (iB == 0) {
            f();
            return readByte();
        }
        byte[] bArr = iVar.f175881a;
        int i = iVar.f175882b;
        iVar.f175882b = i + 1;
        byte b4 = bArr[i];
        this.f175871c--;
        if (iB == 1) {
            f();
        }
        return b4;
    }

    public final void skip(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.n(j2, "byteCount (", ") < 0").toString());
        }
        long j3 = j2;
        while (j3 > 0) {
            i iVar = this.f175869a;
            if (iVar == null) {
                throw new EOFException(p.a.n(j2, "Buffer exhausted before skipping ", " bytes."));
            }
            int iMin = (int) Math.min(j3, iVar.f175883c - iVar.f175882b);
            long j5 = iMin;
            this.f175871c -= j5;
            j3 -= j5;
            int i = iVar.f175882b + iMin;
            iVar.f175882b = i;
            if (i == iVar.f175883c) {
                f();
            }
        }
    }

    public final String toString() {
        long j2 = this.f175871c;
        if (j2 == 0) {
            return "Buffer(size=0)";
        }
        long j3 = 64;
        int iMin = (int) Math.min(j3, j2);
        StringBuilder sb6 = new StringBuilder((iMin * 2) + (this.f175871c > j3 ? 1 : 0));
        int i = 0;
        for (i segment = this.f175869a; segment != null; segment = segment.f) {
            int i2 = 0;
            while (i < iMin && i2 < segment.b()) {
                int i3 = i2 + 1;
                Intrinsics.checkNotNullParameter(segment, "segment");
                byte bC = segment.c(i2);
                i++;
                char[] cArr = l.f175889a;
                sb6.append(cArr[(bC >> 4) & 15]);
                sb6.append(cArr[bC & 15]);
                i2 = i3;
            }
        }
        if (this.f175871c > j3) {
            sb6.append((char) 8230);
        }
        return "Buffer(size=" + this.f175871c + " hex=" + ((Object) sb6) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final int u5(int i, int i2, byte[] dst) {
        Intrinsics.checkNotNullParameter(dst, "sink");
        l.a(dst.length, i, i2);
        i iVar = this.f175869a;
        if (iVar == null) {
            return -1;
        }
        int iMin = Math.min(i2 - i, iVar.b());
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i3 = (i + iMin) - i;
        byte[] bArr = iVar.f175881a;
        int i5 = iVar.f175882b;
        p.e(i, bArr, i5, dst, i5 + i3);
        iVar.f175882b += i3;
        this.f175871c -= (long) iMin;
        if (l.d(iVar)) {
            f();
        }
        return iMin;
    }
}
