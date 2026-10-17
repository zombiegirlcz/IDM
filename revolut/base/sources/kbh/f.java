package kbh;

import aw0.o9;
import aw0.p9;
import cfl.j;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import dfl.b0;
import dfl.c0;
import dfl.d0;
import dfl.f0;
import dfl.g0;
import dfl.h0;
import dfl.i0;
import dfl.j0;
import dfl.k;
import dfl.l;
import dfl.n0;
import dfl.o0;
import dfl.q;
import dfl.q0;
import dfl.s;
import dfl.t;
import dfl.v;
import dfl.x;
import dfl.y;
import dfl.z;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1h.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.e0;
import nel.n;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f182590a;

    public f(kpj.f wealthAccountHeaderUiMapper, wfl.b wealthTradeClauseFactory) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthTradeClauseFactory, "wealthTradeClauseFactory");
        this.f182590a = wealthAccountHeaderUiMapper;
    }

    public static Image b(dfl.c cVar) {
        q qVar = cVar.i;
        if (!(qVar instanceof dfl.a)) {
            qVar = null;
        }
        dfl.a aVar = (dfl.a) qVar;
        return aVar != null ? new CurrencyImage(aVar.f114178b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14) : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_coins, Integer.valueOf(R$attr.uikit_colorOnAccent), R$attr.uikit_colorGreen, 12.0f, Float.valueOf(56.0f), null, 32);
    }

    public static Custom d(Integer num) {
        if (num != null) {
            return new Custom(num, false, null, false, null, 254);
        }
        return null;
    }

    public static PairedImage e(k kVar) {
        return new PairedImage(new CurrencyImage(kVar.s().f114178b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(kVar.t().f114178b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
    }

    public static Image f(l lVar) {
        int i = e.e[lVar.f114422t.ordinal()];
        if (i == 1) {
            return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorWhite, R$attr.uikit_colorGreen);
        }
        if (i == 2) {
            return new ResourceImage(R$drawable.uikit_icn_24_portfolio_slow_and_steady, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static k1h.k h(String str, CircleIconBadge circleIconBadge, n nVar) {
        e0 e0VarK;
        List list;
        if (nVar != null) {
            if (!io3.h.o(nVar.f214597c)) {
                nVar = null;
            }
            if (nVar != null && (e0VarK = ifk.b.k(nVar)) != null && (list = e0VarK.d) != null) {
                List list2 = list.isEmpty() ? null : list;
                if (list2 != null) {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(w.t(list3, 10));
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(i((String) it8.next()));
                    }
                    return new k1h.l(arrayList);
                }
            }
        }
        return new m(i(str), circleIconBadge, 2);
    }

    public static InstrumentImage i(String str) {
        return new InstrumentImage(str, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGreyTone20));
    }

    public static Clause n(q0 q0Var, Clause clause) {
        List listL;
        int i = e.f182584a[q0Var.ordinal()];
        if (i == 2) {
            Clause[] elements = {clause, new TextLocalisedClause(R$string.wealth_trading_common_pending, null, null, 14)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        } else if (i == 4) {
            Clause[] elements2 = {clause, new TextLocalisedClause(R$string.wealth_trading_common_cancelled, null, null, 14)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        } else {
            if (i != 5) {
                return clause;
            }
            Clause[] elements3 = {clause, new TextLocalisedClause(R$string.wealth_trading_common_declined, null, null, 14)};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            listL = kotlin.collections.d.L(elements3);
        }
        return v1.c.f(listL, null);
    }

    public static LayeredImage o(z zVar) {
        int i = e.f[zVar.f114543s.ordinal()];
        return (i == 3 || i == 4) ? LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorOnAccent, R$attr.uikit_colorGreen) : i != 5 ? LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_fees, R$attr.uikit_colorWhite, R$attr.uikit_colorDeepGrey) : LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_present, R$attr.uikit_colorOnAccent, R$attr.uikit_colorAccentNeutral_10);
    }

    public static InactiveCircleBadge p(i0 i0Var) {
        int i = e.f182584a[i0Var.p().ordinal()];
        if (i == 4 || i == 5) {
            return new InactiveCircleBadge(dw0.a.Cancelled);
        }
        return null;
    }

    public static TimeClause q(long j2, k1h.n nVar) {
        com.revolut.core.ui_kit.models.q0 q0Var;
        int i = e.i[nVar.ordinal()];
        if (i == 1) {
            q0Var = com.revolut.core.ui_kit.models.q0.DATETIME;
        } else if (i == 2) {
            q0Var = com.revolut.core.ui_kit.models.q0.ONLY_TIME;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            q0Var = null;
        }
        if (q0Var != null) {
            return new TimeClause(j2, new TimeClause.Format.Pretty(q0Var), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
        }
        return null;
    }

    public static AssetClause r(x xVar, String str, Function1 function1) {
        return new AssetClause(xVar.f114516a, new AssetClauseType.Stock(new NumberClause.Format.AllDigitsAfterDot(null, p9.ALWAYS, 1)), str, function1 != null ? (Style) function1.invoke(xVar.f114516a) : null, null, 16);
    }

    public static Image u(bel.a aVar) {
        switch (e.f182589j[aVar.f14871a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new CurrencyImage(aVar.f14872b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            case 7:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit_card, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal);
            case 8:
            case 9:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_vault, R$attr.uikit_colorWhite, R$attr.uikit_colorTerracotta);
            case 10:
            case 11:
                return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TextLocalisedQuantityClause v(int i, BigDecimal bigDecimal) {
        Integer numValueOf = Integer.valueOf(bigDecimal.compareTo(BigDecimal.ONE) == 0 ? 1 : 2);
        String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return new TextLocalisedQuantityClause(i, numValueOf, u.c(new TextClause(plainString, (Style) null, (Integer) null, false, o9.SENSITIVE, (List) null, LDSFile.EF_DG14_TAG)), (Style) null, 24);
    }

    public static WhiteCircleBadge w(bfl.g gVar) {
        int i = e.f182585b[gVar.ordinal()];
        if (i == 1) {
            return new WhiteCircleBadge(dw0.a.Income);
        }
        if (i == 2) {
            return new WhiteCircleBadge(dw0.a.Outgoing);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static i x(dfl.b bVar, String str) {
        o0 o0Var;
        String str2;
        n0 n0Var = bVar.D;
        if (n0Var == null || (o0Var = bVar.f114189q) == null || (str2 = o0Var.e) == null || str == null || Intrinsics.f(o0Var.f114446a, str)) {
            return null;
        }
        return new i(str2, n0Var.f114445a);
    }

    public final Image a(dfl.b bVar) {
        Image currencyImage;
        Image currencyImage2;
        dfl.f fVar = bVar.f114193w;
        j jVar = bVar.f114190r;
        j0 j0Var = bVar.f114188p;
        q qVar = bVar.i;
        if (fVar != null) {
            return LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_fees, R$attr.uikit_colorWhite, R$attr.uikit_colorDeepGrey);
        }
        int i = e.f182585b[bVar.f114191s.ordinal()];
        if (i == 1) {
            LayeredImage layeredImageT = t(j0Var, jVar);
            bel.a aVar = bVar.B;
            if (aVar != null) {
                currencyImage = u(aVar);
            } else {
                Intrinsics.i(qVar, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.transaction.AmountInvestValue");
                currencyImage = new CurrencyImage(((dfl.a) qVar).f114178b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            }
            return new PairedImage(currencyImage, layeredImageT, R$attr.uikit_colorWidgetBackground, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        bel.a aVar2 = bVar.C;
        if (aVar2 != null) {
            currencyImage2 = u(aVar2);
        } else {
            Intrinsics.i(qVar, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.transaction.AmountInvestValue");
            currencyImage2 = new CurrencyImage(((dfl.a) qVar).f114178b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        return new PairedImage(t(j0Var, jVar), currencyImage2, R$attr.uikit_colorWidgetBackground, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model c(dfl.i0 r40, java.lang.String r41, k1h.n r42, nel.n r43, com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r44, kotlin.jvm.functions.Function1 r45) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kbh.f.c(dfl.i0, java.lang.String, k1h.n, nel.n, com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation, kotlin.jvm.functions.Function1):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public final k1h.k g(i0 trade, String str, n nVar) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        if (trade instanceof f0) {
            return h(((f0) trade).f114294c, null, nVar);
        }
        if (trade instanceof dfl.b) {
            dfl.b bVar = (dfl.b) trade;
            i iVarX = x(bVar, str);
            return new m(iVarX != null ? new ContactImage((String) null, (String) null, iVarX.f182594a, (String) null, (String) null, iVarX.f182595b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 3995) : a(bVar), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof dfl.j) {
            return h(((dfl.j) trade).f114377c, null, nVar);
        }
        if (trade instanceof dfl.g) {
            return h(((dfl.g) trade).f114311c, null, nVar);
        }
        if (trade instanceof y) {
            return h(((y) trade).f114519c, null, nVar);
        }
        if (trade instanceof dfl.h) {
            return new m(LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorOnAccent, R$attr.uikit_colorGreen), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof b0) {
            return new m(LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_percent, R$attr.uikit_colorOnAccent, R$attr.uikit_colorGreen), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof g0) {
            return new m(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_coins, Integer.valueOf(R$attr.uikit_colorOnAccent), R$attr.uikit_colorGreen, 12.0f, Float.valueOf(56.0f), null, 32), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof dfl.d) {
            return new m(LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_cash_income, R$attr.uikit_colorOnAccent, R$attr.uikit_colorDeepPurple), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof z) {
            return new m(o((z) trade), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof s) {
            return h(((s) trade).f114455c, null, nVar);
        }
        if (trade instanceof v) {
            return new m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_fees, R$attr.uikit_colorWhite, R$attr.uikit_colorGreen), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof dfl.e) {
            return new m(new CurrencyImage(((xi0.b) ((dfl.e) trade).f114274t.f186385a).f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof k) {
            return new m(e((k) trade), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof h0) {
            h0 h0Var = (h0) trade;
            return h(h0Var.f114351c, w(h0Var.f114361s), nVar);
        }
        if (trade instanceof dfl.c) {
            dfl.c cVar = (dfl.c) trade;
            return new m(b(cVar), w(cVar.f114220s), 2);
        }
        if (trade instanceof dfl.w) {
            return new m(i(((dfl.w) trade).f114505c), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof l) {
            return new m(f((l) trade), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof dfl.i) {
            return new m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_fees, R$attr.uikit_colorWhite, R$attr.uikit_colorGreen), (CircleBadgeModel) null, 6);
        }
        if (trade instanceof t) {
            return h(((t) trade).f114474c, new WhiteCircleBadge(dw0.a.Merge), nVar);
        }
        if (trade instanceof c0) {
            return h(((c0) trade).f114224c, new WhiteCircleBadge(dw0.a.ArrowExchange), nVar);
        }
        if (trade instanceof dfl.e0) {
            return h(((dfl.e0) trade).f114280c, new WhiteCircleBadge(dw0.a.ArrowSplit), nVar);
        }
        if (!(trade instanceof dfl.m)) {
            if (trade instanceof d0) {
                return new m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_revert_left, R$attr.uikit_colorOnAccent, R$attr.uikit_colorAccentNeutral_10), (CircleBadgeModel) null, 6);
            }
            throw new NoWhenBranchMatchedException();
        }
        dfl.m mVar = (dfl.m) trade;
        String str2 = mVar.f114430c;
        int i = e.f182584a[mVar.e.ordinal()];
        return h(str2, (i == 4 || i == 5) ? new DangerCircleBadge(dw0.a.Error) : null, nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0504  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause j(dfl.i0 r32, k1h.n r33, java.lang.String r34, nel.n r35) {
        /*
            Method dump skipped, instruction units count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kbh.f.j(dfl.i0, k1h.n, java.lang.String, nel.n):com.revolut.core.ui_kit.models.Clause");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause k(dfl.i0 r21, com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r22, java.lang.Integer r23) {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kbh.f.k(dfl.i0, com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation, java.lang.Integer):com.revolut.core.ui_kit.models.Clause");
    }

    public final Clause l(i0 trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        return m(trade, new k5e.k(this, trade));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause m(dfl.i0 r12, kotlin.jvm.functions.Function1 r13) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kbh.f.m(dfl.i0, kotlin.jvm.functions.Function1):com.revolut.core.ui_kit.models.Clause");
    }

    public final TextLocalisedClause s(dfl.b bVar, TradingLegalEntityInformation tradingLegalEntityInformation, Custom custom) {
        n2l.j jVar;
        j0 j0Var = bVar.f114188p;
        int i = j0Var == null ? -1 : e.f182588h[j0Var.ordinal()];
        if (i == -1) {
            jVar = n2l.i.f211591a;
        } else if (i == 1) {
            jVar = n2l.d.f211586a;
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = n2l.i.f211591a;
        } else {
            jVar = n2l.g.f211589a;
        }
        return this.f182590a.h(jVar, tradingLegalEntityInformation != null ? tradingLegalEntityInformation.f105106a : null, custom);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage t(dfl.j0 r5, cfl.j r6) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L5
            r5 = r0
            goto Ld
        L5:
            int[] r1 = kbh.e.f182588h
            int r5 = r5.ordinal()
            r5 = r1[r5]
        Ld:
            r1 = 3
            r2 = 2
            r3 = 1
            if (r5 == r0) goto L29
            if (r5 == r3) goto L26
            if (r5 == r2) goto L1f
            if (r5 != r1) goto L19
            goto L29
        L19:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L1f:
            n2l.c r5 = new n2l.c
            r6 = 0
            r5.<init>(r6)
            goto L43
        L26:
            n2l.d r5 = n2l.d.f211586a
            goto L43
        L29:
            int[] r5 = kbh.e.f182587g
            int r6 = r6.ordinal()
            r5 = r5[r6]
            n2l.i r6 = n2l.i.f211591a
            if (r5 == r3) goto L39
            if (r5 == r2) goto L41
            if (r5 != r1) goto L3b
        L39:
            r5 = r6
            goto L43
        L3b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L41:
            n2l.e r5 = n2l.e.f211587a
        L43:
            kpj.f r6 = r4.f182590a
            int r5 = r6.g(r5)
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage$a r6 = com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.INSTANCE
            int r0 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccentNeutral
            int r1 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccentNeutral_10
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r5 = r6.i(r5, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kbh.f.t(dfl.j0, cfl.j):com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage");
    }
}
