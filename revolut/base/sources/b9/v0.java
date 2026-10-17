package b9;

import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class v0 implements w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f13490c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13488a = 0;
    public Object d = new w();

    public v0(String str) {
        this.f13489b = 0;
        String strTrim = str.trim();
        this.f13490c = strTrim;
        this.f13489b = strTrim.length();
    }

    public static boolean l(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    @Override // b9.w0
    public void a(float f, float f4, float f5, float f6) {
        c((byte) 3);
        i(4);
        float[] fArr = (float[]) this.d;
        int i = this.f13489b;
        int i2 = i + 1;
        this.f13489b = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f13489b = i3;
        fArr[i2] = f4;
        int i5 = i + 3;
        this.f13489b = i5;
        fArr[i3] = f5;
        this.f13489b = i + 4;
        fArr[i5] = f6;
    }

    @Override // b9.w0
    public void b(float f, float f4, float f5, boolean z, boolean z3, float f6, float f32) {
        c((byte) ((z ? 2 : 0) | 4 | (z3 ? 1 : 0)));
        i(5);
        float[] fArr = (float[]) this.d;
        int i = this.f13489b;
        int i2 = i + 1;
        this.f13489b = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f13489b = i3;
        fArr[i2] = f4;
        int i5 = i + 3;
        this.f13489b = i5;
        fArr[i3] = f5;
        int i6 = i + 4;
        this.f13489b = i6;
        fArr[i5] = f6;
        this.f13489b = i + 5;
        fArr[i6] = f32;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.io.Serializable, java.lang.Object] */
    public void c(byte b4) {
        int i = this.f13488a;
        byte[] bArr = (byte[]) this.f13490c;
        if (i == bArr.length) {
            ?? r06 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, r06, 0, bArr.length);
            this.f13490c = r06;
        }
        byte[] bArr2 = (byte[]) this.f13490c;
        int i2 = this.f13488a;
        this.f13488a = i2 + 1;
        bArr2[i2] = b4;
    }

    @Override // b9.w0
    public void close() {
        c((byte) 8);
    }

    @Override // b9.w0
    public void cubicTo(float f, float f4, float f5, float f6, float f32, float f35) {
        c((byte) 2);
        i(6);
        float[] fArr = (float[]) this.d;
        int i = this.f13489b;
        int i2 = i + 1;
        this.f13489b = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f13489b = i3;
        fArr[i2] = f4;
        int i5 = i + 3;
        this.f13489b = i5;
        fArr[i3] = f5;
        int i6 = i + 4;
        this.f13489b = i6;
        fArr[i5] = f6;
        int i21 = i + 5;
        this.f13489b = i21;
        fArr[i6] = f32;
        this.f13489b = i + 6;
        fArr[i21] = f35;
    }

    public int d() {
        int i = this.f13488a;
        int i2 = this.f13489b;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.f13488a = i3;
        if (i3 < i2) {
            return ((String) this.f13490c).charAt(i3);
        }
        return -1;
    }

    public Boolean e(Object obj2) {
        if (obj2 == null) {
            return null;
        }
        v();
        int i = this.f13488a;
        if (i == this.f13489b) {
            return null;
        }
        char cCharAt = ((String) this.f13490c).charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f13488a++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public float f(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        v();
        return o();
    }

    public boolean g(char c2) {
        int i = this.f13488a;
        boolean z = i < this.f13489b && ((String) this.f13490c).charAt(i) == c2;
        if (z) {
            this.f13488a++;
        }
        return z;
    }

    public boolean h(String str) {
        int length = str.length();
        int i = this.f13488a;
        boolean z = i <= this.f13489b - length && ((String) this.f13490c).substring(i, i + length).equals(str);
        if (z) {
            this.f13488a += length;
        }
        return z;
    }

    public void i(int i) {
        float[] fArr = (float[]) this.d;
        if (fArr.length < this.f13489b + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.d = fArr2;
        }
    }

    public boolean j() {
        return this.f13488a == this.f13489b;
    }

    public void k(w0 w0Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.f13488a; i2++) {
            byte b4 = ((byte[]) this.f13490c)[i2];
            if (b4 == 0) {
                float[] fArr = (float[]) this.d;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                w0Var.moveTo(f, fArr[i3]);
            } else if (b4 == 1) {
                float[] fArr2 = (float[]) this.d;
                int i5 = i + 1;
                float f4 = fArr2[i];
                i += 2;
                w0Var.lineTo(f4, fArr2[i5]);
            } else if (b4 == 2) {
                float[] fArr3 = (float[]) this.d;
                w0Var.cubicTo(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b4 == 3) {
                float[] fArr4 = (float[]) this.d;
                float f5 = fArr4[i];
                float f6 = fArr4[i + 1];
                int i6 = i + 3;
                float f32 = fArr4[i + 2];
                i += 4;
                w0Var.a(f5, f6, f32, fArr4[i6]);
            } else if (b4 != 8) {
                boolean z = (b4 & 2) != 0;
                boolean z3 = (b4 & 1) != 0;
                float[] fArr5 = (float[]) this.d;
                w0Var.b(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z3, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                w0Var.close();
            }
        }
    }

    @Override // b9.w0
    public void lineTo(float f, float f4) {
        c((byte) 1);
        i(2);
        float[] fArr = (float[]) this.d;
        int i = this.f13489b;
        int i2 = i + 1;
        this.f13489b = i2;
        fArr[i] = f;
        this.f13489b = i + 2;
        fArr[i2] = f4;
    }

    public void m(int i, int i2, int i3, int i5) {
        int i6 = this.f13489b;
        if (i < 0) {
            int i21 = this.f13488a;
            i += i21;
            i2 += 4 - ((i21 + 4) % 8);
        }
        if (i2 < 0) {
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        ((byte[]) this.f13490c)[(i * i6) + i2] = (byte) ((((CharSequence) this.d).charAt(i3) & (1 << (8 - i5))) == 0 ? 0 : 1);
    }

    @Override // b9.w0
    public void moveTo(float f, float f4) {
        c((byte) 0);
        i(2);
        float[] fArr = (float[]) this.d;
        int i = this.f13489b;
        int i2 = i + 1;
        this.f13489b = i2;
        fArr[i] = f;
        this.f13489b = i + 2;
        fArr[i2] = f4;
    }

    public Integer n() {
        int i = this.f13488a;
        if (i == this.f13489b) {
            return null;
        }
        String str = (String) this.f13490c;
        this.f13488a = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public float o() {
        w wVar = (w) this.d;
        float fA = wVar.a(this.f13488a, this.f13489b, (String) this.f13490c);
        if (!Float.isNaN(fA)) {
            this.f13488a = wVar.f13495a;
        }
        return fA;
    }

    public o0 p() {
        float fO = o();
        if (Float.isNaN(fO)) {
            return null;
        }
        j2 j2VarT = t();
        return j2VarT == null ? new o0(fO, j2.f13378px) : new o0(fO, j2VarT);
    }

    public String q() {
        String str = (String) this.f13490c;
        if (j()) {
            return null;
        }
        int i = this.f13488a;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iD = d();
        while (iD != -1 && iD != cCharAt) {
            iD = d();
        }
        if (iD == -1) {
            this.f13488a = i;
            return null;
        }
        int i2 = this.f13488a;
        this.f13488a = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public String r() {
        return s(zsc.p.SPACE_CHAR, false);
    }

    public String s(char c2, boolean z) {
        String str = (String) this.f13490c;
        if (j()) {
            return null;
        }
        char cCharAt = str.charAt(this.f13488a);
        if ((!z && l(cCharAt)) || cCharAt == c2) {
            return null;
        }
        int i = this.f13488a;
        int iD = d();
        while (iD != -1 && iD != c2 && (z || !l(iD))) {
            iD = d();
        }
        return str.substring(i, this.f13488a);
    }

    public j2 t() {
        String str = (String) this.f13490c;
        if (j()) {
            return null;
        }
        if (str.charAt(this.f13488a) == '%') {
            this.f13488a++;
            return j2.percent;
        }
        int i = this.f13488a;
        if (i > this.f13489b - 2) {
            return null;
        }
        try {
            j2 j2VarValueOf = j2.valueOf(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.f13488a += 2;
            return j2VarValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public float u() {
        v();
        w wVar = (w) this.d;
        float fA = wVar.a(this.f13488a, this.f13489b, (String) this.f13490c);
        if (!Float.isNaN(fA)) {
            this.f13488a = wVar.f13495a;
        }
        return fA;
    }

    public boolean v() {
        w();
        int i = this.f13488a;
        if (i == this.f13489b || ((String) this.f13490c).charAt(i) != ',') {
            return false;
        }
        this.f13488a++;
        w();
        return true;
    }

    public void w() {
        while (true) {
            int i = this.f13488a;
            if (i >= this.f13489b || !l(((String) this.f13490c).charAt(i))) {
                return;
            } else {
                this.f13488a++;
            }
        }
    }

    public void x(int i, int i2, int i3) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        m(i5, i6, i3, 1);
        int i21 = i2 - 1;
        m(i5, i21, i3, 2);
        int i22 = i - 1;
        m(i22, i6, i3, 3);
        m(i22, i21, i3, 4);
        m(i22, i2, i3, 5);
        m(i, i6, i3, 6);
        m(i, i21, i3, 7);
        m(i, i2, i3, 8);
    }
}
