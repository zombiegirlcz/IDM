package ey0;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends RecyclerView.OnScrollListener implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f130507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f130508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a76.c f130509c;
    public b d;
    public final AccelerateDecelerateInterpolator e;
    public final /* synthetic */ d f;

    public c(d dVar, View scrollFrom, View scrollTo, a76.c onComplete) {
        Intrinsics.checkNotNullParameter(scrollFrom, "scrollFrom");
        Intrinsics.checkNotNullParameter(scrollTo, "scrollTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.f = dVar;
        this.f130507a = scrollFrom;
        this.f130508b = scrollTo;
        this.f130509c = onComplete;
        this.d = b.FORWARD;
        this.e = new AccelerateDecelerateInterpolator();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView rv4, int i) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        if (i == 0) {
            if (this.d == b.FORWARD) {
                this.d = b.BACKWARD;
                run();
            } else {
                this.f.f130510a.removeOnScrollListener(this);
                this.f130509c.invoke();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArrCalculateDistanceToFinalSnap;
        int i;
        d dVar = this.f;
        boolean z = dVar.d;
        RecyclerView recyclerView = dVar.f130510a;
        if (z) {
            return;
        }
        View view = this.d == b.FORWARD ? this.f130508b : this.f130507a;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (iArrCalculateDistanceToFinalSnap = dVar.f130511b.calculateDistanceToFinalSnap(linearLayoutManager, view)) == null || (i = iArrCalculateDistanceToFinalSnap[1]) == 0) {
            return;
        }
        recyclerView.addOnScrollListener(this);
        recyclerView.smoothScrollBy(0, i, this.e, 600);
    }
}
