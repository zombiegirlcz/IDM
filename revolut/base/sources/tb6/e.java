package tb6;

import com.revolut.core.ui_kit.delegates.NewProductDelegate;
import com.revolut.feature.donations.api.navigation.DonationsFeatureConfig;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CharityDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CharityDetailsScreen charityDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = charityDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((NewProductDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NewProductDelegate.Model model = (NewProductDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) rVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        cli.y yVar = cVar.J;
        xi0.b bVar = (xi0.b) ((m) ((j2) yVar.f22677a).getValue()).e.getContent();
        if (bVar != null) {
            Object obj3 = model.f;
            if (obj3 instanceof ba6.r) {
                ba6.r rVar = (ba6.r) obj3;
                ba6.l lVar = (ba6.l) ((m) ((j2) yVar.f22677a).getValue()).f269480a.getContent();
                if (lVar != null) {
                    int i = v.f269498a[rVar.d.ordinal()];
                    if (i == 1) {
                        cVar.C1(new BridgeDestination(cVar.f72075x.c(rVar.f13956c.f13952a)));
                    } else if (i == 2) {
                        cVar.C1(new BridgeDestination(new FeatureCommand(new DonationsFeatureConfig.CharityDonationConfig(lVar.f13938a, ba6.u.REGULAR, cp5.c.u(rVar, bVar), 8))));
                    } else if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
