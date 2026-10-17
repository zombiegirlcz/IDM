package nci;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends LinearSmoothScroller {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f214196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f214197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, boolean z, boolean z3) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f214196a = z;
        this.f214197b = z3;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateDyToMakeVisible(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        int iCalculateDyToMakeVisible = super.calculateDyToMakeVisible(view, i);
        return this.f214196a ? iCalculateDyToMakeVisible - view.getHeight() : iCalculateDyToMakeVisible;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateTimeForScrolling(int i) {
        int iCalculateTimeForScrolling = super.calculateTimeForScrolling(i);
        return this.f214197b ? Math.min(iCalculateTimeForScrolling, 1000) : iCalculateTimeForScrolling;
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
        double d = iCalculateDxToMakeVisible;
        double d5 = iCalculateDyToMakeVisible;
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((d5 * d5) + (d * d)));
        if (iCalculateTimeForDeceleration > 0) {
            action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }
}
