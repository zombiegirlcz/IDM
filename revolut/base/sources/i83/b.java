package i83;

import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day.CreditCardOfferSelectDueDayScreen;
import com.revolut.feature.extension_auth.impl.ui_kompot.ExtensionAuthViewController;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.confirm.PixAuthorisationConfirmScreen;
import com.revolut.feature.pix.impl.flow.refund.screen.review.PixRefundReviewScreen;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameScreen;
import com.revolut.feature.subscriptions.impl.subscriptionlist.SubscriptionListActivity;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsActivity;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreen;
import ib9.d;
import if7.e;
import java.lang.annotation.Annotation;
import jf7.l1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.v1;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159417a;

    public /* synthetic */ b(int i) {
        this.f159417a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f159417a) {
            case 0:
                KProperty[] kPropertyArr = ReactivateCardScreen.T;
                return new RowDelegate(null, null, 7);
            case 1:
                KProperty[] kPropertyArr2 = ReactivateCardScreen.T;
                return new CellDetailsChevronDelegate();
            case 2:
                KProperty[] kPropertyArr3 = CreditCardOfferSelectDueDayScreen.S;
                return new GridSingleChoiceDelegate();
            case 3:
                KProperty[] kPropertyArr4 = SubAccountEditNameScreen.S;
                return new InputTextDelegate(null);
            case 4:
                KProperty[] kPropertyArr5 = PixAuthorisationConfirmScreen.Q;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
            case 5:
                int i = MostTradedAssetsActivity.C0;
                return new SingleChoiceDelegate();
            case 6:
                return new qlm.e(v1.f247718a);
            case 7:
                d.Companion bVar = ib9.d.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 8:
                return new qlm.e(ib9.a.f160127a);
            case 9:
                PixRefundReviewScreen.a aVar = PixRefundReviewScreen.Companion;
                return new ListSubheaderDelegate();
            case 10:
                PixRefundReviewScreen.a aVar2 = PixRefundReviewScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 11:
                PixRefundReviewScreen.a aVar3 = PixRefundReviewScreen.Companion;
                return new LargeActionButtonDelegate();
            case 12:
                PixRefundReviewScreen.a aVar4 = PixRefundReviewScreen.Companion;
                return new CellDetailsDelegate();
            case 13:
                PixRefundReviewScreen.a aVar5 = PixRefundReviewScreen.Companion;
                return new CellDetailsActionDelegate();
            case 14:
                PixRefundReviewScreen.a aVar6 = PixRefundReviewScreen.Companion;
                return new CellDetailsAccountDelegate();
            case 15:
                PixRefundReviewScreen.a aVar7 = PixRefundReviewScreen.Companion;
                return new CellDetailsNoteDelegate();
            case 16:
                PixRefundReviewScreen.a aVar8 = PixRefundReviewScreen.Companion;
                return new CellDetailsSwitcherDelegate();
            case 17:
                PixRefundReviewScreen.a aVar9 = PixRefundReviewScreen.Companion;
                return new InputTextDelegate(null);
            case 18:
                int i2 = SubscriptionListActivity.y0;
                return new RowDelegate(null, null, 7);
            case 19:
                int i3 = SubscriptionListActivity.y0;
                return new ErrorDelegate();
            case 20:
                int i5 = SubscriptionListActivity.y0;
                return new InputDisclosureDelegate();
            case 21:
                return new PromptContentDelegate();
            case 22:
                return new qlm.e(id5.b.f160419a);
            case 23:
                return new go.g(f0.f322471a, 2);
            case 24:
                KProperty[] kPropertyArr6 = ExtensionAuthViewController.Q;
                return new ErrorDelegate();
            case 25:
                KProperty[] kPropertyArr7 = PodNomineeDetailsScreen.S;
                return new RowDelegate(null, null, 7);
            case 26:
                KProperty[] kPropertyArr8 = PodNomineeDetailsScreen.S;
                return new ListSubheaderDelegate();
            case 27:
                return new qlm.e(l1.Companion.serializer());
            case 28:
                e.a aVar10 = if7.e.Companion;
                p0 p0Var = o0.f186429a;
                KClass kClassB = p0Var.b(if7.e.class);
                KClass[] kClassArr = {p0Var.b(if7.c.class)};
                KSerializer[] kSerializerArr = {if7.a.f160961a};
                Intrinsics.checkNotNullParameter("type", "discriminator");
                return new mlm.f("com.revolut.feature.incentive_reward.impl.model.details.actions.IncentiveRewardDetailsAction", kClassB, kClassArr, kSerializerArr, new Annotation[]{new if7.d()});
            default:
                return new qlm.e(v1.f247718a);
        }
    }
}
