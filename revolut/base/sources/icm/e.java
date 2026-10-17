package icm;

import java.util.Arrays;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.h f160319a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160321c;
    public int e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c[] f160320b = new c[8];
    public int d = 7;

    public e(mmm.h hVar) {
        this.f160319a = hVar;
    }

    public final void a(c cVar) {
        int i;
        int i2 = cVar.f160313c;
        if (i2 > 4096) {
            Arrays.fill(this.f160320b, (Object) null);
            this.d = this.f160320b.length - 1;
            this.f160321c = 0;
            this.e = 0;
            return;
        }
        int i3 = (this.e + i2) - 4096;
        if (i3 > 0) {
            int length = this.f160320b.length - 1;
            int i5 = 0;
            while (true) {
                i = this.d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i6 = this.f160320b[length].f160313c;
                i3 -= i6;
                this.e -= i6;
                this.f160321c--;
                i5++;
                length--;
            }
            c[] cVarArr = this.f160320b;
            int i21 = i + 1;
            System.arraycopy(cVarArr, i21, cVarArr, i21 + i5, this.f160321c);
            this.d += i5;
        }
        int i22 = this.f160321c + 1;
        c[] cVarArr2 = this.f160320b;
        if (i22 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.d = this.f160320b.length - 1;
            this.f160320b = cVarArr3;
        }
        int i32 = this.d;
        this.d = i32 - 1;
        this.f160320b[i32] = cVar;
        this.f160321c++;
        this.e += i2;
    }

    public final void b(mmm.m mVar) {
        c(mVar.d(), CertificateBody.profileType, 0);
        this.f160319a.v(mVar);
    }

    public final void c(int i, int i2, int i3) {
        mmm.h hVar = this.f160319a;
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
