package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int[] f26159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient char[] f26160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient byte[] f26161c;
    public final String d;
    public final char e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f26163h;

    public b(String str, String str2, boolean z, char c2, int i) {
        int[] iArr = new int[128];
        this.f26159a = iArr;
        char[] cArr = new char[64];
        this.f26160b = cArr;
        this.f26161c = new byte[64];
        this.d = str;
        this.f26162g = z;
        this.e = c2;
        this.f = i;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException(j6.a.l(length, "Base64Alphabet length must be exactly 64 (was ", ")"));
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < length; i2++) {
            char c3 = this.f26160b[i2];
            this.f26161c[i2] = (byte) c3;
            this.f26159a[c3] = i2;
        }
        if (z) {
            this.f26159a[c2] = -2;
        }
        this.f26163h = z ? a.PADDING_REQUIRED : a.PADDING_FORBIDDEN;
    }

    public final void a() {
        throw new IllegalArgumentException(String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", this.d, Character.valueOf(this.e)));
    }

    public final void b(char c2, String str, int i) {
        String strO;
        if (c2 <= ' ') {
            strO = "Illegal white space character (code 0x" + Integer.toHexString(c2) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units";
        } else {
            char c3 = this.e;
            if (c2 == c3) {
                strO = "Unexpected padding character ('" + c3 + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
            } else if (!Character.isDefined(c2) || Character.isISOControl(c2)) {
                strO = "Illegal character (code 0x" + Integer.toHexString(c2) + ") in base64 content";
            } else {
                strO = "Illegal character '" + c2 + "' (code 0x" + Integer.toHexString(c2) + ") in base64 content";
            }
        }
        if (str != null) {
            strO = com.google.android.gms.internal.mlkit_vision_face.a.o(strO, ": ", str);
        }
        throw new IllegalArgumentException(strO);
    }

    public final void c(String str, j9.c cVar) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt > ' ') {
                int[] iArr = this.f26159a;
                int i3 = cCharAt <= 127 ? iArr[cCharAt] : -1;
                if (i3 < 0) {
                    b(cCharAt, null, 0);
                    throw null;
                }
                if (i2 >= length) {
                    a();
                    throw null;
                }
                int i5 = i + 2;
                char cCharAt2 = str.charAt(i2);
                int i6 = cCharAt2 <= 127 ? iArr[cCharAt2] : -1;
                if (i6 < 0) {
                    b(cCharAt2, null, 1);
                    throw null;
                }
                int i21 = (i3 << 6) | i6;
                a aVar = this.f26163h;
                if (i5 >= length) {
                    if (aVar != a.PADDING_REQUIRED) {
                        cVar.f(i21 >> 4);
                        return;
                    } else {
                        a();
                        throw null;
                    }
                }
                int i22 = i + 3;
                char cCharAt3 = str.charAt(i5);
                int i32 = cCharAt3 <= 127 ? iArr[cCharAt3] : -1;
                String str2 = this.d;
                if (i32 >= 0) {
                    int i33 = (i21 << 6) | i32;
                    if (i22 >= length) {
                        if (aVar != a.PADDING_REQUIRED) {
                            cVar.g(i33 >> 2);
                            return;
                        } else {
                            a();
                            throw null;
                        }
                    }
                    i += 4;
                    char cCharAt4 = str.charAt(i22);
                    int i43 = cCharAt4 <= 127 ? iArr[cCharAt4] : -1;
                    if (i43 >= 0) {
                        int i59 = (i33 << 6) | i43;
                        int i66 = cVar.d;
                        int i74 = i66 + 2;
                        byte[] bArr = cVar.f172252c;
                        if (i74 < bArr.length) {
                            int i92 = i66 + 1;
                            cVar.d = i92;
                            bArr[i66] = (byte) (i59 >> 16);
                            cVar.d = i74;
                            bArr[i92] = (byte) (i59 >> 8);
                            cVar.d = i66 + 3;
                            bArr[i74] = (byte) i59;
                        } else {
                            cVar.f(i59 >> 16);
                            cVar.f(i59 >> 8);
                            cVar.f(i59);
                        }
                    } else {
                        if (i43 != -2) {
                            b(cCharAt4, null, 3);
                            throw null;
                        }
                        if (aVar == a.PADDING_FORBIDDEN) {
                            throw new IllegalArgumentException(p.a.p("Unexpected end of base64-encoded String: base64 variant '", str2, "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                        }
                        cVar.g(i33 >> 2);
                    }
                } else {
                    if (i32 != -2) {
                        b(cCharAt3, null, 2);
                        throw null;
                    }
                    if (aVar == a.PADDING_FORBIDDEN) {
                        throw new IllegalArgumentException(p.a.p("Unexpected end of base64-encoded String: base64 variant '", str2, "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                    }
                    if (i22 >= length) {
                        a();
                        throw null;
                    }
                    i += 4;
                    char cCharAt5 = str.charAt(i22);
                    char c2 = this.e;
                    if (cCharAt5 != c2) {
                        b(cCharAt5, "expected padding character '" + c2 + "'", 3);
                        throw null;
                    }
                    cVar.f(i21 >> 4);
                }
            } else {
                i = i2;
            }
        }
    }

    public final int d(char[] cArr, int i, int i2) {
        char[] cArr2 = this.f26160b;
        cArr[i2] = cArr2[(i >> 18) & 63];
        cArr[i2 + 1] = cArr2[(i >> 12) & 63];
        int i3 = i2 + 3;
        cArr[i2 + 2] = cArr2[(i >> 6) & 63];
        int i5 = i2 + 4;
        cArr[i3] = cArr2[i & 63];
        return i5;
    }

    public final int e(char[] cArr, int i, int i2, int i3) {
        char[] cArr2 = this.f26160b;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i5 = i3 + 2;
        cArr[i3 + 1] = cArr2[(i >> 12) & 63];
        if (!this.f26162g) {
            if (i2 != 2) {
                return i5;
            }
            int i6 = i3 + 3;
            cArr[i5] = cArr2[(i >> 6) & 63];
            return i6;
        }
        int i21 = i3 + 3;
        char c2 = this.e;
        cArr[i5] = i2 == 2 ? cArr2[(i >> 6) & 63] : c2;
        int i22 = i3 + 4;
        cArr[i21] = c2;
        return i22;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != b.class) {
            return false;
        }
        b bVar = (b) obj2;
        return bVar.e == this.e && bVar.f == this.f && bVar.f26162g == this.f26162g && bVar.f26163h == this.f26163h && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }

    public b(b bVar) {
        a aVar = bVar.f26163h;
        int[] iArr = new int[128];
        this.f26159a = iArr;
        char[] cArr = new char[64];
        this.f26160b = cArr;
        byte[] bArr = new byte[64];
        this.f26161c = bArr;
        this.d = "MIME-NO-LINEFEEDS";
        byte[] bArr2 = bVar.f26161c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = bVar.f26160b;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = bVar.f26159a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f26162g = true;
        this.e = '=';
        this.f = Integer.MAX_VALUE;
        this.f26163h = aVar;
    }
}
