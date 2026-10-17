package pdg;

import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pdg.p;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsPropertyDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsPropertyDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsActionListDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionListDelegate.Model model = (CellDetailsActionListDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarE3 = this.v.d();
        Intrinsics.h(model);
        i0 i0Var = (i0) xVarE3;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51796a, "AMENITY_ITEM_ID")) {
            i0Var.C2(p.a.f235212a);
        }
        return Unit.f186387a;
    }
}
