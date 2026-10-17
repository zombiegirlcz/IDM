package mhe;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f205545a;

    public c(d dVar) {
        this.f205545a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView rv4, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
        if (e.getActionMasked() != 1 && e.getActionMasked() != 3) {
            return false;
        }
        d dVar = this.f205545a;
        RecyclerView.ViewHolder viewHolder = dVar.f;
        if (viewHolder != null) {
            dVar.a(viewHolder);
        }
        dVar.f = null;
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(RecyclerView rv4, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
    }
}
