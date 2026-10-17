package d0i;

import aw0.k7;
import aw0.o9;
import aw0.p9;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_crypto_order_flow.api.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public static LayeredImage a(int i) {
        return LayeredImage.Companion.f(LayeredImage.INSTANCE, i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorBackground, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), 2.0f, 2.0f, null, 64);
    }

    public static Clause f(myh.c cVar, MoneyClause.Format format, o9 o9Var) {
        if (cVar instanceof myh.b) {
            myh.b bVar = (myh.b) cVar;
            dj0.d dVar = bVar.f210508a;
            return Intrinsics.f(dVar.f115083b.f306286a, "PTS") ? nub.a.q(new RevPoints(dVar), null, new nub.e(h(format.getF57832a())), o9Var, 1) : new MoneyClause(bVar.f210508a, format, null, o9Var, 4);
        }
        if (!(cVar instanceof myh.a)) {
            throw new NoWhenBranchMatchedException();
        }
        dj0.b bVar2 = ((myh.a) cVar).f210507a;
        xi0.b bVar3 = bVar2.f115080b;
        return new AssetClause(new BigDecimal(bVar2.f115079a, bVar3.c()), new AssetClauseType.Stock(new NumberClause.Format.AllDigitsAfterDot(null, h(format.getF57832a()), 1)), cp5.d.J(bVar3), null, o9Var, 8);
    }

    public static Image g(xi0.b bVar, ImageTransformations imageTransformations) {
        return Intrinsics.f(bVar.f306286a, "PTS") ? nub.a.s() : new CurrencyImage(bVar.f306286a, imageTransformations, (TextLocalisedClause) null, 10);
    }

    public static p9 h(k7 k7Var) {
        int i = i.f110368b[k7Var.ordinal()];
        if (i == 1) {
            return p9.ALWAYS;
        }
        if (i == 2) {
            return p9.ONLY_NEGATIVE;
        }
        if (i == 3) {
            return p9.NEVER;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause b(myh.h config, boolean z) {
        Object objF;
        List listC;
        int i;
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof myh.f)) {
            myh.c cVarB = config.b();
            xi0.b currency = config.getCurrency();
            wd6.e eVarA = config.a();
            wd6.h hVarT = config.t();
            int i2 = i.f110367a[hVarT.ordinal()];
            int i3 = i2 != 1 ? i2 != 2 ? eVarA == wd6.e.BUY ? R$string.cryptobuysell_market_order_confirmation_header_buy_title : R$string.cryptobuysell_market_order_confirmation_header_sell_title : R$string.cryptobuysell_recurring_order_confirmation_header_buy_title : R$string.cryptobuysell_take_profit_stop_loss_title;
            if (hVarT == wd6.h.TAKE_PROFIT_STOP_LOSS) {
                listC = f0.f322471a;
            } else {
                if (hVarT == wd6.h.RECURRING) {
                    objF = new CurrencyClause(currency, CurrencyClause.Format.Ticker.f57756a, null, 4);
                } else {
                    objF = f(cVarB, new MoneyClause.Format.Asset(0), z ? o9.SENSITIVE : o9.NON_SENSITIVE);
                }
                listC = u.c(objF);
            }
            return new TextLocalisedClause(i3, listC, null, 12);
        }
        myh.f fVar = (myh.f) config;
        myh.b bVar = fVar.f210517c;
        wd6.h hVar = fVar.f210515a;
        wd6.e eVar = fVar.f210516b;
        Pair pair = new Pair(hVar, eVar);
        wd6.h hVar2 = wd6.h.LIMIT;
        wd6.e eVar2 = wd6.e.BUY;
        if (pair.equals(new Pair(hVar2, eVar2))) {
            i = R$string.cryptobuysell_limit_order_header_subtitle_limit_buy;
        } else {
            wd6.e eVar3 = wd6.e.SELL;
            if (pair.equals(new Pair(hVar2, eVar3))) {
                i = R$string.cryptobuysell_limit_order_header_subtitle_limit_sell;
            } else {
                wd6.h hVar3 = wd6.h.STOP;
                if (pair.equals(new Pair(hVar3, eVar2))) {
                    i = R$string.cryptobuysell_limit_order_header_subtitle_stop_buy;
                } else {
                    if (!pair.equals(new Pair(hVar3, eVar3))) {
                        throw new IllegalArgumentException("Details for " + hVar + " and " + eVar + " is not supported");
                    }
                    i = R$string.cryptobuysell_limit_order_header_subtitle_stop_sell;
                }
            }
        }
        return new TextLocalisedClause(i, u.c(new MoneyClause(bVar.f210508a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, z ? o9.SENSITIVE : o9.NON_SENSITIVE, 4)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
    }

    public final Image c(myh.h config, ImageTransformations imageTransformations) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof myh.d)) {
            return g(config.getCurrency(), null);
        }
        myh.d dVar = (myh.d) config;
        xi0.b bVar = dVar.e;
        xi0.b bVar2 = dVar.d;
        Pair pair = dVar.f210509a == wd6.e.BUY ? new Pair(bVar2, bVar) : new Pair(bVar, bVar2);
        xi0.b bVar3 = (xi0.b) pair.f186385a;
        return new PairedImage(g((xi0.b) pair.f186386b, imageTransformations), g(bVar3, imageTransformations), R$attr.uikit_colorWidgetBackground, null);
    }

    public final LayeredImage d(myh.h config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof myh.g) {
            return a(R$drawable.uikit_icn_24_credit);
        }
        if (config instanceof myh.e) {
            return a(R$drawable.uikit_icn_16_arrow_recurring);
        }
        if (!(config instanceof myh.f)) {
            if (config instanceof myh.d) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        myh.f fVar = (myh.f) config;
        wd6.e eVar = fVar.f210516b;
        wd6.h hVar = fVar.f210515a;
        boolean z = false;
        boolean z3 = eVar == wd6.e.BUY && hVar == wd6.h.STOP;
        if (eVar == wd6.e.SELL && hVar == wd6.h.LIMIT) {
            z = true;
        }
        return a((z3 || z) ? R$drawable.uikit_icn_24_order_upwards : R$drawable.uikit_icn_24_order_downwards);
    }

    public final Clause e(myh.h config, boolean z) {
        myh.c cVarB;
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof myh.g) {
            cVarB = cj9.c.r(((myh.g) config).f210519b);
        } else if (config instanceof myh.d) {
            myh.d dVar = (myh.d) config;
            myh.c cVar = dVar.f210511c;
            cVarB = dVar.f210509a == wd6.e.BUY ? cj9.c.r(cVar) : cVar;
        } else {
            wd6.e eVarA = config.a();
            wd6.e eVar = wd6.e.BUY;
            cVarB = config.b();
            if (eVarA == eVar) {
                cVarB = cj9.c.r(cVarB);
            }
        }
        return f(cVarB, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), z ? o9.SENSITIVE : o9.NON_SENSITIVE);
    }
}
