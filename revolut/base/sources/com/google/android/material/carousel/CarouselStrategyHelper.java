package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;

/* JADX INFO: loaded from: classes16.dex */
final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
    }

    public static float addEnd(float f, float f4, int i) {
        return (Math.max(0, i - 1) * f4) + f;
    }

    public static float addStart(float f, float f4, int i) {
        return i > 0 ? (f4 / 2.0f) + f : f;
    }

    public static KeylineState createCenterAlignedKeylineState(@NonNull Context context, float f, float f4, @NonNull Arrangement arrangement) {
        float f5;
        float f6;
        float fMin = Math.min(getExtraSmallSize(context) + f, arrangement.largeSize);
        float f32 = fMin / 2.0f;
        float f35 = BitmapDescriptorFactory.HUE_RED - f32;
        float fAddStart = addStart(BitmapDescriptorFactory.HUE_RED, arrangement.smallSize, arrangement.smallCount);
        float fUpdateCurPosition = updateCurPosition(BitmapDescriptorFactory.HUE_RED, addEnd(fAddStart, arrangement.smallSize, (int) Math.floor(arrangement.smallCount / 2.0f)), arrangement.smallSize, arrangement.smallCount);
        float fAddStart2 = addStart(fUpdateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float fUpdateCurPosition2 = updateCurPosition(fUpdateCurPosition, addEnd(fAddStart2, arrangement.mediumSize, (int) Math.floor(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount);
        float fAddStart3 = addStart(fUpdateCurPosition2, arrangement.largeSize, arrangement.largeCount);
        float fUpdateCurPosition3 = updateCurPosition(fUpdateCurPosition2, addEnd(fAddStart3, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float fAddStart4 = addStart(fUpdateCurPosition3, arrangement.mediumSize, arrangement.mediumCount);
        float fAddStart5 = addStart(updateCurPosition(fUpdateCurPosition3, addEnd(fAddStart4, arrangement.mediumSize, (int) Math.ceil(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f36 = f32 + f4;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, arrangement.largeSize, f);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f);
        KeylineState.Builder builderAddAnchorKeyline = new KeylineState.Builder(arrangement.largeSize, f4).addAnchorKeyline(f35, childMaskPercentage, fMin);
        if (arrangement.smallCount > 0) {
            f5 = 2.0f;
            f6 = f36;
            builderAddAnchorKeyline.addKeylineRange(fAddStart, childMaskPercentage2, arrangement.smallSize, (int) Math.floor(r7 / 2.0f));
        } else {
            f5 = 2.0f;
            f6 = f36;
        }
        if (arrangement.mediumCount > 0) {
            builderAddAnchorKeyline.addKeylineRange(fAddStart2, childMaskPercentage3, arrangement.mediumSize, (int) Math.floor(r4 / f5));
        }
        builderAddAnchorKeyline.addKeylineRange(fAddStart3, BitmapDescriptorFactory.HUE_RED, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            builderAddAnchorKeyline.addKeylineRange(fAddStart4, childMaskPercentage3, arrangement.mediumSize, (int) Math.ceil(r4 / f5));
        }
        if (arrangement.smallCount > 0) {
            builderAddAnchorKeyline.addKeylineRange(fAddStart5, childMaskPercentage2, arrangement.smallSize, (int) Math.ceil(r0 / f5));
        }
        builderAddAnchorKeyline.addAnchorKeyline(f6, childMaskPercentage, fMin);
        return builderAddAnchorKeyline.build();
    }

    public static KeylineState createKeylineState(@NonNull Context context, float f, float f4, @NonNull Arrangement arrangement, int i) {
        return i == 1 ? createCenterAlignedKeylineState(context, f, f4, arrangement) : createLeftAlignedKeylineState(context, f, f4, arrangement);
    }

    public static KeylineState createLeftAlignedKeylineState(@NonNull Context context, float f, float f4, @NonNull Arrangement arrangement) {
        float fMin = Math.min(getExtraSmallSize(context) + f, arrangement.largeSize);
        float f5 = fMin / 2.0f;
        float f6 = BitmapDescriptorFactory.HUE_RED - f5;
        float fAddStart = addStart(BitmapDescriptorFactory.HUE_RED, arrangement.largeSize, arrangement.largeCount);
        float fUpdateCurPosition = updateCurPosition(BitmapDescriptorFactory.HUE_RED, addEnd(fAddStart, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float fAddStart2 = addStart(fUpdateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float fAddStart3 = addStart(updateCurPosition(fUpdateCurPosition, fAddStart2, arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f32 = f5 + f4;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, arrangement.largeSize, f);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f);
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(arrangement.largeSize, f4).addAnchorKeyline(f6, childMaskPercentage, fMin).addKeylineRange(fAddStart, BitmapDescriptorFactory.HUE_RED, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            builderAddKeylineRange.addKeyline(fAddStart2, childMaskPercentage3, arrangement.mediumSize);
        }
        int i = arrangement.smallCount;
        if (i > 0) {
            builderAddKeylineRange.addKeylineRange(fAddStart3, childMaskPercentage2, arrangement.smallSize, i);
        }
        builderAddKeylineRange.addAnchorKeyline(f32, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    public static float getExtraSmallSize(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    public static float getSmallSizeMax(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    public static float getSmallSizeMin(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    public static int maxValue(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static float updateCurPosition(float f, float f4, float f5, int i) {
        return i > 0 ? (f5 / 2.0f) + f4 : f;
    }
}
