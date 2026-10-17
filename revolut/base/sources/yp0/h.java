package yp0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f315729a;

    public h(k kVar) {
        this.f315729a = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView rv4, int i) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        if (i != 0) {
            return;
        }
        rv4.removeOnScrollListener(this);
        k kVar = this.f315729a;
        kVar.i = null;
        if (kVar.f) {
            return;
        }
        kVar.f315739a.post(new e(kVar, 1));
    }
}
