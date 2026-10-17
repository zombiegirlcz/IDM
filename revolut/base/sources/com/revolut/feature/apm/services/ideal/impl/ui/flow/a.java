package com.revolut.feature.apm.services.ideal.impl.ui.flow;

import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import com.revolut.feature.apm.services.ideal.impl.ui.flow.IDealFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import jch.p;
import jd2.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import q06.d;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements c {
    public final f80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f62856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f62857q;

    public a(IDealFlowDestination.InputData inputData, f80.a uriHelper, d deeplinkParser) {
        FlowStep addAccounts;
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.o = uriHelper;
        this.f62856p = deeplinkParser;
        IDealFlowDestination.StartType startType = inputData.f62830a;
        if (Intrinsics.f(startType, IDealFlowDestination.StartType.PaymentConfirmedDesktop.f62832a)) {
            flowStep = IDealFlowContract$Step.PaymentConfirmedDesktop.f62850a;
        } else {
            if (startType instanceof IDealFlowDestination.StartType.PaymentConfirmedMobile) {
                addAccounts = new IDealFlowContract$Step.PaymentConfirmedMobile(((IDealFlowDestination.StartType.PaymentConfirmedMobile) startType).f62833a);
            } else if (Intrinsics.f(startType, IDealFlowDestination.StartType.StartRegistrationFromSettings.f62835a)) {
                flowStep = IDealFlowContract$Step.StartRegistrationFromSettings.f62853a;
            } else if (startType instanceof IDealFlowDestination.StartType.StartRegistrationFromPayment) {
                addAccounts = new IDealFlowContract$Step.StartRegistrationFromPayment(((IDealFlowDestination.StartType.StartRegistrationFromPayment) startType).f62834a);
            } else if (startType instanceof IDealFlowDestination.StartType.SuccessAuth) {
                addAccounts = new IDealFlowContract$Step.SuccessAuth(((IDealFlowDestination.StartType.SuccessAuth) startType).f62836a);
            } else if (Intrinsics.f(startType, IDealFlowDestination.StartType.SuccessQrAuth.f62837a)) {
                flowStep = IDealFlowContract$Step.SuccessQrAuth.f62855a;
            } else {
                if (!(startType instanceof IDealFlowDestination.StartType.AddAccounts)) {
                    throw new NoWhenBranchMatchedException();
                }
                addAccounts = new IDealFlowContract$Step.AddAccounts(((IDealFlowDestination.StartType.AddAccounts) startType).f62831a, gd2.d.CONFIRM_PAYMENT);
            }
            flowStep = addAccounts;
        }
        this.f62857q = cp5.d.a(this, flowStep, f0.f322471a, new p(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto L6d
            q06.d r3 = r0.f62856p
            s06.c r3 = (s06.c) r3
            r3.getClass()
            java.lang.String r4 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            boolean r4 = r3.c(r1)
            if (r4 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r2
        L1b:
            if (r1 == 0) goto L6d
            jf0.c r1 = r3.d(r1)
            if (r1 == 0) goto L6d
            r3 = 1
            java.lang.String r3 = r1.e(r3)
            java.lang.String r4 = "open-banking-create-ideal-profile"
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L6d
            java.lang.String r1 = r1.f173629c
            if (r1 == 0) goto L6d
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "param"
            java.lang.String r4 = "returnUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r3 = 6
            java.lang.String r4 = "returnUrl="
            r5 = 0
            int r3 = kotlin.text.d0.T(r1, r4, r5, r5, r3)
            r4 = -1
            if (r3 != r4) goto L50
            goto L6d
        L50:
            int r3 = r3 + 10
            java.lang.String r6 = "&"
            r7 = 4
            int r5 = kotlin.text.d0.T(r1, r6, r3, r5, r7)
            java.lang.String r6 = "substring(...)"
            if (r5 != r4) goto L65
            java.lang.String r1 = r1.substring(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            goto L6e
        L65:
            java.lang.String r1 = r1.substring(r3, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            goto L6e
        L6d:
            r1 = r2
        L6e:
            if (r1 == 0) goto La4
            com.revolut.retail.core.navigation.FinishCommand r3 = new com.revolut.retail.core.navigation.FinishCommand
            r4 = 7
            r3.<init>(r2, r2, r2, r4)
            com.revolut.retail.core.navigation.ActivityNavigateCommand r5 = new com.revolut.retail.core.navigation.ActivityNavigateCommand
            com.revolut.retail.core.navigation.ImplicitActivityDestination r6 = new com.revolut.retail.core.navigation.ImplicitActivityDestination
            f80.a r2 = r0.o
            f80.b r2 = (f80.b) r2
            android.net.Uri r11 = r2.f(r1)
            r12 = 14
            java.lang.String r7 = "android.intent.action.VIEW"
            r8 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r15 = 0
            r16 = 1022(0x3fe, float:1.432E-42)
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.revolut.retail.core.navigation.CompositeCommand r1 = com.revolut.retail.core.navigation.a.c(r3, r5)
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = zh9.u0.b(r1)
            r0.C1(r1)
            return
        La4:
            yki.a r1 = r0.f62857q
            oki.h.D2(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.services.ideal.impl.ui.flow.a.I2(java.lang.String):void");
    }

    @Override // yki.g
    public final b s() {
        return this.f62857q;
    }
}
