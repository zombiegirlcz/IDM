package com.onfido.android.sdk.capture.internal.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 32\u00020\u0001:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bB%\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0019\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\nJ\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\u0006\u0010\u0007\u001a\u00020\nJ\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nJ\u0016\u0010)\u001a\u00020&2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nJ\u001e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\nJ\u0006\u00100\u001a\u00020\u0003J\t\u00101\u001a\u000202HÖ\u0001J\u0006\u0010\u0005\u001a\u00020\nR\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u00064"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "", "rect", "Landroid/graphics/RectF;", "(Landroid/graphics/RectF;)V", "width", "", "height", "(II)V", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom", "()F", "setBottom", "(F)V", "getLeft", "setLeft", "getRight", "setRight", "getTop", "setTop", "area", "centerX", "centerY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "inset", "", "dx", "dy", "offset", "rotate", "rotationAngle", "frameWidth", "frameHeight", "scaleAboutCenter", "scaleFactor", "toRectF", "toString", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OnfidoRectF {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private float bottom;
    private float left;
    private float right;
    private float top;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0006J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0007J\n\u0010\u0003\u001a\u00020\u0004*\u00020\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF$Companion;", "", "()V", "toOnfidoRectF", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "Landroid/graphics/Bitmap;", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "Landroid/view/View;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final OnfidoRectF toOnfidoRectF(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "<this>");
            return new OnfidoRectF(bitmap.getWidth(), bitmap.getHeight());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OnfidoRectF toOnfidoRectF(@NotNull Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "<this>");
            return new OnfidoRectF(new RectF(rect));
        }

        @NotNull
        public final OnfidoRectF toOnfidoRectF(@NotNull RectF rectF) {
            Intrinsics.checkNotNullParameter(rectF, "<this>");
            return new OnfidoRectF(rectF);
        }

        @NotNull
        public final OnfidoRectF toOnfidoRectF(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            return new OnfidoRectF(view.getWidth(), view.getHeight());
        }
    }

    public OnfidoRectF(float f, float f4, float f5, float f6) {
        this.left = f;
        this.top = f4;
        this.right = f5;
        this.bottom = f6;
    }

    public static /* synthetic */ OnfidoRectF copy$default(OnfidoRectF onfidoRectF, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = onfidoRectF.left;
        }
        if ((i & 2) != 0) {
            f4 = onfidoRectF.top;
        }
        if ((i & 4) != 0) {
            f5 = onfidoRectF.right;
        }
        if ((i & 8) != 0) {
            f6 = onfidoRectF.bottom;
        }
        return onfidoRectF.copy(f, f4, f5, f6);
    }

    public final float area() {
        return height() * width();
    }

    public final float centerX() {
        return (width() / 2) + this.left;
    }

    public final float centerY() {
        return (height() / 2) + this.top;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @NotNull
    public final OnfidoRectF copy(float left, float top, float right, float bottom) {
        return new OnfidoRectF(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnfidoRectF)) {
            return false;
        }
        OnfidoRectF onfidoRectF = (OnfidoRectF) other;
        return Float.compare(this.left, onfidoRectF.left) == 0 && Float.compare(this.top, onfidoRectF.top) == 0 && Float.compare(this.right, onfidoRectF.right) == 0 && Float.compare(this.bottom, onfidoRectF.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Float.hashCode(this.bottom) + b.b(this.right, b.b(this.top, Float.hashCode(this.left) * 31, 31), 31);
    }

    public final float height() {
        return this.bottom - this.top;
    }

    public final void inset(float dx9, float dy10) {
        this.left += dx9;
        this.top += dy10;
        this.right -= dx9;
        this.bottom -= dy10;
    }

    public final void offset(float dx9, float dy10) {
        this.left += dx9;
        this.top += dy10;
        this.right += dx9;
        this.bottom += dy10;
    }

    @NotNull
    public final OnfidoRectF rotate(int rotationAngle, int frameWidth, int frameHeight) {
        if (rotationAngle == 90) {
            float f = frameWidth;
            float fHeight = (f - this.top) - height();
            float f4 = this.left;
            return copy(fHeight, f4, f - this.top, width() + f4);
        }
        if (rotationAngle == 180) {
            float f5 = frameHeight;
            return copy(this.left, (f5 - this.top) - height(), this.right, f5 - this.top);
        }
        if (rotationAngle != 270) {
            return this;
        }
        float f6 = this.top;
        return copy(f6, this.left, height() + f6, width() + this.left);
    }

    @NotNull
    public final OnfidoRectF scaleAboutCenter(float scaleFactor) {
        float fWidth = width() * scaleFactor;
        float fHeight = height() * scaleFactor;
        float fWidth2 = width() - fWidth;
        float f = 2;
        inset(fWidth2 / f, (height() - fHeight) / f);
        return this;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    @NotNull
    public final RectF toRectF() {
        return new RectF(this.left, this.top, this.right, this.bottom);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("OnfidoRectF(left=");
        sb6.append(this.left);
        sb6.append(", top=");
        sb6.append(this.top);
        sb6.append(", right=");
        sb6.append(this.right);
        sb6.append(", bottom=");
        return b.s(sb6, this.bottom, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final float width() {
        return this.right - this.left;
    }

    public OnfidoRectF(int i, int i2) {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnfidoRectF(@NotNull RectF rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        Intrinsics.checkNotNullParameter(rect, "rect");
    }
}
