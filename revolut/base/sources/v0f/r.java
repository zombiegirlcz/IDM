package v0f;

import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardDetailsScreen f284823w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(CardDetailsScreen cardDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284823w = cardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f284823w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            default:
                r rVar2 = new r(this.f284823w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t61.j jVar;
        int i = this.u;
        CardDetailsScreen cardDetailsScreen = this.f284823w;
        switch (i) {
            case 0:
                String cvv = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.screens.card_details.b bVar = (com.revolut.feature.topup_screen.impl.screens.card_details.b) cardDetailsScreen.e3();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(cvv, "cvv");
                cli.y yVar = bVar.G;
                u uVar = (u) ((j2) yVar.f22677a).getValue();
                if (cvv.length() == 3 && (jVar = uVar.e) != null && jVar.f268165m) {
                    bVar.H2(yVar, new uo7.k(cvv, 10));
                } else {
                    bVar.H2(yVar, new uo7.k(cvv, 11));
                }
                break;
            default:
                String postcode = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.screens.card_details.b bVar2 = (com.revolut.feature.topup_screen.impl.screens.card_details.b) cardDetailsScreen.e3();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(postcode, "postcode");
                bVar2.H2(bVar2.G, new uo7.k(postcode, 12));
                break;
        }
        return Unit.f186387a;
    }
}
