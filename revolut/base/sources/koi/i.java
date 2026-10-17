package koi;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f186376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f186377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f186378c;
    public androidx.view.d d;

    public i(h adapter, boolean z) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f186376a = adapter;
        this.f186377b = z;
        this.f186378c = new ArrayList();
    }

    public final DiffUtil.DiffResult b(List newList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new g(new ArrayList(getItems()), newList), this.f186377b);
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "calculateDiff(...)");
        return diffResultCalculateDiff;
    }

    public final void c(DiffUtil.DiffResult diffResult, List newList, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        ao.a aVar = new ao.a(this, 2, newList, diffResult);
        Runnable runnable = this.d;
        if (runnable != null) {
            recyclerView.removeCallbacks(runnable);
        }
        if (!recyclerView.isComputingLayout()) {
            aVar.invoke();
            return;
        }
        androidx.view.d dVar = new androidx.view.d(aVar, 18);
        this.d = dVar;
        recyclerView.post(dVar);
    }

    @Override // koi.f
    public List getItems() {
        return this.f186378c;
    }

    @Override // koi.f
    public void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        DiffUtil.DiffResult diffResultB = b(items);
        WeakReference weakReference = this.f186376a.i;
        RecyclerView recyclerView = weakReference != null ? (RecyclerView) weakReference.get() : null;
        if (recyclerView == null) {
            throw new IllegalStateException("Recycler View not attached");
        }
        c(diffResultB, items, recyclerView);
    }
}
