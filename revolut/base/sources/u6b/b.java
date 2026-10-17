package u6b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_linking.CobrandedCardsAccountLinkingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tjf.p0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CobrandedCardsAccountLinkingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CobrandedCardsAccountLinkingScreen cobrandedCardsAccountLinkingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cobrandedCardsAccountLinkingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CobrandedCardsAccountLinkingScreen cobrandedCardsAccountLinkingScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) cobrandedCardsAccountLinkingScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) cobrandedCardsAccountLinkingScreen.d();
                lVar.H2(lVar.f277539r, new rk.b(true, 22));
                lVar.l2(new p0(lVar, null, 28), new k(lVar, 0));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) cobrandedCardsAccountLinkingScreen.d()).C2(f.f277530a);
                break;
        }
        return Unit.f186387a;
    }
}
