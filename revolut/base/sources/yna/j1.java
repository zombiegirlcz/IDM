package yna;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.fee_breakdown.TapiFeeBreakdownScreen;
import com.revolut.feature.apm.bizum.impl.ui.registration.confirmation.BizumRegistrationConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.settings.due_date.CreditCardSelectDueDateScreen;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters.FiltersScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreen;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315355a;

    public /* synthetic */ j1(int i) {
        this.f315355a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f315355a) {
            case 0:
                KProperty[] kPropertyArr = ProfileScreen.f81447v0;
                return new ActionCardDelegate();
            case 1:
                KProperty[] kPropertyArr2 = ProfileScreen.f81447v0;
                return new PlanTileDelegate(0);
            case 2:
                KProperty[] kPropertyArr3 = ProfileScreen.f81447v0;
                return new RowDelegate(null, null, 7);
            case 3:
                return Unit.f186387a;
            case 4:
                KProperty[] kPropertyArr4 = TapiFeeBreakdownScreen.R;
                return new CellDetailsDelegate();
            case 5:
                return yr5.u.Companion.serializer();
            case 6:
                return qlm.j1.a("com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_price.WidgetDateRange", yr5.u.values(), new String[]{"1D", "1W", "1M", "6M", "1Y", "5Y", "All"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 7:
                KProperty[] kPropertyArr5 = PushToCardTransferAmountScreen.p0;
                return new TextDelegate();
            case 8:
                KProperty[] kPropertyArr6 = PushToCardTransferAmountScreen.p0;
                return new LargeActionButtonDelegate();
            case 9:
                KProperty[] kPropertyArr7 = PushToCardTransferAmountScreen.p0;
                return new CellDetailsDelegate();
            case 10:
                KProperty[] kPropertyArr8 = PushToCardTransferAmountScreen.p0;
                return new CellDetailsActionDelegate();
            case 11:
                KProperty[] kPropertyArr9 = PushToCardTransferAmountScreen.p0;
                return new CellDetailsNoteDelegate();
            case 12:
                KProperty[] kPropertyArr10 = PushToCardTransferAmountScreen.p0;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr11 = PushToCardTransferAmountScreen.p0;
                return new HighlightTileDelegate();
            case 14:
                KProperty[] kPropertyArr12 = BizumRegistrationConfirmationScreen.f61590b0;
                return zhm.v.k(new CellDetailsDelegate(), new PlainTextWarningDelegate());
            case 15:
                return new q46.a(1);
            case 16:
                return new qlm.e(ysj.d.f316474a);
            case 17:
                return ysj.v.Companion.serializer();
            case 18:
                return qlm.j1.a("com.revolut.retail.feature.impl.income_sorter.database.entity.IncomeSorterTransferReasonTypeEntity", ysj.v.values(), new String[]{"PREDEFINED", "CUSTOM"}, new Annotation[][]{null, null});
            case 19:
                return Unit.f186387a;
            case 20:
                return Unit.f186387a;
            case 21:
                return Unit.f186387a;
            case 22:
                return Unit.f186387a;
            case 23:
                return new qlm.e(ie0.o.f160615a);
            case 24:
                KProperty[] kPropertyArr13 = CreditCardSelectDueDateScreen.S;
                return new GridSingleChoiceDelegate();
            case 25:
                KProperty[] kPropertyArr14 = FiltersScreen.f71437d0;
                return new InputChecklistDelegate();
            case 26:
                KProperty[] kPropertyArr15 = FiltersScreen.f71437d0;
                return new ListSubheaderDelegate();
            case 27:
                KProperty[] kPropertyArr16 = FiltersScreen.f71437d0;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
            case 28:
                KProperty[] kPropertyArr17 = InsuranceCoverageActivationScreen.S;
                return new LargeActionButtonDelegate();
            default:
                KProperty[] kPropertyArr18 = AsftTimeSlotBookingScreen.S;
                return new InputTextDelegate(null);
        }
    }
}
