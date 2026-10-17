package io.grpc.okhttp.internal;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f163000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163001c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char[] f163002g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f162999a = name;
        this.f163000b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r6 = r14.d;
        r3 = new java.lang.String(r5, r6, r14.e - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0114, code lost:
    
        r14.e = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.internal.d.a():java.lang.String");
    }

    public final int b(int i) {
        int i2;
        int i3;
        int i5 = i + 1;
        int i6 = this.f163000b;
        String str = this.f162999a;
        if (i5 >= i6) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f163002g;
        char c2 = cArr[i];
        if (c2 >= '0' && c2 <= '9') {
            i2 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i2 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i2 = c2 - '7';
        }
        char c3 = cArr[i5];
        if (c3 >= '0' && c3 <= '9') {
            i3 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i3 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i3 = c3 - '7';
        }
        return (i2 << 4) + i3;
    }

    public final char c() {
        int i;
        int i2;
        int i3 = this.f163001c + 1;
        this.f163001c = i3;
        int i5 = this.f163000b;
        if (i3 == i5) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f162999a);
        }
        char c2 = this.f163002g[i3];
        if (c2 != ' ' && c2 != '%' && c2 != '\\' && c2 != '_' && c2 != '\"' && c2 != '#') {
            switch (c2) {
                default:
                    switch (c2) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iB = b(i3);
                            this.f163001c++;
                            if (iB < 128) {
                                return (char) iB;
                            }
                            if (iB < 192 || iB > 247) {
                                return '?';
                            }
                            if (iB <= 223) {
                                i = iB & 31;
                                i2 = 1;
                            } else if (iB <= 239) {
                                i = iB & 15;
                                i2 = 2;
                            } else {
                                i = iB & 7;
                                i2 = 3;
                            }
                            for (int i6 = 0; i6 < i2; i6++) {
                                int i21 = this.f163001c;
                                int i22 = i21 + 1;
                                this.f163001c = i22;
                                if (i22 == i5 || this.f163002g[i22] != '\\') {
                                    return '?';
                                }
                                int i32 = i21 + 2;
                                this.f163001c = i32;
                                int iB2 = b(i32);
                                this.f163001c++;
                                if ((iB2 & 192) != 128) {
                                    return '?';
                                }
                                i = (i << 6) + (iB2 & 63);
                            }
                            return (char) i;
                    }
                case '*':
                case '+':
                case ',':
                    return c2;
            }
        }
        return c2;
    }

    public final String d() {
        int i;
        int i2;
        int i3;
        char c2;
        int i5;
        char c3;
        char c5;
        while (true) {
            i = this.f163001c;
            i2 = this.f163000b;
            if (i >= i2 || this.f163002g[i] != ' ') {
                break;
            }
            this.f163001c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        this.f163001c = i + 1;
        while (true) {
            i3 = this.f163001c;
            if (i3 >= i2 || (c5 = this.f163002g[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.f163001c = i3 + 1;
        }
        String str = this.f162999a;
        if (i3 >= i2) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.e = i3;
        if (this.f163002g[i3] == ' ') {
            while (true) {
                i5 = this.f163001c;
                if (i5 >= i2 || (c3 = this.f163002g[i5]) == '=' || c3 != ' ') {
                    break;
                }
                this.f163001c = i5 + 1;
            }
            if (this.f163002g[i5] != '=' || i5 == i2) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f163001c++;
        while (true) {
            int i6 = this.f163001c;
            if (i6 >= i2 || this.f163002g[i6] != ' ') {
                break;
            }
            this.f163001c = i6 + 1;
        }
        int i21 = this.e;
        int i22 = this.d;
        if (i21 - i22 > 4) {
            char[] cArr = this.f163002g;
            if (cArr[i22 + 3] == '.' && (((c2 = cArr[i22]) == 'O' || c2 == 'o') && ((cArr[i22 + 1] == 'I' || cArr[i22 + 1] == 'i') && (cArr[i22 + 2] == 'D' || cArr[i22 + 2] == 'd')))) {
                this.d = i22 + 4;
            }
        }
        char[] cArr2 = this.f163002g;
        int i32 = this.d;
        return new String(cArr2, i32, i21 - i32);
    }
}
