package hq3;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.close.models.CreditApplicationClosePayload;
import com.revolut.feature.credit.application.close.provider.CancellationDialogProvider$CancellationConfirmationOption;
import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.models.CreditOnboardingClosePayload;
import com.revolut.feature.credit.core.R$string;
import ft3.g1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import rp0.m;
import rp0.t;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objC;
        TextLocalisedClause textLocalisedClauseC;
        o oVar = this.v;
        eq3.b bVar = oVar.u;
        j60.a aVar = oVar.f154601q;
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = oVar.f154600p;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            boolean z = creditApplicationCloseScreenContract$InputData.f66221b;
            CreditApplicationClosePayload creditApplicationClosePayload = creditApplicationCloseScreenContract$InputData.f66220a;
            if (!z) {
                eq3.a aVar3 = eq3.b.Companion;
                aVar.x(((ow3.a) bVar).b(creditApplicationClosePayload, null));
                return Unit.f186387a;
            }
            ow3.e eVar = oVar.f154604t;
            String str = ((CreditOnboardingClosePayload) creditApplicationClosePayload).f66907a.f66892b;
            String str2 = creditApplicationCloseScreenContract$InputData.f66222c;
            this.u = 1;
            objC = eVar.c(str, str2, this);
            if (objC == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objC = obj2;
        }
        DropOutConfig dropOutConfig = (DropOutConfig) objC;
        DropOutConfig.ConfirmationContent confirmationContent = dropOutConfig.f66304b;
        if (confirmationContent != null) {
            aVar.x(eq3.b.a(bVar, ((CreditOnboardingClosePayload) creditApplicationCloseScreenContract$InputData.f66220a).f66908b, confirmationContent));
        } else if (dropOutConfig.f66303a) {
            eq3.d dVar = oVar.f154602r;
            CreditApplicationClosePayload payload = creditApplicationCloseScreenContract$InputData.f66220a;
            eq3.c cVar = eq3.d.Companion;
            ow3.h hVar = (ow3.h) dVar;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(payload, "payload");
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("RESUME_LATER_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_button_primary_title, null, null, 14), false, null, null, CancellationDialogProvider$CancellationConfirmationOption.SaveForLater.f66214a, null, 744);
            yp0.b.r(model, 0, 0, 0, 0, 15);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CANCEL_APPLICATION_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_button_secondary_title, null, null, 14), false, null, null, CancellationDialogProvider$CancellationConfirmationOption.ConfirmCancellation.f66212a, null, 744);
            yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
            m.b bVar2 = rp0.m.Companion;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_title, null, null, 14);
            if (payload instanceof CreditOnboardingClosePayload) {
                ow3.g gVar = hVar.f230304a;
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = ((CreditOnboardingClosePayload) payload).f66907a;
                textLocalisedClauseC = TextLocalisedClause.c(gVar.a(g1.e(creditApplicationPluginFlowContract$Configuration.d, creditApplicationPluginFlowContract$Configuration.e, creditApplicationPluginFlowContract$Configuration.k), creditApplicationPluginFlowContract$Configuration.f66898m, creditApplicationPluginFlowContract$Configuration.f66900p), null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 27);
            } else {
                p0 p0Var = o0.f186429a;
                hx7.e.n(new IllegalStateException("payload must be of type " + p0Var.b(CreditOnboardingClosePayload.class) + ", but was " + p0Var.b(payload.getClass())));
                textLocalisedClauseC = null;
            }
            aVar.x(dy4.b.b(bVar2, v.k(model, model2), new t(textLocalisedClause, textLocalisedClauseC, null, 28), rp0.l.WINDOW, null, ((CreditOnboardingClosePayload) payload).f66908b, null, 632));
        } else {
            oVar.u2();
        }
        return Unit.f186387a;
    }
}
