package jyk;

import android.os.Parcelable;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sdl.b1;
import sdl.c1;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements oxk.f {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f179499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nxk.a f179500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ba8.f f179501c;
    public final ybl.k d;
    public final sri.m e;
    public final d1l.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c1l.e f179502g;

    public r(xoj.a featuresInteractor, nxk.a productCommsCommandProvider, ba8.f juniorIsaNaviProvider, ybl.k tradingAccountsInteractor, sri.m navigator, d1l.g tradingOnboardingResolutionProvider, c1l.e tradingOnboardingStartCommandProvider, b1 tradingProductCodeMapper) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(productCommsCommandProvider, "productCommsCommandProvider");
        Intrinsics.checkNotNullParameter(juniorIsaNaviProvider, "juniorIsaNaviProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tradingOnboardingResolutionProvider, "tradingOnboardingResolutionProvider");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(tradingProductCodeMapper, "tradingProductCodeMapper");
        this.f179499a = featuresInteractor;
        this.f179500b = productCommsCommandProvider;
        this.f179501c = juniorIsaNaviProvider;
        this.d = tradingAccountsInteractor;
        this.e = navigator;
        this.f = tradingOnboardingResolutionProvider;
        this.f179502g = tradingOnboardingStartCommandProvider;
    }

    public static FeatureCommand b() {
        return jbb.a.a(ibb.c.f160141b, null, null, null, 14);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "onboarding");
    }

    public final ufm.i c() {
        sfm.b bVarG = pd.b.n(p0.f264003c, new ji1.m(this, null, 20)).g(rd0.e.c(ybl.k.k(this.d, w4l.h.f294642c, null, null, 6), kotlin.coroutines.g.f186406a));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        efm.d0 d0VarFirstOrError = m70.a.g(bVarG, null, new jul.c(11), 1).firstOrError();
        jy2.a aVar = new jy2.a(new jxb.g(28), 10);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.b d(d1l.c cVar) {
        FeatureCommand featureCommandB = b();
        TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType = cVar.f110663a;
        k9 value = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f179502g.b(featureCommandB, new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(featureCommandB, tradingAccountOrType, null, new EndPromptParams(true, cVar.f110664b), new AnalyticsProduct.Retail(value)), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof jyk.o
            if (r0 == 0) goto L13
            r0 = r9
            jyk.o r0 = (jyk.o) r0
            int r1 = r0.f179495x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179495x = r1
            goto L1a
        L13:
            jyk.o r0 = new jyk.o
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179495x
            r3 = 2
            r4 = 1
            r5 = 3
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 == r3) goto L37
            if (r2 != r5) goto L2f
            yhm.o.b(r9)
            return r9
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            return r9
        L3b:
            jf0.c r8 = r0.u
            yhm.o.b(r9)
            goto L5b
        L41:
            yhm.o.b(r9)
            yoj.c r9 = yoj.c.WEALTH_TRADING
            yoj.d r2 = yoj.d.DISABLED
            xoj.a r6 = r7.f179499a
            cpj.b r6 = (cpj.b) r6
            ufm.i r9 = r6.f(r9, r2)
            r0.u = r8
            r0.f179495x = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L5b
            goto L99
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r2 = 0
            if (r9 != 0) goto L65
            goto La6
        L65:
            java.lang.String r9 = r8.e(r5)
            java.lang.String r4 = "TAX_ADVANTAGED:YOUTH_TAX_ADVANTAGED"
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r9, r4)
            if (r4 == 0) goto L7d
            r0.u = r2
            r0.f179495x = r3
            java.lang.Object r8 = r7.h(r8, r0)
            if (r8 != r1) goto L7c
            goto L99
        L7c:
            return r8
        L7d:
            int r3 = r9.length()
            if (r3 <= 0) goto La6
            jyk.n r8 = r7.g(r8)
            boolean r3 = r8 instanceof jyk.m
            if (r3 == 0) goto L9b
            jyk.m r8 = (jyk.m) r8
            java.util.List r8 = r8.f179493a
            r0.u = r2
            r0.f179495x = r5
            java.lang.Object r8 = r7.i(r0, r9, r8)
            if (r8 != r1) goto L9a
        L99:
            return r1
        L9a:
            return r8
        L9b:
            boolean r8 = r8 instanceof jyk.l
            if (r8 == 0) goto La0
            goto La6
        La0:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jyk.r.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.p pVarT = new ufm.i(((cpj.b) this.f179499a).f(yoj.c.WEALTH_TRADING, yoj.d.DISABLED), new jy2.a(new j(deeplink, this, z), 14), 0).t(CapturePresenter.MANUAL_FALLBACK_DELAY_MS, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
        return ue0.e.F(pVarT, Boolean.TRUE);
    }

    public final n g(jf0.c cVar) {
        String str = (String) cVar.d.get("productCodes");
        if (str == null) {
            return new m(null);
        }
        List listN0 = kotlin.text.d0.n0(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(zhm.w.t(listN0, 10));
        Iterator it8 = listN0.iterator();
        while (it8.hasNext()) {
            String code = kotlin.text.d0.F0((String) it8.next()).toString();
            Intrinsics.checkNotNullParameter(code, "code");
            arrayList.add(c1.a(code));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof TradingProductCode.Unknown) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return new m(arrayList);
        }
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "TradingAccountOnboardingDeeplinkActionPerformerImpl", "Trading onboarding deeplink received with invalid productCodes=" + arrayList2 + ", allCodes=" + str, null, h0Var);
        return new l(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(jf0.c r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof jyk.p
            if (r0 == 0) goto L13
            r0 = r9
            jyk.p r0 = (jyk.p) r0
            int r1 = r0.f179497x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179497x = r1
            goto L18
        L13:
            jyk.p r0 = new jyk.p
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179497x
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r9)     // Catch: java.lang.Exception -> La4
            goto L88
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)     // Catch: java.lang.Exception -> La4
            goto L74
        L3a:
            jf0.c r8 = r0.u
            yhm.o.b(r9)
            goto L52
        L40:
            yhm.o.b(r9)
            ufm.i r9 = r7.c()
            r0.u = r8
            r0.f179497x = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L52
            goto L87
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5b
            goto La4
        L5b:
            java.util.HashMap r8 = r8.d     // Catch: java.lang.Exception -> La4
            java.lang.String r9 = "beneficiaryId"
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Exception -> La4
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> La4
            ba8.f r9 = r7.f179501c
            if (r8 != 0) goto L77
            r0.u = r6     // Catch: java.lang.Exception -> La4
            r0.f179497x = r5     // Catch: java.lang.Exception -> La4
            java.lang.Object r9 = r9.b(r0)     // Catch: java.lang.Exception -> La4
            if (r9 != r1) goto L74
            goto L87
        L74:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9     // Catch: java.lang.Exception -> La4
            goto L8a
        L77:
            com.revolut.retail.core.navigation.FeatureCommand r2 = b()     // Catch: java.lang.Exception -> La4
            com.revolut.retail.core.navigation.DummyCommand r4 = com.revolut.retail.core.navigation.DummyCommand.f98635a     // Catch: java.lang.Exception -> La4
            r0.u = r6     // Catch: java.lang.Exception -> La4
            r0.f179497x = r3     // Catch: java.lang.Exception -> La4
            java.lang.Object r9 = r9.c(r8, r2, r4, r0)     // Catch: java.lang.Exception -> La4
            if (r9 != r1) goto L88
        L87:
            return r1
        L88:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9     // Catch: java.lang.Exception -> La4
        L8a:
            nxk.a r8 = r7.f179500b     // Catch: java.lang.Exception -> La4
            wxk.g r8 = (wxk.g) r8     // Catch: java.lang.Exception -> La4
            com.revolut.retail.core.navigation.FeatureCommand r8 = r8.b(r9)     // Catch: java.lang.Exception -> La4
            q06.h r9 = new q06.h     // Catch: java.lang.Exception -> La4
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination     // Catch: java.lang.Exception -> La4
            r0.<init>(r8)     // Catch: java.lang.Exception -> La4
            q06.b r8 = new q06.b     // Catch: java.lang.Exception -> La4
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160141b     // Catch: java.lang.Exception -> La4
            r8.<init>(r1, r6)     // Catch: java.lang.Exception -> La4
            r9.<init>(r0, r8)     // Catch: java.lang.Exception -> La4
            return r9
        La4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jyk.r.h(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r7, java.lang.String r8, java.util.List r9) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof jyk.q
            if (r0 == 0) goto L13
            r0 = r7
            jyk.q r0 = (jyk.q) r0
            int r1 = r0.f179498w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179498w = r1
            goto L18
        L13:
            jyk.q r0 = new jyk.q
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179498w
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L6b
            goto L54
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L6b
            goto L45
        L37:
            yhm.o.b(r7)
            d1l.g r7 = r6.f     // Catch: java.lang.Exception -> L6b
            r0.f179498w = r3     // Catch: java.lang.Exception -> L6b
            java.lang.Object r7 = r7.b(r0, r8, r9)     // Catch: java.lang.Exception -> L6b
            if (r7 != r1) goto L45
            goto L53
        L45:
            d1l.c r7 = (d1l.c) r7     // Catch: java.lang.Exception -> L6b
            ufm.b r7 = r6.d(r7)     // Catch: java.lang.Exception -> L6b
            r0.f179498w = r4     // Catch: java.lang.Exception -> L6b
            java.lang.Object r7 = nim.a.b(r7, r0)     // Catch: java.lang.Exception -> L6b
            if (r7 != r1) goto L54
        L53:
            return r1
        L54:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7     // Catch: java.lang.Exception -> L6b
            q06.h r8 = new q06.h     // Catch: java.lang.Exception -> L6b
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = new com.revolut.kompot.bridge.navigation.BridgeDestination     // Catch: java.lang.Exception -> L6b
            kotlin.jvm.internal.Intrinsics.h(r7)     // Catch: java.lang.Exception -> L6b
            r9.<init>(r7)     // Catch: java.lang.Exception -> L6b
            q06.b r7 = new q06.b     // Catch: java.lang.Exception -> L6b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f160141b     // Catch: java.lang.Exception -> L6b
            r7.<init>(r0, r5)     // Catch: java.lang.Exception -> L6b
            r8.<init>(r9, r7)     // Catch: java.lang.Exception -> L6b
            return r8
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jyk.r.i(gim.c, java.lang.String, java.util.List):java.lang.Object");
    }
}
