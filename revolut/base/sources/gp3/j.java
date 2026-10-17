package gp3;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsContract$Step;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsController;
import com.revolut.feature.retail.corporate_events.common.delegates.widget.mappers.content.EventContentMapper$EventInfoDialogContent;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CorporateEventDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CorporateEventDetailsController corporateEventDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = corporateEventDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a aVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.corporate_events.impl.ui.screen.details.a aVar2 = (com.revolut.feature.corporate_events.impl.ui.screen.details.a) aVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        String str2 = model.f51832a;
        if (obj3 instanceof m8b.d) {
            aVar2.H2(aVar2.u, new av8.o(obj3, 23));
        } else if (obj3 instanceof kp3.a) {
            if (a0.H(str2, "CORPORATE_EVENT_DESCRIPTION_ID_", false)) {
                com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.v;
                h8b.c cVar = aVar2.f66127s;
                iel.a assetEvent = ((kp3.a) obj3).f188164a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(assetEvent, "assetEvent");
                Intrinsics.checkNotNullParameter(assetEvent, "assetEvent");
                oki.h.v2(aVar3, new CorporateEventDetailsContract$Step.EventInfoDialog(new EventContentMapper$EventInfoDialogContent(new TextLocalisedClause(j8b.k.g(assetEvent), null, null, 14), j8b.k.c(assetEvent))), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else if (a0.H(str2, "CORPORATE_EVENT_TRANSCRIPT_ID_", false)) {
                iel.a aVar4 = ((kp3.a) obj3).f188164a;
                iel.h hVar = aVar4 instanceof iel.h ? (iel.h) aVar4 : null;
                if (hVar != null && (str = hVar.i) != null) {
                    aVar2.C1(u0.c(new PdfViewFeatureConfiguration(str, null, false, false, 58)));
                }
            }
        }
        return Unit.f186387a;
    }
}
