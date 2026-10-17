package com.revolut.camera;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$styleable;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/camera/CameraMaskView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "resId", "", "setMaskResource", "(I)V", "Landroid/graphics/Rect;", "getMaskBounds", "()Landroid/graphics/Rect;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraMaskView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f50677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f50678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f50679c;
    public final Rect d;
    public final Rect e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraMaskView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        Drawable drawable = this.f50677a;
        if (drawable == null) {
            return;
        }
        float measuredWidth = getMeasuredWidth() / getMeasuredHeight();
        float intrinsicWidth = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        Rect rect = this.e;
        Rect rect2 = this.d;
        Rect rect3 = this.f50679c;
        if (intrinsicWidth < measuredWidth) {
            int measuredHeight = (int) (intrinsicWidth * getMeasuredHeight());
            int measuredWidth2 = (getMeasuredWidth() - measuredHeight) / 2;
            rect3.left = measuredWidth2;
            rect3.top = 0;
            rect3.right = measuredWidth2 + measuredHeight;
            rect3.bottom = getMeasuredHeight();
            rect2.left = 0;
            rect2.top = 0;
            rect2.right = rect3.left;
            rect2.bottom = getMeasuredHeight();
            rect.left = rect3.right;
            rect.top = 0;
            rect.right = getMeasuredWidth();
            rect.bottom = getMeasuredHeight();
        } else {
            int measuredWidth3 = (int) (getMeasuredWidth() / intrinsicWidth);
            int measuredHeight2 = (getMeasuredHeight() - measuredWidth3) / 2;
            rect3.left = 0;
            rect3.top = measuredHeight2;
            rect3.right = getMeasuredWidth();
            rect3.bottom = measuredWidth3 + measuredHeight2;
            rect2.left = 0;
            rect2.top = 0;
            rect2.right = getMeasuredWidth();
            rect2.bottom = measuredHeight2;
            rect.left = 0;
            rect.top = rect3.bottom;
            rect.right = getMeasuredWidth();
            rect.bottom = getMeasuredHeight();
        }
        drawable.setBounds(rect3);
    }

    @NotNull
    public final Rect getMaskBounds() {
        return new Rect(this.f50679c);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.f50677a;
        if (drawable != null) {
            drawable.draw(canvas);
            Rect rect = this.d;
            Paint paint = this.f50678b;
            canvas.drawRect(rect, paint);
            canvas.drawRect(this.e, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a();
    }

    public final void setMaskResource(int resId) {
        this.f50677a = ContextCompat.getDrawable(getContext(), resId);
        a();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraMaskView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraMaskView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50679c = new Rect();
        this.d = new Rect();
        this.e = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CameraMaskView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.CameraMaskView_outer_color, a.s(R$attr.uikit_colorBlack_20, context));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        this.f50678b = paint;
    }

    public /* synthetic */ CameraMaskView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
