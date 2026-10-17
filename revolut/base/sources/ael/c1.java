package ael;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c1 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f3601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f3602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f3603c;
    public static final Set d;
    public static final Set e;

    public static final class a {
        private a() {
        }
    }

    static {
        cfl.v vVar = cfl.v.AVAILABLE;
        cfl.v vVar2 = cfl.v.ONBOARDING;
        cfl.v vVar3 = cfl.v.ACTIVE;
        cfl.v vVar4 = cfl.v.REMEDIATION_REQUIRED;
        cfl.v vVar5 = cfl.v.OFFBOARDING;
        cfl.v[] elements = {vVar, vVar2, vVar3, vVar4, vVar5};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f3601a = kotlin.collections.d.y0(elements);
        cfl.v[] elements2 = {vVar4, vVar3, vVar5};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f3602b = kotlin.collections.d.y0(elements2);
        f3603c = zhm.y0.b(vVar3);
        cfl.v[] elements3 = {vVar3, vVar4};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        d = kotlin.collections.d.y0(elements3);
        cfl.b[] elements4 = {cfl.b.ACTIVE, cfl.b.OFFBOARDING};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        e = kotlin.collections.d.y0(elements4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker r6, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r7, nel.n r8, nel.z0 r9, boolean r10) {
        /*
            r0 = 1
            r1 = 0
            if (r6 == 0) goto La
            boolean r6 = r6.i
            if (r6 != r0) goto La
            r6 = r0
            goto Lb
        La:
            r6 = r1
        Lb:
            nel.j0 r2 = r8.f214598g
            nel.v r3 = r8.f
            boolean r3 = r3.f214630b
            r4 = 0
            if (r2 == 0) goto L17
            java.util.List r5 = r2.f214580a
            goto L18
        L17:
            r5 = r4
        L18:
            boolean r5 = ue0.e.n(r5)
            if (r5 == 0) goto L24
            if (r6 != 0) goto L8e
            if (r3 == 0) goto L8e
            goto L8d
        L24:
            nel.z r8 = r8.f214597c
            boolean r8 = io3.h.j(r8)
            if (r8 == 0) goto L2f
            java.util.Set r8 = ael.c1.d
            goto L31
        L2f:
            java.util.Set r8 = ael.c1.f3603c
        L31:
            boolean r5 = r9 instanceof nel.x0
            if (r5 == 0) goto L46
            if (r10 == 0) goto L44
            nel.x0 r9 = (nel.x0) r9
            java.math.BigDecimal r9 = r9.f214636a
            boolean r9 = d9.e1.C(r9)
            if (r9 == 0) goto L42
            goto L44
        L42:
            r9 = r1
            goto L56
        L44:
            r9 = r0
            goto L56
        L46:
            boolean r5 = r9 instanceof nel.y0
            if (r5 != 0) goto L53
            if (r9 != 0) goto L4d
            goto L53
        L4d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L53:
            if (r10 != 0) goto L42
            goto L44
        L56:
            if (r7 != 0) goto L59
            goto L8e
        L59:
            if (r6 != 0) goto L8e
            if (r3 == 0) goto L8e
            cfl.b r6 = r7.getD()
            cfl.b r10 = cfl.b.ACTIVE
            if (r6 != r10) goto L8e
            cfl.d r6 = r7.getI()
            cfl.d r10 = cfl.d.BUY_SELL
            if (r6 != r10) goto L8e
            boolean r6 = r7 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.GIA
            if (r6 == 0) goto L74
            r4 = r7
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$GIA r4 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.GIA) r4
        L74:
            if (r4 != 0) goto L77
            goto L85
        L77:
            com.revolut.shared.feature.wealth.models.trading_accounts.Settings r6 = r4.f105188m
            com.revolut.shared.feature.wealth.models.trading_accounts.Settings$BuyBlockSettings r6 = r6.f105178a
            java.lang.Boolean r6 = r6.f105179a
            if (r6 == 0) goto L85
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L8e
        L85:
            boolean r6 = c(r7, r2, r8)
            if (r6 == 0) goto L8e
            if (r9 == 0) goto L8e
        L8d:
            return r0
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.c1.a(com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, nel.n, nel.z0, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker r8, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r9, nel.n r10, nel.z0 r11, boolean r12) {
        /*
            r0 = 1
            r1 = 0
            if (r8 == 0) goto La
            boolean r8 = r8.i
            if (r8 != r0) goto La
            r8 = r0
            goto Lb
        La:
            r8 = r1
        Lb:
            nel.j0 r2 = r10.f214598g
            nel.v r3 = r10.f
            boolean r3 = r3.f214631c
            nel.z r10 = r10.f214597c
            if (r2 == 0) goto L18
            java.util.List r4 = r2.f214580a
            goto L19
        L18:
            r4 = 0
        L19:
            boolean r4 = ue0.e.n(r4)
            if (r4 == 0) goto L25
            if (r8 != 0) goto La6
            if (r3 == 0) goto La6
            goto La5
        L25:
            if (r9 != 0) goto L29
            goto La6
        L29:
            boolean r4 = io3.h.i(r10)
            if (r4 != 0) goto L39
            boolean r4 = io3.h.j(r10)
            if (r4 == 0) goto L36
            goto L39
        L36:
            zhm.h0 r4 = zhm.h0.f322473a
            goto L3b
        L39:
            java.util.Set r4 = ael.c1.f3602b
        L3b:
            boolean r5 = r9 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Margin
            if (r5 == 0) goto L46
            cfl.d r5 = cfl.d.BUY_SELL
            java.util.List r5 = zhm.u.c(r5)
            goto L54
        L46:
            cfl.d r5 = cfl.d.BUY_SELL
            cfl.d r6 = cfl.d.SELL_ONLY
            cfl.d r7 = cfl.d.CLOSE_POSITION_ONLY
            cfl.d[] r5 = new cfl.d[]{r5, r6, r7}
            java.util.List r5 = zhm.v.k(r5)
        L54:
            boolean r6 = r11 instanceof nel.x0
            if (r6 == 0) goto L69
            if (r12 == 0) goto L67
            nel.x0 r11 = (nel.x0) r11
            java.math.BigDecimal r10 = r11.f214636a
            boolean r10 = d9.e1.G(r10)
            if (r10 == 0) goto L65
            goto L67
        L65:
            r10 = r1
            goto L83
        L67:
            r10 = r0
            goto L83
        L69:
            boolean r6 = r11 instanceof nel.y0
            if (r6 == 0) goto L78
            nel.y0 r11 = (nel.y0) r11
            kel.n r10 = r11.f214639a
            java.math.BigDecimal r10 = r10.f183174b
            boolean r10 = d9.e1.G(r10)
            goto L83
        L78:
            if (r11 != 0) goto La7
            if (r12 != 0) goto L65
            boolean r10 = io3.h.j(r10)
            if (r10 == 0) goto L65
            goto L67
        L83:
            if (r8 != 0) goto La6
            if (r3 == 0) goto La6
            java.util.Set r8 = ael.c1.e
            cfl.b r11 = r9.getD()
            boolean r8 = r8.contains(r11)
            if (r8 == 0) goto La6
            boolean r8 = c(r9, r2, r4)
            if (r8 == 0) goto La6
            cfl.d r8 = r9.getI()
            boolean r8 = r5.contains(r8)
            if (r8 == 0) goto La6
            if (r10 == 0) goto La6
        La5:
            return r0
        La6:
            return r1
        La7:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.c1.b(com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, nel.n, nel.z0, boolean):boolean");
    }

    public static boolean c(TradingAccount tradingAccount, nel.j0 j0Var, Set set) {
        boolean z;
        boolean zIsEmpty;
        Boolean boolValueOf = null;
        List list = j0Var != null ? j0Var.f214580a : null;
        if (tradingAccount != null && list != null) {
            List<HashSet> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                for (HashSet hashSet : list2) {
                    List<TradingProduct> listC0 = tradingAccount.c0();
                    z = true;
                    if (set.isEmpty()) {
                        zIsEmpty = true;
                    } else {
                        Set setH1 = zhm.d0.h1(hashSet);
                        for (TradingProduct tradingProduct : listC0) {
                            TradingProductCode tradingProductCode = tradingProduct.f105281b;
                            if (!(tradingProductCode instanceof TradingProductCode.Unknown)) {
                                String f105337a = tradingProductCode.getF105337a();
                                boolean zContains = set.contains(tradingProduct.f105282c);
                                if (setH1.contains(f105337a) && zContains) {
                                    setH1.remove(f105337a);
                                }
                            }
                        }
                        zIsEmpty = setH1.isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public static List d(List list, List list2) {
        List<TradingProduct> list3 = list;
        ArrayList arrayList = new ArrayList();
        for (TradingProduct tradingProduct : list3) {
            String f105337a = ((tradingProduct.f105281b instanceof TradingProductCode.Unknown) || !f3601a.contains(tradingProduct.f105282c)) ? null : tradingProduct.f105281b.getF105337a();
            if (f105337a != null) {
                arrayList.add(f105337a);
            }
        }
        HashSet hashSetB1 = zhm.d0.b1(arrayList);
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            HashSet hashSet = (HashSet) it8.next();
            if (hashSetB1.containsAll(hashSet)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    if (hashSet.contains(((TradingProduct) obj2).f105281b.getF105337a())) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
        }
        return zhm.f0.f322471a;
    }

    public final nel.w0 e(nel.n instrument, TradingAccount tradingAccount, TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard, InstrumentTicker instrumentTicker, Map featuresAvailability, nel.z0 z0Var, boolean z) throws Throwable {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(featuresAvailability, "featuresAvailability");
        nel.j0 j0Var = instrument.f214598g;
        if (j0Var != null) {
            if (j0Var.f214580a.isEmpty()) {
                j0Var = null;
            }
            if (j0Var != null) {
                List list = j0Var.f214580a;
                boolean zB = t1.b(featuresAvailability, zhm.y0.b(ybl.p.BONDS));
                if (io3.h.i(instrument.f214597c) && !zB) {
                    return new nel.r0(instrument);
                }
                if (tradingAccount == null) {
                    if (tradingAccountAvailableToOnboard != null && !z) {
                        List listD = d(tradingAccountAvailableToOnboard.f, list);
                        return listD.isEmpty() ? new nel.r0(instrument) : new nel.q0(tradingAccountAvailableToOnboard, null, listD, instrument);
                    }
                    return new nel.r0(instrument);
                }
                List<TradingProduct> listD2 = d(tradingAccount.c0(), list);
                boolean zG = false;
                if (listD2.isEmpty()) {
                    return new nel.s0(z0Var, false, b(instrumentTicker, tradingAccount, instrument, z0Var, false), tradingAccount, instrument);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (TradingProduct tradingProduct : listD2) {
                    switch (d1.f3607a[tradingProduct.f105282c.ordinal()]) {
                        case 1:
                            arrayList.add(tradingProduct);
                            break;
                        case 2:
                            arrayList3.add(tradingProduct);
                            break;
                        case 3:
                            arrayList2.add(tradingProduct);
                            break;
                        case 4:
                        case 5:
                            break;
                        case 6:
                        case 7:
                            hx7.e.n(new IllegalStateException("Unexpected productId=" + tradingProduct.f105280a + ", productCode=" + tradingProduct.f105281b.getF105337a() + ", productState=" + tradingProduct.f105282c));
                            return new nel.r0(instrument);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                if (arrayList.isEmpty()) {
                    return !arrayList2.isEmpty() ? new nel.u0(arrayList2, z0Var, a(instrumentTicker, tradingAccount, instrument, z0Var, true), b(instrumentTicker, tradingAccount, instrument, z0Var, true), tradingAccount, instrument) : !arrayList3.isEmpty() ? new nel.t0(tradingAccount, instrument, arrayList3) : new nel.s0(z0Var, a(instrumentTicker, tradingAccount, instrument, z0Var, false), b(instrumentTicker, tradingAccount, instrument, z0Var, false), tradingAccount, instrument);
                }
                if (z0Var instanceof nel.x0) {
                    zG = d9.e1.D(((nel.x0) z0Var).f214636a);
                } else if (z0Var instanceof nel.y0) {
                    zG = d9.e1.G(((nel.y0) z0Var).f214639a.f183174b);
                } else if (z0Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return zG ? new nel.u0(arrayList, z0Var, false, b(instrumentTicker, tradingAccount, instrument, z0Var, true), tradingAccount, instrument) : z ? new nel.r0(instrument) : new nel.q0(null, tradingAccount, arrayList, instrument);
            }
        }
        return new nel.r0(instrument);
    }
}
