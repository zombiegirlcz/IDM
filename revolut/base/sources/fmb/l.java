package fmb;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ ReviewProductDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ReviewProductDetailsScreen reviewProductDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = reviewProductDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = ReviewProductDetailsScreen.f83283b0;
        ReviewProductDetailsScreen reviewProductDetailsScreen = this.u;
        ((NavBarWithToolbar) reviewProductDetailsScreen.O.getValue()).setExpanded(false, true);
        ?? r4 = reviewProductDetailsScreen.Q;
        RecyclerView.LayoutManager layoutManager = ((ScreenContentRecyclerView) r4.getValue()).getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        new tw0.v().a((ScreenContentRecyclerView) r4.getValue(), ((LinearLayoutManager) layoutManager).getItemCount() - 1);
        return Unit.f186387a;
    }
}
