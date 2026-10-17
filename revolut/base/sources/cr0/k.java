package cr0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.RevTransitionUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import com.revolut.core.ui_kit.views.o;
import ix0.i1;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f108174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f108175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f108176c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f108177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ValueAnimator f108178h;
    public final ArrayList i;

    public k(o modalViewContainerView, m heightTransitionInfo) {
        Intrinsics.checkNotNullParameter(modalViewContainerView, "modalViewContainerView");
        Intrinsics.checkNotNullParameter(heightTransitionInfo, "heightTransitionInfo");
        this.f108174a = modalViewContainerView;
        this.f108175b = heightTransitionInfo;
        this.i = new ArrayList();
    }

    public final void a(UIKitLinearLayout parent, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        RevTransitionUtils.setTopBottom(parent, (int) i1.c(fFloatValue, this.f, this.f108177g), (int) i1.c(fFloatValue, this.f + this.d, this.f108177g + this.e));
        o oVar = this.f108174a;
        View child = oVar.getContentActiveControllerView$ui_kit_components_release();
        if (child == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        ArrayList outputPath = this.i;
        Intrinsics.checkNotNullParameter(outputPath, "outputPath");
        outputPath.clear();
        View view = child;
        while (view != null && !view.equals(parent)) {
            outputPath.add(view);
            Object parent2 = view.getParent();
            view = parent2 instanceof View ? (View) parent2 : null;
        }
        if (Intrinsics.f(view, parent)) {
            Intrinsics.checkNotNullParameter(outputPath, "<this>");
            Collections.reverse(outputPath);
        } else {
            outputPath.clear();
        }
        if (outputPath.isEmpty()) {
            hx7.e.h(new IllegalStateException("Unable to find viewsToExpand, modalViewContainerView=" + oVar + " activeControllerView=" + child));
            return;
        }
        int size = outputPath.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) outputPath.get(i);
            Object parent3 = view2.getParent();
            View view3 = parent3 instanceof View ? (View) parent3 : null;
            if (view3 == null) {
                hx7.e.h(new IllegalStateException("Unexpected parent=" + view2.getParent()));
            } else {
                int top = view2.getTop();
                int height = view3.getHeight() - view3.getPaddingBottom();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                RevTransitionUtils.setTopBottom(view2, top, height - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
            }
        }
        outputPath.clear();
    }

    public final boolean b() {
        ValueAnimator valueAnimator = this.f108178h;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final void c(UIKitLinearLayout child, cf6.a onComplete) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        ValueAnimator valueAnimator = this.f108178h;
        int i = 1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            r6.b.r("start called on 'started' transition");
            ValueAnimator valueAnimator2 = this.f108178h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        int i2 = this.d;
        int i3 = this.e;
        m mVar = this.f108175b;
        mVar.f108182a = i2;
        mVar.f108183b = i3;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new androidx.core.view.j(this, child, 10));
        valueAnimatorOfFloat.addListener(new byl.i(this, i, child, onComplete));
        valueAnimatorOfFloat.start();
        this.f108178h = valueAnimatorOfFloat;
    }
}
