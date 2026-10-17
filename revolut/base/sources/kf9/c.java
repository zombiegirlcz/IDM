package kf9;

import com.revolut.feature.apm.bills.bpay.api.navigation.BPayDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesDestination;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements df9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f183334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo1.c f183335b;

    public c(m navigator, vo1.c billsFeatureChecker) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        this.f183334a = navigator;
        this.f183335b = billsFeatureChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(kf9.c r5, jf0.c r6, boolean r7, gim.c r8) {
        /*
            vo1.c r0 = r5.f183335b
            boolean r1 = r8 instanceof kf9.a
            if (r1 == 0) goto L15
            r1 = r8
            kf9.a r1 = (kf9.a) r1
            int r2 = r1.f183331y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f183331y = r2
            goto L1a
        L15:
            kf9.a r1 = new kf9.a
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r5 = r1.f183329w
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f183331y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r7 = r1.v
            jf0.c r6 = r1.u
            yhm.o.b(r5)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r5)
            r5 = r0
            fp1.d r5 = (fp1.d) r5
            efm.d0 r5 = r5.b()
            r1.u = r6
            r1.v = r7
            r1.f183331y = r3
            java.lang.Object r5 = nim.a.b(r5, r1)
            if (r5 != r8) goto L4c
            return r8
        L4c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L59
            com.revolut.retail.core.navigation.FeatureCommand r5 = d(r6)
            return r5
        L59:
            fp1.d r0 = (fp1.d) r0
            cf9.a r5 = cf9.a.f23652c
            boolean r5 = r0.c(r5)
            if (r5 == 0) goto L68
            com.revolut.retail.core.navigation.NaviCommand r5 = c(r7)
            return r5
        L68:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "PayBillsAndTaxes deeplink while FT is disabled"
            r5.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            r8 = 0
            rd0.d.a(r7, r8, r8, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kf9.c.b(kf9.c, jf0.c, boolean, gim.c):java.lang.Object");
    }

    public static NaviCommand c(boolean z) {
        FeatureCommand featureCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new BPayDestination((PaymentCounterpartyInfo) null, 3), false, (Integer) null, 0, 61));
        return z ? com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 6))), featureCommand) : featureCommand;
    }

    public static FeatureCommand d(jf0.c cVar) {
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PayBillsAndTaxesDestination(new PayBillsAndTaxesNavigation$InputData(m70.a.l(cVar.e(2)), 2)), false, (Integer) null, 0, 61));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return u.c("pay-bills-taxes").contains(deeplink.e(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kf9.b
            if (r0 == 0) goto L13
            r0 = r7
            kf9.b r0 = (kf9.b) r0
            int r1 = r0.f183333x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f183333x = r1
            goto L1a
        L13:
            kf9.b r0 = new kf9.b
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f183333x
            vo1.c r3 = r5.f183335b
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            jf0.c r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r7)
            r7 = r3
            fp1.d r7 = (fp1.d) r7
            efm.d0 r7 = r7.b()
            r0.u = r6
            r0.f183333x = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = 0
            if (r7 == 0) goto L62
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r6 = d(r6)
            r1.<init>(r6)
            r7.<init>(r1, r0)
            return r7
        L62:
            fp1.d r3 = (fp1.d) r3
            cf9.a r6 = cf9.a.f23652c
            boolean r6 = r3.c(r6)
            if (r6 == 0) goto L83
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1 = 0
            com.revolut.retail.core.navigation.NaviCommand r1 = c(r1)
            r7.<init>(r1)
            q06.b r1 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.f160142c
            r1.<init>(r2, r0)
            r6.<init>(r7, r1)
            return r6
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf9.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new ald.m(this, deeplink, z, (Continuation) null, 26));
    }
}
