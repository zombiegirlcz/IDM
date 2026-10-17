package icm;

import bmm.h0;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import le.u1;
import mmm.l0;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f160315b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f160314a = new ArrayList();
    public c[] e = new c[8];
    public int f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f160317g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f160318h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160316c = 4096;
    public int d = 4096;

    public d(g gVar) {
        this.f160315b = u1.c(gVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i5 = this.e[length].f160313c;
                i -= i5;
                this.f160318h -= i5;
                this.f160317g--;
                i3++;
            }
            c[] cVarArr = this.e;
            System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f160317g);
            this.f += i3;
        }
        return i3;
    }

    public final mmm.m b(int i) throws IOException {
        if (i >= 0) {
            c[] cVarArr = f.f160323b;
            if (i <= cVarArr.length - 1) {
                return cVarArr[i].f160311a;
            }
        }
        int length = this.f + 1 + (i - f.f160323b.length);
        if (length >= 0) {
            c[] cVarArr2 = this.e;
            if (length < cVarArr2.length) {
                return cVarArr2[length].f160311a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(c cVar) {
        this.f160314a.add(cVar);
        int i = cVar.f160313c;
        int i2 = this.d;
        if (i > i2) {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.f160317g = 0;
            this.f160318h = 0;
            return;
        }
        a((this.f160318h + i) - i2);
        int i3 = this.f160317g + 1;
        c[] cVarArr = this.e;
        if (i3 > cVarArr.length) {
            c[] cVarArr2 = new c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f = this.e.length - 1;
            this.e = cVarArr2;
        }
        int i5 = this.f;
        this.f = i5 - 1;
        this.e[i5] = cVar;
        this.f160317g++;
        this.f160318h += i;
    }

    public final mmm.m d() throws EOFException {
        l0 l0Var = this.f160315b;
        byte b4 = l0Var.readByte();
        int i = b4 & UnsignedBytes.MAX_VALUE;
        boolean z = (b4 & 128) == 128;
        int iE = e(i, CertificateBody.profileType);
        if (!z) {
            return l0Var.c(iE);
        }
        l lVar = l.d;
        long j2 = iE;
        l0Var.b(j2);
        byte[] bArrO = l0Var.f207283b.o(j2);
        lVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        h0 h0Var = lVar.f160341a;
        h0 h0Var2 = h0Var;
        int i2 = 0;
        int i3 = 0;
        for (byte b5 : bArrO) {
            i2 = (i2 << 8) | (b5 & UnsignedBytes.MAX_VALUE);
            i3 += 8;
            while (i3 >= 8) {
                h0Var2 = ((h0[]) h0Var2.f16928c)[(i2 >>> (i3 - 8)) & 255];
                if (((h0[]) h0Var2.f16928c) == null) {
                    byteArrayOutputStream.write(h0Var2.f16926a);
                    i3 -= h0Var2.f16927b;
                    h0Var2 = h0Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            h0 h0Var3 = ((h0[]) h0Var2.f16928c)[(i2 << (8 - i3)) & 255];
            h0[] h0VarArr = (h0[]) h0Var3.f16928c;
            int i5 = h0Var3.f16927b;
            if (h0VarArr != null || i5 > i3) {
                break;
            }
            byteArrayOutputStream.write(h0Var3.f16926a);
            i3 -= i5;
            h0Var2 = h0Var;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        mmm.m.Companion.getClass();
        return mmm.l.e(byteArray);
    }

    public final int e(int i, int i2) throws EOFException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i5 = 0;
        while (true) {
            byte b4 = this.f160315b.readByte();
            int i6 = b4 & UnsignedBytes.MAX_VALUE;
            if ((b4 & 128) == 0) {
                return i2 + (i6 << i5);
            }
            i2 += (b4 & Ascii.DEL) << i5;
            i5 += 7;
        }
    }
}
