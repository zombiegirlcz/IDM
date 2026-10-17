package gtd;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.feature.insurance_home.api.navigation.InsuranceHomeDestinations$Home;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.TravelController;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesDestination;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airportlounges.api.navigation.AirportLoungesFeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TravelController travelController, Continuation continuation) {
        super(2, continuation);
        this.v = travelController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((IconDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureCommand featureCommandF;
        IconDelegate.Model model = (IconDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.i;
        jtd.f product = obj3 instanceof jtd.f ? (jtd.f) obj3 : null;
        if (product != null) {
            p pVarE3 = this.v.d();
            pVarE3.getClass();
            Intrinsics.checkNotNullParameter(product, "product");
            r rVar = pVarE3.o;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(product, "product");
            if (product.equals(jtd.e.f178477a)) {
                featureCommandF = gc0.c.f(TravelHotelsKompotFeatureConfig.Home.f93634g);
            } else if (product.equals(jtd.b.f178474a)) {
                featureCommandF = u0.f(new TravelExperiencesDestination.Home(null));
            } else if (product.equals(jtd.c.f178475a)) {
                featureCommandF = u0.f(InsuranceHomeDestinations$Home.f76154a);
            } else {
                if (!product.equals(jtd.d.f178476a)) {
                    throw new NoWhenBranchMatchedException();
                }
                featureCommandF = gc0.c.f(new AirportLoungesFeatureConfig.Home(null));
            }
            rVar.f146598a.c(featureCommandF);
        }
        return Unit.f186387a;
    }
}
