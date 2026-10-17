package com.onfido.android.sdk.capture.detector.rectangle;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "", "()V", "NoRectDetected", "RectDetected", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult$NoRectDetected;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult$RectDetected;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RectDetectionResult {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult$NoRectDetected;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoRectDetected extends RectDetectionResult {

        @NotNull
        public static final NoRectDetected INSTANCE = new NoRectDetected();

        private NoRectDetected() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult$RectDetected;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "rect", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "innerPreviewLimit", "outerPreviewLimit", "(Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;)V", "getInnerPreviewLimit", "()Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "getOuterPreviewLimit", "getRect", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RectDetected extends RectDetectionResult {

        @NotNull
        private final OnfidoRectF innerPreviewLimit;

        @NotNull
        private final OnfidoRectF outerPreviewLimit;

        @NotNull
        private final OnfidoRectF rect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RectDetected(@NotNull OnfidoRectF rect, @NotNull OnfidoRectF innerPreviewLimit, @NotNull OnfidoRectF outerPreviewLimit) {
            super(null);
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(innerPreviewLimit, "innerPreviewLimit");
            Intrinsics.checkNotNullParameter(outerPreviewLimit, "outerPreviewLimit");
            this.rect = rect;
            this.innerPreviewLimit = innerPreviewLimit;
            this.outerPreviewLimit = outerPreviewLimit;
        }

        public static /* synthetic */ RectDetected copy$default(RectDetected rectDetected, OnfidoRectF onfidoRectF, OnfidoRectF onfidoRectF2, OnfidoRectF onfidoRectF3, int i, Object obj2) {
            if ((i & 1) != 0) {
                onfidoRectF = rectDetected.rect;
            }
            if ((i & 2) != 0) {
                onfidoRectF2 = rectDetected.innerPreviewLimit;
            }
            if ((i & 4) != 0) {
                onfidoRectF3 = rectDetected.outerPreviewLimit;
            }
            return rectDetected.copy(onfidoRectF, onfidoRectF2, onfidoRectF3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OnfidoRectF getRect() {
            return this.rect;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final OnfidoRectF getInnerPreviewLimit() {
            return this.innerPreviewLimit;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final OnfidoRectF getOuterPreviewLimit() {
            return this.outerPreviewLimit;
        }

        @NotNull
        public final RectDetected copy(@NotNull OnfidoRectF rect, @NotNull OnfidoRectF innerPreviewLimit, @NotNull OnfidoRectF outerPreviewLimit) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(innerPreviewLimit, "innerPreviewLimit");
            Intrinsics.checkNotNullParameter(outerPreviewLimit, "outerPreviewLimit");
            return new RectDetected(rect, innerPreviewLimit, outerPreviewLimit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RectDetected)) {
                return false;
            }
            RectDetected rectDetected = (RectDetected) other;
            return Intrinsics.f(this.rect, rectDetected.rect) && Intrinsics.f(this.innerPreviewLimit, rectDetected.innerPreviewLimit) && Intrinsics.f(this.outerPreviewLimit, rectDetected.outerPreviewLimit);
        }

        @NotNull
        public final OnfidoRectF getInnerPreviewLimit() {
            return this.innerPreviewLimit;
        }

        @NotNull
        public final OnfidoRectF getOuterPreviewLimit() {
            return this.outerPreviewLimit;
        }

        @NotNull
        public final OnfidoRectF getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.outerPreviewLimit.hashCode() + ((this.innerPreviewLimit.hashCode() + (this.rect.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "RectDetected(rect=" + this.rect + ", innerPreviewLimit=" + this.innerPreviewLimit + ", outerPreviewLimit=" + this.outerPreviewLimit + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private RectDetectionResult() {
    }

    public /* synthetic */ RectDetectionResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
