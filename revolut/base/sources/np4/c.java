package np4;

import aw0.n6;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AdditionalCardsChangeLimitScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = additionalCardsChangeLimitScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) additionalCardsChangeLimitScreen.k3();
                oVar.getClass();
                oVar.n2(new k(oVar, null, 1), new whi.b(6));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) additionalCardsChangeLimitScreen.k3()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
