package a08;

import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PropertyCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.feature.defi.accounts.impl.ui.portfolio.DeFiPortfolioScreen;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderActivity;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitParticipant;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource;
import com.revolut.feature.selfserve.sow.impl.ui.evidencetypes.SowEvidenceTypesFragment;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.TradeRevPointsAccountRegistrationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreen;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164a;

    public /* synthetic */ b(int i) {
        this.f164a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f164a) {
            case 0:
                int i = PetPlanBuilderActivity.J0;
                return new ListSubheaderDelegate();
            case 1:
                int i2 = PetPlanBuilderActivity.J0;
                return new TabsDelegate();
            case 2:
                int i3 = PetPlanBuilderActivity.J0;
                return new InputChecklistDelegate();
            case 3:
                int i5 = PetPlanBuilderActivity.J0;
                return new LargeActionButtonDelegate();
            case 4:
                int i6 = PetPlanBuilderActivity.J0;
                return new TextDelegate();
            case 5:
                int i21 = PetPlanBuilderActivity.J0;
                return new DatePickerDelegate();
            case 6:
                int i22 = PetPlanBuilderActivity.J0;
                return new LargeActionButtonDelegate();
            case 7:
                int i32 = PetPlanBuilderActivity.J0;
                return new FullScreenStateDelegate();
            case 8:
                int i33 = PetPlanBuilderActivity.J0;
                return new TwinHorizontalButtonDelegate();
            case 9:
                int i43 = SowEvidenceTypesFragment.f85961h0;
                return new InputChecklistDelegate();
            case 10:
                int i59 = SowEvidenceTypesFragment.f85961h0;
                return new ErrorDelegate();
            case 11:
                Lazy lazy = a19.g.f567a;
                return ue0.e.b(Json.d, new a09.a(10));
            case 12:
                KProperty[] kPropertyArr = DeFiPortfolioScreen.X;
                return new tw0.l0();
            case 13:
                RecurringSplit.Companion bVar = RecurringSplit.INSTANCE;
                return j1.b("com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit.RecurringSplitState", a2a.e.values());
            case 14:
                RecurringSplit.Companion bVar2 = RecurringSplit.INSTANCE;
                return new qlm.e(RecurringSplitParticipant.a.f79927a);
            case 15:
                return new qlm.e(RecurringSplitParticipant.a.f79927a);
            case 16:
                return new qlm.e(v1.f247718a);
            case 17:
                RecurringSplitSource.Companion companion = RecurringSplitSource.INSTANCE;
                return j1.b("com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource.RecurringSplitSourceType", a2a.g.values());
            case 18:
                return new qlm.e(RecurringSplitParticipant.a.f79927a);
            case 19:
                KProperty[] kPropertyArr2 = TradeRevPointsAccountRegistrationScreen.R;
                return new InputTextDelegate(null);
            case 20:
                KProperty[] kPropertyArr3 = TravelExperiencesDetailsScreen.j0;
                return new PropertyCardDelegate();
            case 21:
                KProperty[] kPropertyArr4 = TravelExperiencesDetailsScreen.j0;
                return new CellDetailsPriceDelegate();
            case 22:
                KProperty[] kPropertyArr5 = TravelExperiencesDetailsScreen.j0;
                return new CellDetailsBadgeDelegate();
            case 23:
                KProperty[] kPropertyArr6 = TravelExperiencesDetailsScreen.j0;
                return new CellDetailsChevronDelegate();
            case 24:
                KProperty[] kPropertyArr7 = TravelExperiencesDetailsScreen.j0;
                return new PlainTextDelegate();
            case 25:
                KProperty[] kPropertyArr8 = TravelExperiencesDetailsScreen.j0;
                return new ListSubheaderDelegate();
            case 26:
                KProperty[] kPropertyArr9 = TravelExperiencesDetailsScreen.j0;
                return new CellDetailsActionListDelegate();
            case 27:
                KProperty[] kPropertyArr10 = TravelExperiencesDetailsScreen.j0;
                return new CellDetailsRevPointsDelegate();
            case 28:
                KProperty[] kPropertyArr11 = PendingPaymentConfirmationScreen.S;
                return new RowDelegate(null, null, 7);
            default:
                KProperty[] kPropertyArr12 = PendingPaymentConfirmationScreen.S;
                return new TimerDelegate();
        }
    }
}
