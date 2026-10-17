package zj9;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.aani.impl.ui.settings.AaniSettingsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreen;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsController;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.SalaryRequestsScreen;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2;
import com.revolut.feature.user_declarations.shared.flows.name.screen.NameScreen;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import com.youTransactor.uCube.rpc.Constants;
import java.util.GregorianCalendar;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import o97.m;
import qlm.v1;
import vkm.q;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zmi.p;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322767a;

    public /* synthetic */ a(int i) {
        this.f322767a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322767a) {
            case 0:
                KProperty[] kPropertyArr = PaymentOptionsController.T;
                return new RowDelegate(null, null, 7);
            case 1:
                KProperty[] kPropertyArr2 = TabCryptoFlowV2.S;
                return new AccountCellItemDelegate();
            case 2:
                KProperty[] kPropertyArr3 = CFACClaimStatusUpdateScreen.f75142a0;
                return u.c(new PlainTextDelegate());
            case 3:
                return v.k(new WealthAction.Trade(), new WealthAction.Settings(), new WealthAction.Theme(true, null));
            case 4:
                return f0.f322471a;
            case 5:
                return m.INVEST;
            case 6:
                KProperty[] kPropertyArr4 = AaniSettingsScreen.R;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr5 = AaniSettingsScreen.R;
                return new FullScreenStateDelegate();
            case 8:
                return new RowDelegate(null, null, 7);
            case 9:
                return Unit.f186387a;
            case 10:
                return r0.k(new Pair("success", jm5.a.SUCCESS), new Pair("failed", jm5.a.FAILED));
            case 11:
                return new qlm.e(v1.f247718a);
            case 12:
                return new qlm.e(zmi.a.f323520a);
            case 13:
                return new qlm.e(p.f323540a);
            case 14:
                KProperty[] kPropertyArr6 = EsimSubscriptionDetailsScreen.Z;
                return new CellDetailsSwitcherDelegate();
            case 15:
                KProperty[] kPropertyArr7 = EsimSubscriptionDetailsScreen.Z;
                return new PlainTextDelegate();
            case 16:
                KProperty[] kPropertyArr8 = EsimSubscriptionDetailsScreen.Z;
                return new CellDetailsActionDelegate();
            case 17:
                KProperty[] kPropertyArr9 = EsimSubscriptionDetailsScreen.Z;
                return new ActionsDelegate();
            case 18:
                return u.c(new IconNavBarMenuItem("HELP_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.esim_home_help_button, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            case 19:
                KProperty[] kPropertyArr10 = NameScreen.U;
                return new InputTextDelegate(null);
            case 20:
                KProperty[] kPropertyArr11 = NameScreen.U;
                return new ListSubheaderDelegate();
            case 21:
                return new GregorianCalendar();
            case 22:
                return q.c(null);
            case 23:
                KProperty[] kPropertyArr12 = CryptoSendWalletsListController.V;
                return new RowDelegate(null, null, 7);
            case 24:
                KProperty[] kPropertyArr13 = CryptoSendWalletsListController.V;
                return new FullScreenStateDelegate();
            case 25:
                KProperty[] kPropertyArr14 = CryptoSendWalletsListController.V;
                return new ListSubheaderDelegate();
            case 26:
                KProperty[] kPropertyArr15 = SalaryRequestsScreen.Q;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr16 = InstalmentDetailsScreen.f69363b0;
                return new ListSubheaderDelegate();
            case 28:
                KProperty[] kPropertyArr17 = InstalmentDetailsScreen.f69363b0;
                return new CellDetailsChevronDelegate();
            default:
                KProperty[] kPropertyArr18 = InstalmentDetailsScreen.f69363b0;
                return new ListCellDelegate();
        }
    }
}
