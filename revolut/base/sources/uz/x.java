package uz;

import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: classes16.dex */
public final class x extends y {
    @Override // uz.y
    public final int d(float f, int i, int i2) {
        int iC = rim.d.c(255 * f);
        if (iC > 0) {
            return ColorUtils.setAlphaComponent(i, iC);
        }
        return 0;
    }
}
