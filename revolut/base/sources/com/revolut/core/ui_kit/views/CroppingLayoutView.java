package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.b5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/revolut/core/ui_kit/views/CroppingLayoutView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "setImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Landroid/view/View;", "getCroppingAreaView$ui_kit_components_release", "()Landroid/view/View;", "getCroppingAreaView", "Landroid/graphics/Bitmap;", "getCroppedImage", "()Landroid/graphics/Bitmap;", "mx0/d5", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CroppingLayoutView extends ConstraintLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f58490j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f58491b;
    public final b5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f58492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f58493h;
    public Image i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CroppingLayoutView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f4;
        float f5;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        View croppingAreaView$ui_kit_components_release = getCroppingAreaView$ui_kit_components_release();
        float left = croppingAreaView$ui_kit_components_release.getLeft();
        float top = croppingAreaView$ui_kit_components_release.getTop();
        float right = croppingAreaView$ui_kit_components_release.getRight();
        float bottom = croppingAreaView$ui_kit_components_release.getBottom();
        int left2 = croppingAreaView$ui_kit_components_release.getLeft();
        Paint paint = this.f58492g;
        if (left2 != 0) {
            canvas2 = canvas;
            canvas2.drawRect(BitmapDescriptorFactory.HUE_RED, top, left, bottom, paint);
            left = left;
        } else {
            canvas2 = canvas;
        }
        if (croppingAreaView$ui_kit_components_release.getRight() != getWidth()) {
            canvas2.drawRect(right, top, getWidth(), bottom, paint);
            f = right;
            top = top;
            f4 = bottom;
        } else {
            f = right;
            f4 = bottom;
        }
        if (croppingAreaView$ui_kit_components_release.getTop() != 0) {
            float f6 = top;
            canvas2.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), f6, paint);
            top = f6;
        }
        if (croppingAreaView$ui_kit_components_release.getBottom() != getHeight()) {
            float f32 = f4;
            canvas2.drawRect(BitmapDescriptorFactory.HUE_RED, f32, getWidth(), getHeight(), paint);
            f5 = f32;
        } else {
            f5 = f4;
        }
        canvas2.drawRect(left, top, f, f5, this.f58493h);
    }

    public final Bitmap getCroppedImage() {
        return this.f.getCroppedImage();
    }

    @NotNull
    public final View getCroppingAreaView$ui_kit_components_release() {
        View view = this.f58491b;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R$id.croppingLayout_croppingAreaView);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("Can't find cropping area view");
        }
        this.f58491b = viewFindViewById;
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "apply(...)");
        return viewFindViewById;
    }

    public final void setImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        if (Intrinsics.f(this.i, image)) {
            return;
        }
        this.i = image;
        yy0.f.e(or0.u.k(this).Q(), image, this.f, new mqi.a(this, 26), null, 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CroppingLayoutView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CroppingLayoutView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setStyle(Paint.Style.FILL);
        paintC.setColor(ColorUtils.setAlphaComponent(-16777216, 102));
        this.f58492g = paintC;
        Paint paintC2 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC2.setStyle(Paint.Style.STROKE);
        paintC2.setColor(-1);
        paintC2.setStrokeWidth(kli.a.k(context, 1.0f));
        this.f58493h = paintC2;
        b5 b5Var = new b5(context, null, 6, 0);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.topToTop = 0;
        b5Var.setLayoutParams(layoutParams);
        ViewCompat.setNestedScrollingEnabled(b5Var, true);
        addView(b5Var);
        this.f = b5Var;
    }

    public /* synthetic */ CroppingLayoutView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
