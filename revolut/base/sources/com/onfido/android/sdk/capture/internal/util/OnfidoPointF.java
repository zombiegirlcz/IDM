package com.onfido.android.sdk.capture.internal.util;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;", "", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "convertToRectF", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "width", "height", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OnfidoPointF {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float x;
    private final float y;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF$Companion;", "", "()V", "toOnfidoPointF", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;", "Landroid/graphics/PointF;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final OnfidoPointF toOnfidoPointF(@NotNull PointF pointF) {
            Intrinsics.checkNotNullParameter(pointF, "<this>");
            return new OnfidoPointF(pointF.x, pointF.y);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OnfidoPointF(float f, float f4) {
        this.x = f;
        this.y = f4;
    }

    public static /* synthetic */ OnfidoRectF convertToRectF$default(OnfidoPointF onfidoPointF, float f, float f4, int i, Object obj2) {
        if ((i & 2) != 0) {
            f4 = f;
        }
        return onfidoPointF.convertToRectF(f, f4);
    }

    public static /* synthetic */ OnfidoPointF copy$default(OnfidoPointF onfidoPointF, float f, float f4, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = onfidoPointF.x;
        }
        if ((i & 2) != 0) {
            f4 = onfidoPointF.y;
        }
        return onfidoPointF.copy(f, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @NotNull
    public final OnfidoRectF convertToRectF(float width, float height) {
        float f = 2;
        float f4 = width / f;
        float f5 = height / f;
        float f6 = this.x;
        float f32 = this.y;
        return new OnfidoRectF(f6 - f4, f32 - f5, f6 + f4, f32 + f5);
    }

    @NotNull
    public final OnfidoPointF copy(float x3, float y2) {
        return new OnfidoPointF(x3, y2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnfidoPointF)) {
            return false;
        }
        OnfidoPointF onfidoPointF = (OnfidoPointF) other;
        return Float.compare(this.x, onfidoPointF.x) == 0 && Float.compare(this.y, onfidoPointF.y) == 0;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("OnfidoPointF(x=");
        sb6.append(this.x);
        sb6.append(", y=");
        return b.s(sb6, this.y, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
