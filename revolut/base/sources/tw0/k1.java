package tw0;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k1 implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f274830a;

    public k1(l1 l1Var) {
        this.f274830a = l1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView rv4, MotionEvent event) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        l1 l1Var = this.f274830a;
        if (actionMasked == 1 || actionMasked == 3) {
            RecyclerView.ViewHolder viewHolder = l1Var.e;
            if (viewHolder != null) {
                l1Var.f274844a.a(viewHolder);
            }
            l1Var.f274845b = BitmapDescriptorFactory.HUE_RED;
            l1Var.f274846c = BitmapDescriptorFactory.HUE_RED;
            l1Var.e = null;
            RecyclerView recyclerView = l1Var.d;
            if (recyclerView != null) {
                recyclerView.removeOnItemTouchListener(l1Var.f274847g);
            }
            l1Var.f = j1.IDLE;
        }
        boolean z = l1Var.e != null;
        if (z) {
            l1Var.f274845b = event.getX();
            l1Var.f274846c = event.getY();
            return z;
        }
        l1Var.f274845b = BitmapDescriptorFactory.HUE_RED;
        l1Var.f274846c = BitmapDescriptorFactory.HUE_RED;
        return z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019a  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTouchEvent(androidx.recyclerview.widget.RecyclerView r24, android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tw0.k1.onTouchEvent(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }
}
