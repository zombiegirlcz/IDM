package jwg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kwg.l;
import org.jetbrains.annotations.NotNull;
import tyg.j;
import tzg.m;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @NotNull
    public static final b Companion = new b();
    public static final List f = v.k(yoj.c.WEALTH_TRADING, yoj.c.ROBO, yoj.c.COMMODITIES);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f179005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f179006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f179007c;
    public final m d;
    public final j e;

    public h(l complexAnalyticsInteractor, xoj.a featuresInteractor, gte.a featureToggleInteractor, m wealthAccountsInteractor, j configInteractor) {
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f179005a = complexAnalyticsInteractor;
        this.f179006b = featuresInteractor;
        this.f179007c = featureToggleInteractor;
        this.d = wealthAccountsInteractor;
        this.e = configInteractor;
    }

    public static boolean a(mwg.b bVar) {
        int i;
        if (bVar.i) {
            List listK = v.k(Boolean.valueOf(bVar.f209440g), Boolean.valueOf(bVar.f), Boolean.valueOf(bVar.f209437a), Boolean.valueOf(bVar.f209438b), Boolean.valueOf(bVar.f209441h));
            if ((listK instanceof Collection) && listK.isEmpty()) {
                i = 0;
            } else {
                Iterator it8 = listK.iterator();
                i = 0;
                while (it8.hasNext()) {
                    if (((Boolean) it8.next()).booleanValue() && (i = i + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
            if (i >= 2) {
                return true;
            }
        }
        return false;
    }

    public static WidgetisedAnalyticsType e(WealthAccount wealthAccount, mwg.b bVar) {
        TradingAccount.Portfolio portfolio;
        UUID uuid;
        WealthAccount.TaxAdvantageWealthAccount.JIsa jIsa;
        TradingAccount.Portfolio d;
        UUID uuid2;
        TradingAccount.Portfolio portfolio2;
        UUID uuid3;
        TradingAccount.Portfolio portfolio3;
        UUID uuid4;
        Object next;
        String str;
        if (wealthAccount instanceof WealthAccount.Commodities) {
            if (bVar.f && wealthAccount.b5()) {
                return WidgetisedAnalyticsType.Commodities.f95146a;
            }
        } else if (wealthAccount instanceof WealthAccount.Margin) {
            if (bVar.f209441h && wealthAccount.b5() && (str = ((WealthAccount.Margin) wealthAccount).f95234c) != null) {
                return new WidgetisedAnalyticsType.Cfd(str);
            }
        } else if (wealthAccount instanceof WealthAccount.Robo) {
            if (bVar.f209440g && wealthAccount.Q2() && wealthAccount.b5()) {
                Iterator it8 = ((WealthAccount.Robo) wealthAccount).f95237c.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        TradingAccount.Portfolio portfolio4 = (TradingAccount.Portfolio) next;
                        Intrinsics.checkNotNullParameter(portfolio4, "<this>");
                        switch (com.revolut.shared.feature.wealth.models.trading_accounts.c.f105338a[portfolio4.f105211b.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                break;
                            case 4:
                            case 5:
                            case 6:
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        next = null;
                    }
                }
                TradingAccount.Portfolio portfolio5 = (TradingAccount.Portfolio) next;
                if (portfolio5 != null) {
                    String string = portfolio5.f105210a.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    return new WidgetisedAnalyticsType.Robo(string);
                }
            }
        } else if (wealthAccount instanceof WealthAccount.Securities) {
            if (bVar.f209437a && (portfolio3 = ((WealthAccount.Securities) wealthAccount).f95240c) != null && (uuid4 = portfolio3.f105210a) != null) {
                if (wealthAccount.d9()) {
                    String string2 = uuid4.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    return new WidgetisedAnalyticsType.JointBrokerage(string2);
                }
                String string3 = uuid4.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                return new WidgetisedAnalyticsType.Brokerage(string3);
            }
        } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
            if (bVar.f209438b && wealthAccount.b5() && (portfolio2 = ((WealthAccount.TaxAdvantageWealthAccount.Isa) wealthAccount).d) != null && (uuid3 = portfolio2.f105210a) != null) {
                String string4 = uuid3.toString();
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                return new WidgetisedAnalyticsType.Isa(string4);
            }
        } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) {
            if (bVar.f209439c && wealthAccount.b5() && (d = (jIsa = (WealthAccount.TaxAdvantageWealthAccount.JIsa) wealthAccount).getD()) != null && (uuid2 = d.f105210a) != null) {
                String string5 = uuid2.toString();
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                String str2 = jIsa.getF().f105176b;
                String string6 = jIsa.getF().f105175a.toString();
                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                return new WidgetisedAnalyticsType.Jisa(string5, str2, string6, wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Personal);
            }
        } else {
            if (!(wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea)) {
                throw new NoWhenBranchMatchedException();
            }
            if (bVar.d && wealthAccount.b5() && (portfolio = ((WealthAccount.TaxAdvantageWealthAccount.Pea) wealthAccount).d) != null && (uuid = portfolio.f105210a) != null) {
                String string7 = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                return new WidgetisedAnalyticsType.Pea(string7);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof jwg.d
            if (r0 == 0) goto L13
            r0 = r7
            jwg.d r0 = (jwg.d) r0
            int r1 = r0.f179000w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179000w = r1
            goto L18
        L13:
            jwg.d r0 = new jwg.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179000w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            xoj.a r7 = r6.f179006b
            cpj.b r7 = (cpj.b) r7
            efm.d0 r7 = r7.h()
            jt2.d r2 = new jt2.d
            r4 = 27
            r2.<init>(r4)
            ju0.f r4 = new ju0.f
            r5 = 10
            r4.<init>(r5, r2)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f179000w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jwg.h.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(mwg.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jwg.e
            if (r0 == 0) goto L13
            r0 = r6
            jwg.e r0 = (jwg.e) r0
            int r1 = r0.f179002x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179002x = r1
            goto L18
        L13:
            jwg.e r0 = new jwg.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179002x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mwg.b r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f179002x = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L57
            boolean r5 = r5.e
            if (r5 == 0) goto L4e
            com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType$Crypto r0 = com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType.Crypto.f95147a
        L4e:
            java.util.List r5 = zhm.v.l(r0)
            go.g r5 = zi0.c.i(r5)
            return r5
        L57:
            tzg.m r6 = r4.d
            cfl.k r1 = cfl.k.f23744a
            akg.n r6 = tzg.m.c(r6, r0, r1, r3)
            jp3.b r0 = new jp3.b
            r1 = 24
            r0.<init>(r4, r5, r1)
            akg.n r5 = nim.a.v(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jwg.h.c(mwg.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(mwg.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jwg.f
            if (r0 == 0) goto L13
            r0 = r6
            jwg.f r0 = (jwg.f) r0
            int r1 = r0.f179003w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179003w = r1
            goto L18
        L13:
            jwg.f r0 = new jwg.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179003w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f179003w = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            jud.d r5 = new jud.d
            r0 = 11
            r5.<init>(r4, r0)
            kotlinx.coroutines.flow.Flow r5 = boh.f.e(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jwg.h.d(mwg.b, gim.c):java.lang.Object");
    }
}
