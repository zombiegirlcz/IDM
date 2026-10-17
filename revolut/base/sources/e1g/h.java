package e1g;

import c1g.k;
import com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchLocationType;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o97.l;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f121986w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f121986w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f121986w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            k kVar = this.v.f121990c;
            TravelSearchDestination travelSearchDestination = (TravelSearchDestination) this.f121986w;
            TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = new TravelExperiencesSelectedLocation(travelSearchDestination.f92888a, travelSearchDestination.f92889b, new TravelSearchLocationType.Destination(travelSearchDestination.f92890c));
            this.u = 1;
            if (kVar.b(travelExperiencesSelectedLocation, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return new l(new FeatureCommand(TravelExperiencesFeatureConfig.ExperiencesHome.f92931g));
    }
}
