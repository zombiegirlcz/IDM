package mle;

import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreenContract$InputData;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xzg.o0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends jki.g implements i {
    public final List A;
    public final h B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InvestSettingsScreenContract$InputData f206700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x8h.k f206701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nle.a f206702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ple.a f206703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qle.a f206704t;
    public final uih.a u;
    public final chh.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final tzg.m f206705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ybl.l f206706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final dlc.g f206707y;
    public final h2b.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(jki.p stateMapper, InvestSettingsScreenContract$InputData inputData, x8h.k availableDisplayCurrenciesInteractor, nle.a investBuyBlockItemControllerModelExtension, ple.a smartNotificationsControllerModelExtension, qle.a wealthProtectionItemControllerModelExtension, uih.a stocksSettingsControllerModelExtension, chh.b taaSettingsWidgetControllerModelExtension, tzg.m wealthAccountsInteractor, ybl.l tradingConfigInteractor, dlc.g roboSettingsWidgetProvider, h2b.d cfdSettingsWidgetExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(availableDisplayCurrenciesInteractor, "availableDisplayCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(investBuyBlockItemControllerModelExtension, "investBuyBlockItemControllerModelExtension");
        Intrinsics.checkNotNullParameter(smartNotificationsControllerModelExtension, "smartNotificationsControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthProtectionItemControllerModelExtension, "wealthProtectionItemControllerModelExtension");
        Intrinsics.checkNotNullParameter(stocksSettingsControllerModelExtension, "stocksSettingsControllerModelExtension");
        Intrinsics.checkNotNullParameter(taaSettingsWidgetControllerModelExtension, "taaSettingsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(roboSettingsWidgetProvider, "roboSettingsWidgetProvider");
        Intrinsics.checkNotNullParameter(cfdSettingsWidgetExtension, "cfdSettingsWidgetExtension");
        this.f206700p = inputData;
        this.f206701q = availableDisplayCurrenciesInteractor;
        this.f206702r = investBuyBlockItemControllerModelExtension;
        this.f206703s = smartNotificationsControllerModelExtension;
        this.f206704t = wealthProtectionItemControllerModelExtension;
        this.u = stocksSettingsControllerModelExtension;
        this.v = taaSettingsWidgetControllerModelExtension;
        this.f206705w = wealthAccountsInteractor;
        this.f206706x = tradingConfigInteractor;
        this.f206707y = roboSettingsWidgetProvider;
        this.z = cfdSettingsWidgetExtension;
        this.A = zhm.v.k(o0.ONBOARDING, o0.ACTIVE, o0.OFFBOARDING);
        this.B = new h(0);
    }

    public static final String y2(z zVar, WealthAccount wealthAccount) {
        UUID uuid;
        if (wealthAccount instanceof WealthAccount.Commodities) {
            return wealthAccount.T0().getRawValue();
        }
        if (wealthAccount instanceof WealthAccount.Margin) {
            return a0.d.r(wealthAccount.T0().getRawValue(), ((WealthAccount.Margin) wealthAccount).f95234c);
        }
        if (wealthAccount instanceof WealthAccount.Robo) {
            return a0.d.r(wealthAccount.T0().getRawValue(), ((WealthAccount.Robo) wealthAccount).f95235a);
        }
        if (!(wealthAccount instanceof WealthAccount.Securities)) {
            if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount) {
                return a0.d.r(wealthAccount.T0().getRawValue(), ((WealthAccount.TaxAdvantageWealthAccount) wealthAccount).getF95253a());
            }
            throw new NoWhenBranchMatchedException();
        }
        String rawValue = wealthAccount.T0().getRawValue();
        WealthAccount.Securities securities = (WealthAccount.Securities) wealthAccount;
        TradingAccount.Portfolio portfolio = securities.f95240c;
        return com.google.android.gms.internal.mlkit_vision_face.a.o(rawValue, (portfolio == null || (uuid = portfolio.f105210a) == null) ? null : uuid.toString(), securities.f95239b.name());
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, ybl.l.d(this.f206706x), null, null, new r(this, null, 0), 3);
        if (this.f206700p.f89896a == hke.a.ALL_SETTINGS) {
            yji.l.a1(this, rd0.e.n(this.f206701q.c(), h0.f322473a), null, null, new r(this, null, 1), 3);
        }
        yji.l.a1(this, this.f206702r.Z2(), null, null, new r(this, null, 2), 3);
        final int i = 0;
        x2(new Function1(this) { // from class: mle.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f206687b;

            {
                this.f206687b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r14) {
                /*
                    r13 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L65;
                        default: goto L5;
                    }
                L5:
                    java.util.List r14 = (java.util.List) r14
                    java.lang.String r0 = "accounts"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                    java.lang.Iterable r14 = (java.lang.Iterable) r14
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Iterator r14 = r14.iterator()
                L17:
                    boolean r1 = r14.hasNext()
                    if (r1 == 0) goto L64
                    java.lang.Object r1 = r14.next()
                    r2 = r1
                    com.revolut.feature.wealth.api.domain.model.WealthAccount r2 = (com.revolut.feature.wealth.api.domain.model.WealthAccount) r2
                    mle.z r3 = r13.f206687b
                    java.util.List r4 = r3.A
                    xzg.o0 r5 = r2.getF95255c()
                    boolean r4 = r4.contains(r5)
                    if (r4 == 0) goto L5d
                    com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreenContract$InputData r3 = r3.f206700p
                    hke.a r3 = r3.f89896a
                    int[] r4 = mle.q.f206688a
                    int r3 = r3.ordinal()
                    r3 = r4[r3]
                    r4 = 1
                    if (r3 == r4) goto L59
                    r5 = 2
                    if (r3 == r5) goto L56
                    r5 = 3
                    if (r3 == r5) goto L53
                    r5 = 4
                    if (r3 != r5) goto L4d
                    boolean r2 = r2 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                    goto L5a
                L4d:
                    kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                    r14.<init>()
                    throw r14
                L53:
                    boolean r2 = r2 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.Robo
                    goto L5a
                L56:
                    boolean r2 = r2 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities
                    goto L5a
                L59:
                    r2 = r4
                L5a:
                    if (r2 == 0) goto L5d
                    goto L5e
                L5d:
                    r4 = 0
                L5e:
                    if (r4 == 0) goto L17
                    r0.add(r1)
                    goto L17
                L64:
                    return r0
                L65:
                    r5 = r14
                    mle.h r5 = (mle.h) r5
                    java.lang.String r14 = "$this$updateState"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r14)
                    mle.z r14 = r13.f206687b
                    qle.a r14 = r14.f206704t
                    boolean r7 = r14.Z2()
                    r11 = 0
                    r12 = 61
                    r6 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    mle.h r14 = mle.h.a(r5, r6, r7, r8, r9, r10, r11, r12)
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: mle.p.invoke(java.lang.Object):java.lang.Object");
            }
        });
        yji.l.a1(this, this.f206703s.Z2(), null, null, new r(this, null, 3), 3);
        final int i2 = 1;
        yji.l.a1(this, vkm.q.Q(nim.a.v(tzg.m.c(this.f206705w, null, cfl.k.f23744a, 1), new Function1(this) { // from class: mle.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f206687b;

            {
                this.f206687b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object v) {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L65;
                        default: goto L5;
                    }
                L5:
                    java.util.List r14 = (java.util.List) r14
                    java.lang.String r0 = "accounts"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                    java.lang.Iterable r14 = (java.lang.Iterable) r14
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Iterator r14 = r14.iterator()
                L17:
                    boolean r1 = r14.hasNext()
                    if (r1 == 0) goto L64
                    java.lang.Object r1 = r14.next()
                    r2 = r1
                    com.revolut.feature.wealth.api.domain.model.WealthAccount r2 = (com.revolut.feature.wealth.api.domain.model.WealthAccount) r2
                    mle.z r3 = r13.f206687b
                    java.util.List r4 = r3.A
                    xzg.o0 r5 = r2.getF95255c()
                    boolean r4 = r4.contains(r5)
                    if (r4 == 0) goto L5d
                    com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreenContract$InputData r3 = r3.f206700p
                    hke.a r3 = r3.f89896a
                    int[] r4 = mle.q.f206688a
                    int r3 = r3.ordinal()
                    r3 = r4[r3]
                    r4 = 1
                    if (r3 == r4) goto L59
                    r5 = 2
                    if (r3 == r5) goto L56
                    r5 = 3
                    if (r3 == r5) goto L53
                    r5 = 4
                    if (r3 != r5) goto L4d
                    boolean r2 = r2 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                    goto L5a
                L4d:
                    kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                    r14.<init>()
                    throw r14
                L53:
                    boolean r2 = r2 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.Robo
                    goto L5a
                L56:
                    boolean r2 = r2 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities
                    goto L5a
                L59:
                    r2 = r4
                L5a:
                    if (r2 == 0) goto L5d
                    goto L5e
                L5d:
                    r4 = 0
                L5e:
                    if (r4 == 0) goto L17
                    r0.add(r1)
                    goto L17
                L64:
                    return r0
                L65:
                    r5 = r14
                    mle.h r5 = (mle.h) r5
                    java.lang.String r14 = "$this$updateState"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r14)
                    mle.z r14 = r13.f206687b
                    qle.a r14 = r14.f206704t
                    boolean r7 = r14.Z2()
                    r11 = 0
                    r12 = 61
                    r6 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    mle.h r14 = mle.h.a(r5, r6, r7, r8, r9, r10, r11, r12)
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: mle.p.invoke(java.lang.Object):java.lang.Object");
            }
        }), new mk0.f(continuation, this, 3)), null, null, new r(this, null, 4), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.B;
    }
}
