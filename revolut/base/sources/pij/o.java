package pij;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(EsimSubscriptionsScreen esimSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ActionWidgetDelegate.a aVar2 = tVar.f54721a;
        ActionWidgetDelegate.Model model = tVar.f54722b;
        boolean zF = Intrinsics.f(aVar2, ActionWidgetDelegate.a.C0395a.f51607a);
        EsimSubscriptionsScreen esimSubscriptionsScreen = this.v;
        if (zF) {
            y yVarE3 = esimSubscriptionsScreen.R2();
            Object obj3 = model.f51596l;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.retail.feature.esim.api.model.EsimEvent");
            dej.n remoteEvent = (dej.n) obj3;
            com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE3;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(remoteEvent, "remoteEvent");
            bVar.l2(new j1(bVar, remoteEvent, (Continuation) null), new yi5.b(26));
        } else if (Intrinsics.f(aVar2, ActionWidgetDelegate.a.c.f51609a)) {
            y yVarE32 = esimSubscriptionsScreen.R2();
            Object obj4 = model.f51596l;
            Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.retail.feature.esim.api.model.EsimEvent");
            dej.n remoteEvent2 = (dej.n) obj4;
            com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) yVarE32;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(remoteEvent2, "remoteEvent");
            bVar2.l2(new j1(remoteEvent2, bVar2, (Continuation) null), new yi5.b(26));
        } else {
            if (!Intrinsics.f(aVar2, ActionWidgetDelegate.a.b.f51608a) && !Intrinsics.f(aVar2, ActionWidgetDelegate.a.d.f51610a) && !(aVar2 instanceof com.revolut.core.ui_kit.delegates.h)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
