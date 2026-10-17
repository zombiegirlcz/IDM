package koi;

import android.view.ViewGroup;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends RecyclerView.Adapter {
    public final c f;

    public a(c delegatesManager) {
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        this.f = delegatesManager;
    }

    public abstract j a(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        k kVar;
        j data = a(i);
        c cVar = this.f;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        SparseArrayCompat sparseArrayCompat = cVar.f186369a;
        int size = sparseArrayCompat.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                kVar = null;
                break;
            }
            kVar = (k) sparseArrayCompat.valueAt(i2);
            if (kVar.f(i, data)) {
                break;
            }
            i2++;
        }
        if (kVar != null) {
            return kVar.a();
        }
        k kVarT1 = data.T1();
        if (kVarT1 != null) {
            sparseArrayCompat.put(kVarT1.a(), kVarT1);
            return kVarT1.a();
        }
        throw new IllegalStateException(("No delegate found for position " + i + " and object " + data.getClass() + ", auto creation is not implemented - " + data.getF58316a()).toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        this.f.d(holder.getItemViewType()).p(holder, a(i), i, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.f.d(i).g(parent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        this.f.d(holder.getItemViewType()).k(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        this.f.d(holder.getItemViewType()).h(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f.d(holder.getItemViewType()).onViewRecycled(holder);
    }

    public a() {
        this(new c(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        onBindViewHolder(holder, i, f0.f322471a);
    }
}
