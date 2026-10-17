package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.carousel.KeylineState;

/* JADX INFO: loaded from: classes16.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    private float calculateMediumChildSize(float f, float f4, float f5) {
        float fMax = Math.max(1.5f * f5, f);
        float f6 = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * f4;
        if (fMax > f6) {
            fMax = Math.max(f6, f5 * 1.2f);
        }
        return Math.min(f4, fMax);
    }

    private KeylineState createCenterAlignedKeylineState(float f, float f4, float f5, int i, float f6, float f32, float f35) {
        float fMin = Math.min(f32, f5);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, f5, f4);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f6, f5, f4);
        float f36 = f6 / 2.0f;
        float f37 = (f35 + BitmapDescriptorFactory.HUE_RED) - f36;
        float f41 = f37 + f36;
        float f42 = fMin / 2.0f;
        float f57 = (i * f5) + f41;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f5, f).addAnchorKeyline((f37 - f36) - f42, childMaskPercentage, fMin).addKeyline(f37, childMaskPercentage2, f6, false).addKeylineRange((f5 / 2.0f) + f41, BitmapDescriptorFactory.HUE_RED, f5, i, true);
        builderAddKeylineRange.addKeyline(f36 + f57, childMaskPercentage2, f6, false);
        builderAddKeylineRange.addAnchorKeyline(f57 + f6 + f42, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f, float f4, float f5, int i, float f6, int i2, float f32) {
        float fMin = Math.min(f32, f5);
        float fMax = Math.max(fMin, 0.5f * f6);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMax, f5, f);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(fMin, f5, f);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f6, f5, f);
        float f35 = BitmapDescriptorFactory.HUE_RED - (fMax / 2.0f);
        float f36 = (i * f5) + BitmapDescriptorFactory.HUE_RED;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f5, f4).addAnchorKeyline(f35, childMaskPercentage, fMax).addKeylineRange(f5 / 2.0f, BitmapDescriptorFactory.HUE_RED, f5, i, true);
        if (i2 > 0) {
            float f37 = (f6 / 2.0f) + f36;
            f36 += f6;
            builderAddKeylineRange.addKeyline(f37, childMaskPercentage3, f6, false);
        }
        builderAddKeylineRange.addAnchorKeyline((CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f) + f36, childMaskPercentage2, fMin);
        return builderAddKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean isContained() {
        return false;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f4 = measuredHeight;
        float f5 = f;
        float f6 = f4 + f5;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f5;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f5;
        int iMax = Math.max(1, (int) Math.floor(containerWidth / f6));
        float f32 = containerWidth - (iMax * f6);
        if (carousel.getCarouselAlignment() == 1) {
            float f35 = f32 / 2.0f;
            return createCenterAlignedKeylineState(containerWidth, f5, f6, iMax, Math.max(Math.min(3.0f * f35, f6), getSmallItemSizeMin() + f5), extraSmallSize2, f35);
        }
        int i = 1;
        if (f32 <= BitmapDescriptorFactory.HUE_RED) {
            i = 0;
        }
        return createLeftAlignedKeylineState(view.getContext(), f5, containerWidth, f6, iMax, calculateMediumChildSize(extraSmallSize, f6, f32), i, extraSmallSize2);
    }
}
