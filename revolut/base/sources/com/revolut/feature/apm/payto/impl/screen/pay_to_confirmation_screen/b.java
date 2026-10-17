package com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen;

import cli.y;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.Changes;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetailsAmendment;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreenContract$InputData;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreenContract$Step;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import gc0.c;
import hx7.e;
import ip0.v7;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import okf.m;
import oki.h;
import org.jetbrains.annotations.NotNull;
import oz1.j;
import p4a.g;
import pb2.i;
import pb2.k;
import pb2.o;
import pb2.q;
import pb2.r;
import pb2.u;
import pb2.w;
import retrofit2.HttpException;
import vkm.j2;
import wsg.n;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements i {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Set f62753w;
    public final PayToConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f62754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f62755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b3a.a f62756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sf0.h f62757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ob2.i f62758t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    static {
        Integer[] elements = {146001, 146000, 110048, 110049};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f62753w = d.y0(elements);
    }

    public b(PayToConfirmationScreenContract$InputData inputData, j pendingActionInteractor, n walletInteractor, b3a.a chatTransferNavigationProvider, sf0.h serverErrorParser, ob2.i payToLegalTermsNavigationProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pendingActionInteractor, "pendingActionInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(payToLegalTermsNavigationProvider, "payToLegalTermsNavigationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f62754p = pendingActionInteractor;
        this.f62755q = walletInteractor;
        this.f62756r = chatTransferNavigationProvider;
        this.f62757s = serverErrorParser;
        this.f62758t = payToLegalTermsNavigationProvider;
        this.u = mra.d.b(this, new pb2.h(0), stateMapper, null, false, 12);
        this.v = e.a(this, new g(25));
    }

    public static final FeatureCommand I2(b bVar) {
        bVar.getClass();
        return c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6)));
    }

    @Override // yji.l
    public final void I1() {
        PayToConfirmationScreenContract$InputData payToConfirmationScreenContract$InputData = this.o;
        boolean z = payToConfirmationScreenContract$InputData instanceof PayToConfirmationScreenContract$InputData.WithId;
        y yVar = this.u;
        Continuation continuation = null;
        if (z) {
            PayToConfirmationScreenContract$InputData.WithId withId = (PayToConfirmationScreenContract$InputData.WithId) payToConfirmationScreenContract$InputData;
            l.a1(this, rd0.e.d(this.f62754p.c(withId.f62746a, withId.f62747b, ApmPaymentAuthorisationPaymentMethod.PAY_TO), h0.f322473a), null, null, new a(this, null), 3);
        } else {
            if (!(payToConfirmationScreenContract$InputData instanceof PayToConfirmationScreenContract$InputData.WithPendingActionData)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new q(this, 1));
        }
        l.a1(this, vkm.q.Q(v7.w(yVar.B(new pb2.a(4))), new m(continuation, this, 22)), null, null, new w(this, continuation, 0), 3);
    }

    public final boolean J2(Throwable th10) {
        Continuation continuation = null;
        ServerError serverErrorC = th10 instanceof HttpException ? this.f62757s.c((HttpException) th10) : th10 instanceof ServerErrorException ? ((ServerErrorException) th10).f : null;
        if ((serverErrorC != null ? Integer.valueOf(serverErrorC.f51362a) : null) != null) {
            if (f62753w.contains(Integer.valueOf(serverErrorC.f51362a))) {
                l.a1(this, X1(new y0("ERROR_DIALOG", new z(new TextLocalisedClause(a0.d.n("error.api.", serverErrorC.f51362a), (List) null, (Clause) null, false, 30), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new w(this, continuation, 2), 3);
                return true;
            }
        }
        return false;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetailsAmendment$PayToPaymentMethodDetailsAmendment$AmendmentAdditionalInfo] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final void K2(o uiEvent) {
        PaymentMethodDetails.PayTo.AdditionalInfo additionalInfo;
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        if (uiEvent.equals(pb2.l.f234610a)) {
            B2();
            return;
        }
        PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo amendmentAdditionalInfo = 0;
        amendmentAdditionalInfo = 0;
        if (uiEvent.equals(k.f234609a)) {
            l2(new u(this, amendmentAdditionalInfo, 0), new q(this, 2));
            return;
        }
        if (uiEvent.equals(pb2.n.f234612a)) {
            l2(new u(this, amendmentAdditionalInfo, 1), new q(this, 0));
            return;
        }
        if (!uiEvent.equals(pb2.j.f234608a)) {
            if (!(uiEvent instanceof pb2.m)) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.f(((pb2.m) uiEvent).f234611a, "FOOTER_CLICKABLE_ID")) {
                this.f62758t.getClass();
                C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData("https://www.revolut.com/en-AU/legal/terms/", WebViewScreenTitleSource.Html.f98166a, false)), null, true));
                return;
            }
            return;
        }
        y yVar = this.u;
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction = (ApmPaymentAuthorisationPendingAction) ((pb2.h) ((j2) yVar.f22677a).getValue()).f234606a.getContent();
        ApmPaymentAuthorisationSummary f61991a = apmPaymentAuthorisationPendingAction != null ? apmPaymentAuthorisationPendingAction.getF61991a() : null;
        PaymentMethodDetails paymentMethodDetails = f61991a != null ? f61991a.f61995g : null;
        PaymentMethodDetails.PayTo payTo = paymentMethodDetails instanceof PaymentMethodDetails.PayTo ? (PaymentMethodDetails.PayTo) paymentMethodDetails : null;
        if (payTo == null || (additionalInfo = payTo.f62051n) == null) {
            return;
        }
        ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction2 = (ApmPaymentAuthorisationPendingAction) ((pb2.h) ((j2) yVar.f22677a).getValue()).f234606a.getContent();
        if (apmPaymentAuthorisationPendingAction2 instanceof ApmPaymentAuthorisationPendingAction.Amendment) {
            Changes changes = ((ApmPaymentAuthorisationPendingAction.Amendment) apmPaymentAuthorisationPendingAction2).f61990a.f61986g;
            PaymentMethodDetailsAmendment paymentMethodDetailsAmendment = changes != null ? changes.f : null;
            PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment payToPaymentMethodDetailsAmendment = paymentMethodDetailsAmendment instanceof PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment ? (PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment) paymentMethodDetailsAmendment : null;
            if (payToPaymentMethodDetailsAmendment != null) {
                amendmentAdditionalInfo = payToPaymentMethodDetailsAmendment.k;
            }
        }
        h.v2(this.v, new PayToConfirmationScreenContract$Step.AdditionalInfo(additionalInfo, amendmentAdditionalInfo), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
