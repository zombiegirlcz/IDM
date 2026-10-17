package hea;

import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.pockets.impl.details_v2.domain.PocketDetailsBottomButtonAction;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(PocketDetailsScreen pocketDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            case 1:
                return new l(this.v, continuation, 1);
            default:
                return new l(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CheckoutParams checkoutParams;
        int i = this.u;
        PocketDetailsScreen pocketDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar2 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pocketDetailsScreen.d();
                dda.k kVar = ((o) ((j2) aVar2.U.f22677a).getValue()).f151649g;
                if (kVar != null) {
                    aVar2.L2(kVar);
                }
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pocketDetailsScreen.d()).B2();
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar5 = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) pocketDetailsScreen.d();
                PocketDetailsBottomButtonAction pocketDetailsBottomButtonAction = aVar5.o.f80849h;
                if (!(pocketDetailsBottomButtonAction instanceof PocketDetailsBottomButtonAction.OrderCard) || (checkoutParams = ((PocketDetailsBottomButtonAction.OrderCard) pocketDetailsBottomButtonAction).f80802b) == null) {
                    aVar5.B2();
                } else {
                    aVar5.n2(new h54.o(aVar5, checkoutParams, null, 25), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
