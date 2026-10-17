package hul;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvestOrderReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InvestOrderReviewScreen investOrderReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = investOrderReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52613a;
        csl.l.Companion.getClass();
        boolean zF = Intrinsics.f(str, "EXPANDABLE_DIALOG_LARGE_BUTTON_GOT_IT");
        InvestOrderReviewScreen investOrderReviewScreen = this.v;
        if (zF) {
            j60.a.v(((com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2()).A, false, null, 3);
        } else if (Intrinsics.f(str, "EXPANDABLE_DIALOG_LARGE_BUTTON_LEARN_MORE")) {
            com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
            j60.a.v(oVar.A, false, new t(oVar, 4), 1);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unsupported item with id = ", model.f52613a));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
