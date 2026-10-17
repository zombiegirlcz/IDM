package o3b;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vrl.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 extends oki.h implements o {
    public final u80.t A;
    public final ybl.b B;
    public final u0 C;
    public final Object D;
    public final Object E;
    public final l4i.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f221746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f221747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q0 f221748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f221749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n3b.b f221750t;
    public final wj0.a u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n60.a f221751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n60.b f221752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z f221753y;
    public final y1b.a z;

    public n0(l4i.a amountConverter, j60.a bottomExpandableDialogControllerExtension, b cfdDefaultExitStrategiesProvider, q0 cfdExitStrategiesSetUpInputValidator, d cfdExitStrategyNormaliser, n3b.b exitStrategyInfoDialogMapper, wj0.a idempotencyKeyHolder, y inputData, n60.a keyboardControllerExtension, n60.b keyboardViewControllerExtension, z mapper, y1b.a cfdInteractor, u80.t ratesMoneyUtils, ybl.b instrumentTickerInteractor, u0 tradingOrdersInteractor) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(cfdDefaultExitStrategiesProvider, "cfdDefaultExitStrategiesProvider");
        Intrinsics.checkNotNullParameter(cfdExitStrategiesSetUpInputValidator, "cfdExitStrategiesSetUpInputValidator");
        Intrinsics.checkNotNullParameter(cfdExitStrategyNormaliser, "cfdExitStrategyNormaliser");
        Intrinsics.checkNotNullParameter(exitStrategyInfoDialogMapper, "exitStrategyInfoDialogMapper");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(keyboardViewControllerExtension, "keyboardViewControllerExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cfdInteractor, "cfdInteractor");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        this.o = amountConverter;
        this.f221746p = bottomExpandableDialogControllerExtension;
        this.f221747q = cfdDefaultExitStrategiesProvider;
        this.f221748r = cfdExitStrategiesSetUpInputValidator;
        this.f221749s = cfdExitStrategyNormaliser;
        this.f221750t = exitStrategyInfoDialogMapper;
        this.u = idempotencyKeyHolder;
        this.v = inputData;
        this.f221751w = keyboardControllerExtension;
        this.f221752x = keyboardViewControllerExtension;
        this.f221753y = mapper;
        this.z = cfdInteractor;
        this.A = ratesMoneyUtils;
        this.B = instrumentTickerInteractor;
        this.C = tradingOrdersInteractor;
        final int i = 0;
        this.D = te0.w.y0(new Function0(this) { // from class: o3b.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f221734b;

            {
                this.f221734b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                s sVar;
                bfl.g gVar;
                k4l.n0 n0Var;
                TradingOrderExitStrategy tradingOrderExitStrategy;
                u uVar;
                TradingOrderExitStrategy tradingOrderExitStrategy2;
                u uVar2;
                switch (i) {
                    case 0:
                        return BigDecimal.ONE.scaleByPowerOfTen(-((t) ((j2) this.f221734b.getState().f22677a).getValue()).f221767g);
                    default:
                        n0 n0Var2 = this.f221734b;
                        y yVar = n0Var2.v;
                        Integer num = yVar.f221779b.f214603n;
                        int iIntValue = num != null ? num.intValue() : yVar.f221780c.scale();
                        BigDecimal bigDecimalK2 = n0Var2.K2();
                        BigDecimal bigDecimal = yVar.f221780c;
                        List list = yVar.f221783j;
                        BigDecimal bigDecimal2 = yVar.d;
                        bfl.g gVar2 = yVar.e;
                        xi0.b bVar = yVar.f221779b.i;
                        k4l.n0 n0Var3 = k4l.n0.TAKE_PROFIT;
                        s sVar2 = null;
                        if (!list.contains(n0Var3) || (tradingOrderExitStrategy2 = yVar.f221781g) == null) {
                            sVar = null;
                        } else {
                            if (tradingOrderExitStrategy2 instanceof TradingOrderExitStrategy.Amount) {
                                uVar2 = u.AMOUNT;
                            } else if (tradingOrderExitStrategy2 instanceof TradingOrderExitStrategy.Distance) {
                                uVar2 = u.DISTANCE;
                            } else {
                                if (!(tradingOrderExitStrategy2 instanceof TradingOrderExitStrategy.Price)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                uVar2 = u.PRICE;
                            }
                            u uVar3 = uVar2;
                            BigDecimal bigDecimal3 = yVar.d;
                            BigDecimal bigDecimal4 = yVar.f221780c;
                            sVar = new s(uVar3, tradingOrderExitStrategy2, n0Var2.O2(n0Var3, tradingOrderExitStrategy2, false, bigDecimal3, bigDecimal4, bigDecimal4, iIntValue), false, false, false);
                        }
                        k4l.n0 n0Var4 = k4l.n0.STOP_LOSS;
                        if (!list.contains(n0Var4) || (tradingOrderExitStrategy = yVar.f221782h) == null) {
                            gVar = gVar2;
                            n0Var = n0Var3;
                        } else {
                            if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Amount) {
                                uVar = u.AMOUNT;
                            } else if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Distance) {
                                uVar = u.DISTANCE;
                            } else {
                                if (!(tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Price)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                uVar = u.PRICE;
                            }
                            u uVar4 = uVar;
                            BigDecimal bigDecimal5 = yVar.d;
                            BigDecimal bigDecimal6 = yVar.f221780c;
                            gVar = gVar2;
                            n0Var = n0Var3;
                            sVar2 = new s(uVar4, tradingOrderExitStrategy, n0Var2.O2(n0Var4, tradingOrderExitStrategy, false, bigDecimal5, bigDecimal6, bigDecimal6, iIntValue), false, false, false);
                        }
                        return mra.d.b(n0Var2, new t(bigDecimalK2, bigDecimal, bigDecimal2, bigDecimal, bigDecimal, gVar, iIntValue, bVar, sVar, sVar2, yVar.f, list.contains(n0Var), list.contains(n0Var4)), n0Var2.f221753y, null, false, 12);
                }
            }
        });
        final int i2 = 1;
        this.E = te0.w.y0(new Function0(this) { // from class: o3b.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f221734b;

            {
                this.f221734b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                s sVar;
                bfl.g gVar;
                k4l.n0 n0Var;
                TradingOrderExitStrategy tradingOrderExitStrategy;
                u uVar;
                TradingOrderExitStrategy tradingOrderExitStrategy2;
                u uVar2;
                switch (i2) {
                    case 0:
                        return BigDecimal.ONE.scaleByPowerOfTen(-((t) ((j2) this.f221734b.getState().f22677a).getValue()).f221767g);
                    default:
                        n0 n0Var2 = this.f221734b;
                        y yVar = n0Var2.v;
                        Integer num = yVar.f221779b.f214603n;
                        int iIntValue = num != null ? num.intValue() : yVar.f221780c.scale();
                        BigDecimal bigDecimalK2 = n0Var2.K2();
                        BigDecimal bigDecimal = yVar.f221780c;
                        List list = yVar.f221783j;
                        BigDecimal bigDecimal2 = yVar.d;
                        bfl.g gVar2 = yVar.e;
                        xi0.b bVar = yVar.f221779b.i;
                        k4l.n0 n0Var3 = k4l.n0.TAKE_PROFIT;
                        s sVar2 = null;
                        if (!list.contains(n0Var3) || (tradingOrderExitStrategy2 = yVar.f221781g) == null) {
                            sVar = null;
                        } else {
                            if (tradingOrderExitStrategy2 instanceof TradingOrderExitStrategy.Amount) {
                                uVar2 = u.AMOUNT;
                            } else if (tradingOrderExitStrategy2 instanceof TradingOrderExitStrategy.Distance) {
                                uVar2 = u.DISTANCE;
                            } else {
                                if (!(tradingOrderExitStrategy2 instanceof TradingOrderExitStrategy.Price)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                uVar2 = u.PRICE;
                            }
                            u uVar3 = uVar2;
                            BigDecimal bigDecimal3 = yVar.d;
                            BigDecimal bigDecimal4 = yVar.f221780c;
                            sVar = new s(uVar3, tradingOrderExitStrategy2, n0Var2.O2(n0Var3, tradingOrderExitStrategy2, false, bigDecimal3, bigDecimal4, bigDecimal4, iIntValue), false, false, false);
                        }
                        k4l.n0 n0Var4 = k4l.n0.STOP_LOSS;
                        if (!list.contains(n0Var4) || (tradingOrderExitStrategy = yVar.f221782h) == null) {
                            gVar = gVar2;
                            n0Var = n0Var3;
                        } else {
                            if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Amount) {
                                uVar = u.AMOUNT;
                            } else if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Distance) {
                                uVar = u.DISTANCE;
                            } else {
                                if (!(tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Price)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                uVar = u.PRICE;
                            }
                            u uVar4 = uVar;
                            BigDecimal bigDecimal5 = yVar.d;
                            BigDecimal bigDecimal6 = yVar.f221780c;
                            gVar = gVar2;
                            n0Var = n0Var3;
                            sVar2 = new s(uVar4, tradingOrderExitStrategy, n0Var2.O2(n0Var4, tradingOrderExitStrategy, false, bigDecimal5, bigDecimal6, bigDecimal6, iIntValue), false, false, false);
                        }
                        return mra.d.b(n0Var2, new t(bigDecimalK2, bigDecimal, bigDecimal2, bigDecimal, bigDecimal, gVar, iIntValue, bVar, sVar, sVar2, yVar.f, list.contains(n0Var), list.contains(n0Var4)), n0Var2.f221753y, null, false, 12);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r17v2, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlin.coroutines.Continuation, r2b.a] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.revolut.core.ui_kit.models.Style, java.lang.String, java.util.List, kotlin.coroutines.Continuation, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(o3b.n0 r28, r2b.a r29, com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies r30, gim.c r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3b.n0.I2(o3b.n0, r2b.a, com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies, gim.c):java.lang.Object");
    }

    public static TradingOrderExitStrategy.Price J2(n0 n0Var, k4l.n0 n0Var2) {
        BigDecimal bigDecimal = ((t) ((j2) n0Var.getState().f22677a).getValue()).f221765b;
        BigDecimal bigDecimal2 = ((t) ((j2) n0Var.getState().f22677a).getValue()).f221766c;
        b bVar = n0Var.f221747q;
        y yVar = n0Var.v;
        int i = j0.f221738a[n0Var2.ordinal()];
        if (i == 1) {
            return bVar.d(yVar.e, bigDecimal, bigDecimal2, yVar.f221779b.i, ((t) ((j2) n0Var.getState().f22677a).getValue()).f221767g);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return bVar.c(yVar.e, bigDecimal, bigDecimal2, yVar.f221779b.i, ((t) ((j2) n0Var.getState().f22677a).getValue()).f221767g);
    }

    public static /* synthetic */ void N2(n0 n0Var, k4l.n0 n0Var2, TradingOrderExitStrategy tradingOrderExitStrategy, u uVar, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        if ((i & 4) != 0) {
            uVar = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            bool3 = null;
        }
        n0Var.M2(n0Var2, tradingOrderExitStrategy, uVar, bool, bool2, bool3);
    }

    public static r P2(n0 n0Var, k4l.n0 n0Var2, TradingOrderExitStrategy tradingOrderExitStrategy, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        BigDecimal bigDecimal3 = ((t) ((j2) n0Var.getState().f22677a).getValue()).f221766c;
        if ((i & 16) != 0) {
            bigDecimal = ((t) ((j2) n0Var.getState().f22677a).getValue()).d;
        }
        BigDecimal bigDecimal4 = bigDecimal;
        if ((i & 32) != 0) {
            bigDecimal2 = ((t) ((j2) n0Var.getState().f22677a).getValue()).e;
        }
        return n0Var.O2(n0Var2, tradingOrderExitStrategy, z, bigDecimal3, bigDecimal4, bigDecimal2, ((t) ((j2) n0Var.getState().f22677a).getValue()).f221767g);
    }

    @Override // yji.l
    public final void I1() {
        if (this.v.f instanceof r2b.a) {
            yji.l.a1(this, getState().B(new o2g.f(5)), null, null, new k0(this, null, 0), 3);
        }
    }

    public final BigDecimal K2() {
        BigDecimal bigDecimalAbs;
        String str;
        y yVar = this.v;
        if (e1.I(yVar.f221778a)) {
            bigDecimalAbs = BigDecimal.ONE;
            str = "ONE";
        } else {
            bigDecimalAbs = yVar.f221778a.abs();
            str = "abs(...)";
        }
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, str);
        return bigDecimalAbs;
    }

    public final TradingOrderExitStrategy L2(k4l.n0 strategyType, u strategyInputType, TradingOrderExitStrategy strategy) {
        y yVar = this.v;
        bfl.g side = yVar.e;
        BigDecimal quantity = K2();
        BigDecimal baseRate = ((t) ((j2) getState().f22677a).getValue()).f221766c;
        xi0.b currency = yVar.f221779b.i;
        int i = ((t) ((j2) getState().f22677a).getValue()).f221767g;
        q2b.b bVar = this.f221749s.f221719a;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(baseRate, "baseRate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(strategyType, "strategyType");
        Intrinsics.checkNotNullParameter(strategyInputType, "strategyInputType");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        int i2 = c.f221718a[strategyInputType.ordinal()];
        if (i2 == 1) {
            return new TradingOrderExitStrategy.Price(bVar.c(side, quantity, baseRate, strategyType, strategy, currency, i));
        }
        if (i2 == 2) {
            return new TradingOrderExitStrategy.Amount(bVar.a(side, quantity, baseRate, strategy, strategyType, currency));
        }
        if (i2 == 3) {
            return new TradingOrderExitStrategy.Distance(bVar.b(side, quantity, baseRate, strategy, strategyType));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void M2(k4l.n0 n0Var, final TradingOrderExitStrategy tradingOrderExitStrategy, final u uVar, final Boolean bool, final Boolean bool2, final Boolean bool3) {
        int i = j0.f221738a[n0Var.ordinal()];
        if (i == 1) {
            final int i2 = 1;
            H2(getState(), new Function1() { // from class: o3b.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    s sVarA;
                    s sVar;
                    s sVarA2;
                    s sVar2;
                    switch (i2) {
                        case 0:
                            t update = (t) obj2;
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            TradingOrderExitStrategy tradingOrderExitStrategy2 = tradingOrderExitStrategy;
                            if (tradingOrderExitStrategy2 != null) {
                                s sVar3 = update.f221769j;
                                u uVar2 = uVar;
                                n0 n0Var2 = this;
                                if (sVar3 == null) {
                                    if (uVar2 == null) {
                                        uVar2 = u.PRICE;
                                    }
                                    sVar = new s(uVar2, tradingOrderExitStrategy2, n0.P2(n0Var2, k4l.n0.STOP_LOSS, tradingOrderExitStrategy2, false, null, null, SyslogConstants.LOG_CLOCK), true, false, false);
                                    return t.a(update, null, null, null, null, null, sVar, 7679);
                                }
                                boolean zBooleanValue = sVar3.e;
                                if (uVar2 == null) {
                                    uVar2 = sVar3.f221761a;
                                }
                                u uVar3 = uVar2;
                                k4l.n0 n0Var3 = k4l.n0.STOP_LOSS;
                                Boolean bool4 = bool2;
                                r rVarP2 = n0.P2(n0Var2, n0Var3, tradingOrderExitStrategy2, bool4 != null ? bool4.booleanValue() : zBooleanValue, null, null, SyslogConstants.LOG_CLOCK);
                                Boolean bool5 = bool;
                                boolean zBooleanValue2 = bool5 != null ? bool5.booleanValue() : sVar3.d;
                                if (bool4 != null) {
                                    zBooleanValue = bool4.booleanValue();
                                }
                                boolean z = zBooleanValue;
                                Boolean bool6 = bool3;
                                sVarA = s.a(uVar3, tradingOrderExitStrategy2, rVarP2, zBooleanValue2, z, bool6 != null ? bool6.booleanValue() : sVar3.f);
                            } else {
                                sVarA = null;
                            }
                            sVar = sVarA;
                            return t.a(update, null, null, null, null, null, sVar, 7679);
                        default:
                            t update2 = (t) obj2;
                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                            TradingOrderExitStrategy tradingOrderExitStrategy3 = tradingOrderExitStrategy;
                            if (tradingOrderExitStrategy3 != null) {
                                s sVar4 = update2.i;
                                u uVar4 = uVar;
                                n0 n0Var4 = this;
                                if (sVar4 == null) {
                                    if (uVar4 == null) {
                                        uVar4 = u.PRICE;
                                    }
                                    sVar2 = new s(uVar4, tradingOrderExitStrategy3, n0.P2(n0Var4, k4l.n0.TAKE_PROFIT, tradingOrderExitStrategy3, false, null, null, SyslogConstants.LOG_CLOCK), true, false, false);
                                    return t.a(update2, null, null, null, null, sVar2, null, 7935);
                                }
                                boolean zBooleanValue3 = sVar4.e;
                                if (uVar4 == null) {
                                    uVar4 = sVar4.f221761a;
                                }
                                k4l.n0 n0Var5 = k4l.n0.TAKE_PROFIT;
                                Boolean bool7 = bool2;
                                r rVarP22 = n0.P2(n0Var4, n0Var5, tradingOrderExitStrategy3, bool7 != null ? bool7.booleanValue() : zBooleanValue3, null, null, SyslogConstants.LOG_CLOCK);
                                Boolean bool8 = bool;
                                boolean zBooleanValue4 = bool8 != null ? bool8.booleanValue() : sVar4.d;
                                if (bool7 != null) {
                                    zBooleanValue3 = bool7.booleanValue();
                                }
                                boolean z3 = zBooleanValue3;
                                Boolean bool9 = bool3;
                                sVarA2 = s.a(uVar4, tradingOrderExitStrategy3, rVarP22, zBooleanValue4, z3, bool9 != null ? bool9.booleanValue() : sVar4.f);
                            } else {
                                sVarA2 = null;
                            }
                            sVar2 = sVarA2;
                            return t.a(update2, null, null, null, null, sVar2, null, 7935);
                    }
                }
            });
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            final int i3 = 0;
            H2(getState(), new Function1() { // from class: o3b.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    s sVarA;
                    s sVar;
                    s sVarA2;
                    s sVar2;
                    switch (i3) {
                        case 0:
                            t update = (t) obj2;
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            TradingOrderExitStrategy tradingOrderExitStrategy2 = tradingOrderExitStrategy;
                            if (tradingOrderExitStrategy2 != null) {
                                s sVar3 = update.f221769j;
                                u uVar2 = uVar;
                                n0 n0Var2 = this;
                                if (sVar3 == null) {
                                    if (uVar2 == null) {
                                        uVar2 = u.PRICE;
                                    }
                                    sVar = new s(uVar2, tradingOrderExitStrategy2, n0.P2(n0Var2, k4l.n0.STOP_LOSS, tradingOrderExitStrategy2, false, null, null, SyslogConstants.LOG_CLOCK), true, false, false);
                                    return t.a(update, null, null, null, null, null, sVar, 7679);
                                }
                                boolean zBooleanValue = sVar3.e;
                                if (uVar2 == null) {
                                    uVar2 = sVar3.f221761a;
                                }
                                u uVar3 = uVar2;
                                k4l.n0 n0Var3 = k4l.n0.STOP_LOSS;
                                Boolean bool4 = bool2;
                                r rVarP2 = n0.P2(n0Var2, n0Var3, tradingOrderExitStrategy2, bool4 != null ? bool4.booleanValue() : zBooleanValue, null, null, SyslogConstants.LOG_CLOCK);
                                Boolean bool5 = bool;
                                boolean zBooleanValue2 = bool5 != null ? bool5.booleanValue() : sVar3.d;
                                if (bool4 != null) {
                                    zBooleanValue = bool4.booleanValue();
                                }
                                boolean z = zBooleanValue;
                                Boolean bool6 = bool3;
                                sVarA = s.a(uVar3, tradingOrderExitStrategy2, rVarP2, zBooleanValue2, z, bool6 != null ? bool6.booleanValue() : sVar3.f);
                            } else {
                                sVarA = null;
                            }
                            sVar = sVarA;
                            return t.a(update, null, null, null, null, null, sVar, 7679);
                        default:
                            t update2 = (t) obj2;
                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                            TradingOrderExitStrategy tradingOrderExitStrategy3 = tradingOrderExitStrategy;
                            if (tradingOrderExitStrategy3 != null) {
                                s sVar4 = update2.i;
                                u uVar4 = uVar;
                                n0 n0Var4 = this;
                                if (sVar4 == null) {
                                    if (uVar4 == null) {
                                        uVar4 = u.PRICE;
                                    }
                                    sVar2 = new s(uVar4, tradingOrderExitStrategy3, n0.P2(n0Var4, k4l.n0.TAKE_PROFIT, tradingOrderExitStrategy3, false, null, null, SyslogConstants.LOG_CLOCK), true, false, false);
                                    return t.a(update2, null, null, null, null, sVar2, null, 7935);
                                }
                                boolean zBooleanValue3 = sVar4.e;
                                if (uVar4 == null) {
                                    uVar4 = sVar4.f221761a;
                                }
                                k4l.n0 n0Var5 = k4l.n0.TAKE_PROFIT;
                                Boolean bool7 = bool2;
                                r rVarP22 = n0.P2(n0Var4, n0Var5, tradingOrderExitStrategy3, bool7 != null ? bool7.booleanValue() : zBooleanValue3, null, null, SyslogConstants.LOG_CLOCK);
                                Boolean bool8 = bool;
                                boolean zBooleanValue4 = bool8 != null ? bool8.booleanValue() : sVar4.d;
                                if (bool7 != null) {
                                    zBooleanValue3 = bool7.booleanValue();
                                }
                                boolean z3 = zBooleanValue3;
                                Boolean bool9 = bool3;
                                sVarA2 = s.a(uVar4, tradingOrderExitStrategy3, rVarP22, zBooleanValue4, z3, bool9 != null ? bool9.booleanValue() : sVar4.f);
                            } else {
                                sVarA2 = null;
                            }
                            sVar2 = sVarA2;
                            return t.a(update2, null, null, null, null, sVar2, null, 7935);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o3b.r O2(k4l.n0 r14, com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy r15, boolean r16, java.math.BigDecimal r17, java.math.BigDecimal r18, java.math.BigDecimal r19, int r20) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3b.n0.O2(k4l.n0, com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy, boolean, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, int):o3b.r");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, mo3.a.g(((ael.k) this.B).g(this.v.f221779b.f214596b), null, new nz7.g(22), 1), null, new l0(this, continuation, 1), 3);
        yji.l.b1(this, rd0.e.b(this.f221752x.d), null, new l0(this, continuation, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.E.getValue();
    }
}
