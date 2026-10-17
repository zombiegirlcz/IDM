package j9;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f172264j = new char[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f172265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f172266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f172267c;
    public boolean d;
    public int e;
    public char[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f172268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f172269h;
    public char[] i;

    public j(a aVar) {
        this.f172265a = aVar;
    }

    public final void a(int i, int i2, String str) {
        if (this.f172266b >= 0) {
            i(i2);
        }
        this.f172269h = null;
        this.i = null;
        char[] cArr = this.f;
        int length = cArr.length;
        int i3 = this.f172268g;
        int i5 = length - i3;
        if (i5 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.f172268g += i2;
            return;
        }
        if (i5 > 0) {
            int i6 = i + i5;
            str.getChars(i, i6, cArr, i3);
            i2 -= i5;
            i = i6;
        }
        while (true) {
            e();
            int iMin = Math.min(this.f.length, i2);
            int i21 = i + iMin;
            str.getChars(i, i21, this.f, 0);
            this.f172268g += iMin;
            i2 -= iMin;
            if (i2 <= 0) {
                return;
            } else {
                i = i21;
            }
        }
    }

    public final void b(char[] cArr, int i, int i2) {
        if (this.f172266b >= 0) {
            i(i2);
        }
        this.f172269h = null;
        this.i = null;
        char[] cArr2 = this.f;
        int length = cArr2.length;
        int i3 = this.f172268g;
        int i5 = length - i3;
        if (i5 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.f172268g += i2;
            return;
        }
        if (i5 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i5);
            i += i5;
            i2 -= i5;
        }
        do {
            e();
            int iMin = Math.min(this.f.length, i2);
            System.arraycopy(cArr, i, this.f, 0, iMin);
            this.f172268g += iMin;
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final String c() {
        if (this.f172269h == null) {
            char[] cArr = this.i;
            if (cArr != null) {
                this.f172269h = new String(cArr);
            } else {
                if (this.f172266b >= 0) {
                    this.f172269h = "";
                    return "";
                }
                int i = this.e;
                int i2 = this.f172268g;
                if (i == 0) {
                    this.f172269h = i2 != 0 ? new String(this.f, 0, i2) : "";
                } else {
                    StringBuilder sb6 = new StringBuilder(i + i2);
                    ArrayList arrayList = this.f172267c;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            char[] cArr2 = (char[]) this.f172267c.get(i3);
                            sb6.append(cArr2, 0, cArr2.length);
                        }
                    }
                    sb6.append(this.f, 0, this.f172268g);
                    this.f172269h = sb6.toString();
                }
            }
        }
        return this.f172269h;
    }

    public final char[] d() {
        char[] cArr;
        this.f172266b = -1;
        this.f172268g = 0;
        this.f172269h = null;
        this.i = null;
        if (this.d) {
            this.d = false;
            this.f172267c.clear();
            this.e = 0;
            this.f172268g = 0;
        }
        char[] cArr2 = this.f;
        if (cArr2 != null) {
            return cArr2;
        }
        a aVar = this.f172265a;
        if (aVar != null) {
            int i = a.d[2];
            int i2 = i > 0 ? i : 0;
            cArr = (char[]) aVar.f172247b.getAndSet(2, null);
            if (cArr == null || cArr.length < i2) {
                cArr = new char[i2];
            }
        } else {
            cArr = new char[Math.max(0, 500)];
        }
        this.f = cArr;
        return cArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026 A[PHI: r1
      0x0026: PHI (r1v8 int) = (r1v6 int), (r1v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f172267c
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f172267c = r0
        Lb:
            char[] r0 = r3.f
            r1 = 1
            r3.d = r1
            java.util.ArrayList r1 = r3.f172267c
            r1.add(r0)
            int r1 = r3.e
            int r2 = r0.length
            int r1 = r1 + r2
            r3.e = r1
            r1 = 0
            r3.f172268g = r1
            int r0 = r0.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L28
        L26:
            r0 = r1
            goto L2d
        L28:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L2d
            goto L26
        L2d:
            char[] r0 = new char[r0]
            r3.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.j.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final char[] f() {
        /*
            r2 = this;
            java.util.ArrayList r0 = r2.f172267c
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f172267c = r0
        Lb:
            r0 = 1
            r2.d = r0
            java.util.ArrayList r0 = r2.f172267c
            char[] r1 = r2.f
            r0.add(r1)
            char[] r0 = r2.f
            int r0 = r0.length
            int r1 = r2.e
            int r1 = r1 + r0
            r2.e = r1
            r1 = 0
            r2.f172268g = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L29
        L27:
            r0 = r1
            goto L2e
        L29:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L2e
            goto L27
        L2e:
            char[] r0 = new char[r0]
            r2.f = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.j.f():char[]");
    }

    public final void g() {
        char[] cArr;
        this.f172266b = -1;
        this.f172268g = 0;
        this.i = null;
        if (this.d) {
            this.d = false;
            this.f172267c.clear();
            this.e = 0;
            this.f172268g = 0;
        }
        a aVar = this.f172265a;
        if (aVar == null || (cArr = this.f) == null) {
            return;
        }
        this.f = null;
        aVar.f172247b.set(2, cArr);
    }

    public final String h(int i) {
        this.f172268g = i;
        if (this.e > 0) {
            return c();
        }
        String str = i == 0 ? "" : new String(this.f, 0, i);
        this.f172269h = str;
        return str;
    }

    public final void i(int i) {
        char[] cArr;
        this.f172266b = -1;
        char[] cArr2 = this.f;
        if (cArr2 == null || i > cArr2.length) {
            a aVar = this.f172265a;
            if (aVar != null) {
                int i2 = a.d[2];
                if (i < i2) {
                    i = i2;
                }
                cArr = (char[]) aVar.f172247b.getAndSet(2, null);
                if (cArr == null || cArr.length < i) {
                    cArr = new char[i];
                }
            } else {
                cArr = new char[Math.max(i, 500)];
            }
            this.f = cArr;
        }
        this.e = 0;
        this.f172268g = 0;
    }

    public final String toString() {
        return c();
    }

    public j(char[] cArr) {
        this.f172265a = null;
        this.f = cArr;
        this.f172268g = cArr.length;
        this.f172266b = -1;
    }
}
