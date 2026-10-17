package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class n implements j7 {
    private final int area(Bitmap bitmap) {
        return bitmap.getWidth() * bitmap.getHeight();
    }

    private final boolean isOutsideOfBitmap(fa faVar) {
        return faVar.getLeft() < 0 || faVar.getTop() < 0;
    }

    public final int calculateAdjustmentX(@NotNull fa cropRectangle, int i) {
        Intrinsics.checkNotNullParameter(cropRectangle, "cropRectangle");
        if (cropRectangle.getLeft() < 0) {
            return -cropRectangle.getLeft();
        }
        if (cropRectangle.getRight() > i) {
            return i - cropRectangle.getRight();
        }
        return 0;
    }

    public final int calculateAdjustmentY(@NotNull fa cropRectangle, int i) {
        Intrinsics.checkNotNullParameter(cropRectangle, "cropRectangle");
        if (cropRectangle.getTop() < 0) {
            return -cropRectangle.getTop();
        }
        if (cropRectangle.getBottom() > i) {
            return i - cropRectangle.getBottom();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    @Override // com.fourthline.vision.internal.j7
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap crop(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r10, @org.jetbrains.annotations.NotNull com.fourthline.vision.internal.fa r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "cropRectangle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.fourthline.vision.internal.fa r1 = new com.fourthline.vision.internal.fa
            int r0 = r10.getWidth()
            int r2 = r10.getHeight()
            r3 = 0
            r1.<init>(r3, r3, r0, r2)
            int r0 = r10.getWidth()
            int r0 = r9.calculateAdjustmentX(r11, r0)
            int r2 = r10.getHeight()
            int r2 = r9.calculateAdjustmentY(r11, r2)
            com.fourthline.vision.internal.fa r0 = r11.translate(r0, r2)
            int r2 = r11.area()
            int r3 = r9.area(r10)
            if (r2 < r3) goto L37
            goto L43
        L37:
            boolean r2 = r9.isOutsideOfBitmap(r0)
            if (r2 == 0) goto L45
            boolean r0 = r9.isOutsideOfBitmap(r11)
            if (r0 == 0) goto L46
        L43:
            r11 = r1
            goto L46
        L45:
            r11 = r0
        L46:
            int r3 = r11.getLeft()     // Catch: java.lang.Throwable -> L6e
            int r4 = r11.getTop()     // Catch: java.lang.Throwable -> L6e
            int r5 = r11.width()     // Catch: java.lang.Throwable -> L6e
            int r6 = r11.height()     // Catch: java.lang.Throwable -> L6e
            android.graphics.Matrix r7 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L6e
            r7.<init>()     // Catch: java.lang.Throwable -> L6e
            float r0 = (float) r12     // Catch: java.lang.Throwable -> L6e
            r7.postRotate(r0)     // Catch: java.lang.Throwable -> L6e
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L6e
            r8 = 0
            r2 = r10
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6b
            kotlin.jvm.internal.Intrinsics.h(r10)     // Catch: java.lang.Throwable -> L6b
            return r10
        L6b:
            r0 = move-exception
        L6c:
            r10 = r0
            goto L71
        L6e:
            r0 = move-exception
            r2 = r10
            goto L6c
        L71:
            int r0 = r2.getHeight()
            int r3 = r2.getWidth()
            com.fourthline.vision.internal.qe r4 = new com.fourthline.vision.internal.qe
            r4.<init>(r10, r11, r3, r0)
            ib.h r10 = hb.a.f150532a
            if (r10 == 0) goto L85
            r10.f(r4)
        L85:
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.width()
            int r6 = r1.height()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            float r10 = (float) r12
            r7.postRotate(r10)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            r8 = 0
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.Intrinsics.h(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.n.crop(android.graphics.Bitmap, com.fourthline.vision.internal.fa, int):android.graphics.Bitmap");
    }
}
