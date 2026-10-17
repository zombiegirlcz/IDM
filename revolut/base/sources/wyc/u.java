package wyc;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.material3.tokens.TypographyTokensKt;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.card_management.impl.ui.replace_reasons.CardSelectReplaceReasonActivity;
import com.revolut.feature.selfserve.sot.impl.ui.evidencetypes.EvidenceTypesFragment;
import com.revolut.feature.selfserve.sow.impl.ui.document.list.SowDocumentListFragment;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301231a;

    public /* synthetic */ u(int i) {
        this.f301231a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f301231a) {
            case 0:
                EvidenceTypesFragment.Companion companion = EvidenceTypesFragment.INSTANCE;
                return new RowDelegate(null, null, 7);
            case 1:
                EvidenceTypesFragment.Companion companion2 = EvidenceTypesFragment.INSTANCE;
                return new ErrorDelegate();
            case 2:
                KProperty[] kPropertyArr = WidgetisedAnalyticsPerformanceScreen.X;
                return new RowDelegate(null, null, 7);
            case 3:
                KProperty[] kPropertyArr2 = WidgetisedAnalyticsPerformanceScreen.X;
                return new FullScreenStateDelegate();
            case 4:
                KProperty[] kPropertyArr3 = WidgetisedAnalyticsPerformanceScreen.X;
                return new FixedTabsDelegate();
            case 5:
                KProperty[] kPropertyArr4 = WidgetisedAnalyticsPerformanceScreen.X;
                return new TrendViewDelegate(2000L);
            case 6:
                KProperty[] kPropertyArr5 = WidgetisedAnalyticsPerformanceScreen.X;
                return new TextDelegate();
            case 7:
                return wz8.d.Companion.serializer();
            case 8:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.quiz.QuizCoverDto.Type", wz8.d.values(), new String[]{"VIDEO", "IMAGE"}, new Annotation[][]{null, null});
            case 9:
                return new qlm.e(wz8.l.f301391a);
            case 10:
                return new qlm.e(wz8.i.f301388a);
            case 11:
                return wz8.p.Companion.serializer();
            case 12:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.quiz.QuizQuestionSelectionTypeDto", wz8.p.values(), new String[]{"SINGLE", "MULTIPLE"}, new Annotation[][]{null, null});
            case 13:
                int i = SowDocumentListFragment.g0;
                return new InputChecklistDelegate();
            case 14:
                int i2 = CardSelectReplaceReasonActivity.f64920w0;
                return new InputDisclosureDelegate();
            case 15:
                KProperty[] kPropertyArr6 = ExternalCardDetailsScreen.T;
                return new ActionsDelegate();
            case 16:
                KProperty[] kPropertyArr7 = ExternalCardDetailsScreen.T;
                return new CellDetailsActionDelegate();
            case 17:
                return ColorSchemeKt.LocalColorScheme$lambda$1();
            case 18:
                return Boolean.valueOf(ColorSchemeKt.LocalTonalElevationEnabled$lambda$2());
            case 19:
                return Boolean.valueOf(InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement$lambda$0());
            case 20:
                return InteractiveComponentSizeKt.LocalMinimumInteractiveComponentSize$lambda$1();
            case 21:
                return Boolean.valueOf(MaterialThemeKt.LocalUsingExpressiveTheme$lambda$3());
            case 22:
                return MaterialThemeKt._localMotionScheme$lambda$5();
            case 23:
                return RippleKt.LocalRippleConfiguration$lambda$0();
            case 24:
                return ShapesKt.LocalShapes$lambda$0();
            case 25:
                return Unit.f186387a;
            case 26:
                return SurfaceKt.LocalAbsoluteTonalElevation$lambda$3();
            case 27:
                return TypographyTokensKt.getDefaultTextStyle();
            case 28:
                return TypographyKt.LocalTypography$lambda$0();
            default:
                return new qlm.e(x1e.a.f302366a);
        }
    }
}
