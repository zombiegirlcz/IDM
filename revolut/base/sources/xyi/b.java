package xyi;

import b93.e;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f309744l;

    public b(x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f309744l = deeplinkHandler;
    }

    public final Object Z2(SchemeAirportLoungesFooter.Action action, i iVar) {
        if (!(action instanceof SchemeAirportLoungesFooter.Action.Deeplink)) {
            if (!(action instanceof SchemeAirportLoungesFooter.Action.OrderCard)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(u0.b(new FeatureCommand(new CardDesignFeatureConfig(e.PHYSICAL, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870910))));
            return Unit.f186387a;
        }
        Object objX1 = lg0.b.x1(this.f309744l, ((SchemeAirportLoungesFooter.Action.Deeplink) action).f98941a, lg0.a.OPEN_BROWSER, null, iVar, 4);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objX1 != aVar) {
            objX1 = Unit.f186387a;
        }
        return objX1 == aVar ? objX1 : Unit.f186387a;
    }
}
