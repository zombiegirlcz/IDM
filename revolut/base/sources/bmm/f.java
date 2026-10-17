package bmm;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mmm.l0 f16914c;
    public e[] d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16915g;

    public f(y source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f16912a = 4096;
        this.f16913b = new ArrayList();
        this.f16914c = u1.c(source);
        this.d = new e[8];
        this.e = 7;
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                e eVar = this.d[length];
                Intrinsics.h(eVar);
                int i5 = eVar.f16903c;
                i -= i5;
                this.f16915g -= i5;
                this.f--;
                i3++;
            }
            e[] eVarArr = this.d;
            System.arraycopy(eVarArr, i2 + 1, eVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final mmm.m b(int i) throws IOException {
        if (i >= 0) {
            e[] eVarArr = h.f16924a;
            if (i <= eVarArr.length - 1) {
                return eVarArr[i].f16901a;
            }
        }
        int length = this.e + 1 + (i - h.f16924a.length);
        if (length >= 0) {
            e[] eVarArr2 = this.d;
            if (length < eVarArr2.length) {
                e eVar = eVarArr2[length];
                Intrinsics.h(eVar);
                return eVar.f16901a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(e eVar) {
        this.f16913b.add(eVar);
        int i = eVar.f16903c;
        int i2 = this.f16912a;
        if (i > i2) {
            e[] eVarArr = this.d;
            zhm.p.p(eVarArr, 0, eVarArr.length, null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.f16915g = 0;
            return;
        }
        a((this.f16915g + i) - i2);
        int i3 = this.f + 1;
        e[] eVarArr2 = this.d;
        if (i3 > eVarArr2.length) {
            e[] eVarArr3 = new e[eVarArr2.length * 2];
            System.arraycopy(eVarArr2, 0, eVarArr3, eVarArr2.length, eVarArr2.length);
            this.e = this.d.length - 1;
            this.d = eVarArr3;
        }
        int i5 = this.e;
        this.e = i5 - 1;
        this.d[i5] = eVar;
        this.f++;
        this.f16915g += i;
    }

    public final mmm.m d() {
        mmm.l0 source = this.f16914c;
        int iB = vlm.h.b(source.readByte());
        int iB2 = 0;
        boolean z = (iB & 128) == 128;
        long jE = e(iB, CertificateBody.profileType);
        if (!z) {
            return source.c(jE);
        }
        mmm.h sink = new mmm.h();
        int[] iArr = i0.f16932a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        h0 h0Var = i0.f16934c;
        h0 h0Var2 = h0Var;
        int i = 0;
        for (long j2 = 0; j2 < jE; j2++) {
            iB2 = (iB2 << 8) | vlm.h.b(source.readByte());
            i += 8;
            while (i >= 8) {
                h0[] h0VarArr = (h0[]) h0Var2.f16928c;
                Intrinsics.h(h0VarArr);
                h0Var2 = h0VarArr[(iB2 >>> (i - 8)) & 255];
                Intrinsics.h(h0Var2);
                if (((h0[]) h0Var2.f16928c) == null) {
                    sink.w(h0Var2.f16926a);
                    i -= h0Var2.f16927b;
                    h0Var2 = h0Var;
                } else {
                    i -= 8;
                }
            }
        }
        while (i > 0) {
            h0[] h0VarArr2 = (h0[]) h0Var2.f16928c;
            Intrinsics.h(h0VarArr2);
            h0 h0Var3 = h0VarArr2[(iB2 << (8 - i)) & 255];
            Intrinsics.h(h0Var3);
            int i2 = h0Var3.f16927b;
            if (((h0[]) h0Var3.f16928c) != null || i2 > i) {
                break;
            }
            sink.w(h0Var3.f16926a);
            i -= i2;
            h0Var2 = h0Var;
        }
        return sink.c(sink.f207266b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i5 = 0;
        while (true) {
            int iB = vlm.h.b(this.f16914c.readByte());
            if ((iB & 128) == 0) {
                return i2 + (iB << i5);
            }
            i2 += (iB & CertificateBody.profileType) << i5;
            i5 += 7;
        }
    }
}
