package cim;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class c extends b {
    public static int j(int i, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i2 : other) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static Comparable k(Comparable a7, Comparable b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return a7.compareTo(b4) >= 0 ? a7 : b4;
    }

    public static Comparable l(Comparable a7, Comparable b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return a7.compareTo(b4) <= 0 ? a7 : b4;
    }
}
