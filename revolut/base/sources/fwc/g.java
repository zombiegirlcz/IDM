package fwc;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreen;
import com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsLimitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TransactionsLimitsScreen transactionsLimitsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsLimitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar2 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) rVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "SEPA_INSTANT_LIMIT_SUBHEADER_LIST_ITEM_ID")) {
            aVar2.C2(new p(SecurityHubProductArticleKey.TRANSACTION_SEPA_LIMIT_INTRO));
        }
        return Unit.f186387a;
    }
}
