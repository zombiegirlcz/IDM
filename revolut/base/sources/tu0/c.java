package tu0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import mic.a0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ts5.o;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f274509a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f274510b = new ifm.b();

    public static final class a {
        private a() {
        }
    }

    @Override // tu0.b
    public final void a(SwipeableCardContainerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.swipeableCardInnerRecyclerItemDelegate_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            throw new IllegalStateException("forgot layoutManager?");
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            throw new IllegalStateException("forgot adapter?");
        }
        View viewFindViewById2 = view.findViewById(R$id.swipeableCardInnerRecyclerItemDelegate_headerGradient);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = view.findViewById(R$id.swipeableCardInnerRecyclerItemDelegate_footerGradient);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        recyclerView.post(new b0.e(linearLayoutManager, adapter, viewFindViewById2, viewFindViewById3, 12));
        View viewFindViewById4 = view.findViewById(R$id.swipeableCardInnerRecyclerItemDelegate_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        g gVar = this.f274509a;
        ((RecyclerView) viewFindViewById4).removeOnScrollListener(gVar);
        ifm.b bVar = this.f274510b;
        bVar.d();
        recyclerView.addOnScrollListener(gVar);
        r rVarDistinctUntilChanged = gVar.f274513a.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        w.j0(bVar, rVarDistinctUntilChanged.subscribe(new o(13, new tkm.d(viewFindViewById2, viewFindViewById3, 22)), new a0(13, e.f274512a)));
    }

    @Override // tu0.b
    public final void b(SwipeableCardContainerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.swipeableCardInnerRecyclerItemDelegate_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((RecyclerView) viewFindViewById).removeOnScrollListener(this.f274509a);
        this.f274510b.d();
    }
}
