package xq0;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ip0.mc0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f308025a;

    public b(c cVar) {
        this.f308025a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView rv4, MotionEvent event) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(event, "event");
        c cVar = this.f308025a;
        if (Intrinsics.f(cVar.f308028c, mc0.f165357a)) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                cVar.e = true;
                cVar.f.removeCallbacks(cVar.f308029g);
                cVar.d = false;
                return false;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                cVar.e = false;
                cVar.a();
                return false;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(RecyclerView rv4, MotionEvent event) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(event, "event");
    }
}
