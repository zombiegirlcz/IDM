package foi;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eoi.h f137003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f137004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f137005c;
    public es0.k d;

    public o(eoi.h frameStatsTracker) {
        Intrinsics.checkNotNullParameter(frameStatsTracker, "frameStatsTracker");
        this.f137003a = frameStatsTracker;
    }

    public final void a() {
        RecyclerView recyclerView = this.f137004b;
        n nVar = this.f137005c;
        es0.k kVar = this.d;
        this.f137004b = null;
        this.f137005c = null;
        this.d = null;
        if (recyclerView != null) {
            eoi.h hVar = this.f137003a;
            c key = c.VERTICAL_SCROLL;
            Intrinsics.checkNotNullParameter(key, "key");
            eoi.j jVar = ((eoi.k) hVar).e;
            if (jVar != null) {
                jVar.e(key);
            }
        }
        if (nVar != null && recyclerView != null) {
            recyclerView.removeOnScrollListener(nVar);
        }
        if (kVar == null || recyclerView == null) {
            return;
        }
        recyclerView.removeOnAttachStateChangeListener(kVar);
    }

    public final void b(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.f137004b == recyclerView) {
            return;
        }
        a();
        n nVar = new n(this);
        es0.k kVar = new es0.k(this, 1);
        this.f137004b = recyclerView;
        this.f137005c = nVar;
        this.d = kVar;
        recyclerView.addOnScrollListener(nVar);
        recyclerView.addOnAttachStateChangeListener(kVar);
        int scrollState = recyclerView.getScrollState();
        eoi.h hVar = this.f137003a;
        if (scrollState == 0) {
            c key = c.VERTICAL_SCROLL;
            Intrinsics.checkNotNullParameter(key, "key");
            eoi.j jVar = ((eoi.k) hVar).e;
            if (jVar != null) {
                jVar.e(key);
                return;
            }
            return;
        }
        if (scrollState == 1 || scrollState == 2) {
            g state = g.f136993a;
            Intrinsics.checkNotNullParameter(state, "state");
            eoi.j jVar2 = ((eoi.k) hVar).e;
            if (jVar2 != null) {
                jVar2.d(state);
            }
        }
    }
}
