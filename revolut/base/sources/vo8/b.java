package vo8;

import androidx.compose.ui.text.SpanStyleKt;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.TermsScreen;
import com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.OldOrNewPinDialogScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.CryptoCommodityDiscoverAllActivity;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreen;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.assumptions.PetPlanAssumptionsActivity;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineViewController;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlow;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreen;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges.AirportSavedLoungesScreen;
import ip0.pb0;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import vz8.e;
import vz8.f;
import vz8.g;
import vz8.h;
import w19.g;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290875a;

    public /* synthetic */ b(int i) {
        this.f290875a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        boolean z = false;
        switch (this.f290875a) {
            case 0:
                KProperty[] kPropertyArr = JuniorSecurityAndPrivacyController.W;
                return new LargeActionButtonDelegate();
            case 1:
                return Unit.f186387a;
            case 2:
                return "Feedback items can't be displayed as group";
            case 3:
                return "Default error items can't be wrapped as group";
            case 4:
                KProperty[] kPropertyArr2 = TransferReasonsDeclarationActionsScreen.Q;
                return new RowDelegate(null, null, 7);
            case 5:
                return Boolean.FALSE;
            case 6:
                KProperty[] kPropertyArr3 = TermsScreen.R;
                return new LargeActionButtonDelegate();
            case 7:
                OldOrNewPinDialogScreen.a aVar = OldOrNewPinDialogScreen.Companion;
                return new LargeActionButtonDelegate();
            case 8:
                KProperty[] kPropertyArr4 = FourthlineViewController.V;
                return new RowDelegate(null, null, 7);
            case 9:
                KProperty[] kPropertyArr5 = FourthlineViewController.V;
                return new SimpleMediaDelegate();
            case 10:
                KProperty[] kPropertyArr6 = ExtendTicketScreen.S;
                return new RowDelegate(null, null, 7);
            case 11:
                KProperty[] kPropertyArr7 = ExtendTicketScreen.S;
                return new LargeActionButtonDelegate();
            case 12:
                KProperty[] kPropertyArr8 = PaymentProfileFlow.U;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr9 = PaymentProfileFlow.U;
                return new LargeActionButtonDelegate();
            case 14:
                return new qlm.e(vwg.s.f292752a);
            case 15:
                return new qlm.e(vwg.y.f292760a);
            case 16:
                int i2 = CryptoCommodityDiscoverAllActivity.z0;
                return new ListSubheaderDelegate();
            case 17:
                KProperty[] kPropertyArr10 = AirportSavedLoungesScreen.c0;
                return new ListingCardBasicDelegate();
            case 18:
                KProperty[] kPropertyArr11 = AirportSavedLoungesScreen.c0;
                return new FullScreenStateDelegate();
            case 19:
                int i3 = PetPlanAssumptionsActivity.f76356v0;
                return new z4l.j(i, zhm.v.k(new ListSubheaderDelegate(), new ListCellDelegate()), z);
            case 20:
                return new qlm.e(vz8.e.Companion.serializer());
            case 21:
                e.a aVar2 = vz8.e.Companion;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.learn.shared.impl.data.network.dto.lesson.content.ContentCardTextItemDto", p0Var.b(vz8.e.class), new KClass[]{p0Var.b(vz8.f.class), p0Var.b(vz8.g.class), p0Var.b(vz8.h.class)}, new KSerializer[]{f.a.f293416a, g.a.f293419a, h.a.f293421a}, new Annotation[]{new vz8.d()});
            case 22:
                f.b bVar = vz8.f.Companion;
                return new qlm.e(vz8.e.Companion.serializer());
            case 23:
                g.b bVar2 = vz8.g.Companion;
                return new qlm.e(vz8.e.Companion.serializer());
            case 24:
                return new vzk.n(vzk.x.c(false), null, zhm.v.k(new pb0("TRADING_KYC_NATIONALITY_LOADING_ITEM_ID"), new pb0("TRADING_KYC_NATIONALITY_LOADING_ITEM_ID")));
            case 25:
                phm.a aVar3 = (phm.a) ((hf0.a) hf0.b.d.c()).a().get(jm0.a.class);
                b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar4 != null) {
                    return ((jm0.a) aVar4.b()).d().b().f115814c;
                }
                throw new IllegalStateException(a0.d.q("Api ", jm0.a.class, " is not found"));
            case 26:
                return new qlm.e(w19.c.f293802a);
            case 27:
                g.Companion aVar5 = w19.g.INSTANCE;
                return new mlm.f("com.revolut.feature.lifestyle.core.api.model.onboarding.LifestyleOnboardingInfoState", kotlin.jvm.internal.o0.f186429a.b(w19.g.class), new KClass[0], new KSerializer[0], new Annotation[0]);
            case 28:
                return SpanStyleKt.DefaultColorForegroundStyle;
            default:
                KProperty[] kPropertyArr12 = DeFiSendReviewScreen.S;
                return new FullScreenStateDelegate();
        }
    }
}
