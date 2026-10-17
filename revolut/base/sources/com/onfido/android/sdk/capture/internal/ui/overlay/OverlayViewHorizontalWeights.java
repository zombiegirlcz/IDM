package com.onfido.android.sdk.capture.internal.ui.overlay;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/overlay/OverlayViewHorizontalWeights;", "", "bigHorizontalWeight", "", "smallHorizontalWeight", "visibleHorizontalWeight", "(FFF)V", "getBigHorizontalWeight", "()F", "getSmallHorizontalWeight", "setSmallHorizontalWeight", "(F)V", "getVisibleHorizontalWeight", "setVisibleHorizontalWeight", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OverlayViewHorizontalWeights {
    private final float bigHorizontalWeight;
    private float smallHorizontalWeight;
    private float visibleHorizontalWeight;

    public OverlayViewHorizontalWeights(float f, float f4, float f5) {
        this.bigHorizontalWeight = f;
        this.smallHorizontalWeight = f4;
        this.visibleHorizontalWeight = f5;
    }

    public static /* synthetic */ OverlayViewHorizontalWeights copy$default(OverlayViewHorizontalWeights overlayViewHorizontalWeights, float f, float f4, float f5, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = overlayViewHorizontalWeights.bigHorizontalWeight;
        }
        if ((i & 2) != 0) {
            f4 = overlayViewHorizontalWeights.smallHorizontalWeight;
        }
        if ((i & 4) != 0) {
            f5 = overlayViewHorizontalWeights.visibleHorizontalWeight;
        }
        return overlayViewHorizontalWeights.copy(f, f4, f5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getBigHorizontalWeight() {
        return this.bigHorizontalWeight;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSmallHorizontalWeight() {
        return this.smallHorizontalWeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getVisibleHorizontalWeight() {
        return this.visibleHorizontalWeight;
    }

    @NotNull
    public final OverlayViewHorizontalWeights copy(float bigHorizontalWeight, float smallHorizontalWeight, float visibleHorizontalWeight) {
        return new OverlayViewHorizontalWeights(bigHorizontalWeight, smallHorizontalWeight, visibleHorizontalWeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayViewHorizontalWeights)) {
            return false;
        }
        OverlayViewHorizontalWeights overlayViewHorizontalWeights = (OverlayViewHorizontalWeights) other;
        return Float.compare(this.bigHorizontalWeight, overlayViewHorizontalWeights.bigHorizontalWeight) == 0 && Float.compare(this.smallHorizontalWeight, overlayViewHorizontalWeights.smallHorizontalWeight) == 0 && Float.compare(this.visibleHorizontalWeight, overlayViewHorizontalWeights.visibleHorizontalWeight) == 0;
    }

    public final float getBigHorizontalWeight() {
        return this.bigHorizontalWeight;
    }

    public final float getSmallHorizontalWeight() {
        return this.smallHorizontalWeight;
    }

    public final float getVisibleHorizontalWeight() {
        return this.visibleHorizontalWeight;
    }

    public int hashCode() {
        return Float.hashCode(this.visibleHorizontalWeight) + b.b(this.smallHorizontalWeight, Float.hashCode(this.bigHorizontalWeight) * 31, 31);
    }

    public final void setSmallHorizontalWeight(float f) {
        this.smallHorizontalWeight = f;
    }

    public final void setVisibleHorizontalWeight(float f) {
        this.visibleHorizontalWeight = f;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("OverlayViewHorizontalWeights(bigHorizontalWeight=");
        sb6.append(this.bigHorizontalWeight);
        sb6.append(", smallHorizontalWeight=");
        sb6.append(this.smallHorizontalWeight);
        sb6.append(", visibleHorizontalWeight=");
        return b.s(sb6, this.visibleHorizontalWeight, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
