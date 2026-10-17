package l0c;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends LinearSmoothScroller {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f191206a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, boolean z) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f191206a = z;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateDyToMakeVisible(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        int iCalculateDyToMakeVisible = super.calculateDyToMakeVisible(view, i);
        return this.f191206a ? iCalculateDyToMakeVisible - view.getHeight() : iCalculateDyToMakeVisible;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateTimeForScrolling(int i) {
        return Math.min(super.calculateTimeForScrolling(i), 1000);
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int getVerticalSnapPreference() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void onTargetFound(View targetView, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(targetView, getHorizontalSnapPreference());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(targetView, 1);
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.hypot(iCalculateDxToMakeVisible, iCalculateDyToMakeVisible));
        if (iCalculateTimeForDeceleration > 0) {
            action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }
}
