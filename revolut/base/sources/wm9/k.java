package wm9;

import com.revolut.core.ui_kit.delegates.widgets.GoalProgressTileWidgetDelegate;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payees.impl.ui.payees_overview.personal.PayeesOverviewScreenContract$Step;
import com.revolut.feature.payees.impl.ui.payees_overview_info_bottom_sheet.PayeesOverviewInfoBottomSheetScreen;
import com.revolut.feature.payees.impl.ui.payees_overview_info_bottom_sheet.PayeesOverviewInfoBottomSheetScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models.ScoreCardType;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.score_card.RevIQScoreCardController;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.bottomsheet.WaitlistInvitationBottomsheetScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.bottomsheet.WaitlistInvitationBottomsheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreenContract$ModalStep;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wrj.u;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298622a;

    public /* synthetic */ k(int i) {
        this.f298622a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f298622a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PayeesOverviewScreenContract$Step step = (PayeesOverviewScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, PayeesOverviewScreenContract$Step.BlockedUsers.f79018a)) {
                    return new PayeesOverviewInfoBottomSheetScreen(new PayeesOverviewInfoBottomSheetScreenContract$InputData(ym9.d.BLOCKED_USERS));
                }
                if (Intrinsics.f(step, PayeesOverviewScreenContract$Step.RequireAuthentication.f79019a)) {
                    return new PayeesOverviewInfoBottomSheetScreen(new PayeesOverviewInfoBottomSheetScreenContract$InputData(ym9.d.REQUIRE_AUTHENTICATION));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null));
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 3:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new wn7.j((List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null)), f0.f322471a);
            case 4:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 5:
                Throwable error = (Throwable) obj2;
                wnb.a aVar = (wnb.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 7:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return new wo2.i((List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null)));
            case 8:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WaitlistInvitationScreenContract$ModalStep step2 = (WaitlistInvitationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof WaitlistInvitationScreenContract$ModalStep.BottomSheet) {
                    return new WaitlistInvitationBottomsheetScreen(new WaitlistInvitationBottomsheetScreenContract$InputData(((WaitlistInvitationScreenContract$ModalStep.BottomSheet) step2).f103702a));
                }
                if (step2 instanceof WaitlistInvitationScreenContract$ModalStep.Benefits) {
                    return new WaitlistBenefitsScreen(new WaitlistBenefitsScreenContract$InputData(((WaitlistInvitationScreenContract$ModalStep.Benefits) step2).f103701a));
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new wok.k(null, (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null)));
            case 10:
                Throwable th10 = (Throwable) obj2;
                if (((CreditCardAutopayConfig) obj3) == null) {
                    return th10;
                }
                return null;
            case 11:
                Function1 defaultErrorItem2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem2, "defaultErrorItem");
                return (List) defaultErrorItem2.invoke(new iii.d(14, null, true, false, null));
            case 12:
                Throwable error2 = (Throwable) obj2;
                CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (cryptoAddress == null) {
                    return error2;
                }
                return null;
            case 13:
                CryptoAddressCounterparty counterparty = (CryptoAddressCounterparty) obj2;
                CryptoAddress cryptoAddress2 = (CryptoAddress) obj3;
                Intrinsics.checkNotNullParameter(counterparty, "counterparty");
                Intrinsics.checkNotNullParameter(cryptoAddress2, "cryptoAddress");
                return new Pair(counterparty, cryptoAddress2);
            case 14:
                Throwable error3 = (Throwable) obj2;
                CryptoAddress cryptoAddress3 = (CryptoAddress) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (cryptoAddress3 == null) {
                    return error3;
                }
                return null;
            case 15:
                xi0.b sourceCurrency = (xi0.b) obj2;
                List currenciesForAddressType = (List) obj3;
                Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
                Intrinsics.checkNotNullParameter(currenciesForAddressType, "currenciesForAddressType");
                return new Pair(sourceCurrency, currenciesForAddressType);
            case 16:
                Throwable error4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (obj3 == null) {
                    return error4;
                }
                return null;
            case 17:
                Throwable error5 = (Throwable) obj2;
                GoalProgressTileWidgetDelegate.Model model = (GoalProgressTileWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (model == null) {
                    return error5;
                }
                return null;
            case 18:
                Throwable error6 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list == null) {
                    return error6;
                }
                return null;
            case 19:
                ali.b PagerCoordinator = (ali.b) obj2;
                ScoreCardType scoreCardType = (ScoreCardType) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(scoreCardType, "scoreCardType");
                return new RevIQScoreCardController(new xqd.b(scoreCardType));
            case 20:
                Pair pair = (Pair) obj2;
                Pair pair2 = (Pair) obj3;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                io3.d dVar = (io3.d) pair.f186385a;
                Double d = (Double) pair.f186386b;
                io3.d dVar2 = (io3.d) pair2.f186385a;
                return Boolean.valueOf(Intrinsics.f(dVar.f163145a, dVar2.f163145a) && dVar.i == dVar2.i && Intrinsics.c(d, (Double) pair2.f186386b));
            case 21:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 23:
                Throwable error7 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list2 == null) {
                    return error7;
                }
                return null;
            case 24:
                Throwable error8 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (set == null) {
                    return error8;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c();
            case 26:
                Throwable error9 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (cVar == null) {
                    return error9;
                }
                return null;
            case 27:
                Throwable error10 = (Throwable) obj2;
                io3.d dVar3 = (io3.d) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (dVar3 == null) {
                    return error10;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                Throwable error11 = (Throwable) obj2;
                io3.d dVar4 = (io3.d) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (dVar4 == null) {
                    return error11;
                }
                return null;
        }
    }
}
