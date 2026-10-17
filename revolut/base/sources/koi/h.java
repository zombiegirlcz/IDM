package koi;

import android.os.Looper;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class h extends koi.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f186374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f186375h;
    public WeakReference i;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a extends DiffUtil.ItemCallback {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final boolean areContentsTheSame(Object obj2, Object obj3) {
            j oldItem = (j) obj2;
            j newItem = (j) obj3;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.f(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final boolean areItemsTheSame(Object obj2, Object obj3) {
            j oldItem = (j) obj2;
            j newItem = (j) obj3;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.f(oldItem.getF51890a(), newItem.getF51890a());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final Object getChangePayload(Object obj2, Object obj3) {
            j oldItem = (j) obj2;
            j newItem = (j) obj3;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return newItem.z(oldItem);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h() {
        boolean z = false;
        this(null, z, z, 7);
    }

    @Override // koi.a
    public j a(int i) {
        return (j) b().get(i);
    }

    public List b() {
        return this.f186375h.getItems();
    }

    public void c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (!Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("DiffAdapter.setItems() was called from worker thread");
        }
        this.f186375h.setItems(items);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.i = new WeakReference(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.i = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c delegatesManager, boolean z, boolean z3) {
        super(delegatesManager);
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        this.f186374g = z3;
        this.f186375h = z ? new d(this) : new i(this, true);
        if (z3) {
            registerAdapterDataObserver(new e(this));
        }
    }

    public /* synthetic */ h(c cVar, boolean z, boolean z3, int i) {
        this((i & 1) != 0 ? new c(0) : cVar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z3);
    }
}
