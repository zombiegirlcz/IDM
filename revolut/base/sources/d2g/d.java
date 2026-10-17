package d2g;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesDestinationDiscoveryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelExperiencesDestinationDiscoveryScreen travelExperiencesDestinationDiscoveryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesDestinationDiscoveryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        y yVar = (y) vVarE3;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52715m;
        lyf.b bVar = obj3 instanceof lyf.b ? (lyf.b) obj3 : null;
        if (bVar != null) {
            lyf.e eVar = (lyf.e) ((k) ((j2) yVar.f110830s.f22677a).getValue()).f110808b.getContent();
            yVar.C2(new r(bVar, eVar != null ? eVar.f200820c : null));
        }
        return Unit.f186387a;
    }
}
