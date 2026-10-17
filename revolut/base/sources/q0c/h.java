package q0c;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RevPointsTransactionsListScreen f241230a;

    public h(RevPointsTransactionsListScreen revPointsTransactionsListScreen) {
        this.f241230a = revPointsTransactionsListScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        KProperty[] kPropertyArr = RevPointsTransactionsListScreen.f83871e0;
        this.f241230a.d3();
    }
}
