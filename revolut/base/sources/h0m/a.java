package h0m;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    public static int a(String from, String to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        int length = from.length();
        int length2 = to6.length();
        int i = length + 1;
        int[][] iArr = new int[i][];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = new int[length2 + 1];
        }
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                iArr[i3][0] = i3;
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                iArr[0][i5] = i5;
                if (i5 == length2) {
                    break;
                }
                i5++;
            }
        }
        if (1 <= length) {
            int i6 = 1;
            while (true) {
                if (1 <= length2) {
                    int i21 = 1;
                    while (true) {
                        int[] iArr2 = iArr[i6];
                        int i22 = i6 - 1;
                        int[] iArr3 = iArr[i22];
                        int i32 = i21 - 1;
                        iArr2[i21] = Math.min(iArr3[i21] + 1, Math.min(iArr2[i32] + 1, iArr3[i32] + (from.charAt(i22) == to6.charAt(i32) ? 0 : 1)));
                        if (i21 == length2) {
                            break;
                        }
                        i21++;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        return iArr[length][length2];
    }
}
