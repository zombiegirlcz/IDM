package ds4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f117223w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f117223w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y((com.revolut.feature.credit.card.impl.ui.instalment.hub.a) this.f117223w, continuation, 0);
            case 1:
                return new y((com.revolut.feature.credit.card.impl.ui.instalment.term.b) this.f117223w, continuation, 1);
            case 2:
                return new y((com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b) this.f117223w, continuation, 2);
            case 3:
                return new y((com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.a) this.f117223w, continuation, 3);
            case 4:
                return new y((dx5.n) this.f117223w, continuation, 4);
            case 5:
                return new y((com.revolut.feature.freelancer.impl.ui.extension.a) this.f117223w, continuation, 5);
            case 6:
                return new y((dzd.g) this.f117223w, continuation, 6);
            case 7:
                return new y((com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a) this.f117223w, continuation, 7);
            case 8:
                return new y((e0a.i) this.f117223w, continuation, 8);
            case 9:
                return new y((e0a.l) this.f117223w, continuation, 9);
            case 10:
                return new y((e0c.a) this.f117223w, continuation, 10);
            case 11:
                return new y((e0c.a) this.f117223w, continuation, 11);
            case 12:
                return new y((e0c.a) this.f117223w, continuation, 12);
            case 13:
                return new y((e0c.a) this.f117223w, continuation, 13);
            case 14:
                return new y((e0c.a) this.f117223w, continuation, 14);
            case 15:
                return new y((e0c.a) this.f117223w, continuation, 15);
            case 16:
                return new y((e0c.a) this.f117223w, continuation, 16);
            case 17:
                return new y((e0c.a) this.f117223w, continuation, 17);
            case 18:
                return new y((e1c.q) this.f117223w, continuation, 18);
            case 19:
                return new y((com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) this.f117223w, continuation, 19);
            case 20:
                return new y((com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) this.f117223w, continuation, 20);
            case 21:
                return new y((e2l.g) this.f117223w, continuation, 21);
            case 22:
                return new y((com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c) this.f117223w, continuation, 22);
            case 23:
                return new y((e5c.a) this.f117223w, continuation, 23);
            case 24:
                return new y((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a) this.f117223w, continuation, 24);
            case 25:
                return new y((com.revolut.feature.giro.impl.ui.review.a) this.f117223w, continuation, 25);
            case 26:
                return new y((e8h.j) this.f117223w, continuation, 26);
            case 27:
                return new y((e94.h) this.f117223w, continuation, 27);
            case 28:
                return new y((com.revolut.feature.revolutpay.management.impl.ui.management.home.a) this.f117223w, continuation, 28);
            default:
                return new y((com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a) this.f117223w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x03b4  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ds4.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
