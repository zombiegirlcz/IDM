package tw0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f274831a;

    public l() {
        this(0);
    }

    public static boolean a(RecyclerView recyclerView, au0.o appBarLayout) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        if (appBarLayout.f9292a >= 1.0f) {
            return (recyclerView != null && recyclerView.computeVerticalScrollOffset() == 0) || recyclerView == null;
        }
        return false;
    }

    public l(int i) {
        v recyclerScrollDispatcher = new v();
        Intrinsics.checkNotNullParameter(recyclerScrollDispatcher, "recyclerScrollDispatcher");
        this.f274831a = recyclerScrollDispatcher;
    }
}
