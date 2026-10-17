package uyg;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import wxg.m;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tyg.j f284340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nmc.d f284341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f284342c;

    public h(tyg.j configInteractor, nmc.d roboPortfolioUIMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioUIMapper, "roboPortfolioUIMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f284340a = configInteractor;
        this.f284341b = roboPortfolioUIMapper;
        this.f284342c = featureToggleInteractor;
    }

    public static Clause b(BigDecimal bigDecimal) {
        PercentageClause percentageClause = new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6);
        return e1.I(bigDecimal) ? new CompositeClause(v.k(new TextClause("~", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), percentageClause), null, null, null, 14) : percentageClause;
    }

    public static CompositeClause e(Clause clause, m mVar, dj0.d dVar, String str, ScaleMode scaleMode) {
        Clause[] elements = {clause, dVar != null ? mVar instanceof wxg.g ? u5l.a.b(dVar, o9.NON_SENSITIVE, null, null, 14) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, scaleMode, false, false, 13), null, o9.NON_SENSITIVE, 4) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }

    public static /* synthetic */ CompositeClause f(h hVar, Clause clause, m mVar, dj0.d dVar, int i) {
        m70.a.a(t0.f186434a);
        ScaleMode.SimpleLen simpleLen = (i & 8) != 0 ? new ScaleMode.SimpleLen(2, 2) : null;
        hVar.getClass();
        return e(clause, mVar, dVar, " · ", simpleLen);
    }

    public final Image a(m asset, boolean z) {
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(asset, "asset");
        if (asset instanceof wxg.a) {
            return new InstrumentImage(((wxg.a) asset).f300950b, 30, null, null);
        }
        if (asset instanceof wxg.e) {
            return new InstrumentImage(((wxg.e) asset).f300963b, 30, null, null);
        }
        if (asset instanceof wxg.c) {
            return new InstrumentImage(((wxg.c) asset).f300956b, 30, null, null);
        }
        if (asset instanceof wxg.h) {
            return new InstrumentImage(((wxg.h) asset).f300974b, 30, null, null);
        }
        if (asset instanceof wxg.l) {
            return new InstrumentImage(((wxg.l) asset).f300986b, 30, null, null);
        }
        if ((asset instanceof wxg.d) || (asset instanceof wxg.b)) {
            return z ? LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cash, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 4.0f, fValueOf, null, 32) : LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cash, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
        }
        if (asset instanceof wxg.f) {
            return new CurrencyImage(((wxg.f) asset).f300967a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (asset instanceof wxg.g) {
            return new CurrencyImage(((wxg.g) asset).f300970a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (asset instanceof wxg.k) {
            return z ? LayeredImage.Companion.b(LayeredImage.INSTANCE, ce9.m.m(((wxg.k) asset).f300982a, c()), Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 4.0f, fValueOf, null, 32) : LayeredImage.INSTANCE.i(ce9.m.m(((wxg.k) asset).f300982a, c()), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
        }
        if (asset instanceof wxg.j) {
            return this.f284341b.b(((wxg.j) asset).f300979a);
        }
        if (asset instanceof wxg.i) {
            return z ? LayeredImage.Companion.b(LayeredImage.INSTANCE, ce9.m.l(((wxg.i) asset).f300976a, c()), Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 4.0f, fValueOf, null, 32) : LayeredImage.INSTANCE.i(ce9.m.l(((wxg.i) asset).f300976a, c()), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean c() {
        return ((jte.d) this.f284342c).c(WealthUiApi$Toggles.RoboStrategies.f95863c);
    }

    public final List d(WidgetisedAnalyticsType analyticsType, Data allocationData, TextLocalisedClause textLocalisedClause, boolean z, g screenType, Function1 assetsSelection) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(allocationData, "allocationData");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(assetsSelection, "assetsSelection");
        List list = (List) iii.c.f(allocationData, new uwi.v(this, 28), new utk.b(28), new ccg.b(this, analyticsType, assetsSelection, screenType, 12));
        if (textLocalisedClause == null) {
            yp0.b.k(list, 0, 0, 0, 0, 31);
            return list;
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        if (!z) {
            resourceImage = null;
        }
        return yp0.b.g(list, new ListSubheaderDelegate.Model("CURRENT_ALLOCATION_HEADER_ID", (Image) null, (Clause) textLocalisedClause, (Image) resourceImage, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z, z, false, 4), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458), null, 0, 0, 126);
    }
}
