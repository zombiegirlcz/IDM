package hp3;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CorporateEventsHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CorporateEventsHomeScreen corporateEventsHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = corporateEventsHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        String str2 = model.f51832a;
        kp3.a aVar2 = obj3 instanceof kp3.a ? (kp3.a) obj3 : null;
        if (aVar2 != null) {
            iel.a aVar3 = aVar2.f188164a;
            if (a0.H(str2, "CORPORATE_EVENT_DESCRIPTION_ID_", false)) {
                bVar.f66143s.x(bVar.f66144t.a(aVar3));
            } else if (a0.H(str2, "CORPORATE_EVENT_TRANSCRIPT_ID_", false)) {
                iel.h hVar = aVar3 instanceof iel.h ? (iel.h) aVar3 : null;
                if (hVar != null && (str = hVar.i) != null) {
                    bVar.C1(new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(str, null, false, false, 58))));
                }
            }
        }
        return Unit.f186387a;
    }
}
