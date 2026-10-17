package xsf;

import android.content.res.Resources;
import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.FiltersDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsScreen;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.address_change.AddressChangePriceReviewActivity;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.confirmation.PetPlanConfirmPurchaseActivity;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.revolut_x_balances.impl.fiat.RevolutXFiatBalancesDetailsScreen;
import com.revolut.feature.selfserve.sow.impl.ui.document.other.SowOtherDocumentFragment;
import com.revolut.feature.trading.impl.ui.holdings.information.entry.HoldingsInformationEntryController;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.feature.transport.impl.ui.help.contact.TransportHelpContactScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search.AsftAirportSearchScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.AirportLoungesPassActivityScreen;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.v1;
import xz8.a;
import xz8.o;
import xz8.p;
import yhm.m;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308465a;

    public /* synthetic */ c(int i) {
        this.f308465a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        switch (this.f308465a) {
            case 0:
                KProperty[] kPropertyArr = TransferReasonsAdditionalInfoScreen.T;
                return new RowDelegate(null, null, 7);
            case 1:
                AsftAirportSearchScreen.a aVar = AsftAirportSearchScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 2:
                AsftAirportSearchScreen.a aVar2 = AsftAirportSearchScreen.Companion;
                return new FullScreenStateDelegate();
            case 3:
                Lazy lazy = xv0.b.f309146a;
                return new ihm.f();
            case 4:
                KProperty[] kPropertyArr2 = CreditCardStatementDetailsScreen.V;
                return new CellDetailsActionDelegate();
            case 5:
                KProperty[] kPropertyArr3 = CreditCardStatementDetailsScreen.V;
                return new ExpandableCellDelegate();
            case 6:
                KProperty[] kPropertyArr4 = CreditCardStatementDetailsScreen.V;
                return new CellDetailsDelegate();
            case 7:
                KProperty[] kPropertyArr5 = TransportHelpContactScreen.U;
                return new RowDelegate(null, null, 7);
            case 8:
                KProperty[] kPropertyArr6 = TransportHelpContactScreen.U;
                return new CellDetailsActionDelegate();
            case 9:
                KProperty[] kPropertyArr7 = TransportHelpContactScreen.U;
                return new CellDetailsDelegate();
            case 10:
                KProperty[] kPropertyArr8 = TransportHelpContactScreen.U;
                return new FullScreenStateDelegate();
            case 11:
                Resources system = Resources.getSystem();
                int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", "android");
                int iIntValue = 255;
                if (identifier != 0) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = Integer.valueOf(system.getInteger(identifier));
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    Integer num = (Integer) objA;
                    if (num != null) {
                        Integer num2 = num.intValue() > 0 ? num : null;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        }
                    }
                    break;
                }
                return Integer.valueOf(iIntValue);
            case 12:
                KProperty[] kPropertyArr9 = AirportLoungesPassActivityScreen.U;
                return new FiltersDelegate();
            case 13:
                KProperty[] kPropertyArr10 = AirportLoungesPassActivityScreen.U;
                return new ListSubheaderDelegate();
            case 14:
                KProperty[] kPropertyArr11 = AirportLoungesPassActivityScreen.U;
                return new RowDelegate(null, null, 7);
            case 15:
                KProperty[] kPropertyArr12 = AirportLoungesPassActivityScreen.U;
                return new FullScreenStateDelegate();
            case 16:
                int i = AddressChangePriceReviewActivity.f76313w0;
                return new RowDelegate(null, null, 7);
            case 17:
                int i2 = PetPlanConfirmPurchaseActivity.z0;
                return new RowDelegate(null, null, 7);
            case 18:
                int i3 = PetPlanConfirmPurchaseActivity.z0;
                return new TextDelegate();
            case 19:
                a.b bVar = xz8.a.Companion;
                return new qlm.e(xz8.k.f309902a);
            case 20:
                a.b bVar2 = xz8.a.Companion;
                return yz8.c.INSTANCE.serializer();
            case 21:
                a.b bVar3 = xz8.a.Companion;
                return zz8.c.INSTANCE.serializer();
            case 22:
                return new qlm.e(v1.f247718a);
            case 23:
                o.a aVar3 = xz8.o.Companion;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.learn.shared.impl.data.network.dto.quiz.submit.QuizSubmitResponseDto", p0Var.b(xz8.o.class), new KClass[]{p0Var.b(xz8.a.class), p0Var.b(xz8.p.class)}, new KSerializer[]{a.C1724a.f309890a, p.a.f309908a}, new Annotation[]{new xz8.n()});
            case 24:
                int i5 = SowOtherDocumentFragment.g0;
                return new InputTextDelegate(null);
            case 25:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
            case 26:
                return new NavBarWithContainerBackground.ImageBackground(new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorGreen), null), (s8) null, (Color.SolidRes) null, 14);
            case 27:
                KProperty[] kPropertyArr13 = RevolutXFiatBalancesDetailsScreen.V;
                return new FixedTabsDelegate();
            case 28:
                KProperty[] kPropertyArr14 = HoldingsInformationEntryController.W;
                return new TextDelegate();
            default:
                KProperty[] kPropertyArr15 = HoldingsInformationEntryController.W;
                return new CellDetailsDelegate();
        }
    }

    public /* synthetic */ c(xvi.g gVar) {
        this.f308465a = 11;
    }
}
