package xr0;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f308188a;

    public a(i iVar) {
        this.f308188a = iVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        i iVar = this.f308188a;
        ViewParent parent = iVar.f308195a.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            iVar.f308198g.onScrollStateChanged(recyclerView, recyclerView.getScrollState());
            recyclerView.addOnScrollListener(iVar.f308198g);
            w.A(iVar.f308195a).addObserver(iVar.f308199h);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        i iVar = this.f308188a;
        ViewParent parent = iVar.f308195a.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(iVar.f308198g);
        }
        iVar.f = false;
        iVar.b();
    }
}
