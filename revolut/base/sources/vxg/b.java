package vxg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nmc.d;
import wxg.c;
import wxg.e;
import wxg.f;
import wxg.g;
import wxg.h;
import wxg.i;
import wxg.j;
import wxg.k;
import wxg.l;
import wxg.m;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f293086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f293087b;

    public b(d roboPortfolioUIMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(roboPortfolioUIMapper, "roboPortfolioUIMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f293086a = roboPortfolioUIMapper;
        this.f293087b = featureToggleInteractor;
    }

    public final Image a(m mVar) {
        Float fValueOf = Float.valueOf(16.0f);
        if (mVar instanceof wxg.a) {
            return new InstrumentImage(((wxg.a) mVar).f300950b, 30, null, null);
        }
        if (mVar instanceof l) {
            return new InstrumentImage(((l) mVar).f300986b, 30, null, null);
        }
        if ((mVar instanceof wxg.d) || (mVar instanceof wxg.b)) {
            return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cash, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 4.0f, fValueOf, null, 32);
        }
        if (mVar instanceof f) {
            return new CurrencyImage(((f) mVar).f300967a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (mVar instanceof g) {
            return new CurrencyImage(((g) mVar).f300970a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (mVar instanceof h) {
            return new InstrumentImage(((h) mVar).f300974b, 30, null, null);
        }
        if (mVar instanceof k) {
            return LayeredImage.INSTANCE.i(ce9.m.m(((k) mVar).f300982a, b()), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
        }
        if (mVar instanceof e) {
            return new InstrumentImage(((e) mVar).f300963b, 30, null, null);
        }
        if (mVar instanceof c) {
            return new InstrumentImage(((c) mVar).f300956b, 30, null, null);
        }
        if (mVar instanceof j) {
            return this.f293086a.b(((j) mVar).f300979a);
        }
        if (mVar instanceof i) {
            return LayeredImage.Companion.b(LayeredImage.INSTANCE, ce9.m.l(((i) mVar).f300976a, b()), Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 4.0f, fValueOf, null, 32);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() {
        return ((jte.d) this.f293087b).c(WealthUiApi$Toggles.RoboStrategies.f95863c);
    }
}
