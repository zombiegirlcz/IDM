package au0;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayoutProxy;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class o extends AppBarLayoutProxy {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f9293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9294c;
    public boolean d;
    public boolean e;
    public final SparseBooleanArray f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f9295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9296h;
    public WeakReference i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f9297j;
    public final u2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = new n(this);
        this.f9292a = 1.0f;
        this.d = true;
        this.e = true;
        this.f = new SparseBooleanArray();
        this.f9295g = new ArrayList();
        this.f9296h = Integer.MAX_VALUE;
        this.f9297j = new ArrayList();
        this.k = new u2(this);
        addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) nVar);
    }

    public static float n(float f, float f4, boolean z) {
        if (!z) {
            return f <= f4 ? BitmapDescriptorFactory.HUE_RED : (f - f4) / (1 - f4);
        }
        if (f <= f4) {
            return 1.0f;
        }
        float f5 = 1;
        return f5 - ((f - f4) / (f5 - f4));
    }

    public static void w(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(f);
        view.setVisibility(f > BitmapDescriptorFactory.HUE_RED ? 0 : 4);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NotNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new CollapsingAppBarLayout$Behavior();
    }

    public final CollapsingAppBarLayout$Behavior getCurrentBehaviourOrNull$ui_kit_components_release() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        CoordinatorLayout.Behavior behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
        if (behavior instanceof CollapsingAppBarLayout$Behavior) {
            return (CollapsingAppBarLayout$Behavior) behavior;
        }
        return null;
    }

    public final float getExpandRatio() {
        return this.f9292a;
    }

    public final float getLastExpandRatio$ui_kit_components_release() {
        return this.f9292a;
    }

    public final int getLastOffset() {
        return this.f9294c;
    }

    public final int getMaxCollapseOffset$ui_kit_components_release() {
        return this.f9296h;
    }

    @NotNull
    public final List<Function1<View, Unit>> getPrimaryNestedScrollViewChangedListeners() {
        return this.f9297j;
    }

    public final Integer getReflectiveSurfaceCollapsedHeight$ui_kit_components_release() {
        return this.f9293b;
    }

    public final void j(boolean z) {
        setScrollEnabled$ui_kit_components_release(true);
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        int scrollFlags = ((AppBarLayout.LayoutParams) layoutParams).getScrollFlags();
        int i = z ? 0 : 3;
        if (i != scrollFlags) {
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            Intrinsics.i(layoutParams2, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            ((AppBarLayout.LayoutParams) layoutParams2).setScrollFlags(i);
            requestLayout();
        }
    }

    public abstract void k(float f, int i);

    public float l() {
        return -1.0f;
    }

    public final boolean o(int i) {
        if (!this.d || getTotalScrollRange() == 0) {
            return false;
        }
        boolean z = i > 0;
        float f = this.f9292a;
        boolean z3 = f <= BitmapDescriptorFactory.HUE_RED;
        boolean z4 = f >= 1.0f;
        if (z3 && z) {
            return false;
        }
        if (!z3 || z) {
            return (z4 && z) || !z4 || z;
        }
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k.h();
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy, com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release = getCurrentBehaviourOrNull$ui_kit_components_release();
        if (currentBehaviourOrNull$ui_kit_components_release != null) {
            boolean z3 = this.d;
            currentBehaviourOrNull$ui_kit_components_release.f57239b = z3;
            if (z3) {
                currentBehaviourOrNull$ui_kit_components_release.setDragCallback(currentBehaviourOrNull$ui_kit_components_release.e);
            } else {
                currentBehaviourOrNull$ui_kit_components_release.setDragCallback(currentBehaviourOrNull$ui_kit_components_release.d);
            }
        }
    }

    public final void p(View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        WeakReference weakReference = this.i;
        if (Intrinsics.f(weakReference != null ? (View) weakReference.get() : null, target)) {
            return;
        }
        this.i = new WeakReference(target);
        ArrayList arrayList = this.f9297j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Function1) arrayList.get(i)).invoke(target);
        }
    }

    public void q(int i, int i2, ViewGroup viewGroup) {
        setAlwaysExpanded$ui_kit_components_release(1, getHeight() <= i2 - i);
    }

    public void s(SlidingFromTopViewContainer view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void setAlwaysExpanded$ui_kit_components_release(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.f;
        sparseBooleanArray.put(i, z);
        if (this.e) {
            j(sparseBooleanArray.indexOfValue(true) >= 0);
        }
    }

    public final void setAlwaysExpandedFlagEnabled$ui_kit_components_release(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (z) {
            j(this.f.indexOfValue(true) >= 0);
        } else {
            j(false);
        }
    }

    public final void setMaxCollapseOffset$ui_kit_components_release(int i) {
        this.f9296h = i;
    }

    public final void setReflectiveSurfaceCollapsedHeight$ui_kit_components_release(Integer num) {
        this.f9293b = num;
    }

    public final void setScrollEnabled$ui_kit_components_release(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release = getCurrentBehaviourOrNull$ui_kit_components_release();
        if (currentBehaviourOrNull$ui_kit_components_release != null) {
            boolean z3 = this.d;
            currentBehaviourOrNull$ui_kit_components_release.f57239b = z3;
            if (z3) {
                currentBehaviourOrNull$ui_kit_components_release.setDragCallback(currentBehaviourOrNull$ui_kit_components_release.e);
            } else {
                currentBehaviourOrNull$ui_kit_components_release.setDragCallback(currentBehaviourOrNull$ui_kit_components_release.d);
            }
        }
    }

    public void u(SlidingFromTopViewContainer view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
