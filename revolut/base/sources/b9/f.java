package b9;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends v0 {
    public f(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int y(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String A() {
        int i;
        int i2;
        String str = (String) this.f13490c;
        if (j()) {
            i2 = this.f13488a;
        } else {
            int i3 = this.f13488a;
            int iCharAt = str.charAt(i3);
            if (iCharAt == 45) {
                iCharAt = d();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i3;
            } else {
                int iD = d();
                while (true) {
                    if ((iD < 65 || iD > 90) && ((iD < 97 || iD > 122) && !((iD >= 48 && iD <= 57) || iD == 45 || iD == 95))) {
                        break;
                    }
                    iD = d();
                }
                i = this.f13488a;
            }
            this.f13488a = i3;
            i2 = i;
        }
        int i5 = this.f13488a;
        if (i2 == i5) {
            return null;
        }
        String strSubstring = str.substring(i5, i2);
        this.f13488a = i2;
        return strSubstring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x026b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [b9.e] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r11v12, types: [b9.d] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [b9.g] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v10, types: [b9.s] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [b9.s] */
    /* JADX WARN: Type inference failed for: r8v13, types: [b9.s] */
    /* JADX WARN: Type inference failed for: r8v14, types: [b9.s] */
    /* JADX WARN: Type inference failed for: r8v15, types: [b9.s] */
    /* JADX WARN: Type inference failed for: r8v16, types: [b9.s] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v20, types: [b9.s] */
    /* JADX WARN: Type inference failed for: r8v21, types: [b9.s] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [b9.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList B() {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.f.B():java.util.ArrayList");
    }

    public final String z() {
        int iY;
        if (j()) {
            return null;
        }
        char cCharAt = ((String) this.f13490c).charAt(this.f13488a);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb6 = new StringBuilder();
        this.f13488a++;
        int iIntValue = n().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = n().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = n().intValue();
                    } else {
                        int iY2 = y(iIntValue);
                        if (iY2 != -1) {
                            for (int i = 1; i <= 5 && (iY = y((iIntValue = n().intValue()))) != -1; i++) {
                                iY2 = (iY2 * 16) + iY;
                            }
                            sb6.append((char) iY2);
                        }
                    }
                }
            }
            sb6.append((char) iIntValue);
            iIntValue = n().intValue();
        }
        return sb6.toString();
    }
}
