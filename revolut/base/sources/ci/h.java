package ci;

import kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f24335b = {1, 1, 1, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f24336c = {3, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24337a;

    public /* synthetic */ h(int i) {
        this.f24337a = i;
    }

    public static void T(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
    }

    public static int U(int i, String str) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static d V(int i, String str) {
        int length = str.length();
        if (i >= length) {
            return d.UNCODABLE;
        }
        char cCharAt = str.charAt(i);
        if (cCharAt == 241) {
            return d.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return d.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return d.ONE_DIGIT;
        }
        char cCharAt2 = str.charAt(i2);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? d.ONE_DIGIT : d.TWO_DIGITS;
    }

    public static void W(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    public static void X(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // kotlin.jvm.internal.s, vh.d
    public final yh.b b(String str, vh.a aVar, int i, int i2, aim.f fVar) {
        switch (this.f24337a) {
            case 0:
                if (aVar == vh.a.ITF) {
                    return super.b(str, aVar, i, i2, fVar);
                }
                throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
            case 1:
                if (aVar == vh.a.CODE_128) {
                    return super.b(str, aVar, i, i2, fVar);
                }
                throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
            case 2:
                if (aVar == vh.a.CODE_39) {
                    return super.b(str, aVar, i, i2, fVar);
                }
                throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
            default:
                if (aVar == vh.a.CODE_93) {
                    return super.b(str, aVar, i, i2, fVar);
                }
                throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    @Override // kotlin.jvm.internal.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean[] d(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.h.d(java.lang.String):boolean[]");
    }
}
