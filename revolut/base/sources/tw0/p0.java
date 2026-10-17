package tw0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f274862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ koi.h f274863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f274864c;

    public p0(l0 l0Var, koi.h hVar, RecyclerView recyclerView) {
        this.f274862a = l0Var;
        this.f274863b = hVar;
        this.f274864c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2) {
        int iE = l0.e(this.f274863b);
        this.f274862a.f274842q = iE != -1;
        if (this.f274864c.getScrollState() == 0 && i <= iE && iE < i + i2) {
            this.f274862a.a(this.f274864c, this.f274863b, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        this.f274862a.f274842q = l0.e(this.f274863b) != -1;
        this.f274862a.a(this.f274864c, this.f274863b, false);
    }
}
