package ns1;

import androidx.recyclerview.widget.DefaultItemAnimator;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.CreditCardLimitHistoryController;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection.CfacCoverageSelectionScreen;
import com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.FrequencyPickerController;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreen;
import com.revolut.feature.topup_screen.impl.R$drawable;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ck0;
import ip0.yj0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import ntj.b1;
import ntj.e1;
import ntj.h1;
import ntj.k0;
import ntj.m;
import ntj.s;
import ntj.y0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218728a;

    public /* synthetic */ a(int i) {
        this.f218728a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f218728a) {
            case 0:
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr = CreditCardAnticipationConfirmationScreen.R;
                return new CellDetailsActionDelegate();
            case 2:
                KProperty[] kPropertyArr2 = CreditCardLimitHistoryController.S;
                return new RowDelegate(null, null, 7);
            case 3:
                KProperty[] kPropertyArr3 = CreditCardLimitHistoryController.S;
                return new FullScreenStateDelegate();
            case 4:
                return new qlm.e(ntj.a.f219042a);
            case 5:
                return new qlm.e(s.f219122a);
            case 6:
                return new qlm.e(m.f219097a);
            case 7:
                return new qlm.e(k0.f219082a);
            case 8:
                return new qlm.e(ntj.d.f219051a);
            case 9:
                return new qlm.e(y0.f219143a);
            case 10:
                return new qlm.e(m.f219097a);
            case 11:
                return new qlm.e(b1.f219049a);
            case 12:
                return new qlm.e(e1.f219058a);
            case 13:
                return new qlm.e(h1.f219073a);
            case 14:
                return new qlm.e(m.f219097a);
            case 15:
                return Unit.f186387a;
            case 16:
                return Unit.f186387a;
            case 17:
                KProperty[] kPropertyArr4 = FrequencyPickerController.R;
                return new SingleChoiceDelegate();
            case 18:
                HiddenTransactionsScreen.a aVar = HiddenTransactionsScreen.Companion;
                DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
                defaultItemAnimator.setSupportsChangeAnimations(false);
                return defaultItemAnimator;
            case 19:
                KProperty[] kPropertyArr5 = AsftPassDetailsLegacyScreen.T;
                return new FullScreenStateDelegate();
            case 20:
                KProperty[] kPropertyArr6 = AsftPassDetailsLegacyScreen.T;
                return new QRCodeDelegate();
            case 21:
                KProperty[] kPropertyArr7 = AsftPassDetailsLegacyScreen.T;
                return new CellDetailsChevronDelegate();
            case 22:
                return new qlm.e(nuj.d.f219324a);
            case 23:
                return new qlm.e(nuj.a.f219322a);
            case 24:
                KProperty[] kPropertyArr8 = CreditCardStatementExportScreen.U;
                return new InputTextDelegate(null);
            case 25:
                KProperty[] kPropertyArr9 = CreditCardStatementExportScreen.U;
                return new FullScreenStateDelegate();
            case 26:
                KProperty[] kPropertyArr10 = CreditCardStatementExportScreen.U;
                return new FixedTabsDelegate();
            case 27:
                KProperty[] kPropertyArr11 = CfacCoverageSelectionScreen.T;
                return new FullScreenStateDelegate();
            case 28:
                KProperty[] kPropertyArr12 = CfacCoverageSelectionScreen.T;
                return new RowDelegate(null, null, 7);
            default:
                List listK = v.k(new ImageClause(R$drawable.ic_nfc_16dp, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28), new TextLocalisedClause(R.string.add_card_details_nfc_title, null, null, 14));
                m70.a.t(t0.f186434a);
                CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                ck0 ck0Var = new ck0(yj0.START);
                int i = R$attr.uikit_dp0;
                return new TextDelegate.Model("LIST_ITEM_NFC_TITLE", compositeClause, false, ck0Var, null, null, i, i, 0, 0, 1652);
        }
    }
}
