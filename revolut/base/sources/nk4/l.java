package nk4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature_pdf_view.ui.PdfViewContract$Configuration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConfirmAutopayScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ConfirmAutopayScreen confirmAutopayScreen, Continuation continuation) {
        super(2, continuation);
        this.v = confirmAutopayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarD = this.v.d();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.credit.core.models.Document");
        ux4.e document = (ux4.e) obj3;
        com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b bVar = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) bVarD;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(document, "document");
        g9i.p.Companion.getClass();
        bVar.C1(new BridgeDestination(new ActivityNavigateCommand(g9i.i.f141889b, new PdfViewContract$Configuration(new TextLocalisedClause(R$string.credit_loan_autopay_external_confirmation_documents_ach_authorization_title, null, null, 14), document.j8(), true), null, null, 0, null, null, null, null, false, 1020)));
        return Unit.f186387a;
    }
}
