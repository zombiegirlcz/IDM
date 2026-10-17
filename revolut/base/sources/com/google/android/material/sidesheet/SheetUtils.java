package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes16.dex */
final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f, float f4) {
        return Math.abs(f) > Math.abs(f4);
    }
}
