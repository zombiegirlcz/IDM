package com.revolut.core.ui_kit.internal.dialogs;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rr0.i;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \n*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/dialogs/DynamicMarginBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/revolut/core/ui_kit/internal/dialogs/MiddleStateBottomSheetBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class DynamicMarginBottomSheetBehavior<V extends View> extends MiddleStateBottomSheetBehavior<V> {
    public WeakReference G;
    public WeakReference H;
    public int I;
    public int J;
    public int K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicMarginBottomSheetBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.I = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
    }

    @Override // com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior
    public final void dispatchOnSlide(int i) {
        View view;
        WeakReference weakReference;
        CoordinatorLayout coordinatorLayout;
        super.dispatchOnSlide(i);
        WeakReference weakReference2 = this.H;
        if (weakReference2 == null || (view = (View) weakReference2.get()) == null || (weakReference = this.G) == null || (coordinatorLayout = (CoordinatorLayout) weakReference.get()) == null) {
            return;
        }
        j(coordinatorLayout, view, i);
    }

    public final void j(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.K;
        if (i2 == 0 && this.L == 0) {
            return;
        }
        if (this.I == Integer.MIN_VALUE || this.J == Integer.MIN_VALUE) {
            this.I = this.A;
            this.J = this.z;
        }
        int i3 = this.J;
        int i5 = this.I;
        float f = 1.0f;
        if (i3 > i5 && i < i3) {
            f = i <= i5 ? BitmapDescriptorFactory.HUE_RED : (i - i5) / (i3 - i5);
        }
        int i6 = (int) (i2 * f);
        int i21 = (int) (this.L * f);
        int width = coordinatorLayout.getWidth() - (i6 * 2);
        if (width < 0) {
            width = 0;
        }
        int height = (coordinatorLayout.getHeight() - i21) - i;
        i.a(view, width, height >= 0 ? height : 0);
        Rect rect = rr0.c.f256608a;
        rr0.c.d(view, i6, i);
    }

    @Override // com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout parent, View child, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        WeakReference weakReference = this.G;
        if (!Intrinsics.f(weakReference != null ? (CoordinatorLayout) weakReference.get() : null, parent)) {
            this.G = new WeakReference(parent);
        }
        WeakReference weakReference2 = this.H;
        if (!Intrinsics.f(weakReference2 != null ? (View) weakReference2.get() : null, child)) {
            this.H = new WeakReference(child);
        }
        super.onLayoutChild(parent, child, i);
        this.I = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
        j(parent, child, child.getTop());
        return true;
    }
}
