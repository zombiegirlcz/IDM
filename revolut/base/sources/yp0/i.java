package yp0;

import android.content.Context;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f315735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Context context) {
        super(context);
        this.f315735a = kVar;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateDtToFit(int i, int i2, int i3, int i5, int i6) {
        int i21 = g.f315726a[this.f315735a.f315740b.ordinal()];
        if (i21 == 1) {
            return a10.b.a(i5, i3, 2, i3) - (((i2 - i) / 2) + i);
        }
        if (i21 == 2) {
            return i3 - i;
        }
        if (i21 == 3) {
            return i5 - i2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void onStop() {
        super.onStop();
        k kVar = this.f315735a;
        RecyclerView recyclerView = kVar.f315739a;
        if (kVar.f) {
            return;
        }
        kVar.f();
        if (recyclerView.getScrollState() == 0) {
            k.a(kVar);
            return;
        }
        h hVar = new h(kVar);
        kVar.i = hVar;
        recyclerView.addOnScrollListener(hVar);
    }
}
