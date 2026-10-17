package mq4;

import android.os.Parcelable;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.internal.views.MarginChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreen;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.CryptoFeeBreakdownDialogController;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionController;
import com.revolut.trading.orders.R$string;
import com.revolut.trading.orders.ui.invest.list.screen.InvestOrdersListScreen;
import com.revolut.trading.orders.ui.invest.placement.security_asset_balance_breakdown.SecurityAssetBalanceBreakdownScreen;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.d1;
import qlm.i0;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207856a;

    public /* synthetic */ b(int i) {
        this.f207856a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f207856a) {
            case 0:
                KProperty[] kPropertyArr = CollateralMoveMoneyScreen.X;
                return new LargeActionButtonDelegate();
            case 1:
                int i = CryptoFeeBreakdownDialogController.V;
                return new CellDetailsDelegate();
            case 2:
                return new d1("com.revolut.retail.core.job.BalanceUpdateInfo.JointWallet", mri.h.INSTANCE, new Annotation[0]);
            case 3:
                return j1.b("com.revolut.retail.core.job.BalanceUpdateInfo.MoneyBoxAccountType", mri.j.values());
            case 4:
                return new d1("com.revolut.retail.core.job.BalanceUpdateInfo.RevPointsPocket", mri.k.INSTANCE, new Annotation[0]);
            case 5:
                return mri.j.Companion.serializer();
            case 6:
                return mri.j.Companion.serializer();
            case 7:
                return new d1("com.revolut.retail.core.job.BalanceUpdateInfo.Wallet", mri.r.INSTANCE, new Annotation[0]);
            case 8:
                return new i0(mri.s.Companion.serializer(), 1);
            case 9:
                int i2 = MarginChartView.O;
                return new AccelerateDecelerateInterpolator();
            case 10:
                BluePromptActivity.Companion aVar = BluePromptActivity.INSTANCE;
                return new InputChecklistDelegate();
            case 11:
                BluePromptActivity.Companion aVar2 = BluePromptActivity.INSTANCE;
                return new PromptContentDelegate();
            case 12:
                BluePromptActivity.Companion aVar3 = BluePromptActivity.INSTANCE;
                return new LargeActionButtonDelegate();
            case 13:
                BluePromptActivity.Companion aVar4 = BluePromptActivity.INSTANCE;
                return new ListCellBulletDelegate();
            case 14:
                BluePromptActivity.Companion aVar5 = BluePromptActivity.INSTANCE;
                return new TwinHorizontalButtonDelegate();
            case 15:
                return Unit.f186387a;
            case 16:
                DocumentSelectionController.a aVar6 = DocumentSelectionController.Companion;
                return new InputTextDelegate(null);
            case 17:
                DocumentSelectionController.a aVar7 = DocumentSelectionController.Companion;
                return new CellDetailsListDelegate();
            case 18:
                DocumentSelectionController.a aVar8 = DocumentSelectionController.Companion;
                return new FullScreenStateDelegate();
            case 19:
                DocumentSelectionController.a aVar9 = DocumentSelectionController.Companion;
                return new LargeActionButtonDelegate();
            case 20:
                KProperty[] kPropertyArr2 = InvestOrdersListScreen.f106829a0;
                return new RowLoadingDelegate();
            case 21:
                KProperty[] kPropertyArr3 = InvestOrdersListScreen.f106829a0;
                return new RowDelegate(null, null, 7);
            case 22:
                KProperty[] kPropertyArr4 = InvestOrdersListScreen.f106829a0;
                return new TextDelegate();
            case 23:
                KProperty[] kPropertyArr5 = InvestOrdersListScreen.f106829a0;
                return new FullScreenStateDelegate();
            case 24:
                return PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "LIST_ID_PLUS_ACTION_NAV_BAR_BUTTON", new TextLocalisedClause(R$string.wealth_invest_invest_plans_new_button_title, null, null, 14), null, 60);
            case 25:
                return new ListSubheaderDelegate.Model("list_id_section_pending", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_trading_orders_list_section_pending, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            case 26:
                KProperty[] kPropertyArr6 = CreditCardRepaySpeiDetailsScreen.S;
                return new CellDetailsActionDelegate();
            case 27:
                KProperty[] kPropertyArr7 = CreditCardRepaySpeiDetailsScreen.S;
                return new FullScreenStateDelegate();
            case 28:
                int i3 = SecurityAssetBalanceBreakdownScreen.V;
                return new CellDetailsTextProgressDelegate();
            default:
                int i5 = SecurityAssetBalanceBreakdownScreen.V;
                return new FullScreenStateDelegate();
        }
    }
}
