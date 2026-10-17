package k50;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y1 extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.h f181295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f181296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f181297c;

    public y1(koi.h adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f181295a = adapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        if (this.f181297c == 0) {
            this.f181297c = this.f181295a.getItemCount();
        } else {
            this.f181296b = true;
        }
    }
}
