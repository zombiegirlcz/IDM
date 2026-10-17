package uwi;

import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AirportDetailsScreen f283674w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AirportDetailsScreen airportDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283674w = airportDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f283674w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f283674w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        hxi.b bVar = (hxi.b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(bVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AirportDetailsScreen airportDetailsScreen = this.f283674w;
        switch (i) {
            case 0:
                hxi.b loungeItemPayload = (hxi.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) airportDetailsScreen.T2();
                uVar.getClass();
                Intrinsics.checkNotNullParameter(loungeItemPayload, "loungeItemPayload");
                uVar.v2(new m(loungeItemPayload.f156600a, loungeItemPayload.f156601b, uVar.f283690p.f99031b));
                break;
            default:
                hxi.b bVar = (hxi.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarI3 = airportDetailsScreen.T2();
                String loungeId = bVar.f156600a;
                u uVar2 = (u) nVarI3;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(loungeId, "loungeId");
                uVar2.l2(new un8.j(uVar2, loungeId, null, 16), new uv1.c(26));
                break;
        }
        return Unit.f186387a;
    }
}
