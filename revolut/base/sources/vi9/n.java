package vi9;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CountdownTimerImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.tracking.v3.PayLaterToggleContext;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.g1;
import zh9.h1;
import zh9.i1;
import zh9.j1;
import zh9.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f289546a;

    public n(h payLaterCardItemMapper, si9.c payLaterExplainerItemsFactoryProvider) {
        Intrinsics.checkNotNullParameter(payLaterCardItemMapper, "payLaterCardItemMapper");
        Intrinsics.checkNotNullParameter(payLaterExplainerItemsFactoryProvider, "payLaterExplainerItemsFactoryProvider");
        this.f289546a = payLaterCardItemMapper;
    }

    public static w0 a(y0 y0Var) {
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        PayLaterToggleContext.a aVarNewBuilder = PayLaterToggleContext.newBuilder();
        boolean z = y0Var.a() instanceof i1;
        aVarNewBuilder.c();
        ((PayLaterToggleContext) aVarNewBuilder.f49761b).setPayLaterToggleEnabled(z);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public static CountdownTimerImage d(i1 i1Var, boolean z) {
        CountdownTimerImage.Companion companion = CountdownTimerImage.INSTANCE;
        long j2 = i1Var.f322288a;
        long j3 = i1Var.f322289b;
        ez0.d dVar = ez0.d.MinutesLeadingZero;
        companion.getClass();
        CountdownTimerImage countdownTimerImageA = CountdownTimerImage.a(CountdownTimerImage.Companion.a(j2, j3, dVar), 0, zhm.v.k(new CountdownTimerImage.ProgressCycle(1.0f, R$attr.uikit_colorAccentNeutral), new CountdownTimerImage.ProgressCycle(0.25f, R$attr.uikit_colorOrange), new CountdownTimerImage.ProgressCycle(0.05f, R$attr.uikit_colorRed)), 383);
        return z ? CountdownTimerImage.a(countdownTimerImageA, R$attr.uikit_colorGrey50, null, 479) : countdownTimerImageA;
    }

    public final LabelNavBarMenuItem b(y0 productState) {
        Intrinsics.checkNotNullParameter(productState, "productState");
        j1 j1VarA = productState.a();
        if (j1VarA instanceof i1) {
            return new LabelNavBarMenuItem("PAY_LATER_NAV_BAR_SWITCH", new ResourceImage(R$drawable.uikit_icn_24_switch_on, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.pay_later_toggle_nav_bar_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 10), new AnalyticsContext(a(productState)), null, 488);
        }
        if ((j1VarA instanceof h1) || (j1VarA instanceof g1)) {
            return new LabelNavBarMenuItem("PAY_LATER_NAV_BAR_SWITCH", new ResourceImage(R$drawable.uikit_icn_24_switch_off, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlack), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.pay_later_toggle_nav_bar_title, null, null, 14), new AnalyticsContext(a(productState)), null, 488);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RowDelegate.Model c(i1 state, zh9.i accountConfig, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
        RowDelegate.Model.MainImage.CountdownTimer countdownTimer = new RowDelegate.Model.MainImage.CountdownTimer(d(state, true), null, false, false);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_later_timer_active_v2, zhm.u.c(Integer.valueOf(state.f322290c)), null, 12);
        zh9.h hVar = accountConfig.f;
        if (hVar != null) {
            return new RowDelegate.Model("PAY_LATER_TIMER_INFO", countdownTimer, textLocalisedClause, null, 0, new TextLocalisedClause(R$string.pay_later_toggle_subtitle_amount, zhm.u.c(new MoneyClause(hVar.f322270g, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, z, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536861656);
        }
        throw new IllegalArgumentException(j6.a.q("User toggle config must not be null if BNPL switcher is available. PocketId: ", accountConfig.f322280a).toString());
    }
}
