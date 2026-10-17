package jbh;

import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.q;
import xzg.a0;
import xzg.t;
import xzg.u;
import xzg.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DotDividerClause f172631c = new DotDividerClause((Integer) null);
    public static final int d = R$attr.uikit_colorPerformancePositive;
    public static final int e = R$attr.uikit_colorPerformanceNegative;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.b f172632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nbh.f f172633b;

    public b(t70.b currenciesLocalization, nbh.f instrumentRowProvider) {
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(instrumentRowProvider, "instrumentRowProvider");
        this.f172632a = currenciesLocalization;
        this.f172633b = instrumentRowProvider;
    }

    public static Image b(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (vVar instanceof t) {
            return new CurrencyImage(((t) vVar).f310031b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (vVar instanceof u) {
            return new InstrumentImage(((u) vVar).f310034b.f214596b, 30, null, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String d(int i) {
        return a0.d.h(i, "%");
    }

    public final RowDelegate.Model a(v asset, int i, Object obj2) {
        Clause clauseM;
        RowDelegate.Model.c.b bVar;
        Clause clause;
        BigDecimal bigDecimal;
        Clause rateClause;
        Intrinsics.checkNotNullParameter(asset, "asset");
        CompositeClause compositeClauseB = null;
        if (!(asset instanceof t)) {
            if (!(asset instanceof u)) {
                throw new NoWhenBranchMatchedException();
            }
            u uVar = (u) asset;
            a0 a0Var = uVar.f310033a;
            String strQ = j6.a.q("MostTradedAsset.RowDelegate.", a0Var.f309969a);
            TextClause textClauseC = c(asset);
            Intrinsics.checkNotNullParameter(asset, "<this>");
            if (asset instanceof t) {
                float f = ((t) asset).f310030a.f309971c;
                clauseM = ((double) f) >= 0.5d ? new TextLocalisedClause(R$string.wealth_most_traded_tag_buys_percentage, zhm.u.c(d((int) (f * 100))), new Custom(Integer.valueOf(d), false, null, false, null, 254), 8) : new TextLocalisedClause(R$string.wealth_most_traded_tag_sells_percentage, zhm.u.c(d((int) ((1 - f) * 100))), new Custom(Integer.valueOf(e), false, null, false, null, 254), 8);
            } else {
                int i2 = (int) (a0Var.f309971c * 100);
                clauseM = yoj.b.m(f172631c, zhm.v.k(new TextLocalisedClause(R$string.wealth_most_traded_tag_buys_percentage, zhm.u.c(d(i2)), null, 12), new TextLocalisedClause(R$string.wealth_most_traded_tag_sells_percentage, zhm.u.c(d(100 - i2)), null, 12)));
            }
            Clause clause2 = clauseM;
            Image imageB = b(asset);
            InstrumentTicker instrumentTicker = uVar.f310035c;
            if (instrumentTicker != null) {
                RowDelegate.Model.c.b bVarA = p1h.a.a(this.f172633b, uVar.f310034b, instrumentTicker, null, null, 12);
                if (bVarA != null) {
                    bVar = bVarA;
                }
                return new RowDelegate.Model(strQ, imageB, null, null, textClauseC, clause2, null, null, 0, bVar, false, false, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 1023407980);
            }
            bVar = new RowDelegate.Model.c.b(new TextClause(a0.d.n("#", i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126);
            return new RowDelegate.Model(strQ, imageB, null, null, textClauseC, clause2, null, null, 0, bVar, false, false, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 1023407980);
        }
        t tVar = (t) asset;
        a0 a0Var2 = tVar.f310030a;
        String strQ2 = j6.a.q("MostTradedAsset.RowDelegate.", a0Var2.f309969a);
        TextClause textClauseC2 = c(asset);
        int i3 = (int) (a0Var2.f309971c * 100);
        CompositeClause compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.wealth_most_traded_tag_buys_percentage, zhm.u.c(d(i3)), null, 12), new TextLocalisedClause(R$string.wealth_most_traded_tag_sells_percentage, zhm.u.c(d(100 - i3)), null, 12)), f172631c, null, null, 12);
        Image imageB2 = b(asset);
        n9l.a aVar = tVar.f310032c;
        xi0.b bVar2 = tVar.f310031b;
        if (aVar != null) {
            xi0.b bVar3 = aVar.f213662b;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(aVar.f213663c);
            if (cp5.d.z(bVar2)) {
                Intrinsics.h(bigDecimalValueOf);
                rateClause = new MoneyClause(q.a(bigDecimalValueOf, bVar3), new MoneyClause.Format.Defaults(null, ScaleMode.CryptoHoldingFormat.f51439a, false, false, 13), null, o9.NON_SENSITIVE, 4);
            } else {
                Intrinsics.h(bigDecimalValueOf);
                rateClause = new RateClause(bigDecimalValueOf, bVar3, new RateClause.Format.Default(null, true), null);
            }
            clause = rateClause;
        } else {
            clause = null;
        }
        vel.a aVar2 = tVar.d;
        if (aVar2 != null && (bigDecimal = aVar2.f288346c) != null) {
            compositeClauseB = xqi.a.b(bigDecimal, false, 7);
        }
        return new RowDelegate.Model(strQ2, imageB2, null, null, textClauseC2, compositeClause, null, null, 0, new RowDelegate.Model.c.b(clause, compositeClauseB, null, false, 124), false, false, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 1023407980);
    }

    public final TextClause c(v vVar) {
        String strA;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        if (vVar instanceof t) {
            xi0.b bVar = ((t) vVar).f310031b;
            strA = this.f172632a.a(bVar);
            if (strA == null) {
                strA = bVar.f306286a;
            }
        } else {
            if (!(vVar instanceof u)) {
                throw new NoWhenBranchMatchedException();
            }
            strA = ((u) vVar).f310034b.d;
        }
        return new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
