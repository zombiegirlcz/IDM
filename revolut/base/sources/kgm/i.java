package kgm;

import afl.t0;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuoteParams;
import com.revolut.feature.payments.api.PaymentsToggles$ChatMentions;
import com.revolut.feature.payments.messaging.data.api.model.MentionsData;
import com.revolut.feature.payments.messaging.data.api.model.MessageMetadata;
import com.revolut.feature.statements.api.models.CustomStatementAccountPeriods;
import com.revolut.feature.statements.api.models.CustomStatementData;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import efm.d0;
import efm.l;
import efm.r;
import efm.x;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kfm.o;
import kl.b0;
import kl.c0;
import kl.g0;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import lde.k;
import om4.r0;
import qlm.e1;
import qlm.f1;
import qlm.o0;
import qua.p;
import sgm.e3;
import vkm.q;
import vrl.a0;
import vrl.t;
import vrl.u;
import vrl.v;
import vrl.y;
import vrl.z;
import yhm.m;
import yhm.n;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class i implements igm.b, o, igm.g, igm.o, fgm.b, x, f1, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f184023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f184024c;

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f184022a = i;
        this.f184023b = obj2;
        this.f184024c = obj3;
    }

    public static wkm.l p(i iVar, DeFiSwapQuoteParams params) {
        iVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        return q.Q(rd0.e.b(xv5.c.b((xv5.c) iVar.f184024c)), new r0(null, iVar, params, 28));
    }

    @Override // qlm.f1
    public Object a(KClass key, ArrayList types) {
        Object objA;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f184024c;
        Class clsO = nim.a.o(key);
        Object e1Var = concurrentHashMap.get(clsO);
        if (e1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsO, (e1Var = new e1()))) != null) {
            e1Var = objPutIfAbsent;
        }
        e1 e1Var2 = (e1) e1Var;
        ArrayList arrayList = new ArrayList(w.t(types, 10));
        Iterator it8 = types.iterator();
        while (it8.hasNext()) {
            arrayList.add(new o0((KType) it8.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = e1Var2.f247636a;
        Object obj2 = concurrentHashMap2.get(arrayList);
        if (obj2 == null) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = (KSerializer) ((Function2) this.f184023b).invoke(key, types);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            m mVar = new m(objA);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, mVar);
            obj2 = objPutIfAbsent2 == null ? mVar : objPutIfAbsent2;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((m) obj2).f314193a;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        List backStackSnapshot = (List) obj2;
        Intrinsics.checkNotNullParameter(backStackSnapshot, "backStackSnapshot");
        nl.e eVar = (nl.e) this.f184023b;
        ArrayList arrayListA = nl.e.a(eVar, backStackSnapshot);
        if (arrayListA.size() > 1) {
            eVar.f216900b.exitCurrentScreen();
        } else if (eVar.f216899a.isStudioUserFlowBackButtonEnabled() && arrayListA.size() == 1) {
            ((g0) this.f184024c).invoke();
        }
    }

    @Override // efm.x
    public efm.w apply(r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return nim.a.w(upstream, new qa9.r(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof sg2.a
            if (r0 == 0) goto L13
            r0 = r13
            sg2.a r0 = (sg2.a) r0
            int r1 = r0.f262582w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f262582w = r1
            goto L18
        L13:
            sg2.a r0 = new sg2.a
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f262582w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L79
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r13)
            goto L56
        L36:
            yhm.o.b(r13)
            java.lang.Object r13 = r11.f184023b
            r6 = r13
            vz1.g r6 = (vz1.g) r6
            r0.f262582w = r4
            vq5.w r5 = new vq5.w
            r9 = 0
            r10 = 12
            j02.c r8 = j02.c.f169914a
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L56
            goto L78
        L56:
            r0.f262582w = r3
            java.lang.Object r12 = r11.f184024c
            com.revolut.domain.interactors.transactions.a r12 = (com.revolut.domain.interactors.transactions.a) r12
            tof.q6[] r13 = new tof.q6[r4]
            tof.i1 r2 = tof.i1.f272794a
            r3 = 0
            r13[r3] = r2
            mjf.b0 r12 = (mjf.b0) r12
            pfm.r r12 = r12.g(r13)
            pfm.a r12 = ue0.e.v(r12)
            java.lang.Object r12 = nim.a.a(r12, r0)
            if (r12 != r1) goto L74
            goto L76
        L74:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L76:
            if (r12 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.i.b(java.lang.String, gim.c):java.lang.Object");
    }

    public Object c(Object obj2, d9d.b bVar) throws Throwable {
        Object objA;
        xua.a aVar = (xua.a) this.f184023b;
        try {
            m.Companion companion = m.INSTANCE;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.recurring_payments.api.data.models.RecurringPayment");
            objA = (p) obj2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        p subscription = (p) objA;
        if (subscription == null) {
            return Unit.f186387a;
        }
        ibd.e eVar = subscription.f249314a;
        int i = k.f194084a[eVar.f160152c.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            Object objA2 = nim.a.a(((yua.q) aVar).u(subscription, true), bVar);
            return objA2 == fim.a.COROUTINE_SUSPENDED ? objA2 : Unit.f186387a;
        }
        if (i == 4) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            Object objA3 = nim.a.a(((yua.q) aVar).v(subscription, true), bVar);
            return objA3 == fim.a.COROUTINE_SUSPENDED ? objA3 : Unit.f186387a;
        }
        throw new IllegalStateException("Recurring payment of type " + eVar.f160152c + " can not be blocked");
    }

    public a0 d(TargetPriceInputValue inputValue, nel.n instrument, InstrumentTicker instrumentTicker, bfl.g tradeSide, k4l.r0 orderType, oel.l ipoInstrumentSummary) {
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Amount amountA = ((f7j.p) this.f184023b).a(inputValue, instrument);
        BigDecimal bigDecimal = amountA.f104717a;
        if (ipoInstrumentSummary != null) {
            Intrinsics.checkNotNullParameter(ipoInstrumentSummary, "ipoInstrumentSummary");
            if (!d9.e1.I(bigDecimal)) {
                t0 t0Var = ipoInstrumentSummary.f224647a;
                BigDecimal bigDecimal2 = l4i.a.e(t0Var.f4647a).f104717a;
                BigDecimal bigDecimal3 = l4i.a.e(t0Var.f4648b).f104717a;
                BigDecimal bigDecimalMultiply = bigDecimal2.multiply(rul.d.f257627a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                if (bigDecimal.compareTo(bigDecimalMultiply) < 0) {
                    return new vrl.w(k4l.r0.LIMIT);
                }
                BigDecimal bigDecimalMultiply2 = bigDecimal3.multiply(rul.d.f257628b);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                if (bigDecimal.compareTo(bigDecimalMultiply2) > 0) {
                    return new v(k4l.r0.LIMIT);
                }
                return t.f291679b;
            }
            return u.f291680b;
        }
        Amount marketPrice = ((ogm.i) this.f184024c).a(instrumentTicker, tradeSide, orderType);
        if (!io3.h.j(instrument.f214597c)) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(marketPrice, "marketPrice");
            if (!oi0.d.y(orderType) && !oi0.d.D(orderType)) {
                throw new IllegalStateException("Only limit and stop orders are supported.");
            }
            if (!d9.e1.I(bigDecimal)) {
                if (orderType == k4l.r0.STOP) {
                    if (a.a.u(marketPrice, amountA).f104717a.abs().compareTo(bsl.c.f18219a) <= 0) {
                        return new y(tradeSide);
                    }
                    if (tradeSide == bfl.g.BUY && a.a.e(amountA, marketPrice) < 0) {
                        return vrl.x.f291686b;
                    }
                    if (tradeSide == bfl.g.SELL && a.a.e(amountA, marketPrice) > 0) {
                        return z.f291693b;
                    }
                }
                BigDecimal scale = marketPrice.f104717a.setScale(3);
                BigDecimal scale2 = bigDecimal.setScale(3);
                Intrinsics.h(scale2);
                Intrinsics.h(scale);
                RoundingMode roundingMode = RoundingMode.HALF_EVEN;
                BigDecimal bigDecimalDivide = scale2.divide(scale, roundingMode);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                if (bigDecimalDivide.compareTo(new BigDecimal(String.valueOf(1.5d))) > 0) {
                    return new v(orderType);
                }
                BigDecimal bigDecimalDivide2 = scale2.divide(scale, roundingMode);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
                if (bigDecimalDivide2.compareTo(new BigDecimal(String.valueOf(0.5d))) < 0) {
                    return new vrl.w(orderType);
                }
                return t.f291679b;
            }
            return u.f291680b;
        }
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(marketPrice, "marketPrice");
        if (!oi0.d.B(orderType) && !oi0.d.z(orderType)) {
            if (!d9.e1.I(bigDecimal)) {
                int i = rul.a.f257625a[tradeSide.ordinal()];
                a0 vVar = null;
                if (i == 1) {
                    int i2 = rul.a.f257626b[orderType.ordinal()];
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (a.a.e(amountA, marketPrice) <= 0) {
                                vVar = new vrl.w(orderType);
                            }
                        } else if (a.a.e(amountA, marketPrice) >= 0) {
                            vVar = new v(orderType);
                        }
                    }
                    if (vVar != null) {
                        return vVar;
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = rul.a.f257626b[orderType.ordinal()];
                    if (i3 != 1 && i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (a.a.e(amountA, marketPrice) >= 0) {
                                vVar = new v(orderType);
                            }
                        } else if (a.a.e(amountA, marketPrice) <= 0) {
                            vVar = new vrl.w(orderType);
                        }
                    }
                    if (vVar != null) {
                        return vVar;
                    }
                }
            }
            return u.f291680b;
        }
        return t.f291679b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof lzd.a
            if (r0 == 0) goto L13
            r0 = r7
            lzd.a r0 = (lzd.a) r0
            int r1 = r0.f200963w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200963w = r1
            goto L18
        L13:
            lzd.a r0 = new lzd.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200963w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L62
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f184023b
            fk3.a r7 = (fk3.a) r7
            ik3.c r7 = (ik3.c) r7
            efm.r r7 = r7.n()
            r2 = 3
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r4, r2)
            lyd.b r2 = new lyd.b
            r4 = 15
            r2.<init>(r4)
            lxb.c r4 = new lxb.c
            r5 = 20
            r4.<init>(r5, r2)
            efm.r r7 = r7.map(r4)
            java.lang.String r2 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f200963w = r3
            java.lang.Object r7 = nim.a.c(r7, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.i.e(gim.c):java.lang.Object");
    }

    public StatementPeriod f(CustomStatementData customStatementData) {
        Intrinsics.checkNotNullParameter(customStatementData, "customStatementData");
        Comparable MAX = LocalDate.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        Comparable MIN = LocalDate.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        for (CustomStatementAccountPeriods customStatementAccountPeriods : customStatementData.getPeriods().getAccounts()) {
            LocalDate startDate = customStatementAccountPeriods.getStartDate();
            LocalDate endDate = customStatementAccountPeriods.getEndDate();
            if (endDate == null) {
                endDate = ((l80.f) ((l80.e) this.f184024c)).e();
            }
            MAX = kotlin.ranges.f.d(MAX, startDate);
            MIN = kotlin.ranges.f.c(MIN, endDate);
        }
        return new StatementPeriod((LocalDate) MAX, (LocalDate) MIN);
    }

    public byte[] g() {
        return (byte[]) this.f184023b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rnf.e
            if (r0 == 0) goto L13
            r0 = r6
            rnf.e r0 = (rnf.e) r0
            int r1 = r0.f255660w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255660w = r1
            goto L18
        L13:
            rnf.e r0 = new rnf.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255660w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f184024c
            mde.e r6 = (mde.e) r6
            r2 = 0
            ufm.b r5 = r6.e(r5, r2)
            r0.f255660w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.i.h(java.lang.String, gim.c):java.lang.Object");
    }

    public byte[] i() {
        return (byte[]) this.f184024c;
    }

    public efm.b j(Object obj2) {
        efm.b bVarIgnoreElements = ((ne0.k) this.f184024c).a(obj2).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bw0.m k(long r24, boolean r26, hrf.h r27, hrf.c r28, hrf.f r29) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.i.k(long, boolean, hrf.h, hrf.c, hrf.f):bw0.m");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof nm3.b
            if (r0 == 0) goto L13
            r0 = r5
            nm3.b r0 = (nm3.b) r0
            int r1 = r0.f217163w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f217163w = r1
            goto L18
        L13:
            nm3.b r0 = new nm3.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f217163w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.f184023b
            ang.f r5 = (ang.f) r5
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f217163w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            do3.n r5 = (do3.n) r5
            if (r5 == 0) goto L55
            com.revolut.feature.address.models.Address r5 = r5.k
            if (r5 == 0) goto L55
            wi0.b r5 = nz8.d.g(r5)
            vm3.c r5 = r4.m(r5)
            return r5
        L55:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.i.l(gim.c):java.lang.Object");
    }

    public vm3.c m(wi0.b bVar) {
        String strJ = ((z80.b) this.f184024c).j(bVar);
        fj0.b.Companion.getClass();
        Serializable serializableB = fj0.a.b(strJ);
        m.Companion companion = m.INSTANCE;
        if (serializableB instanceof n) {
            serializableB = null;
        }
        fj0.b bVar2 = (fj0.b) serializableB;
        if (bVar2 != null) {
            return new vm3.c(bVar2.f135518a, bVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof n37.f
            if (r0 == 0) goto L13
            r0 = r7
            n37.f r0 = (n37.f) r0
            int r1 = r0.f211922w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211922w = r1
            goto L18
        L13:
            n37.f r0 = new n37.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211922w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L71
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f184023b
            gr6.m r7 = (gr6.m) r7
            et6.i2 r7 = (et6.i2) r7
            w4l.h r2 = w4l.h.f294642c
            akg.n r7 = r7.b(r2)
            java.lang.Object r4 = r6.f184024c
            ppg.b r4 = (ppg.b) r4
            pcd.g r5 = pcd.g.f234858b
            ypg.p r4 = (ypg.p) r4
            efm.r r2 = r4.f(r2, r5)
            vkm.d r2 = rd0.e.b(r2)
            n33.v0 r4 = new n33.v0
            r5 = 8
            r4.<init>(r5)
            akg.n r2 = nim.a.v(r2, r4)
            t38.e r7 = zh9.u0.m(r7, r2)
            n33.l0 r2 = new n33.l0
            r4 = 6
            r2.<init>(r4)
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.f211922w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r0 = r7.f186385a
            io3.d r0 = (io3.d) r0
            java.lang.Object r7 = r7.f186386b
            od0.i r7 = (od0.i) r7
            java.lang.Object r1 = r7.f224257a
            pcd.s r1 = (pcd.s) r1
            r2 = 0
            if (r1 == 0) goto L88
            pcd.g0 r1 = r1.f234885h
            long r4 = r1.f234861c
            goto L89
        L88:
            r4 = r2
        L89:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L9f
            com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$PocketInfo r0 = new com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$PocketInfo
            java.lang.Object r7 = r7.c()
            pcd.s r7 = (pcd.s) r7
            java.lang.String r7 = r7.f()
            io3.l r1 = io3.l.SAVINGS
            r0.<init>(r7, r1)
            return r0
        L9f:
            com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$PocketInfo r7 = new com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$PocketInfo
            java.lang.String r0 = r0.f163145a
            io3.l r1 = io3.l.MERCHANT
            r7.<init>(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.i.n(gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public String o(String dayCode) {
        Intrinsics.checkNotNullParameter(dayCode, "dayCode");
        String[] shortWeekdays = ((DateFormatSymbols) ((Lazy) this.f184023b).getValue()).getShortWeekdays();
        Integer num = (Integer) this.f184024c.get(dayCode);
        if (num == null) {
            throw new IllegalStateException(h30.l.r("Unsupported day ", dayCode));
        }
        String str = shortWeekdays[num.intValue()];
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    @Override // fgm.b
    public void onComplete() {
        switch (this.f184022a) {
            case 15:
                ((fgm.b) this.f184024c).onComplete();
                break;
            default:
                ((l) this.f184024c).onComplete();
                break;
        }
    }

    @Override // fgm.b, efm.f0
    public void onError(Throwable th10) {
        switch (this.f184022a) {
            case 15:
                ((fgm.b) this.f184024c).onError(th10);
                break;
            default:
                ((l) this.f184024c).onError(th10);
                break;
        }
    }

    @Override // fgm.b
    public void onSubscribe(Disposable disposable) {
        jgm.b.c((ngm.g) this.f184023b, disposable);
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        ((l) this.f184024c).onSuccess(obj2);
    }

    public r q(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        ufm.i iVar = new ufm.i(d0.m(g4i.a.e(searchQuery)), new ny7.j(new nrd.g(this, 29), 7), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        r rVarX = ue0.e.F(iVar, f0.f322471a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }

    public MessageMetadata r(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (!((jte.d) ((gte.a) this.f184023b)).c(PaymentsToggles$ChatMentions.f79146c)) {
            return null;
        }
        List listJ = nkm.y.J(nkm.y.x(Regex.c((Regex) this.f184024c, text), new mul.k(3)));
        if (listJ.isEmpty()) {
            return null;
        }
        return new MessageMetadata(new MentionsData(listJ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.lang.String r12, j02.o r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof sg2.b
            if (r0 == 0) goto L13
            r0 = r14
            sg2.b r0 = (sg2.b) r0
            int r1 = r0.f262583w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f262583w = r1
            goto L18
        L13:
            sg2.b r0 = new sg2.b
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f262583w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            goto L78
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r14)
            goto L55
        L36:
            yhm.o.b(r14)
            java.lang.Object r14 = r11.f184023b
            r6 = r14
            vz1.g r6 = (vz1.g) r6
            r0.f262583w = r4
            vq5.w r5 = new vq5.w
            r9 = 0
            r10 = 13
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L55
            goto L77
        L55:
            r0.f262583w = r3
            java.lang.Object r12 = r11.f184024c
            com.revolut.domain.interactors.transactions.a r12 = (com.revolut.domain.interactors.transactions.a) r12
            tof.q6[] r13 = new tof.q6[r4]
            tof.i1 r14 = tof.i1.f272794a
            r2 = 0
            r13[r2] = r14
            mjf.b0 r12 = (mjf.b0) r12
            pfm.r r12 = r12.g(r13)
            pfm.a r12 = ue0.e.v(r12)
            java.lang.Object r12 = nim.a.a(r12, r0)
            if (r12 != r1) goto L73
            goto L75
        L73:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L75:
            if (r12 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.i.s(java.lang.String, j02.o, gim.c):java.lang.Object");
    }

    public Object t(Object obj2, d9d.b bVar) throws Throwable {
        Object objA;
        xua.a aVar = (xua.a) this.f184023b;
        try {
            m.Companion companion = m.INSTANCE;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.recurring_payments.api.data.models.RecurringPayment");
            objA = (p) obj2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof n) {
            objA = null;
        }
        p subscription = (p) objA;
        if (subscription == null) {
            return Unit.f186387a;
        }
        ibd.e eVar = subscription.f249314a;
        int i = k.f194084a[eVar.f160152c.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            Object objA2 = nim.a.a(((yua.q) aVar).u(subscription, false), bVar);
            return objA2 == fim.a.COROUTINE_SUSPENDED ? objA2 : Unit.f186387a;
        }
        if (i == 4) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            Object objA3 = nim.a.a(((yua.q) aVar).v(subscription, false), bVar);
            return objA3 == fim.a.COROUTINE_SUSPENDED ? objA3 : Unit.f186387a;
        }
        throw new IllegalStateException("Recurring payment of type " + eVar.f160152c + " can not be unblocked");
    }

    public i(byte[] cipherText, byte[] nonce) {
        this.f184022a = 23;
        Intrinsics.checkNotNullParameter(cipherText, "cipherText");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        this.f184023b = cipherText;
        this.f184024c = nonce;
    }

    @Override // efm.l
    public void onSubscribe(ifm.c cVar) {
        lfm.d.c((ofm.i) this.f184023b, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kfm.o, androidx.arch.core.util.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f184022a
            switch(r0) {
                case 7: goto L67;
                default: goto L5;
            }
        L5:
            com.onfido.android.sdk.capture.internal.model.UploadedArtifact r10 = (com.onfido.android.sdk.capture.internal.model.UploadedArtifact) r10
            java.lang.String r0 = "uploadedArtifact"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.Object r0 = r9.f184023b
            nl.g0 r0 = (nl.g0) r0
            java.lang.Object r1 = r9.f184024c
            sl.o r1 = (sl.o) r1
            java.lang.String r10 = r10.getId()
            if (r10 == 0) goto L23
            r0.getClass()
            java.util.List r10 = zhm.u.c(r10)
            if (r10 != 0) goto L25
        L23:
            zhm.f0 r10 = zhm.f0.f322471a
        L25:
            sl.f r2 = r0.f216909b
            r2.getClass()
            java.lang.String r3 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "uploadIds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            io.reactivex.rxjava3.core.Completable r10 = r2.c(r1, r10)
            nl.f0 r2 = new nl.f0
            r2.<init>(r1)
            r10.getClass()
            ogm.a r4 = new ogm.a
            r1 = 2
            r4.<init>(r10, r2, r1)
            java.lang.String r10 = "onErrorComplete(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r10)
            ks0.n r5 = new ks0.n
            r10 = 15
            r5.<init>(r0, r10)
            he2.b r6 = kgm.j.d
            kgm.b r7 = kgm.j.f184027c
            ogm.m r3 = new ogm.m
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            io.reactivex.rxjava3.core.Observable r10 = io.reactivex.rxjava3.core.Observable.just(r10)
            mgm.b r10 = r3.d(r10)
            return r10
        L67:
            hhm.g r0 = new hhm.g
            java.lang.Object r1 = r9.f184024c
            efm.c0 r1 = (efm.c0) r1
            java.lang.Object r2 = r9.f184023b
            java.util.concurrent.TimeUnit r2 = (java.util.concurrent.TimeUnit) r2
            r1.getClass()
            long r3 = efm.c0.a(r2)
            r0.<init>(r10, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kgm.i.apply(java.lang.Object):java.lang.Object");
    }

    public i(c0 common, b0 brMapper) {
        this.f184022a = 6;
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(brMapper, "brMapper");
        this.f184023b = common;
        this.f184024c = brMapper;
    }

    public i(qd0.b languageProvider) {
        this.f184022a = 19;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f184023b = yhm.j.b(new bp0.k(languageProvider, 4));
        this.f184024c = zhm.r0.k(new Pair("mon", 2), new Pair("tue", 3), new Pair("wed", 4), new Pair("thu", 5), new Pair("fri", 6), new Pair("sat", 7), new Pair("sun", 1));
    }

    @Override // igm.b
    public void accept(Object obj2, Object obj3) {
        ((Map) obj2).put(((igm.o) this.f184024c).apply(obj3), ((igm.o) this.f184023b).apply(obj3));
    }

    public i(ib7.j mapperRegistry, df0.b syncedDateProvider) {
        this.f184022a = 3;
        Intrinsics.checkNotNullParameter(mapperRegistry, "mapperRegistry");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        this.f184023b = mapperRegistry;
        this.f184024c = syncedDateProvider;
    }

    public i(uig.a troubleshooterFeatureToggleProvider, mde.e sharedHelpDestinationProvider) {
        this.f184022a = 26;
        Intrinsics.checkNotNullParameter(troubleshooterFeatureToggleProvider, "troubleshooterFeatureToggleProvider");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        this.f184023b = troubleshooterFeatureToggleProvider;
        this.f184024c = sharedHelpDestinationProvider;
    }

    public i(x4l.c investorUpdateDetailsDod, x4l.c investorUpdatesDod) {
        this.f184022a = 24;
        Intrinsics.checkNotNullParameter(investorUpdateDetailsDod, "investorUpdateDetailsDod");
        Intrinsics.checkNotNullParameter(investorUpdatesDod, "investorUpdatesDod");
        this.f184023b = investorUpdateDetailsDod;
        this.f184024c = investorUpdatesDod;
    }

    public i(pae.b state, thf.m mapper) {
        this.f184022a = 21;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f184023b = state;
        this.f184024c = mapper;
    }

    public i(ang.f userInteractor, z80.b phoneToolsProvider) {
        this.f184022a = 13;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f184023b = userInteractor;
        this.f184024c = phoneToolsProvider;
    }

    public i(bsl.c orderLimitsInteractor, f7j.p targetPriceBuilder, ogm.i marketPriceBuilder, rul.b cfdValidationBuilder, rul.d ipoValidationBuilder) {
        this.f184022a = 27;
        Intrinsics.checkNotNullParameter(orderLimitsInteractor, "orderLimitsInteractor");
        Intrinsics.checkNotNullParameter(targetPriceBuilder, "targetPriceBuilder");
        Intrinsics.checkNotNullParameter(marketPriceBuilder, "marketPriceBuilder");
        Intrinsics.checkNotNullParameter(cfdValidationBuilder, "cfdValidationBuilder");
        Intrinsics.checkNotNullParameter(ipoValidationBuilder, "ipoValidationBuilder");
        this.f184023b = targetPriceBuilder;
        this.f184024c = marketPriceBuilder;
    }

    public i(gte.a featureToggleInteractor) {
        this.f184022a = 8;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f184023b = featureToggleInteractor;
        this.f184024c = new Regex("(?:^|(?<=\\s))@([A-Za-z0-9_]{3,32})\\b");
    }

    public i(j9l.a moneyCalculator, gte.a featureToggleInteractor) {
        this.f184022a = 18;
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f184023b = moneyCalculator;
        this.f184024c = featureToggleInteractor;
    }

    public i(o36.f swapRepository, xv5.c baseCurrencyInteractor) {
        this.f184022a = 28;
        Intrinsics.checkNotNullParameter(swapRepository, "swapRepository");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        this.f184023b = swapRepository;
        this.f184024c = baseCurrencyInteractor;
    }

    public i(vz1.g apmPaymentsAuthorisationsRepository, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        this.f184022a = 29;
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f184023b = apmPaymentsAuthorisationsRepository;
        this.f184024c = transactionsInteractor;
    }

    public i(xua.a recurringPaymentInteractor, e3 transactionStringsProvider, gte.a featureToggleInteractor) {
        this.f184022a = 4;
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(transactionStringsProvider, "transactionStringsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f184023b = recurringPaymentInteractor;
        this.f184024c = transactionStringsProvider;
    }

    public i(fk3.a configurationInteractor, l80.e dateProvider) {
        this.f184022a = 5;
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f184023b = configurationInteractor;
        this.f184024c = dateProvider;
    }

    public i(nih.a wealthCommoditiesPerformanceInteractor, gte.a featureToggleInteractor) {
        this.f184022a = 16;
        Intrinsics.checkNotNullParameter(wealthCommoditiesPerformanceInteractor, "wealthCommoditiesPerformanceInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f184023b = wealthCommoditiesPerformanceInteractor;
        this.f184024c = featureToggleInteractor;
    }

    public i(cl3.a contactsInteractor, ang.f userInteractor) {
        this.f184022a = 14;
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f184023b = contactsInteractor;
        this.f184024c = userInteractor;
    }

    public i(gr6.m freelancerPocketsInteractor, ppg.b vaultsInteractor) {
        this.f184022a = 9;
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.f184023b = freelancerPocketsInteractor;
        this.f184024c = vaultsInteractor;
    }

    public i(jid.z amountHintTextMapper, ppf.c transferAmountMapper) {
        this.f184022a = 20;
        Intrinsics.checkNotNullParameter(amountHintTextMapper, "amountHintTextMapper");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        this.f184023b = amountHintTextMapper;
        this.f184024c = transferAmountMapper;
    }

    public i(ybl.d portfolioInteractor, ybl.b instrumentTickerInteractor) {
        this.f184022a = 17;
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f184023b = portfolioInteractor;
        this.f184024c = instrumentTickerInteractor;
    }

    public i(krh.a aVar) {
        this.f184022a = 1;
        this.f184023b = aVar;
    }

    public i(Function2 compute) {
        this.f184022a = 22;
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f184023b = compute;
        this.f184024c = new ConcurrentHashMap();
    }

    public i(Function1 load) {
        this.f184022a = 10;
        Intrinsics.checkNotNullParameter(load, "load");
        efm.c0 c0Var = hhm.f.f152431c;
        Intrinsics.checkNotNullParameter(load, "load");
        this.f184023b = load;
        this.f184024c = new ne0.k(new n7h.c(this, 20), c0Var);
    }

    public i(a4d.a multipleWatchlistsRepository, kpj.f ratesFetcher) {
        this.f184022a = 2;
        Intrinsics.checkNotNullParameter(multipleWatchlistsRepository, "multipleWatchlistsRepository");
        Intrinsics.checkNotNullParameter(ratesFetcher, "ratesFetcher");
        this.f184023b = multipleWatchlistsRepository;
        this.f184024c = ratesFetcher;
    }
}
