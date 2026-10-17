package szl;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui_kit.delegates.AddProductDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountScreen;
import com.revolut.feature.card_order_new.impl.virtual.IssueVirtualCardActivity;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature_exchange.impl.ui.exchange.order_intro.OrderIntroActivity;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.ManualConsentScreen;
import java.lang.annotation.Annotation;
import java.time.Clock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.e;
import qlm.j1;
import szl.b;
import t5f.f;
import t5f.k;
import t5f.n;
import t5f.o;
import t5f.p;
import t68.d;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266828a;

    public /* synthetic */ a(int i) {
        this.f266828a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f266828a) {
            case 0:
                b.a aVar = b.Companion;
                Clock clockSystemUTC = Clock.systemUTC();
                Intrinsics.checkNotNullExpressionValue(clockSystemUTC, "systemUTC(...)");
                return clockSystemUTC;
            case 1:
                KProperty[] kPropertyArr = ManualConsentScreen.f104274d0;
                return new TextDelegate();
            case 2:
                int i = OrderIntroActivity.f96900w0;
                return new TrendViewDelegate(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS);
            case 3:
                int i2 = IssueVirtualCardActivity.f65227x0;
                return new InputTextDelegate(null);
            case 4:
                int i3 = IssueVirtualCardActivity.f65227x0;
                return new SuggestionsBarDelegate();
            case 5:
                KProperty[] kPropertyArr2 = TransferAmountScreen.c0;
                return new TextDelegate();
            case 6:
                KProperty[] kPropertyArr3 = TransferAmountScreen.c0;
                return new LargeActionButtonDelegate();
            case 7:
                KProperty[] kPropertyArr4 = TransferAmountScreen.c0;
                return new CellDetailsDelegate();
            case 8:
                KProperty[] kPropertyArr5 = TransferAmountScreen.c0;
                return new CellDetailsActionDelegate();
            case 9:
                KProperty[] kPropertyArr6 = TransferAmountScreen.c0;
                return new CellDetailsNoteDelegate();
            case 10:
                KProperty[] kPropertyArr7 = TransferAmountScreen.c0;
                return new RowDelegate(null, null, 7);
            case 11:
                return new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            case 12:
                return j1.a("com.revolut.feature.trading.managed_portfolios.impl.data.network.template.model.RiskProfileDto", t5f.b.values(), new String[]{"CONSERVATIVE", "CAUTIOUS", "BALANCED", "BOLD", "AGGRESSIVE"}, new Annotation[][]{null, null, null, null, null});
            case 13:
                return new e(f.f268083a);
            case 14:
                return new e(p.f268099a);
            case 15:
                return t5f.b.Companion.serializer();
            case 16:
                n.Companion bVar = n.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.trading.managed_portfolios.impl.data.network.template.model.TemplateIntroScreenContentDto", p0Var.b(n.class), new KClass[]{p0Var.b(n.a.class), p0Var.b(n.c.class)}, new KSerializer[]{n.a.C1499a.f268095a, n.c.a.f268098a}, new Annotation[]{new o()});
            case 17:
                n.c.Companion bVar2 = n.c.INSTANCE;
                return new e(k.f268089a);
            case 18:
                return n.INSTANCE.serializer();
            case 19:
                return new e(t66.a.f268254a);
            case 20:
                return new e(d.f268266a);
            case 21:
                CardsCarouselScreen.a aVar2 = CardsCarouselScreen.Companion;
                return new PermissionDelegate();
            case 22:
                CardsCarouselScreen.a aVar3 = CardsCarouselScreen.Companion;
                return new LargeActionButtonDelegate();
            case 23:
                CardsCarouselScreen.a aVar4 = CardsCarouselScreen.Companion;
                return new CellDetailsActionDelegate();
            case 24:
                CardsCarouselScreen.a aVar5 = CardsCarouselScreen.Companion;
                return new AddProductDelegate();
            case 25:
                CardsCarouselScreen.a aVar6 = CardsCarouselScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 26:
                CardsCarouselScreen.a aVar7 = CardsCarouselScreen.Companion;
                return new CellDetailsNoteDelegate();
            case 27:
                CardsCarouselScreen.a aVar8 = CardsCarouselScreen.Companion;
                return new PlainTextWarningDelegate();
            case 28:
                CardsCarouselScreen.a aVar9 = CardsCarouselScreen.Companion;
                return new PermissionDelegate();
            default:
                CardsCarouselScreen.a aVar10 = CardsCarouselScreen.Companion;
                return new CircleActionButtonsBarDelegate();
        }
    }
}
