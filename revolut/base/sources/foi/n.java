package foi;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f137002a;

    public n(o oVar) {
        this.f137002a = oVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        eoi.h hVar = this.f137002a.f137003a;
        if (i == 0) {
            c key = c.VERTICAL_SCROLL;
            Intrinsics.checkNotNullParameter(key, "key");
            eoi.j jVar = ((eoi.k) hVar).e;
            if (jVar != null) {
                jVar.e(key);
                return;
            }
            return;
        }
        if (i == 1 || i == 2) {
            g state = g.f136993a;
            Intrinsics.checkNotNullParameter(state, "state");
            eoi.j jVar2 = ((eoi.k) hVar).e;
            if (jVar2 != null) {
                jVar2.d(state);
            }
        }
    }
}
