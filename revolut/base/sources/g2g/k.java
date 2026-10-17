package g2g;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePopularFilter;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TravelExperiencesFilterScreen travelExperiencesFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarI3 = this.v.T2();
        Intrinsics.h(model);
        b bVar = (b) nVarI3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51917h;
        if (obj3 instanceof TravelExperiencePopularFilter) {
            TravelExperiencePopularFilter travelExperiencePopularFilter = (TravelExperiencePopularFilter) obj3;
            int i = a.f140051a[travelExperiencePopularFilter.f92839a.ordinal()];
            if (i == 1) {
                bVar.x2(new g1k.k(20));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.x2(new a31.i(model.f51915c, travelExperiencePopularFilter.f92840b, 4));
            }
        }
        return Unit.f186387a;
    }
}
