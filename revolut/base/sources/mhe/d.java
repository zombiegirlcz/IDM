package mhe;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yp0.y;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends ItemTouchHelper.Callback {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DecelerateInterpolator f205546h = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4l.j f205547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ItemTouchHelper f205548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f205549c;
    public float d;
    public boolean e;
    public RecyclerView.ViewHolder f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f205550g;

    public d(z4l.j adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f205547a = adapter;
        this.f205548b = new ItemTouchHelper(this);
        this.f205549c = v0.a.d("create(...)");
        this.f205550g = new c(this);
    }

    public final void a(RecyclerView.ViewHolder viewHolder) {
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setElevation(this.d);
        itemView.animate().cancel();
        itemView.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(f205546h).setDuration(200L).start();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder current, RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(target, "target");
        int bindingAdapterPosition = target.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            z4l.j jVar = this.f205547a;
            if (bindingAdapterPosition < jVar.getItemCount()) {
                koi.j jVarA = jVar.a(bindingAdapterPosition);
                if ((jVarA instanceof SmallStockCardDelegate.Model) && (((SmallStockCardDelegate.Model) jVarA).f53388p instanceof i)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        if (this.f != null) {
            a(viewHolder);
            this.f = null;
        }
        if (this.e) {
            z4l.c cVar = this.f205547a.f319395l;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : cVar) {
                if (obj2 instanceof SmallStockCardDelegate.Model) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                Object obj3 = ((SmallStockCardDelegate.Model) it8.next()).f53388p;
                i iVar = obj3 instanceof i ? (i) obj3 : null;
                TotalWealthCategoryKey totalWealthCategoryKey = iVar != null ? iVar.f205557a : null;
                if (totalWealthCategoryKey != null) {
                    arrayList2.add(totalWealthCategoryKey);
                }
            }
            this.f205549c.onNext(arrayList2);
            this.e = false;
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            z4l.j jVar = this.f205547a;
            if (bindingAdapterPosition < jVar.getItemCount()) {
                koi.j jVarA = jVar.a(bindingAdapterPosition);
                return ((jVarA instanceof SmallStockCardDelegate.Model) && (((SmallStockCardDelegate.Model) jVarA).f53388p instanceof i)) ? ItemTouchHelper.Callback.makeMovementFlags(15, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
        }
        return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
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
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = target.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
            return false;
        }
        z4l.j jVar = this.f205547a;
        if (bindingAdapterPosition >= jVar.getItemCount() || bindingAdapterPosition2 >= jVar.getItemCount()) {
            return false;
        }
        z4l.c cVar = jVar.f319395l;
        ArrayList arrayListF1 = d0.f1(cVar);
        arrayListF1.add(bindingAdapterPosition2, (koi.j) arrayListF1.remove(bindingAdapterPosition));
        cVar.clear();
        cVar.addAll(arrayListF1);
        jVar.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        this.e = true;
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        super.onSelectedChanged(viewHolder, i);
        if (i != 2 || viewHolder == null) {
            return;
        }
        this.e = false;
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        this.d = itemView.getElevation();
        ViewParent parent = itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        itemView.setElevation((recyclerView != null ? y.e(recyclerView, itemView) : BitmapDescriptorFactory.HUE_RED) + 1.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
