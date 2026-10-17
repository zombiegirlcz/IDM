package qbi;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import akd.s;
import cbi.c;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.feature.user.details.impl.ui.flow.UserDetailsFlow;
import com.feature.user.details.impl.ui.flow.UserDetailsFlowContract$InputData;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pockets.api.PocketsUIApi$Toggles;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.feature.pockets.api.navigation.PocketsListDestination;
import com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination;
import com.revolut.feature.pockets.api.ui.mcy.PocketDetailsMcyDestination;
import com.revolut.feature.pockets.impl.R$string;
import com.revolut.feature.pockets.impl.details_v2.flow.PocketDetailsV2Flow;
import com.revolut.feature.pockets.impl.details_v2.mcy.PocketDetailsMcyFlow;
import com.revolut.feature.pockets.impl.details_v2.mcy.PocketDetailsMcyFlowContract$InputData;
import com.revolut.feature.pockets.impl.new_pocket_details.NewPocketDetailsScreen;
import com.revolut.feature.pockets.impl.ui.add_new.AddNewPocketFlow;
import com.revolut.feature.pockets.impl.ui.add_new.OpenNewPocketFlow;
import com.revolut.feature.pockets.impl.ui.add_new.OpenNewPocketFlowContract$InputData;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListContract$InputData;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListContract$UICustomization;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListScreen;
import com.revolut.feature.pockets.impl.ui.pockets_list.model.CurrencyCountryKey;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature_retail_user_declarations.UserDeclarationsApi$Toggles;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsControllerDescriptor;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreen;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipControllerDescriptor;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipDestination;
import com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.SubmitCitizenshipFlow;
import com.revolut.feature_retail_user_declarations.contact_selection.ContactSelectionWrapperFlow;
import com.revolut.feature_retail_user_declarations.credit_consent.flow.CreditConsentFlow;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlow;
import com.revolut.feature_retail_user_declarations.email.navigation.EmailFlowDescriptor;
import com.revolut.feature_retail_user_declarations.email_verification.EmailVerificationFlow;
import com.revolut.feature_retail_user_declarations.email_verification.EmailVerificationFlowDestination;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlow;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowControllerDescriptor;
import com.revolut.feature_retail_user_declarations.employer.flow.EmployerFlow;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlow;
import com.revolut.feature_retail_user_declarations.occupation.flow.OccupationChooserFlow;
import com.revolut.feature_retail_user_declarations.purpose.flow.PurposeOfAccountFlow;
import com.revolut.feature_retail_user_declarations.risk_assessment.flow.RiskAssessmentFlow;
import com.revolut.feature_retail_user_declarations.terms_review.flow.TermsReviewFlow;
import com.revolut.feature_retail_user_declarations.transaction_countries.flow.TransactionCountriesFlow;
import hda.d;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f244284b;

    public a(ImmutableSet deeplinkGateways, int i) {
        this.f244283a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f244284b = deeplinkGateways;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f244284b = deeplinkGateways;
                break;
            default:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f244284b = deeplinkGateways;
                break;
        }
    }

    public static PocketsListScreen a(PocketListType pocketListType, b bVar, wi0.b bVar2) {
        return new PocketsListScreen(new PocketsListContract$InputData(pocketListType, (bVar == null || bVar2 == null) ? null : new CurrencyCountryKey(bVar2, bVar), new PocketsListContract$UICustomization(new TextLocalisedClause(R$string.account_detail_details_list_title, null, null, 14), false, new SlotContext(s.ACCOUNTS_LIST)), true));
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        switch (this.f244283a) {
            case 0:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (descriptor instanceof EmailFlowDescriptor) {
                    EmailFlowDescriptor emailFlowDescriptor = (EmailFlowDescriptor) descriptor;
                    return emailFlowDescriptor.a(new EmailFlow(emailFlowDescriptor.getF97575a()));
                }
                if (descriptor instanceof c) {
                    c cVar = (c) descriptor;
                    return cVar.a(new EmailVerificationFlow(cVar.b()));
                }
                if (descriptor instanceof EmailVerificationOtpFlowControllerDescriptor) {
                    EmailVerificationOtpFlowControllerDescriptor emailVerificationOtpFlowControllerDescriptor = (EmailVerificationOtpFlowControllerDescriptor) descriptor;
                    return emailVerificationOtpFlowControllerDescriptor.a(new EmailVerificationOtpFlow(emailVerificationOtpFlowControllerDescriptor.getF97623a()));
                }
                if (descriptor instanceof obi.c) {
                    obi.c cVar2 = (obi.c) descriptor;
                    return cVar2.a(new IdentityDeclarationsFlow(cVar2.b()));
                }
                if (descriptor instanceof ybi.a) {
                    ybi.a aVar = (ybi.a) descriptor;
                    return aVar.a(new PurposeOfAccountFlow(aVar.b()));
                }
                if (descriptor instanceof rbi.b) {
                    rbi.b bVar = (rbi.b) descriptor;
                    return bVar.a(new OccupationChooserFlow(bVar.b()));
                }
                if (descriptor instanceof pci.a) {
                    pci.a aVar2 = (pci.a) descriptor;
                    return aVar2.a(new TransactionCountriesFlow(aVar2.b()));
                }
                if (descriptor instanceof ici.a) {
                    ici.a aVar3 = (ici.a) descriptor;
                    return aVar3.a(new RiskAssessmentFlow(aVar3.b()));
                }
                if (descriptor instanceof ibi.a) {
                    ibi.a aVar4 = (ibi.a) descriptor;
                    return aVar4.a(new EmployerFlow(aVar4.b()));
                }
                if (descriptor instanceof AcceptBankTermsControllerDescriptor) {
                    AcceptBankTermsControllerDescriptor acceptBankTermsControllerDescriptor = (AcceptBankTermsControllerDescriptor) descriptor;
                    return acceptBankTermsControllerDescriptor.a(new AcceptBankTermsScreen(acceptBankTermsControllerDescriptor.getF97480a()));
                }
                if (descriptor instanceof mci.a) {
                    mci.a aVar5 = (mci.a) descriptor;
                    return aVar5.a(new TermsReviewFlow(aVar5.b()));
                }
                if (descriptor instanceof kai.a) {
                    kai.a aVar6 = (kai.a) descriptor;
                    return aVar6.a(new CreditConsentFlow(aVar6.b()));
                }
                if (descriptor instanceof jai.a) {
                    jai.a aVar7 = (jai.a) descriptor;
                    return aVar7.a(new ContactSelectionWrapperFlow(aVar7.b()));
                }
                if (!(descriptor instanceof SubmitCitizenshipControllerDescriptor)) {
                    return null;
                }
                SubmitCitizenshipControllerDescriptor submitCitizenshipControllerDescriptor = (SubmitCitizenshipControllerDescriptor) descriptor;
                return submitCitizenshipControllerDescriptor.a(new SubmitCitizenshipFlow(submitCitizenshipControllerDescriptor.getF97493a()));
            case 1:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (descriptor instanceof jda.b) {
                    jda.b bVar2 = (jda.b) descriptor;
                    return bVar2.a(new AddNewPocketFlow(bVar2.b()));
                }
                if (descriptor instanceof hda.a) {
                    hda.a aVar8 = (hda.a) descriptor;
                    return aVar8.a(new PocketDetailsV2Flow(aVar8.b()));
                }
                if (descriptor instanceof lda.a) {
                    return ((lda.a) descriptor).a(new NewPocketDetailsScreen());
                }
                if (!(descriptor instanceof d)) {
                    super.c(descriptor);
                    return null;
                }
                d dVar = (d) descriptor;
                return dVar.a(a(PocketListType.Main.f80780a, dVar.c(), dVar.b()));
            default:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (!(descriptor instanceof sa.d)) {
                    return null;
                }
                sa.d dVar2 = (sa.d) descriptor;
                return dVar2.a(new UserDetailsFlow(new UserDetailsFlowContract$InputData(dVar2.c(), dVar2.b())));
        }
    }

    @Override // nte.a
    public final List e() {
        switch (this.f244283a) {
            case 0:
                return UserDeclarationsApi$Toggles.a();
            case 1:
                return PocketsUIApi$Toggles.a();
            default:
                return hb9.b.i();
        }
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        switch (this.f244283a) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof SubmitCitizenshipDestination) {
                    return new SubmitCitizenshipFlow(((SubmitCitizenshipDestination) destination).f97494a);
                }
                if (destination instanceof EmailVerificationFlowDestination) {
                    return new EmailVerificationFlow(((EmailVerificationFlowDestination) destination).getF97608a());
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof PocketsListDestination) {
                    return gc0.c.b(a(((PocketsListDestination) destination).getF80783a(), null, null), new ak3.a(destination, 2));
                }
                if (destination instanceof PocketDetailsDestination) {
                    return new PocketDetailsV2Flow(((PocketDetailsDestination) destination).getF80770a());
                }
                if (destination instanceof OpenNewPocketDestination) {
                    OpenNewPocketDestination openNewPocketDestination = (OpenNewPocketDestination) destination;
                    return new OpenNewPocketFlow(new OpenNewPocketFlowContract$InputData(openNewPocketDestination.getF80795a(), openNewPocketDestination.getF80796b()));
                }
                if (!(destination instanceof PocketDetailsMcyDestination)) {
                    return null;
                }
                PocketDetailsMcyDestination pocketDetailsMcyDestination = (PocketDetailsMcyDestination) destination;
                return new PocketDetailsMcyFlow(new PocketDetailsMcyFlowContract$InputData(pocketDetailsMcyDestination.getF80798a(), pocketDetailsMcyDestination.getF80799b(), pocketDetailsMcyDestination.getF80800c()));
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof UserDetailsDestination) {
                    return new UserDetailsFlow(new UserDetailsFlowContract$InputData());
                }
                return null;
        }
    }

    @Override // aii.p
    public final Set h() {
        switch (this.f244283a) {
        }
        return this.f244284b;
    }
}
