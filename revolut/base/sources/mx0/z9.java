package mx0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.ModalViewContainerBehavior;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class z9 extends RecyclerView.OnScrollListener implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f210144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModalViewContainerBehavior f210145b;

    public z9(ModalViewContainerBehavior modalViewContainerBehavior) {
        this.f210145b = modalViewContainerBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ModalViewContainerBehavior modalViewContainerBehavior;
        CoordinatorLayout coordinatorLayout;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i != 0 || (coordinatorLayout = (modalViewContainerBehavior = this.f210145b).f58785j) == null) {
            return;
        }
        modalViewContainerBehavior.d(coordinatorLayout);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        RecyclerView recyclerView = this.f210144a;
        if (recyclerView != null) {
            recyclerView.removeOnAttachStateChangeListener(this);
            recyclerView.removeOnScrollListener(this);
        }
        this.f210144a = null;
    }
}
