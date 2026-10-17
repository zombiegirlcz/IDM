package iyi;

import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.AirportLoungesDisclaimerAcceptanceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AirportLoungesDisclaimerAcceptanceScreen f169765w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AirportLoungesDisclaimerAcceptanceScreen airportLoungesDisclaimerAcceptanceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169765w = airportLoungesDisclaimerAcceptanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f169765w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f169765w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AirportLoungesDisclaimerAcceptanceScreen airportLoungesDisclaimerAcceptanceScreen = this.f169765w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE3 = airportLoungesDisclaimerAcceptanceScreen.e3();
                Intrinsics.h(aVar);
                ((m) cVarE3).I2(aVar);
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE32 = airportLoungesDisclaimerAcceptanceScreen.e3();
                Intrinsics.h(aVar3);
                ((m) cVarE32).I2(aVar3);
                break;
        }
        return Unit.f186387a;
    }
}
