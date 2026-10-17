package v0f;

import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(CardDetailsScreen cardDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.v, continuation, 0);
            case 1:
                return new s(this.v, continuation, 1);
            default:
                return new s(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardDetailsScreen cardDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.screens.card_details.b bVar = (com.revolut.feature.topup_screen.impl.screens.card_details.b) cardDetailsScreen.e3();
                if (bVar.o.f90483a) {
                    bVar.C2(ste.a.f265556a);
                } else {
                    bVar.B2();
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.screens.card_details.b bVar2 = (com.revolut.feature.topup_screen.impl.screens.card_details.b) cardDetailsScreen.e3();
                bVar2.getClass();
                bVar2.l2(new com.revolut.feature.topup_screen.impl.screens.card_details.a(bVar2, null), new yi5.b(26));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.screens.card_details.b bVar3 = (com.revolut.feature.topup_screen.impl.screens.card_details.b) cardDetailsScreen.e3();
                j60.a aVar4 = bVar3.f91094s;
                bVar3.f91093r.getClass();
                aVar4.x(wig.a.a());
                break;
        }
        return Unit.f186387a;
    }
}
