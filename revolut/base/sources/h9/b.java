package h9;

import a0.d;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import j9.h;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f150069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f150070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f150071c;
    public final boolean d;
    public final boolean e;
    public int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f150072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f150073h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f150074j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f150075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f150076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f150077n;
    public boolean o;

    public b(int i) {
        this.f150069a = null;
        this.k = 0;
        this.o = true;
        this.f150071c = i;
        this.d = false;
        this.e = true;
        this.f150070b = new AtomicReference(new a(64, 4, new int[512], new String[128], CaptureActivity.RESULT_EXIT_USER_FLOW, 512));
    }

    public final int a(int i) {
        return (i & (this.f150072g - 1)) << 2;
    }

    public final int b(int i) {
        int iA = a(i);
        int[] iArr = this.f;
        if (iArr[iA + 3] == 0) {
            return iA;
        }
        if (this.k > (this.f150072g >> 1)) {
            int iD = (this.f150076m - d()) >> 2;
            int i2 = this.k;
            if (iD > ((i2 + 1) >> 7) || i2 > ((double) this.f150072g) * 0.8d) {
                return c(i);
            }
        }
        int i3 = this.f150073h + ((iA >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i5 = this.i;
        int i6 = this.f150074j;
        int i21 = i5 + ((iA >> (i6 + 2)) << i6);
        int i22 = (1 << i6) + i21;
        while (i21 < i22) {
            if (iArr[i21 + 3] == 0) {
                return i21;
            }
            i21 += 4;
        }
        int i32 = this.f150076m;
        int i33 = i32 + 4;
        this.f150076m = i33;
        int i43 = this.f150072g;
        if (i33 < (i43 << 3)) {
            return i32;
        }
        if (!this.e || i43 <= 1024) {
            return c(i);
        }
        StringBuilder sb6 = new StringBuilder("Spill-over slots in symbol table with ");
        sb6.append(this.k);
        sb6.append(" entries, hash area of ");
        sb6.append(this.f150072g);
        sb6.append(" slots is now full (all ");
        throw new IllegalStateException(j6.a.v(sb6, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`", this.f150072g >> 3));
    }

    public final int c(int i) {
        this.o = false;
        int[] iArr = this.f;
        String[] strArr = this.f150075l;
        int i2 = this.f150072g;
        int i3 = this.k;
        int i5 = i2 + i2;
        int i6 = this.f150076m;
        if (i5 > 65536) {
            o(true);
        } else {
            this.f = new int[iArr.length + (i2 << 3)];
            this.f150072g = i5;
            int i21 = i5 << 2;
            this.f150073h = i21;
            this.i = i21 + (i21 >> 1);
            int i22 = i5 >> 2;
            this.f150074j = i22 < 64 ? 4 : i22 <= 256 ? 5 : i22 <= 1024 ? 6 : 7;
            this.f150075l = new String[strArr.length << 1];
            o(false);
            int[] iArr2 = new int[16];
            int i32 = 0;
            for (int i33 = 0; i33 < i6; i33 += 4) {
                int i43 = iArr[i33 + 3];
                if (i43 != 0) {
                    i32++;
                    String str = strArr[i33 >> 2];
                    if (i43 == 1) {
                        iArr2[0] = iArr[i33];
                        g(iArr2, 1, str);
                    } else if (i43 == 2) {
                        iArr2[0] = iArr[i33];
                        iArr2[1] = iArr[i33 + 1];
                        g(iArr2, 2, str);
                    } else if (i43 != 3) {
                        if (i43 > iArr2.length) {
                            iArr2 = new int[i43];
                        }
                        System.arraycopy(iArr, iArr[i33 + 1], iArr2, 0, i43);
                        g(iArr2, i43, str);
                    } else {
                        iArr2[0] = iArr[i33];
                        iArr2[1] = iArr[i33 + 1];
                        iArr2[2] = iArr[i33 + 2];
                        g(iArr2, 3, str);
                    }
                }
            }
            if (i32 != i3) {
                throw new IllegalStateException(d.g(i3, i32, "Failed rehash(): old count=", ", copyCount="));
            }
        }
        int iA = a(i);
        int[] iArr3 = this.f;
        if (iArr3[iA + 3] == 0) {
            return iA;
        }
        int i59 = this.f150073h + ((iA >> 3) << 2);
        if (iArr3[i59 + 3] == 0) {
            return i59;
        }
        int i66 = this.i;
        int i74 = this.f150074j;
        int i92 = i66 + ((iA >> (i74 + 2)) << i74);
        int i96 = (1 << i74) + i92;
        while (i92 < i96) {
            if (iArr3[i92 + 3] == 0) {
                return i92;
            }
            i92 += 4;
        }
        int i99 = this.f150076m;
        this.f150076m = i99 + 4;
        return i99;
    }

    public final int d() {
        int i = this.f150072g;
        return (i << 3) - i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int[] r8, int r9, int r10) {
        /*
            r7 = this;
            int[] r0 = r7.f
            r1 = 1
            r2 = 0
            switch(r9) {
                case 4: goto L51;
                case 5: goto L43;
                case 6: goto L35;
                case 7: goto L27;
                case 8: goto L1b;
                default: goto L7;
            }
        L7:
            r0 = r2
        L8:
            int r3 = r0 + 1
            r0 = r8[r0]
            int[] r4 = r7.f
            int r5 = r10 + 1
            r10 = r4[r10]
            if (r0 == r10) goto L15
            return r2
        L15:
            if (r3 < r9) goto L18
            return r1
        L18:
            r0 = r3
            r10 = r5
            goto L8
        L1b:
            r9 = r8[r2]
            int r3 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L24
            return r2
        L24:
            r9 = r1
            r10 = r3
            goto L28
        L27:
            r9 = r2
        L28:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L33
            return r2
        L33:
            r10 = r4
            goto L36
        L35:
            r3 = r2
        L36:
            int r9 = r3 + 1
            r3 = r8[r3]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r3 == r10) goto L41
            return r2
        L41:
            r10 = r4
            goto L44
        L43:
            r9 = r2
        L44:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L4f
            return r2
        L4f:
            r10 = r4
            goto L52
        L51:
            r3 = r2
        L52:
            int r9 = r3 + 1
            r4 = r8[r3]
            int r5 = r10 + 1
            r6 = r0[r10]
            if (r4 == r6) goto L5d
            return r2
        L5d:
            int r4 = r3 + 2
            r9 = r8[r9]
            int r6 = r10 + 2
            r5 = r0[r5]
            if (r9 == r5) goto L68
            return r2
        L68:
            int r3 = r3 + 3
            r9 = r8[r4]
            int r10 = r10 + 3
            r4 = r0[r6]
            if (r9 == r4) goto L73
            return r2
        L73:
            r8 = r8[r3]
            r9 = r0[r10]
            if (r8 == r9) goto L7a
            return r2
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.b.e(int[], int, int):boolean");
    }

    public final void f() {
        if (this.o) {
            if (this.f150069a == null) {
                if (this.k != 0) {
                    throw new IllegalStateException("Cannot add names to Placeholder symbol table");
                }
                throw new IllegalStateException("Cannot add names to Root symbol table");
            }
            int[] iArr = this.f;
            this.f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f150075l;
            this.f150075l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.o = false;
        }
    }

    public final String g(int[] iArr, int i, String str) {
        int iB;
        f();
        if (this.d) {
            str = h.f172262b.a(str);
        }
        if (i == 1) {
            iB = b(h(iArr[0]));
            int[] iArr2 = this.f;
            iArr2[iB] = iArr[0];
            iArr2[iB + 3] = 1;
        } else if (i == 2) {
            iB = b(i(iArr[0], iArr[1]));
            int[] iArr3 = this.f;
            iArr3[iB] = iArr[0];
            iArr3[iB + 1] = iArr[1];
            iArr3[iB + 3] = 2;
        } else if (i != 3) {
            int iK = k(i, iArr);
            iB = b(iK);
            int[] iArr4 = this.f;
            iArr4[iB] = iK;
            int i2 = this.f150077n;
            int i3 = i2 + i;
            if (i3 > iArr4.length) {
                this.f = Arrays.copyOf(this.f, Math.max(i3 - iArr4.length, Math.min(4096, this.f150072g)) + this.f.length);
            }
            System.arraycopy(iArr, 0, this.f, i2, i);
            this.f150077n += i;
            int[] iArr5 = this.f;
            iArr5[iB + 1] = i2;
            iArr5[iB + 3] = i;
        } else {
            iB = b(j(iArr[0], iArr[1], iArr[2]));
            int[] iArr6 = this.f;
            iArr6[iB] = iArr[0];
            iArr6[iB + 1] = iArr[1];
            iArr6[iB + 2] = iArr[2];
            iArr6[iB + 3] = 3;
        }
        this.f150075l[iB >> 2] = str;
        this.k++;
        return str;
    }

    public final int h(int i) {
        int i2 = i ^ this.f150071c;
        int i3 = i2 + (i2 >>> 16);
        int i5 = i3 ^ (i3 << 3);
        return i5 + (i5 >>> 12);
    }

    public final int i(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i5 = this.f150071c ^ ((i2 * 33) + (i3 ^ (i3 >>> 9)));
        int i6 = i5 + (i5 >>> 16);
        int i21 = i6 ^ (i6 >>> 4);
        return i21 + (i21 << 3);
    }

    public final int j(int i, int i2, int i3) {
        int i5 = i ^ this.f150071c;
        int i6 = (((i5 + (i5 >>> 9)) * 31) + i2) * 33;
        int i21 = (i6 + (i6 >>> 15)) ^ i3;
        int i22 = i21 + (i21 >>> 4);
        int i32 = i22 + (i22 >>> 15);
        return i32 ^ (i32 << 9);
    }

    public final int k(int i, int[] iArr) {
        if (i < 4) {
            throw new IllegalArgumentException();
        }
        int i2 = iArr[0] ^ this.f150071c;
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i5 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i6 = i5 + (i5 >>> 4);
        for (int i21 = 3; i21 < i; i21++) {
            int i22 = iArr[i21];
            i6 += i22 ^ (i22 >> 21);
        }
        int i32 = i6 * 65599;
        int i33 = i32 + (i32 >>> 19);
        return (i33 << 5) ^ i33;
    }

    public final String l(int i) {
        int iA = a(h(i));
        int[] iArr = this.f;
        int i2 = iArr[iA + 3];
        if (i2 == 1) {
            if (iArr[iA] == i) {
                return this.f150075l[iA >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        int i3 = this.f150073h + ((iA >> 3) << 2);
        int i5 = iArr[i3 + 3];
        if (i5 == 1) {
            if (iArr[i3] == i) {
                return this.f150075l[i3 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.i;
        int i21 = this.f150074j;
        int i22 = i6 + ((iA >> (i21 + 2)) << i21);
        int i32 = (1 << i21) + i22;
        while (true) {
            if (i22 < i32) {
                int i33 = iArr[i22 + 3];
                if (i == iArr[i22] && 1 == i33) {
                    return this.f150075l[i22 >> 2];
                }
                if (i33 == 0) {
                    break;
                }
                i22 += 4;
            } else {
                for (int iD = d(); iD < this.f150076m; iD += 4) {
                    if (i == iArr[iD] && 1 == iArr[iD + 3]) {
                        return this.f150075l[iD >> 2];
                    }
                }
            }
        }
        return null;
    }

    public final String m(int i, int i2) {
        int iA = a(i(i, i2));
        int[] iArr = this.f;
        int i3 = iArr[iA + 3];
        if (i3 == 2) {
            if (i == iArr[iA] && i2 == iArr[iA + 1]) {
                return this.f150075l[iA >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i5 = this.f150073h + ((iA >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 2) {
            if (i == iArr[i5] && i2 == iArr[i5 + 1]) {
                return this.f150075l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i21 = this.i;
        int i22 = this.f150074j;
        int i32 = i21 + ((iA >> (i22 + 2)) << i22);
        int i33 = (1 << i22) + i32;
        while (true) {
            if (i32 < i33) {
                int i43 = iArr[i32 + 3];
                if (i == iArr[i32] && i2 == iArr[i32 + 1] && 2 == i43) {
                    return this.f150075l[i32 >> 2];
                }
                if (i43 == 0) {
                    break;
                }
                i32 += 4;
            } else {
                for (int iD = d(); iD < this.f150076m; iD += 4) {
                    if (i == iArr[iD] && i2 == iArr[iD + 1] && 2 == iArr[iD + 3]) {
                        return this.f150075l[iD >> 2];
                    }
                }
            }
        }
        return null;
    }

    public final String n(int i, int i2, int i3) {
        int iA = a(j(i, i2, i3));
        int[] iArr = this.f;
        int i5 = iArr[iA + 3];
        if (i5 == 3) {
            if (i == iArr[iA] && iArr[iA + 1] == i2 && iArr[iA + 2] == i3) {
                return this.f150075l[iA >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.f150073h + ((iA >> 3) << 2);
        int i21 = iArr[i6 + 3];
        if (i21 == 3) {
            if (i == iArr[i6] && iArr[i6 + 1] == i2 && iArr[i6 + 2] == i3) {
                return this.f150075l[i6 >> 2];
            }
        } else if (i21 == 0) {
            return null;
        }
        int i22 = this.i;
        int i32 = this.f150074j;
        int i33 = i22 + ((iA >> (i32 + 2)) << i32);
        int i43 = (1 << i32) + i33;
        while (true) {
            if (i33 < i43) {
                int i59 = iArr[i33 + 3];
                if (i == iArr[i33] && i2 == iArr[i33 + 1] && i3 == iArr[i33 + 2] && 3 == i59) {
                    return this.f150075l[i33 >> 2];
                }
                if (i59 == 0) {
                    break;
                }
                i33 += 4;
            } else {
                for (int iD = d(); iD < this.f150076m; iD += 4) {
                    if (i == iArr[iD] && i2 == iArr[iD + 1] && i3 == iArr[iD + 2] && 3 == iArr[iD + 3]) {
                        return this.f150075l[iD >> 2];
                    }
                }
            }
        }
        return null;
    }

    public final void o(boolean z) {
        this.k = 0;
        this.f150076m = d();
        this.f150077n = this.f150072g << 3;
        if (z) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.f150075l, (Object) null);
        }
    }

    public final String toString() {
        int i = this.f150073h;
        int i2 = 0;
        int i3 = 0;
        for (int i5 = 3; i5 < i; i5 += 4) {
            if (this.f[i5] != 0) {
                i3++;
            }
        }
        int i6 = this.i;
        int i21 = 0;
        for (int i22 = this.f150073h + 3; i22 < i6; i22 += 4) {
            if (this.f[i22] != 0) {
                i21++;
            }
        }
        int i32 = this.i + 3;
        int i33 = this.f150072g + i32;
        int i43 = 0;
        while (i32 < i33) {
            if (this.f[i32] != 0) {
                i43++;
            }
            i32 += 4;
        }
        int iD = (this.f150076m - d()) >> 2;
        int i59 = this.f150072g << 3;
        for (int i66 = 3; i66 < i59; i66 += 4) {
            if (this.f[i66] != 0) {
                i2++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", b.class.getName(), Integer.valueOf(this.k), Integer.valueOf(this.f150072g), Integer.valueOf(i3), Integer.valueOf(i21), Integer.valueOf(i43), Integer.valueOf(iD), Integer.valueOf(i3 + i21 + i43 + iD), Integer.valueOf(i2));
    }

    public b(b bVar, int i, a aVar, boolean z, boolean z3) {
        this.f150069a = bVar;
        this.f150071c = i;
        this.d = z;
        this.e = z3;
        this.f150070b = null;
        this.k = aVar.f150066b;
        int i2 = aVar.f150065a;
        this.f150072g = i2;
        int i3 = i2 << 2;
        this.f150073h = i3;
        this.i = i3 + (i3 >> 1);
        this.f150074j = aVar.f150067c;
        this.f = aVar.d;
        this.f150075l = aVar.e;
        this.f150076m = aVar.f;
        this.f150077n = aVar.f150068g;
        this.o = true;
    }

    public b(a aVar) {
        this.f150069a = null;
        this.f150071c = 0;
        this.d = false;
        this.e = true;
        this.f150070b = null;
        this.k = -1;
        int[] iArr = aVar.d;
        this.f = iArr;
        this.f150075l = aVar.e;
        this.f150072g = aVar.f150065a;
        int length = iArr.length;
        this.f150073h = length;
        this.i = length;
        this.f150074j = 1;
        this.f150076m = length;
        this.f150077n = length;
        this.o = true;
    }
}
