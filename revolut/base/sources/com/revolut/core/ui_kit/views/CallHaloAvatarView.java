package com.revolut.core.ui_kit.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.q2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/revolut/core/ui_kit/views/CallHaloAvatarView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/views/CallHaloAvatarView$b;", "model", "", "setModel", "(Lcom/revolut/core/ui_kit/views/CallHaloAvatarView$b;)V", "Companion", "b", "mx0/q2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallHaloAvatarView extends ViewGroup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f58374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f58375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f58376c;
    public final ObjectAnimator d;
    public final ObjectAnimator e;
    public b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f58377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f58378h;
    public long i;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.CallHaloAvatarView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static final ObjectAnimator a(Companion companion, ImageView imageView, float f) {
            companion.getClass();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, BitmapDescriptorFactory.HUE_RED, f);
            objectAnimatorOfFloat.setDuration(5000L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(1);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
            return objectAnimatorOfFloat;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f58379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q2 f58380b;

        public b() {
            this(null, null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f58379a, bVar.f58379a) && this.f58380b == bVar.f58380b;
        }

        public final int hashCode() {
            Image image = this.f58379a;
            int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
            q2 q2Var = this.f58380b;
            return iHashCode + (q2Var != null ? q2Var.hashCode() : 0);
        }

        public b(Image image, q2 q2Var) {
            this.f58379a = image;
            this.f58380b = q2Var;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallHaloAvatarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(ImageView imageView, int i, int i2) {
        int measuredWidth = imageView.getMeasuredWidth() / 2;
        int measuredHeight = imageView.getMeasuredHeight() / 2;
        imageView.layout(i - measuredWidth, i2 - measuredHeight, i + measuredWidth, i2 + measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int i6 = (i3 - i) / 2;
        int i21 = (i5 - i2) / 2;
        a(this.f58374a, i6, i21);
        a(this.f58375b, i6, i21);
        a(this.f58376c, i6, i21);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize;
        int defaultSize2;
        if (this.f58377g <= 0 || View.MeasureSpec.getMode(i) == 1073741824 || View.MeasureSpec.getMode(i2) == 1073741824) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            int i3 = (int) (this.f58377g * 1.5f);
            defaultSize = View.resolveSize(i3, i);
            defaultSize2 = View.resolveSize(i3, i2);
        }
        int iMin = Math.min(defaultSize, defaultSize2);
        int i5 = this.f58377g;
        if (i5 <= 0) {
            i5 = (int) (iMin / 1.5f);
        }
        float f = i5;
        int i6 = (int) (1.25f * f);
        int i21 = (int) (f * 1.5f);
        this.f58376c.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        this.f58375b.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        this.f58374a.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        ObjectAnimator objectAnimator = this.d;
        ObjectAnimator objectAnimator2 = this.e;
        if (z) {
            if (objectAnimator.isRunning()) {
                return;
            }
            objectAnimator.start();
            objectAnimator.setCurrentPlayTime(this.f58378h);
            objectAnimator2.start();
            objectAnimator2.setCurrentPlayTime(this.i);
            return;
        }
        if (objectAnimator.isRunning()) {
            this.f58378h = objectAnimator.getCurrentPlayTime();
            this.i = objectAnimator2.getCurrentPlayTime();
            objectAnimator.cancel();
            objectAnimator2.cancel();
        }
    }

    public final void setModel(@NotNull b model) {
        int iK;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f, model)) {
            return;
        }
        this.f = model;
        q2 q2Var = model.f58380b;
        if (q2Var != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, q2Var.a());
        } else {
            iK = 0;
        }
        if (this.f58377g != iK) {
            this.f58377g = iK;
            requestLayout();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        yy0.f.e(jh.d.f(context2).Q(), model.f58379a, this.f58376c, null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallHaloAvatarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallHaloAvatarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R$drawable.internal_call_halo_outer);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        this.f58374a = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R$drawable.internal_call_halo_inner);
        imageView2.setScaleType(scaleType);
        this.f58375b = imageView2;
        ImageView imageView3 = new ImageView(context);
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f58376c = imageView3;
        Companion companion = INSTANCE;
        this.d = Companion.a(companion, imageView, 360.0f);
        this.e = Companion.a(companion, imageView2, -360.0f);
        addView(imageView);
        addView(imageView2);
        addView(imageView3);
    }

    public /* synthetic */ CallHaloAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
