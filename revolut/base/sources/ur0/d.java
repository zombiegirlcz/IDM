package ur0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import ip0.t4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import tpl.o;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends RecyclerView.OnScrollListener {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsyncDiffRecyclerView f282227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f282228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f282229c;

    public d(AsyncDiffRecyclerView asyncDiffRecyclerView, o oVar) {
        this.f282227a = asyncDiffRecyclerView;
        this.f282228b = oVar;
        asyncDiffRecyclerView.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 24));
        asyncDiffRecyclerView.addOnScrollListener(this);
        b(asyncDiffRecyclerView);
        if (this.f282229c == null) {
            oVar.invoke(null);
        }
    }

    public final void b(RecyclerView recyclerView) {
        View viewF = s.f(recyclerView);
        Object childViewHolder = viewF != null ? this.f282227a.getChildViewHolder(viewF) : null;
        if (!(childViewHolder instanceof e)) {
            childViewHolder = null;
        }
        e eVar = (e) childViewHolder;
        if (Intrinsics.f(this.f282229c, eVar)) {
            return;
        }
        e eVar2 = this.f282229c;
        o listener = this.f282228b;
        if (eVar2 != null) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            ((t4) eVar2).F.remove(listener);
        }
        this.f282229c = eVar;
        if (eVar != null) {
            t4 t4Var = (t4) eVar;
            Intrinsics.checkNotNullParameter(listener, "listener");
            t4Var.F.add(listener);
            listener.invoke(t4Var.f166431h.getDrawable());
        }
        if (this.f282229c == null) {
            listener.invoke(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 0) {
            b(recyclerView);
        }
    }
}
