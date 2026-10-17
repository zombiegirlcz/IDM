package hp3;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.corporate_events.impl.navigation.CorporateEventsHomeFeatureConfig;
import com.revolut.feature.corporate_events.impl.ui.flow.home.CorporateEventsHomeFlowContract$Input;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature.corporate_events.navigation.CorporateEventsFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CorporateEventsHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CorporateEventsHomeScreen corporateEventsHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = corporateEventsHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        String str = model.f52613a;
        int iHashCode = str.hashCode();
        if (iHashCode != -199204935) {
            if (iHashCode != 1492721321) {
                if (iHashCode == 1860645164 && str.equals("SEE_ALL_EVENTS_BUTTON_ID")) {
                    bVar.C1(new CorporateEventsHomeFeatureConfig.CorporateEventsHomeDestination(new CorporateEventsHomeFlowContract$Input(new CorporateEventsFeatureConfig.CorporateEventsConfig(null, 4))));
                }
            } else if (str.equals("CALENDAR_TODAY_BUTTON_ID")) {
                LocalDate initialDate = bVar.f66145w;
                Intrinsics.checkNotNullExpressionValue(initialDate, "initialDate");
                bVar.H2(bVar.f66146x, new hm3.b(bVar, initialDate, 14));
                j60.a.v(bVar.f66143s, false, null, 3);
            }
        } else if (str.equals("CORPORATE_EVENTS_DESCRIPTION_BUTTON_ID") && (obj3 instanceof String)) {
            bVar.C1(new AssetDetailsDestination((String) obj3, null, false, null, null, null, 62));
        }
        return Unit.f186387a;
    }
}
