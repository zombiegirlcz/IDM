package g2g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePricingFilter;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.model.TravelExperienceExpandableFilters;
import ip0.r70;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesFilterScreen f140055w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TravelExperiencesFilterScreen travelExperiencesFilterScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140055w = travelExperiencesFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f140055w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f140055w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesFilterScreen travelExperiencesFilterScreen = this.f140055w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarI3 = travelExperiencesFilterScreen.T2();
                Intrinsics.h(itemId);
                b bVar = (b) nVarI3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "RESET_ACTION_ID")) {
                    bVar.x2(new g1k.k(18));
                }
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarI32 = travelExperiencesFilterScreen.T2();
                Intrinsics.h(pair);
                b bVar2 = (b) nVarI32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(pair, "pair");
                TravelExperienceExpandableFilters travelExperienceExpandableFilters = (TravelExperienceExpandableFilters) ((l) bVar2.t2()).f140056a.getContent();
                TravelExperiencePricingFilter travelExperiencePricingFilter = travelExperienceExpandableFilters != null ? travelExperienceExpandableFilters.f93074a : null;
                Object obj3 = ((r70) pair.f186385a).f166134j;
                if ((obj3 instanceof xi0.b) && travelExperiencePricingFilter != null) {
                    bVar2.x2(new eed.i((Pair) pair.f186386b, 29, obj3, travelExperiencePricingFilter));
                }
                break;
        }
        return Unit.f186387a;
    }
}
