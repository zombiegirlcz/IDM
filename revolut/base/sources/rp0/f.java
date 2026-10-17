package rp0;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import ix0.i2;
import ix0.j2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f256074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f256075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xv0.d f256076c;
    public e d;
    public RecyclerView e;
    public int f;

    public f(View anchorView, boolean z) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        this.f256074a = z;
        this.f256075b = anchorView;
        this.f = -1;
    }

    @Override // rp0.m0
    public final void a() {
        RecyclerView recyclerView = this.e;
        if (recyclerView == null) {
            return;
        }
        e eVar = this.d;
        if (eVar != null && eVar.f256066b == this.f) {
            eVar.a(false);
        }
        xv0.d dVar = this.f256076c;
        if (dVar != null) {
            recyclerView.removeOnItemTouchListener(dVar);
        }
    }

    @Override // rp0.m0
    public final void b() {
        View view = this.f256075b;
        ViewParent parent = view.getParent();
        fu0.l lVar = null;
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            this.e = recyclerView;
            Object tag2 = recyclerView.getTag(R$id.internal_recycler_overlay_tag);
            e eVar = tag2 instanceof e ? (e) tag2 : null;
            if (eVar == null) {
                eVar = new e(recyclerView);
                recyclerView.addItemDecoration(eVar);
                recyclerView.setTag(R$id.internal_recycler_overlay_tag, eVar);
            }
            if (this.f256074a) {
                recyclerView.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
                xv0.d dVar = new xv0.d();
                recyclerView.addOnItemTouchListener(dVar);
                this.f256076c = dVar;
            }
            Intrinsics.checkNotNullParameter(view, "view");
            eVar.f256067c = view;
            RecyclerView recyclerView2 = eVar.f256065a;
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = recyclerView2.findContainingViewHolder(view);
            if (viewHolderFindContainingViewHolder != null) {
                if (!(viewHolderFindContainingViewHolder instanceof koi.b)) {
                    viewHolderFindContainingViewHolder = null;
                }
                koi.b bVar = (koi.b) viewHolderFindContainingViewHolder;
                if (bVar != null) {
                    lVar = new fu0.l(bVar);
                }
            }
            eVar.f256072m = lVar;
            j2 j2Var = eVar.k;
            if (j2Var != null) {
                j2Var.cancel();
            }
            i2 i2Var = j2.Companion;
            p6.e eVar2 = new p6.e(view, eVar, 9);
            i2Var.getClass();
            eVar.k = i2.a(recyclerView2, eVar2);
            eVar.a(true);
            int i = eVar.f256066b + 1;
            eVar.f256066b = i;
            this.f = i;
            this.d = eVar;
        }
    }
}
