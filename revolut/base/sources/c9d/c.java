package c9d;

import c84.y;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SubscriptionCancellationScreen f22354w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SubscriptionCancellationScreen subscriptionCancellationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22354w = subscriptionCancellationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f22354w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f22354w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f22354w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        SubscriptionCancellationScreen subscriptionCancellationScreen = this.f22354w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarT2 = subscriptionCancellationScreen.T2();
                Intrinsics.h(itemId);
                com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c cVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) iVarT2;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("DONE_BUTTON_ITEM_ID")) {
                    cVar.C1(cVar.u.c());
                }
                break;
            case 1:
                um0 um0Var = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarT22 = subscriptionCancellationScreen.T2();
                String itemId2 = um0Var.f166695a;
                com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c cVar2 = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) iVarT22;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId2, "itemId");
                j60.a.v(cVar2.f86335p, false, null, 3);
                break;
            default:
                um0 um0Var2 = (um0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarT23 = subscriptionCancellationScreen.T2();
                String itemId3 = um0Var2.f166695a;
                com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c cVar3 = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) iVarT23;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(itemId3, "itemId");
                j60.a.v(cVar3.f86335p, false, null, 3);
                cVar3.l2(new y(cVar3, itemId3, continuation, 2), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
