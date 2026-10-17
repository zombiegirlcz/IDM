package es0;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import mx0.j5;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mnl.g f128811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j5 f128812b;

    public c(mnl.g onMoved, j5 onCompleted) {
        Intrinsics.checkNotNullParameter(onMoved, "onMoved");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        this.f128811a = onMoved;
        this.f128812b = onCompleted;
    }

    public static boolean a(RecyclerView.ViewHolder viewHolder) {
        koi.b bVar = viewHolder instanceof koi.b ? (koi.b) viewHolder : null;
        koi.j jVar = bVar != null ? bVar.e : null;
        ar0.e eVar = jVar instanceof ar0.e ? (ar0.e) jVar : null;
        if (eVar != null) {
            return eVar.d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(RecyclerView.ViewHolder viewHolder) {
        a aVar = viewHolder instanceof a ? (a) viewHolder : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Your holder should be implemented by DraggableCallback");
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder current, RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(target, "target");
        return a(current) && a(target);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        ((ar0.h) b(viewHolder)).F(new b(this, 1));
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (a(viewHolder)) {
            return ItemTouchHelper.Callback.makeMovementFlags(48, 0);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!a(viewHolder)) {
            return false;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = target.getAdapterPosition();
        if (adapterPosition < 0 || adapterPosition2 < 0) {
            return false;
        }
        this.f128811a.invoke(Integer.valueOf(adapterPosition), Integer.valueOf(adapterPosition2));
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        super.onSelectedChanged(viewHolder, i);
        if (i != 2 || viewHolder == null) {
            return;
        }
        ar0.h hVar = (ar0.h) b(viewHolder);
        if (hVar.f) {
            hVar.itemView.clearAnimation();
        }
        hVar.f8493g.animate().scaleX(1.1f).scaleY(1.1f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
