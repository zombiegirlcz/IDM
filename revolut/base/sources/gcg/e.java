package gcg;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover.TravelHotelsHomeDiscoverScreen;
import gcg.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsHomeDiscoverScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsHomeDiscoverScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarD3 = this.v.d();
        Intrinsics.h(model);
        e0 e0Var = (e0) rVarD3;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "TRAVEL_HOME_PROPERTIES_RECOMMENDATION_SUB_HEADER_ID")) {
            Object obj3 = model.f52715m;
            Continuation continuation = null;
            jxf.a aVar2 = obj3 instanceof jxf.a ? (jxf.a) obj3 : null;
            if (aVar2 != null) {
                e0Var.f142446x.Z2(new ah1.m(e0Var, aVar2, continuation, 15));
            }
        } else if (Intrinsics.f(str, "UPCOMING_BOOKINGS_SUB_HEADER_ITEM_ID")) {
            e0Var.C2(k.d.f142459a);
        }
        return Unit.f186387a;
    }
}
