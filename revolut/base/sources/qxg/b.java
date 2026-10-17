package qxg;

import aw0.o9;
import ce9.m;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rxg.h;
import rxg.i;
import rxg.j;
import wp5.y;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f250089a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f250089a = featureToggleInteractor;
    }

    public final Image a(j asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        if (asset instanceof rxg.a) {
            return new InstrumentImage(((rxg.a) asset).f258155b, 30, null, null);
        }
        if (asset instanceof rxg.c) {
            return new InstrumentImage(((rxg.c) asset).f258161b, 30, null, null);
        }
        if (asset instanceof rxg.f) {
            return new InstrumentImage(((rxg.f) asset).f258172b, 30, null, null);
        }
        if (asset instanceof rxg.b) {
            return new InstrumentImage(((rxg.b) asset).f258158b, 30, null, null);
        }
        if (asset instanceof i) {
            return new InstrumentImage(((i) asset).f258182b, 30, null, null);
        }
        if (asset instanceof rxg.d) {
            return new CurrencyImage(((rxg.d) asset).f258165a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (asset instanceof rxg.e) {
            return new CurrencyImage(((rxg.e) asset).f258168a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        boolean z = asset instanceof h;
        gte.a aVar = this.f250089a;
        if (z) {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int iM = m.m(((h) asset).f258177a, ((jte.d) aVar).c(WealthUiApi$Toggles.RoboStrategies.f95863c));
            int i = R$attr.uikit_colorAccentNeutral;
            return y.h(new Color.Solid(i), 0.1f, companion, iM, new Color.Solid(i));
        }
        if (!(asset instanceof rxg.g)) {
            throw new NoWhenBranchMatchedException();
        }
        LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
        int iL = m.l(((rxg.g) asset).f258174a, ((jte.d) aVar).c(WealthUiApi$Toggles.RoboStrategies.f95863c));
        int i2 = R$attr.uikit_colorAccentNeutral;
        return y.h(new Color.Solid(i2), 0.1f, companion2, iL, new Color.Solid(i2));
    }

    public final Clause b(j asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        if (asset instanceof rxg.a) {
            return new TextClause(((rxg.a) asset).f258156c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (asset instanceof rxg.f) {
            return new TextClause(((rxg.f) asset).f258173c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        boolean z = asset instanceof rxg.d;
        CurrencyClause.Format.DisplayName displayName = CurrencyClause.Format.DisplayName.f57755a;
        if (z) {
            return new CurrencyClause(((rxg.d) asset).f258165a, displayName, null, 4);
        }
        if (asset instanceof rxg.e) {
            return new CurrencyClause(((rxg.e) asset).f258168a, displayName, null, 4);
        }
        boolean z3 = asset instanceof h;
        gte.a aVar = this.f250089a;
        if (z3) {
            return new TextLocalisedClause(m.p(((h) asset).f258177a, ((jte.d) aVar).c(WealthUiApi$Toggles.RoboStrategies.f95863c)), null, null, 14);
        }
        if (asset instanceof rxg.g) {
            return new TextLocalisedClause(m.o(((rxg.g) asset).f258174a, ((jte.d) aVar).c(WealthUiApi$Toggles.RoboStrategies.f95863c)), null, null, 14);
        }
        if (asset instanceof rxg.b) {
            return new TextClause(((rxg.b) asset).f258159c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (asset instanceof i) {
            return new TextClause(((i) asset).f258183c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (!(asset instanceof rxg.c)) {
            throw new NoWhenBranchMatchedException();
        }
        rxg.c cVar = (rxg.c) asset;
        return new TextLocalisedClause(e1.G(cVar.f) ? R$string.wealth_margin_cfd_open_positions_buy : R$string.wealth_margin_cfd_open_positions_sell, u.c(new TextClause(cVar.f258162c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public final Clause c(j asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        if ((asset instanceof rxg.a) || (asset instanceof rxg.f) || (asset instanceof h) || (asset instanceof rxg.g)) {
            return null;
        }
        if (asset instanceof rxg.b) {
            return new TextClause(((rxg.b) asset).f258157a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (asset instanceof i) {
            return new TextClause(((i) asset).f258181a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        boolean z = asset instanceof rxg.d;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (z) {
            return new CurrencyClause(((rxg.d) asset).f258165a, ticker, null, 4);
        }
        if (asset instanceof rxg.e) {
            return new CurrencyClause(((rxg.e) asset).f258168a, ticker, null, 4);
        }
        if (!(asset instanceof rxg.c)) {
            throw new NoWhenBranchMatchedException();
        }
        rxg.c cVar = (rxg.c) asset;
        BigDecimal bigDecimalAbs = cVar.f.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        AssetClause assetClause = new AssetClause(bigDecimalAbs, new AssetClauseType.Stock(0), cVar.f258160a, null, null, 24);
        dj0.d dVar = cVar.d;
        Object[] elements = {assetClause, dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" @ ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }
}
