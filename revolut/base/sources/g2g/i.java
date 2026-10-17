package g2g;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.model.TravelExperienceExpandableFilters;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TravelExperiencesFilterScreen travelExperiencesFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarI3 = this.v.T2();
        Intrinsics.h(model);
        b bVar = (b) nVarI3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        TravelExperienceExpandableFilters travelExperienceExpandableFilters = (TravelExperienceExpandableFilters) ((l) bVar.t2()).f140056a.getContent();
        if ((obj3 instanceof i2g.a) && travelExperienceExpandableFilters != null) {
            bVar.x2(new g0f.f(travelExperienceExpandableFilters, obj3, 23));
        }
        return Unit.f186387a;
    }
}
