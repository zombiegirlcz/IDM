package fmb;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsRevampScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ ReviewProductDetailsRevampScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen, Continuation continuation) {
        super(2, continuation);
        this.u = reviewProductDetailsRevampScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = ReviewProductDetailsRevampScreen.c0;
        ReviewProductDetailsRevampScreen reviewProductDetailsRevampScreen = this.u;
        ?? r06 = reviewProductDetailsRevampScreen.Q;
        RecyclerView.LayoutManager layoutManager = ((ScreenContentRecyclerView) r06.getValue()).getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || linearLayoutManager.getItemCount() <= 0) {
            IllegalStateException illegalStateException = new IllegalStateException("LayoutManager " + linearLayoutManager + " is null or itemCount <= 0");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            ((NavBarLargeCentred) reviewProductDetailsRevampScreen.O.getValue()).setExpanded(false, true);
            new tw0.v().a((ScreenContentRecyclerView) r06.getValue(), linearLayoutManager.getItemCount() - 1);
        }
        return Unit.f186387a;
    }
}
