package vl6;

import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.LinkedAccountsConsentFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.LinkedAccountConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.LinkedAccountConsentDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.LinkedAccountConsentDetailsScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.LinkedAccountsConsentScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen.LinkedAccountsConsentScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.g;
import oki.h;
import u3a.p;
import vgk.f;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a f290301b;

    public /* synthetic */ c(com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a aVar, int i) {
        this.f290300a = i;
        this.f290301b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f290300a) {
            case 0:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                LinkedAccountsConsentFlowContract$Step step = (LinkedAccountsConsentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof LinkedAccountsConsentFlowContract$Step.LinkedAccountsConsentScreen;
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a aVar = this.f290301b;
                if (z) {
                    LinkedAccountsConsentScreen linkedAccountsConsentScreen = new LinkedAccountsConsentScreen();
                    aVar.a(linkedAccountsConsentScreen, new c(aVar, 1));
                    return linkedAccountsConsentScreen;
                }
                if (step instanceof LinkedAccountsConsentFlowContract$Step.LinkedAccountConsentDetailsScreen) {
                    LinkedAccountConsentDetailsScreen linkedAccountConsentDetailsScreen = new LinkedAccountConsentDetailsScreen(new LinkedAccountConsentDetailsScreenContract$InputData(((LinkedAccountsConsentFlowContract$Step.LinkedAccountConsentDetailsScreen) step).f72793a));
                    aVar.a(linkedAccountConsentDetailsScreen, new c(aVar, 2));
                    return linkedAccountConsentDetailsScreen;
                }
                if (step instanceof LinkedAccountsConsentFlowContract$Step.ReviewAccountLinkingDetailsScreen) {
                    LinkedAccountsConsentFlowContract$Step.ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen = (LinkedAccountsConsentFlowContract$Step.ReviewAccountLinkingDetailsScreen) step;
                    ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen2 = new ReviewAccountLinkingDetailsScreen(new ReviewAccountLinkingDetailsScreenContract$InputData(reviewAccountLinkingDetailsScreen.f72795a, reviewAccountLinkingDetailsScreen.f72796b, null, true));
                    aVar.a(reviewAccountLinkingDetailsScreen2, new p(aVar, step, 12));
                    return reviewAccountLinkingDetailsScreen2;
                }
                if (!(step instanceof LinkedAccountsConsentFlowContract$Step.RevokeDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                zca.b bVar = aVar.f72801r;
                String str = ((LinkedAccountsConsentFlowContract$Step.RevokeDialog) step).f72798b;
                bVar.getClass();
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(zca.b.a(str));
                f block = new f(aVar, step, 9);
                Intrinsics.checkNotNullParameter(block, "block");
                actionsBottomSheetController.H = block;
                return actionsBottomSheetController;
            case 1:
                LinkedAccountsConsentScreenContract$OutputData output = (LinkedAccountsConsentScreenContract$OutputData) obj3;
                Intrinsics.checkNotNullParameter((g) obj2, "$this$onResult");
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof LinkedAccountsConsentScreenContract$OutputData.AccountClicked) {
                    com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a aVar2 = this.f290301b;
                    h.u2(aVar2, aVar2.f72802s, new LinkedAccountsConsentFlowContract$Step.LinkedAccountConsentDetailsScreen(((LinkedAccountsConsentScreenContract$OutputData.AccountClicked) output).f72811a), null, 6);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a aVar3 = this.f290301b;
                i iVar = aVar3.f72802s;
                g onResult = (g) obj2;
                LinkedAccountConsentDetailsScreenContract$OutputData output2 = (LinkedAccountConsentDetailsScreenContract$OutputData) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof LinkedAccountConsentDetailsScreenContract$OutputData.Back) {
                    onResult.pop();
                } else if (output2 instanceof LinkedAccountConsentDetailsScreenContract$OutputData.RenewOrEdit) {
                    LinkedAccountConsentDetailsScreenContract$OutputData.RenewOrEdit renewOrEdit = (LinkedAccountConsentDetailsScreenContract$OutputData.RenewOrEdit) output2;
                    h.u2(aVar3, iVar, new LinkedAccountsConsentFlowContract$Step.ReviewAccountLinkingDetailsScreen(renewOrEdit.f72805a, renewOrEdit.f72806b), null, 6);
                } else {
                    if (!(output2 instanceof LinkedAccountConsentDetailsScreenContract$OutputData.RevokeClicked)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LinkedAccountConsentDetailsScreenContract$OutputData.RevokeClicked revokeClicked = (LinkedAccountConsentDetailsScreenContract$OutputData.RevokeClicked) output2;
                    h.w2(iVar, new LinkedAccountsConsentFlowContract$Step.RevokeDialog(revokeClicked.f72807a, revokeClicked.f72808b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
        }
    }
}
