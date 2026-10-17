package tw0;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f274861a;

    public p(r rVar) {
        this.f274861a = rVar;
    }

    public static RecyclerView a(View view) {
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            return recyclerView;
        }
        Object parent2 = view.getParent();
        return a(parent2 instanceof View ? (View) parent2 : null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        r rVar = this.f274861a;
        RecyclerView recyclerView = a(rVar.f274867a.itemView);
        if (recyclerView != null) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (Intrinsics.f(rVar.d, recyclerView)) {
                return;
            }
            rVar.a(recyclerView.getScrollState());
            recyclerView.addOnScrollListener(rVar.f274870g);
            rVar.d = recyclerView;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        r rVar = this.f274861a;
        RecyclerView recyclerView = a(rVar.f274867a.itemView);
        if (recyclerView != null) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            recyclerView.removeOnScrollListener(rVar.f274870g);
            rVar.f274869c = false;
            rVar.d = null;
        }
        skm.e0.n(rVar.f274868b.f323100a);
    }
}
