package mx0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.CutoutLottieAnimationView;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c1 extends ViewGroup implements xv0.m {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.revolut.core.ui_kit.models.avatar.a f209621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f209622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public skm.a2 f209623c;
    public List d;
    public final e1 e;
    public xv0.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c1 f209624g;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(View view) {
        if (view instanceof CutoutLottieAnimationView) {
            CutoutLottieAnimationView cutoutLottieAnimationView = (CutoutLottieAnimationView) view;
            cutoutLottieAnimationView.cancelAnimation();
            cutoutLottieAnimationView.setImageDrawable(null);
        } else if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(null);
        }
    }

    public final boolean a(View view) {
        return this.f209622b && getChildCount() > 0 && getChildAt(0) == view;
    }

    public final void b(List list) {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        Continuation continuation = null;
        LifecycleCoroutineScope lifecycleScope = lifecycleOwner != null ? LifecycleOwnerKt.getLifecycleScope(lifecycleOwner) : null;
        if (lifecycleScope == null) {
            this.d = list;
            return;
        }
        this.d = null;
        skm.a2 a2Var = this.f209623c;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f209623c = skm.e0.C(lifecycleScope, null, null, new mll.c0(list, this, continuation, 13), 3);
    }

    @NotNull
    public final List<ix0.h0> getCutoutReceivers() {
        aim.e eVarB = zhm.u.b();
        for (View view : ViewGroupKt.getChildren(this)) {
            if (view instanceof ix0.h0) {
                eVarB.add(view);
            }
        }
        return zhm.u.a(eVarB);
    }

    @Override // xv0.m
    @NotNull
    public xv0.i getItemRenderState() {
        return this.f;
    }

    @Override // xv0.m
    @NotNull
    public View getRenderView() {
        return this.f209624g;
    }

    public int getUnclippedHeight() {
        return getMeasuredHeight();
    }

    public int getUnclippedWidth() {
        return getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        List list = this.d;
        if (list != null) {
            b(list);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int measuredWidth = (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2) + getPaddingLeft();
        int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0) {
                int measuredWidth2 = childAt.getMeasuredWidth() / 2;
                int measuredHeight2 = childAt.getMeasuredHeight() / 2;
                childAt.layout(measuredWidth - measuredWidth2, measuredHeight - measuredHeight2, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                float f = !a(childAt) ? 1.28f : 1.0f;
                childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (paddingTop * f), 1073741824));
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
            }
        }
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + iMax, i), View.resolveSize(getPaddingBottom() + getPaddingTop() + iMax2, i2));
    }

    public final void setImages(@NotNull AvatarModel.AvatarImage.LayeredImage avatarImage) {
        boolean zA;
        View cutoutImageView;
        Intrinsics.checkNotNullParameter(avatarImage, "avatarImage");
        Image image = avatarImage.f57995b;
        List listA = avatarImage.f57994a;
        int i = 0;
        this.f209622b = image != null;
        this.f209621a = avatarImage.f57996c;
        if (image != null) {
            aim.e eVarB = zhm.u.b();
            eVarB.add(image);
            eVarB.addAll(listA);
            listA = zhm.u.a(eVarB);
        }
        skm.a2 a2Var = this.f209623c;
        AttributeSet attributeSet = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        int size = listA.size();
        for (int i2 = 0; i2 < size; i2++) {
            Image image2 = (Image) listA.get(i2);
            View childAt = getChildAt(i2);
            if (childAt != null) {
                if (!(image2 instanceof LottieImage ? childAt instanceof CutoutLottieAnimationView : childAt instanceof CutoutImageView)) {
                    c(childAt);
                    removeView(childAt);
                    childAt = null;
                }
            }
            if (childAt == null) {
                int i3 = 6;
                if (image2 instanceof LottieImage) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    cutoutImageView = new CutoutLottieAnimationView(context, attributeSet, i3, i);
                } else {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    cutoutImageView = new CutoutImageView(context2, null, 6, 0);
                }
                childAt = cutoutImageView;
                childAt.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                addView(childAt, i2);
            }
            if (childAt instanceof CutoutLottieAnimationView) {
                CutoutLottieAnimationView cutoutLottieAnimationView = (CutoutLottieAnimationView) childAt;
                cutoutLottieAnimationView.cancelAnimation();
                cutoutLottieAnimationView.setProgress(BitmapDescriptorFactory.HUE_RED);
            }
        }
        while (getChildCount() > listA.size()) {
            View childAt2 = getChildAt(getChildCount() - 1);
            Intrinsics.h(childAt2);
            c(childAt2);
            removeView(childAt2);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            int i6 = d1.f209643a[this.f209621a.ordinal()];
            if (i6 == 1) {
                zA = true;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zA = a(childAt3);
            }
            if (zA) {
                childAt3.setOutlineProvider(this.e);
                childAt3.setClipToOutline(true);
            } else {
                childAt3.setOutlineProvider(null);
                childAt3.setClipToOutline(false);
            }
        }
        setItemRenderState(xv0.f.f309149a);
        b(listA);
    }

    @Override // xv0.m
    public void setItemRenderState(@NotNull xv0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f = iVar;
    }

    public final void setScaleType(@NotNull ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ImageView) {
                ((ImageView) childAt).setScaleType(scaleType);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209621a = com.revolut.core.ui_kit.models.avatar.a.CLIPPED;
        this.e = new e1(this);
        setClipChildren(false);
        this.f = xv0.g.f309150a;
        this.f209624g = this;
    }

    public /* synthetic */ c1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
