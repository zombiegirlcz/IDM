package n12;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import c12.b0;
import c12.f0;
import c12.j0;
import c12.k;
import c12.p0;
import c12.v0;
import c12.w;
import c12.x;
import com.revolut.feature.apm.core.api.ApmToggles$Aani;
import com.revolut.feature.apm.core.api.ApmToggles$ApmAliasClaim;
import com.revolut.feature.apm.core.api.ApmToggles$ApmBackground;
import com.revolut.feature.apm.core.api.ApmToggles$ApmBreakdown;
import com.revolut.feature.apm.core.api.ApmToggles$ApmClipboard;
import com.revolut.feature.apm.core.api.ApmToggles$ApmDisableQR;
import com.revolut.feature.apm.core.api.ApmToggles$ApmDiscoveryV2;
import com.revolut.feature.apm.core.api.ApmToggles$ApmMoneyRequestAny2Any;
import com.revolut.feature.apm.core.api.ApmToggles$ApmTransferAny2AnyInvest;
import com.revolut.feature.apm.core.api.ApmToggles$ApmTransferAny2AnySavings;
import com.revolut.feature.apm.core.api.ApmToggles$BillsTransferAny2AnyInvest;
import com.revolut.feature.apm.core.api.ApmToggles$BillsTransferAny2AnySavings;
import com.revolut.feature.apm.core.api.ApmToggles$BillsTransferJointAccounts;
import com.revolut.feature.apm.core.api.ApmToggles$BizumTransferAny2Any;
import com.revolut.feature.apm.core.api.ApmToggles$BizumTransferAny2AnyCryptoCommodity;
import com.revolut.feature.apm.core.api.ApmToggles$BizumTransferAny2AnyInvest;
import com.revolut.feature.apm.core.api.ApmToggles$BizumTransferAny2AnySavings;
import com.revolut.feature.apm.core.api.ApmToggles$BlikEea;
import com.revolut.feature.apm.core.api.ApmToggles$BlikP2PRegistrationConfirmation;
import com.revolut.feature.apm.core.api.ApmToggles$Breb;
import com.revolut.feature.apm.core.api.ApmToggles$BrebSkipOnboarding;
import com.revolut.feature.apm.core.api.ApmToggles$BrebSkipOnboardingKeysRegistration;
import com.revolut.feature.apm.core.api.ApmToggles$Iris;
import com.revolut.feature.apm.core.api.ApmToggles$IrisDeregistration;
import com.revolut.feature.apm.core.api.ApmToggles$IrisPro;
import com.revolut.feature.apm.core.api.ApmToggles$PixApmMigration;
import com.revolut.feature.apm.core.api.ApmToggles$PixFxTransfers;
import com.revolut.feature.apm.core.api.ApmToggles$PixJointAccounts;
import com.revolut.feature.apm.core.api.ApmToggles$Qvik;
import com.revolut.feature.apm.core.api.ApmToggles$QvikAreaSend;
import com.revolut.feature.apm.core.api.ApmToggles$Swish;
import com.revolut.feature.apm.core.api.ApmToggles$WeroHome;
import com.revolut.feature.apm.core.api.ApmToggles$WeroPaymentsQR;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimStatusNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientDetailsDestination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.PaymentsBreakdownNavigation$Descriptor;
import com.revolut.feature.apm.core.ui.api.navigation.PaymentsBreakdownNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.ApmAliasClaimFlow;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.status.ApmAliasClaimStatusScreen;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.PaymentsBreakdownController;
import com.revolut.feature.apm.core.ui.impl.ui.entry.ApmEntryController;
import com.revolut.feature.apm.core.ui.impl.ui.list.ApmListScreen;
import com.revolut.feature.apm.core.ui.impl.ui.new_alias.ApmNewAliasScreen;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.ApmNewContactScreen;
import com.revolut.feature.apm.core.ui.impl.ui.pending.ApmPendingScreen;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.ApmPendingPaymentFlow;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmation.ApmConfirmationScreen;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmed.ApmConfirmedScreen;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmed.ApmConfirmedScreenContract$Destination;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.wrapper.ApmConsentWrapperFlow;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsNewScreen;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.list.ApmRecipientListScreen;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.ApmRecipientSettingsFlow;
import com.revolut.feature.apm.core.ui.impl.ui.registration.terms.scopes.ApmTermsScopeScreen;
import com.revolut.feature.apm.core.ui.impl.ui.registration.terms.uri.ApmRegistrationTermsScreen;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.TopupRequestFlow;
import com.revolut.feature.apm.core.ui.impl.ui.transactions_list.area.ApmTransactionAreaListScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transactions_list.mapped.ApmTransactionOnlyListScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.ApmTransferFlow;
import com.revolut.feature.apm.core.ui.impl.ui.transfer_wrapper.ApmTransferWrapperFlow;
import com.revolut.retail.feature.pending_payments.api.PendingPaymentsToggles$ApmConsent;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o12.d;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ohi.a, p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f211203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f211204b;

    public b(gte.a featureToggleInteractor, o12.b apmAliasClaimIntroDeeplinkGateway, d apmAliasClaimStatusDeeplinkGateway) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(apmAliasClaimIntroDeeplinkGateway, "apmAliasClaimIntroDeeplinkGateway");
        Intrinsics.checkNotNullParameter(apmAliasClaimStatusDeeplinkGateway, "apmAliasClaimStatusDeeplinkGateway");
        this.f211203a = featureToggleInteractor;
        xii.b[] elements = {apmAliasClaimIntroDeeplinkGateway, apmAliasClaimStatusDeeplinkGateway};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f211204b = kotlin.collections.d.y0(elements);
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof e12.a) {
            e12.a aVar = (e12.a) descriptor;
            return aVar.a(new ApmListScreen(aVar.f121847a, aVar.f121848b));
        }
        if (descriptor instanceof f12.b) {
            f12.b bVar = (f12.b) descriptor;
            return bVar.a(new ApmPendingPaymentFlow(bVar.f131164a, bVar.f131165b));
        }
        if (descriptor instanceof d12.a) {
            d12.a aVar2 = (d12.a) descriptor;
            return aVar2.a(new ApmEntryController(aVar2.f110479a, aVar2.f110480b));
        }
        if (descriptor instanceof k) {
            k kVar = (k) descriptor;
            return kVar.a(new ApmPendingScreen(kVar.f20336a, kVar.f20337b));
        }
        if (descriptor instanceof w) {
            w wVar = (w) descriptor;
            return wVar.a(new ApmRecipientDetailsNewScreen(new ApmRecipientDetailsContract$InputData(wVar.f20355a)));
        }
        if (descriptor instanceof b0) {
            b0 b0Var = (b0) descriptor;
            return b0Var.a(new ApmRecipientSettingsFlow(b0Var.f20322a));
        }
        if (descriptor instanceof x) {
            x xVar = (x) descriptor;
            return xVar.a(new ApmRecipientListScreen(xVar.f20356a, xVar.f20357b));
        }
        if (descriptor instanceof c12.b) {
            c12.b bVar2 = (c12.b) descriptor;
            return bVar2.a(new ApmNewAliasScreen(bVar2.f20320a, bVar2.f20321b));
        }
        if (descriptor instanceof c12.g) {
            c12.g gVar = (c12.g) descriptor;
            return gVar.a(new ApmNewContactScreen(gVar.f20329a, gVar.f20330b));
        }
        if (descriptor instanceof e12.e) {
            e12.e eVar = (e12.e) descriptor;
            return eVar.a(new ApmTransactionAreaListScreen(eVar.f121854a, eVar.f121855b));
        }
        if (descriptor instanceof e12.g) {
            e12.g gVar2 = (e12.g) descriptor;
            return gVar2.a(new ApmTransactionOnlyListScreen(gVar2.f121856a, gVar2.f121857b));
        }
        if (descriptor instanceof f0) {
            f0 f0Var = (f0) descriptor;
            return f0Var.a(new ApmRegistrationTermsScreen(f0Var.f20328a));
        }
        if (descriptor instanceof j0) {
            j0 j0Var = (j0) descriptor;
            return j0Var.a(new ApmTermsScopeScreen(j0Var.f20335a));
        }
        if (descriptor instanceof p0) {
            p0 p0Var = (p0) descriptor;
            return p0Var.a(new ApmTransferFlow(p0Var.f20346a));
        }
        if (descriptor instanceof v0) {
            v0 v0Var = (v0) descriptor;
            return v0Var.a(new ApmTransferWrapperFlow(v0Var.f20354a));
        }
        if (!(descriptor instanceof PaymentsBreakdownNavigation$Descriptor)) {
            return null;
        }
        PaymentsBreakdownNavigation$Descriptor paymentsBreakdownNavigation$Descriptor = (PaymentsBreakdownNavigation$Descriptor) descriptor;
        return paymentsBreakdownNavigation$Descriptor.a(new PaymentsBreakdownController(paymentsBreakdownNavigation$Descriptor.f62305a));
    }

    @Override // nte.a
    public final List e() {
        return v.k(ApmToggles$ApmDisableQR.f61779c, ApmToggles$ApmAliasClaim.f61775c, ApmToggles$ApmDiscoveryV2.f61780c, ApmToggles$ApmBreakdown.f61777c, ApmToggles$ApmBackground.f61776c, ApmToggles$ApmClipboard.f61778c, ApmToggles$BillsTransferJointAccounts.f61786c, ApmToggles$BlikP2PRegistrationConfirmation.f61792c, ApmToggles$BlikEea.f61791c, ApmToggles$Breb.f61793c, ApmToggles$BrebSkipOnboarding.f61794c, ApmToggles$BrebSkipOnboardingKeysRegistration.f61795c, ApmToggles$Aani.f61774c, ApmToggles$Iris.f61796c, ApmToggles$IrisPro.f61798c, ApmToggles$IrisDeregistration.f61797c, ApmToggles$Qvik.f61802c, ApmToggles$QvikAreaSend.f61803c, ApmToggles$Swish.f61804c, ApmToggles$WeroHome.f61805c, ApmToggles$WeroPaymentsQR.f61806c, ApmToggles$PixJointAccounts.f61801c, ApmToggles$PixFxTransfers.f61800c, ApmToggles$PixApmMigration.f61799c, ApmToggles$ApmTransferAny2AnyInvest.f61782c, ApmToggles$ApmTransferAny2AnySavings.f61783c, ApmToggles$BillsTransferAny2AnyInvest.f61784c, ApmToggles$BillsTransferAny2AnySavings.f61785c, ApmToggles$BizumTransferAny2Any.f61787c, ApmToggles$BizumTransferAny2AnyCryptoCommodity.f61788c, ApmToggles$BizumTransferAny2AnyInvest.f61789c, ApmToggles$BizumTransferAny2AnySavings.f61790c, ApmToggles$ApmMoneyRequestAny2Any.f61781c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ApmAliasClaimNavigation$Destination) {
            return new ApmAliasClaimFlow(((ApmAliasClaimNavigation$Destination) destination).f62234a);
        }
        if (destination instanceof ApmAliasClaimStatusNavigation$Destination) {
            return new ApmAliasClaimStatusScreen(((ApmAliasClaimStatusNavigation$Destination) destination).f62237a);
        }
        if (destination instanceof ApmConsentNavigation$Destination) {
            ApmConsentNavigation$InputData apmConsentNavigation$InputData = ((ApmConsentNavigation$Destination) destination).f62312a;
            return ((jte.d) this.f211203a).c(PendingPaymentsToggles$ApmConsent.f102393c) ? new ApmConsentWrapperFlow(apmConsentNavigation$InputData) : new ApmConfirmationScreen(apmConsentNavigation$InputData);
        }
        if (destination instanceof ApmConfirmedScreenContract$Destination) {
            return new ApmConfirmedScreen();
        }
        if (destination instanceof ApmRecipientDetailsDestination) {
            return new ApmRecipientDetailsNewScreen(new ApmRecipientDetailsContract$InputData(((ApmRecipientDetailsDestination) destination).f62259a));
        }
        if (destination instanceof ApmTransferContract$Destination) {
            return new ApmTransferFlow(((ApmTransferContract$Destination) destination).f62279a);
        }
        if (destination instanceof ApmTopupRequestNavigation$Destination) {
            return new TopupRequestFlow(((ApmTopupRequestNavigation$Destination) destination).f62276a);
        }
        if (destination instanceof PaymentsBreakdownNavigation$Destination) {
            return new PaymentsBreakdownController(((PaymentsBreakdownNavigation$Destination) destination).f62306a);
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f211204b;
    }
}
