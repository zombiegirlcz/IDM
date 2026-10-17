package d2g;

import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesDestinationDiscoveryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelExperiencesDestinationDiscoveryScreen travelExperiencesDestinationDiscoveryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesDestinationDiscoveryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CenteredContentTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredContentTileDelegate.Model model = (CenteredContentTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        y yVar = (y) vVarE3;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        lyf.f fVar = obj3 instanceof lyf.f ? (lyf.f) obj3 : null;
        if (fVar != null) {
            yVar.C2(new q(fVar));
        }
        return Unit.f186387a;
    }
}
