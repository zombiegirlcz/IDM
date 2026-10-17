package l42;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.TopupRequestDetailsScreen;
import com.revolut.feature.support.api.navigation.LegacyHelpCentreFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ TopupRequestDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TopupRequestDetailsScreen topupRequestDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = topupRequestDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar = (com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b) ((e) this.u.R.getValue());
        bVar.getClass();
        bVar.C1(u0.c(LegacyHelpCentreFeatureConfig.HelpCentre.f89360a));
        return Unit.f186387a;
    }
}
