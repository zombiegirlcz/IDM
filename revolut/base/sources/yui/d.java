package yui;

import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaEmbeddedEntity;
import com.revolut.data.database.models.endcriteria.RecurringPaymentEndCriteriaTypeEmbeddedEntity;
import com.revolut.feature.apm.breb.impl.ui.key_replace.BrebKeyReplaceScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.CryptoDiscoverAllScreen;
import com.revolut.feature.payments.profile.impl.ui_kompot.onboarding.ProfileController;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.search.RevPointsGiftcardsSearchScreen;
import com.revolut.feature.selfserve.sow.impl.ui.evidencelist.SowEvidenceListFragment;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryActivity;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;
import qlm.v1;
import yz8.a;
import yz8.c;
import yz8.d;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317023a;

    public /* synthetic */ d(int i) {
        this.f317023a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f317023a) {
            case 0:
                KProperty[] kPropertyArr = AsftTimeSlotBookingScreen.S;
                return new FullScreenStateDelegate();
            case 1:
                KProperty[] kPropertyArr2 = BrebKeyReplaceScreen.S;
                return new RowDelegate(null, null, 7);
            case 2:
                KProperty[] kPropertyArr3 = ProfileController.S;
                return new InputTextDelegate(null);
            case 3:
                KProperty[] kPropertyArr4 = ProfileController.S;
                return new SuggestionsBarDelegate();
            case 4:
                return new qlm.e(v1.f247718a);
            case 5:
                return new qlm.e(v1.f247718a);
            case 6:
                return new qlm.e(v1.f247718a);
            case 7:
                KProperty[] kPropertyArr5 = RevPointsGiftcardsSearchScreen.V;
                return new RowLoadingDelegate();
            case 8:
                KProperty[] kPropertyArr6 = RevPointsGiftcardsSearchScreen.V;
                return new RowDelegate(null, null, 7);
            case 9:
                KProperty[] kPropertyArr7 = RevPointsGiftcardsSearchScreen.V;
                return new ListSubheaderDelegate();
            case 10:
                KProperty[] kPropertyArr8 = RevPointsGiftcardsSearchScreen.V;
                return new FullScreenStateDelegate();
            case 11:
                KProperty[] kPropertyArr9 = AirportLoungesAmenitiesScreen.f99041b0;
                return new FullScreenStateDelegate();
            case 12:
                KProperty[] kPropertyArr10 = CryptoDiscoverAllScreen.S;
                return new ListSubheaderDelegate();
            case 13:
                KProperty[] kPropertyArr11 = CryptoDiscoverAllScreen.S;
                return new RowDelegate(null, null, 7);
            case 14:
                KProperty[] kPropertyArr12 = CryptoDiscoverAllScreen.S;
                return new FullScreenStateDelegate();
            case 15:
                c.a aVar = yz8.c.Companion;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.learn.shared.impl.data.network.dto.quiz.submit.next.QuizSubmitNextStepDto", p0Var.b(yz8.c.class), new KClass[]{p0Var.b(yz8.a.class), p0Var.b(yz8.d.class), p0Var.b(yz8.e.class)}, new KSerializer[]{a.C1770a.f318047a, d.a.f318051a, new d1("NONE_LEFT", yz8.e.INSTANCE, new Annotation[]{new yz8.b()})}, new Annotation[]{new yz8.b()});
            case 16:
                return new d1("NONE_LEFT", yz8.e.INSTANCE, new Annotation[]{new yz8.b()});
            case 17:
                int i = SowEvidenceListFragment.g0;
                return new RowDelegate(null, null, 7);
            case 18:
                return z0d.q.Companion.serializer();
            case 19:
                return j1.a("com.revolut.feature.semi_independent_onboarding.impl.data.model.GuardianInvitationState", z0d.q.values(), new String[]{"PENDING", "ACCEPTED"}, new Annotation[][]{null, null});
            case 20:
                return new qlm.e(z0d.u.f318233a);
            case 21:
                return ComputedProvidableCompositionLocal._init_$lambda$0();
            case 22:
                return RecurringPaymentEndCriteriaEmbeddedEntity._childSerializers$_anonymous_();
            case 23:
                return RecurringPaymentEndCriteriaTypeEmbeddedEntity._init_$_anonymous_();
            case 24:
                int i2 = OrderSummaryActivity.G0;
                return new RowDelegate(null, null, 7);
            case 25:
                int i3 = OrderSummaryActivity.G0;
                return new HighlightTileDelegate();
            case 26:
                int i5 = OrderSummaryActivity.G0;
                return new CellDetailsActionDelegate();
            case 27:
                int i6 = OrderSummaryActivity.G0;
                return new CellDetailsSwitcherDelegate();
            case 28:
                int i21 = OrderSummaryActivity.G0;
                return new CellDetailsDelegate();
            default:
                int i22 = OrderSummaryActivity.G0;
                return new PlainTextDelegate();
        }
    }
}
