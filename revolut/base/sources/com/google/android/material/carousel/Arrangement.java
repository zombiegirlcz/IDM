package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    public Arrangement(int i, float f, float f4, float f5, int i2, float f6, int i3, float f32, int i5, float f35) {
        this.priority = i;
        this.smallSize = MathUtils.clamp(f, f4, f5);
        this.smallCount = i2;
        this.mediumSize = f6;
        this.mediumCount = i3;
        this.largeSize = f32;
        this.largeCount = i5;
        fit(f35, f4, f5, f32);
        this.cost = cost(f32);
    }

    private float calculateLargeSize(float f, int i, float f4, int i2, int i3) {
        if (i <= 0) {
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        float f5 = i2 / 2.0f;
        return (f - ((i + f5) * f4)) / (i3 + f5);
    }

    private float cost(float f) {
        if (isValid()) {
            return Math.abs(f - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    public static Arrangement findLowestCostArrangement(float f, float f4, float f5, float f6, int[] iArr, float f32, int[] iArr2, float f35, int[] iArr3) {
        Arrangement arrangement = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i5 = iArr2[i3];
                int length2 = iArr.length;
                int i6 = 0;
                while (i6 < length2) {
                    int i21 = length;
                    int i22 = i3;
                    int i32 = i;
                    int i33 = length2;
                    int i43 = i6;
                    Arrangement arrangement2 = new Arrangement(i32, f4, f5, f6, iArr[i6], f32, i5, f35, i2, f);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == BitmapDescriptorFactory.HUE_RED) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i59 = i32 + 1;
                    i6 = i43 + 1;
                    i3 = i22;
                    i = i59;
                    length = i21;
                    length2 = i33;
                }
                i3++;
                i = i;
                length = length;
            }
        }
        return arrangement;
    }

    private void fit(float f, float f4, float f5, float f6) {
        float space = f - getSpace();
        int i = this.smallCount;
        if (i > 0 && space > BitmapDescriptorFactory.HUE_RED) {
            float f32 = this.smallSize;
            this.smallSize = Math.min(space / i, f5 - f32) + f32;
        } else if (i > 0 && space < BitmapDescriptorFactory.HUE_RED) {
            float f35 = this.smallSize;
            this.smallSize = Math.max(space / i, f4 - f35) + f35;
        }
        int i2 = this.smallCount;
        float f36 = i2 > 0 ? this.smallSize : 0.0f;
        this.smallSize = f36;
        float fCalculateLargeSize = calculateLargeSize(f, i2, f36, this.mediumCount, this.largeCount);
        this.largeSize = fCalculateLargeSize;
        float f37 = (this.smallSize + fCalculateLargeSize) / 2.0f;
        this.mediumSize = f37;
        int i3 = this.mediumCount;
        if (i3 <= 0 || fCalculateLargeSize == f6) {
            return;
        }
        float f41 = (f6 - fCalculateLargeSize) * this.largeCount;
        float fMin = Math.min(Math.abs(f41), f37 * 0.1f * i3);
        if (f41 > BitmapDescriptorFactory.HUE_RED) {
            this.mediumSize -= fMin / this.mediumCount;
            this.largeSize = (fMin / this.largeCount) + this.largeSize;
        } else {
            this.mediumSize = (fMin / this.mediumCount) + this.mediumSize;
            this.largeSize -= fMin / this.largeCount;
        }
    }

    private float getSpace() {
        return (this.smallSize * this.smallCount) + (this.mediumSize * this.mediumCount) + (this.largeSize * this.largeCount);
    }

    private boolean isValid() {
        int i = this.largeCount;
        if (i <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f = this.largeSize;
        float f4 = this.mediumSize;
        return f > f4 && f4 > this.smallSize;
    }

    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    @NonNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("Arrangement [priority=");
        sb6.append(this.priority);
        sb6.append(", smallCount=");
        sb6.append(this.smallCount);
        sb6.append(", smallSize=");
        sb6.append(this.smallSize);
        sb6.append(", mediumCount=");
        sb6.append(this.mediumCount);
        sb6.append(", mediumSize=");
        sb6.append(this.mediumSize);
        sb6.append(", largeCount=");
        sb6.append(this.largeCount);
        sb6.append(", largeSize=");
        sb6.append(this.largeSize);
        sb6.append(", cost=");
        return n.t(this.cost, "]", sb6);
    }
}
