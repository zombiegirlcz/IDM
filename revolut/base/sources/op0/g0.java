package op0;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f227263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.widgets.v f227264b;

    public g0(View view, com.revolut.core.ui_kit.delegates.widgets.v vVar) {
        this.f227263a = view;
        this.f227264b = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        View view = this.f227263a;
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            com.revolut.core.ui_kit.delegates.widgets.v vVar = this.f227264b;
            h0 h0Var = vVar.o;
            h0Var.onScrollStateChanged(recyclerView, recyclerView.getScrollState());
            recyclerView.addOnScrollListener(h0Var);
            view.addOnLayoutChangeListener(new bx0.v(vVar, view, 12));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ViewParent parent = this.f227263a.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f227264b.o);
        }
    }
}
