package o3b;

import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.r7;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import d9.e1;
import ip0.ck0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o3b.r;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2b.b f221727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f221728b;

    public f0(q2b.b cfdExitStrategyPriceCalculator, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(cfdExitStrategyPriceCalculator, "cfdExitStrategyPriceCalculator");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f221727a = cfdExitStrategyPriceCalculator;
        this.f221728b = languageProvider;
    }

    public static Clause a(TradingOrderExitStrategy tradingOrderExitStrategy, BigDecimal bigDecimal, xi0.b bVar) {
        if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Amount) {
            return new MoneyClause(mif.a.Q(new ej0.b(bigDecimal, bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        }
        if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Price) {
            return new MoneyClause(mif.a.R(new ej0.b(bigDecimal, bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        }
        if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Distance) {
            return new PercentageClause(e1.Z(bigDecimal), PercentageClause.Format.Default.f57910a, (Style) null, 4);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static RowDelegate.Model b(k4l.n0 n0Var, u uVar, u uVar2, int i, int i2, int i3) {
        boolean z = uVar2 == uVar;
        return new RowDelegate.Model("cfd-exit-strategies-input-type-row-" + uVar, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccent, R$attr.uikit_colorAccentNeutral_10), z ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), new TextLocalisedClause(i2, null, null, 14), null, 0, new TextLocalisedClause(i3, null, null, 14), null, null, 0, null, false, null, z, null, null, null, null, null, null, new v(n0Var, uVar), null, 0, 0, 0, 0, 532668376);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        List listF;
        t domainState = (t) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_exit_strategy_setup_title, null, null, 14);
        r2b.c cVar = domainState.k;
        s sVar = domainState.f221769j;
        if (cVar instanceof r2b.a) {
            i = R$string.wealth_trading_exit_strategy_setup_opening_price_subtitle;
        } else {
            if (!Intrinsics.f(cVar, r2b.b.f251091a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_trading_exit_strategy_setup_subtitle;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, zhm.u.c(new MoneyClause(mif.a.P(new ej0.b(domainState.f221766c, domainState.f221768h), domainState.f221767g, 2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14);
        s sVar2 = domainState.i;
        boolean z = (sVar2 == null || (sVar2.f221763c instanceof r.a)) && (sVar == null || (sVar.f221763c instanceof r.a));
        if (domainState.f221770l) {
            listF = f(domainState, sVar2, k4l.n0.TAKE_PROFIT);
            yp0.b.k(listF, R$attr.uikit_dp24, 0, 0, 0, 30);
        } else {
            listF = null;
        }
        if (domainState.f221771m) {
            List listF2 = f(domainState, sVar, k4l.n0.STOP_LOSS);
            yp0.b.k(listF2, 0, 0, 0, 0, 31);
            list = listF2;
        }
        return new d0(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, i2b.a.o(listF, list), z);
    }

    public final TextLocalisedClause d(int i, t tVar, TradingOrderExitStrategy tradingOrderExitStrategy, k4l.n0 n0Var, r rVar) {
        Object moneyClause;
        ej0.b bVarA = this.f221727a.a(tVar.f, tVar.f221764a, tVar.f221766c, tradingOrderExitStrategy, n0Var, tVar.f221768h);
        if (Intrinsics.f(rVar, r.a.f221760a)) {
            moneyClause = new MoneyClause(mif.a.Q(bVarA), new MoneyClause.Format.Defaults(null, ScaleMode.PrettyFormat.f51440a, false, false, 13), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE);
        } else {
            moneyClause = new TextClause("-", (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        }
        return new TextLocalisedClause(i, zhm.u.c(moneyClause), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
    }

    public final TextLocalisedClause e(TradingOrderExitStrategy tradingOrderExitStrategy, k4l.n0 n0Var, r rVar, t tVar) {
        String strR;
        BigDecimal bigDecimalB = this.f221727a.b(tVar.f, tVar.f221764a, tVar.f221766c, tradingOrderExitStrategy, n0Var);
        int i = R$string.wealth_trading_exit_strategies_setup_screen_distance;
        if (Intrinsics.f(rVar, r.a.f221760a)) {
            String string = e1.R(e1.Z(bigDecimalB)).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            strR = a0.d.r(string, "%");
        } else {
            strR = "-";
        }
        return new TextLocalisedClause(i, zhm.u.c(new TextClause(strR, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
    }

    public final List f(t tVar, s sVar, k4l.n0 n0Var) {
        int i;
        int i2;
        InputTextDelegate.Model model;
        k4l.n0 n0Var2;
        Clause moneyClause;
        com.revolut.core.ui_kit.delegates.d0 c0Var;
        int i3;
        int i5;
        com.revolut.core.ui_kit.delegates.a0 yVar;
        List listK;
        int i6;
        int i21;
        List listL = null;
        TradingOrderExitStrategy tradingOrderExitStrategy = sVar != null ? sVar.f221762b : null;
        String str = "cfd-exit-strategies-set-up-toggle-" + n0Var;
        int[] iArr = e0.f221725a;
        int i22 = iArr[n0Var.ordinal()];
        if (i22 == 1) {
            i = R$string.wealth_trading_exit_strategies_widget_take_profit;
        } else {
            if (i22 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_trading_exit_strategies_widget_stop_loss;
        }
        RowDelegate.Model model2 = new RowDelegate.Model(str, null, new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, new vf(tradingOrderExitStrategy != null, true), false, null, false, null, null, null, null, null, null, new x(n0Var, tradingOrderExitStrategy), null, 0, 0, 0, 0, 532675578);
        if (sVar != null) {
            TradingOrderExitStrategy tradingOrderExitStrategy2 = sVar.f221762b;
            r rVar = sVar.f221763c;
            u uVar = sVar.f221761a;
            String str2 = "cfd-exit-strategies-set-up-type-dropdown-" + n0Var;
            int[] iArr2 = e0.f221726b;
            int i32 = iArr2[uVar.ordinal()];
            if (i32 == 1) {
                i2 = R$string.wealth_trading_exit_strategies_setup_screen_input_type_amount;
            } else if (i32 == 2) {
                i2 = R$string.wealth_trading_exit_strategies_setup_screen_input_type_distance;
            } else {
                if (i32 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.wealth_trading_exit_strategies_setup_screen_input_type_price;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
            w wVar = new w(n0Var, sVar);
            r7 r7Var = r7.SINGLE;
            int i33 = R$attr.uikit_dp16;
            InputTextDelegate.Model modelA = yp0.r.a(new InputTextDelegate.Model(str2, textLocalisedClause, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, wVar, null, r7Var, 0, R$attr.uikit_dp8, i33, i33, -4, 5631));
            String str3 = "cfd-exit-strategies-set-up-input-" + n0Var;
            if (sVar.e) {
                moneyClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                model = modelA;
                n0Var2 = n0Var;
            } else {
                int i43 = iArr2[uVar.ordinal()];
                q2b.b bVar = this.f221727a;
                if (i43 != 1) {
                    if (i43 == 2) {
                        model = modelA;
                        BigDecimal bigDecimalAbs = e1.Z(bVar.b(tVar.f, tVar.f221764a, tVar.f221766c, sVar.f221762b, n0Var)).abs();
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                        String string = e1.R(bigDecimalAbs).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        moneyClause = new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    } else {
                        if (i43 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        model = modelA;
                        moneyClause = new MoneyClause(mif.a.R(bVar.c(tVar.f, tVar.f221764a, tVar.f221766c, n0Var, sVar.f221762b, tVar.f221768h, tVar.f221767g)), new MoneyClause.Format.Defaults(null, null, true, false, 11), null, o9.NON_SENSITIVE, 4);
                    }
                    n0Var2 = n0Var;
                } else {
                    model = modelA;
                    n0Var2 = n0Var;
                    moneyClause = new MoneyClause(mif.a.Q(bVar.a(tVar.f, tVar.f221764a, tVar.f221766c, sVar.f221762b, n0Var, tVar.f221768h)), new MoneyClause.Format.Defaults(null, null, true, false, 11), null, o9.NON_SENSITIVE, 4);
                }
            }
            xi0.b bVar2 = tVar.f221768h;
            if (rVar instanceof p) {
                c0Var = new com.revolut.core.ui_kit.delegates.c0(new TextLocalisedClause(R$string.wealth_trading_exit_strategies_setup_screen_error_must_be_lower_than, zhm.u.c(a(tradingOrderExitStrategy2, ((p) rVar).f221754a, bVar2)), null, 12));
            } else if (rVar instanceof q) {
                c0Var = new com.revolut.core.ui_kit.delegates.c0(new TextLocalisedClause(R$string.wealth_trading_exit_strategies_setup_screen_error_must_be_higher_than, zhm.u.c(a(tradingOrderExitStrategy2, ((q) rVar).f221758a, bVar2)), null, 12));
            } else {
                if (!Intrinsics.f(rVar, r.a.f221760a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0Var = com.revolut.core.ui_kit.delegates.b0.f53700a;
            }
            int i59 = iArr2[uVar.ordinal()];
            qd0.b bVar3 = this.f221728b;
            if (i59 != 1) {
                i3 = 2;
                if (i59 != 2) {
                    i5 = 3;
                    if (i59 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yVar = new com.revolut.core.ui_kit.delegates.y(((s80.b) bVar3).b(), bVar2, tVar.f221767g);
                } else {
                    i5 = 3;
                    yVar = new com.revolut.core.ui_kit.delegates.z("[999][.][99]", zhm.u.c(new jm.b(true, ".", CoreConstants.DOT)));
                }
            } else {
                i3 = 2;
                i5 = 3;
                yVar = new com.revolut.core.ui_kit.delegates.y(((s80.b) bVar3).b(), bVar2, bVar2.c());
            }
            AmountInputActionsDelegate.Model model3 = new AmountInputActionsDelegate.Model(str3, moneyClause, c0Var, yVar, !sVar.f, new w(n0Var2, sVar));
            String str4 = "cfd-exit-strategies-set-up-additional-info-" + n0Var2;
            int i66 = iArr2[uVar.ordinal()];
            if (i66 == 1) {
                k4l.n0 n0Var3 = n0Var2;
                listK = zhm.v.k(g(tradingOrderExitStrategy2, n0Var3, rVar, tVar), e(tradingOrderExitStrategy2, n0Var3, rVar, tVar));
            } else if (i66 == i3) {
                k4l.n0 n0Var4 = n0Var2;
                TextLocalisedClause textLocalisedClauseG = g(tradingOrderExitStrategy2, n0Var4, rVar, tVar);
                int i74 = iArr[n0Var4.ordinal()];
                if (i74 == 1) {
                    i6 = R$string.wealth_trading_exit_strategies_setup_screen_profit;
                } else {
                    if (i74 != i3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = R$string.wealth_trading_exit_strategies_setup_screen_loss;
                }
                listK = zhm.v.k(textLocalisedClauseG, d(i6, tVar, sVar.f221762b, n0Var4, sVar.f221763c));
            } else {
                if (i66 != i5) {
                    throw new NoWhenBranchMatchedException();
                }
                int i92 = iArr[n0Var2.ordinal()];
                if (i92 == 1) {
                    i21 = R$string.wealth_trading_exit_strategies_setup_screen_profit;
                } else {
                    if (i92 != i3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i21 = R$string.wealth_trading_exit_strategies_setup_screen_loss;
                }
                listK = zhm.v.k(d(i21, tVar, sVar.f221762b, n0Var, sVar.f221763c), e(tradingOrderExitStrategy2, n0Var, rVar, tVar));
            }
            Object[] elements = {model, model3, new TextDelegate.Model(str4, yoj.b.m(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_templates_horizontal_labels_spaces, null, null, 14), listK), false, new ck0(0), null, null, R$attr.uikit_dp8, 0, 0, 0, 1908)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        }
        return i2b.a.q(model2, listL);
    }

    public final TextLocalisedClause g(TradingOrderExitStrategy tradingOrderExitStrategy, k4l.n0 n0Var, r rVar, t tVar) {
        Object moneyClause;
        ej0.b bVarC = this.f221727a.c(tVar.f, tVar.f221764a, tVar.f221766c, n0Var, tradingOrderExitStrategy, tVar.f221768h, tVar.f221767g);
        int i = R$string.wealth_trading_exit_strategies_setup_screen_price;
        if (Intrinsics.f(rVar, r.a.f221760a)) {
            moneyClause = new MoneyClause(mif.a.R(bVarC), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE);
        } else {
            moneyClause = new TextClause("-", (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        }
        return new TextLocalisedClause(i, zhm.u.c(moneyClause), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
    }
}
