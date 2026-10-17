package pig;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelMilesTransferScreen travelMilesTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarD = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) oVarD;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        xi0.b bVar = ((j) ((j2) aVar2.z.f22677a).getValue()).f236483c;
        if (bVar != null) {
            aVar2.l2(new pdi.j(aVar2, bVar, null, 13), new yi5.b(26));
        } else {
            aVar2.D.a();
            Unit unit = Unit.f186387a;
        }
        aVar2.C.a();
        aVar2.B.a();
        return Unit.f186387a;
    }
}
