package bmm;

import java.io.EOFException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.h f16916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16918c;
    public int d;
    public e[] e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16920h;

    public g(mmm.h out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f16916a = out;
        this.f16917b = Integer.MAX_VALUE;
        this.d = 4096;
        this.e = new e[8];
        this.f = 7;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                e eVar = this.e[length];
                Intrinsics.h(eVar);
                i -= eVar.f16903c;
                int i5 = this.f16920h;
                e eVar2 = this.e[length];
                Intrinsics.h(eVar2);
                this.f16920h = i5 - eVar2.f16903c;
                this.f16919g--;
                i3++;
                length--;
            }
            e[] eVarArr = this.e;
            int i6 = i2 + 1;
            System.arraycopy(eVarArr, i6, eVarArr, i6 + i3, this.f16919g);
            e[] eVarArr2 = this.e;
            int i21 = this.f + 1;
            Arrays.fill(eVarArr2, i21, i21 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(e eVar) {
        int i = eVar.f16903c;
        int i2 = this.d;
        if (i > i2) {
            e[] eVarArr = this.e;
            zhm.p.p(eVarArr, 0, eVarArr.length, null);
            this.f = this.e.length - 1;
            this.f16919g = 0;
            this.f16920h = 0;
            return;
        }
        a((this.f16920h + i) - i2);
        int i3 = this.f16919g + 1;
        e[] eVarArr2 = this.e;
        if (i3 > eVarArr2.length) {
            e[] eVarArr3 = new e[eVarArr2.length * 2];
            System.arraycopy(eVarArr2, 0, eVarArr3, eVarArr2.length, eVarArr2.length);
            this.f = this.e.length - 1;
            this.e = eVarArr3;
        }
        int i5 = this.f;
        this.f = i5 - 1;
        this.e[i5] = eVar;
        this.f16919g++;
        this.f16920h += i;
    }

    public final void c(mmm.m source) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "data");
        int[] iArr = i0.f16932a;
        Intrinsics.checkNotNullParameter(source, "bytes");
        int iD = source.d();
        long j2 = 0;
        long j3 = 0;
        for (int i = 0; i < iD; i++) {
            j3 += (long) i0.f16933b[vlm.h.b(source.k(i))];
        }
        int i2 = (int) ((j3 + ((long) 7)) >> 3);
        int iD2 = source.d();
        mmm.h hVar = this.f16916a;
        if (i2 >= iD2) {
            e(source.d(), CertificateBody.profileType, 0);
            hVar.v(source);
            return;
        }
        mmm.h sink = new mmm.h();
        int[] iArr2 = i0.f16932a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iD3 = source.d();
        int i3 = 0;
        for (int i5 = 0; i5 < iD3; i5++) {
            int iB = vlm.h.b(source.k(i5));
            int i6 = i0.f16932a[iB];
            byte b4 = i0.f16933b[iB];
            j2 = (j2 << b4) | ((long) i6);
            i3 += b4;
            while (i3 >= 8) {
                i3 -= 8;
                sink.w((int) (j2 >> i3));
            }
        }
        if (i3 > 0) {
            sink.w((int) ((j2 << (8 - i3)) | (255 >>> i3)));
        }
        mmm.m mVarC = sink.c(sink.f207266b);
        e(mVarC.d(), CertificateBody.profileType, 128);
        hVar.v(mVarC);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bmm.g.d(java.util.ArrayList):void");
    }

    public final void e(int i, int i2, int i3) {
        mmm.h hVar = this.f16916a;
        if (i < i2) {
            hVar.w(i | i3);
            return;
        }
        hVar.w(i3 | i2);
        int i5 = i - i2;
        while (i5 >= 128) {
            hVar.w(128 | (i5 & CertificateBody.profileType));
            i5 >>>= 7;
        }
        hVar.w(i5);
    }
}
