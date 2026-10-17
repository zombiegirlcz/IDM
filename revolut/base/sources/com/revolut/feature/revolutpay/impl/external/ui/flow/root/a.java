package com.revolut.feature.revolutpay.impl.external.ui.flow.root;

import a01.e;
import a8c.d;
import a8c.k;
import a8c.l;
import a8c.m;
import a8c.n;
import android.os.Parcelable;
import cn0.g;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.revolutpay.api.shared.deeplink.RevolutPayOrderParameters;
import com.revolut.feature.revolutpay.impl.external.ui.flow.root.RevolutPayRootFlowContract$Step;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import ibb.c;
import iki.b;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q7c.x;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b implements d {

    @NotNull
    private static final l Companion = new l();
    public final a8c.b A;
    public final RevolutPayRootFlowContract$InputData B;
    public final j6c.b C;
    public final zm0.b D;
    public final x E;
    public final q06.d F;
    public final xcc.b G;
    public final com.revolut.feature.revolutpay.impl.external.d H;
    public final gte.a I;
    public final RevolutPayRootFlowContract$Step.Entry J;
    public final RevolutPayRootFlowContract$State K;
    public final k z;

    public a(k entryPoint, a8c.b resultDispatcher, RevolutPayRootFlowContract$InputData inputData, j6c.b revolutPayOrderSummaryProvider, zm0.b sessionController, x verificationInteractor, q06.d deeplinkParser, xcc.b orderParametersParser, com.revolut.feature.revolutpay.impl.external.d webPaymentParametersParser, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(resultDispatcher, "resultDispatcher");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutPayOrderSummaryProvider, "revolutPayOrderSummaryProvider");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(verificationInteractor, "verificationInteractor");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(orderParametersParser, "orderParametersParser");
        Intrinsics.checkNotNullParameter(webPaymentParametersParser, "webPaymentParametersParser");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.z = entryPoint;
        this.A = resultDispatcher;
        this.B = inputData;
        this.C = revolutPayOrderSummaryProvider;
        this.D = sessionController;
        this.E = verificationInteractor;
        this.F = deeplinkParser;
        this.G = orderParametersParser;
        this.H = webPaymentParametersParser;
        this.I = featureToggleInteractor;
        this.J = RevolutPayRootFlowContract$Step.Entry.f84470a;
        this.K = new RevolutPayRootFlowContract$State(false, null);
    }

    @Override // iki.b, yji.l
    public final void I1() {
        super.I1();
        if (((RevolutPayRootFlowContract$State) A2().f98429a).f84468a) {
            return;
        }
        l2(new e(this, null, 13), new yi5.b(26));
    }

    public final void R2(m mVar, x7c.a aVar) {
        int i = n.f2171b[aVar.ordinal()];
        a8c.b bVar = this.A;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.a(a8c.e.f2160a);
            return;
        }
        RevolutPayRootFlowContract$State revolutPayRootFlowContract$State = (RevolutPayRootFlowContract$State) A2().f98429a;
        String str = mVar.f2169c;
        boolean z = revolutPayRootFlowContract$State.f84468a;
        revolutPayRootFlowContract$State.getClass();
        L2(new RevolutPayRootFlowContract$State(z, str));
        g gVar = (g) this.D;
        if (gVar.d() instanceof mm0.m) {
            C1(new ExternalDestination.ExplicitActivity(KompotLauncherActivity.class, q0.c(new Pair("CONFIGURATION_ARG", new KompotFlowContract$Configuration.Standalone(new MainContainerScreenDestination.JustShow(c.f160140a.f83420a, (SliderLayout.SlidingSpec) null, (Parcelable) null, 14), true, false))), 24));
            bVar.a(new a8c.g(mVar.f2169c));
            return;
        }
        gVar.i();
        RevolutPayRootFlowContract$State revolutPayRootFlowContract$State2 = (RevolutPayRootFlowContract$State) A2().f98429a;
        String str2 = revolutPayRootFlowContract$State2.f84469b;
        revolutPayRootFlowContract$State2.getClass();
        L2(new RevolutPayRootFlowContract$State(true, str2));
        C1(mVar.f2167a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S2(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a8c.o
            if (r0 == 0) goto L14
            r0 = r9
            a8c.o r0 = (a8c.o) r0
            int r1 = r0.f2173x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f2173x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a8c.o r0 = new a8c.o
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f2173x
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            a8c.m r0 = r6.u
            yhm.o.b(r9)
            goto L6d
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            yhm.o.b(r9)
            com.revolut.feature.revolutpay.impl.external.ui.flow.root.RevolutPayRootFlowContract$InputData r9 = r8.B
            android.content.Intent r1 = r9.f84465a
            android.net.Uri r1 = r1.getData()
            if (r1 == 0) goto L45
            java.lang.String r1 = r1.toString()
            goto L46
        L45:
            r1 = 0
        L46:
            a8c.m r7 = r8.U2(r1)
            if (r7 != 0) goto L56
            a8c.b r9 = r8.A
            a8c.f r0 = a8c.f.f2161a
            r9.a(r0)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L56:
            r1 = r2
            java.lang.String r2 = r7.f2168b
            java.lang.String r3 = r9.f84466b
            java.lang.String r4 = r9.f84467c
            java.lang.String r5 = r9.d
            r6.u = r7
            r6.f2173x = r1
            q7c.x r1 = r8.E
            java.lang.Enum r9 = r1.b(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L6c
            return r0
        L6c:
            r0 = r7
        L6d:
            x7c.a r9 = (x7c.a) r9
            r8.R2(r0, r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolutpay.impl.external.ui.flow.root.a.S2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a8c.p
            if (r0 == 0) goto L13
            r0 = r6
            a8c.p r0 = (a8c.p) r0
            int r1 = r0.f2176y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2176y = r1
            goto L18
        L13:
            a8c.p r0 = new a8c.p
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2174w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f2176y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            a8c.m r1 = r0.v
            com.revolut.feature.revolutpay.impl.external.ui.flow.root.a r0 = r0.u
            yhm.o.b(r6)
            goto L78
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles$WebPayments r6 = com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles.WebPayments.f84299c
            gte.a r2 = r5.I
            jte.d r2 = (jte.d) r2
            boolean r6 = r2.c(r6)
            a8c.b r2 = r5.A
            if (r6 != 0) goto L4c
            a8c.e r6 = a8c.e.f2160a
            r2.a(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L4c:
            com.revolut.feature.revolutpay.impl.external.ui.flow.root.RevolutPayRootFlowContract$InputData r6 = r5.B
            android.content.Intent r6 = r6.f84465a
            android.os.Bundle r6 = r6.getExtras()
            com.revolut.feature.revolutpay.impl.external.d r4 = r5.H
            java.lang.String r6 = r4.a(r6)
            a8c.m r6 = r5.U2(r6)
            if (r6 != 0) goto L68
            a8c.f r6 = a8c.f.f2161a
            r2.a(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L68:
            r0.u = r5
            r0.v = r6
            r0.f2176y = r3
            java.lang.Enum r0 = r5.W2(r0)
            if (r0 != r1) goto L75
            return r1
        L75:
            r1 = r6
            r6 = r0
            r0 = r5
        L78:
            x7c.a r6 = (x7c.a) r6
            r0.R2(r1, r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolutpay.impl.external.ui.flow.root.a.T2(gim.c):java.lang.Object");
    }

    public final m U2(String str) {
        f6c.a aVar;
        try {
            q06.d dVar = this.F;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            jf0.c cVarD = ((s06.c) dVar).d(str);
            if (cVarD == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            RevolutPayOrderParameters revolutPayOrderParametersA = this.G.a(cVarD.d);
            if (revolutPayOrderParametersA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            j6c.b bVar = this.C;
            int i = n.f2170a[this.z.ordinal()];
            if (i == 1) {
                aVar = f6c.a.SDK_EXPORTED;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = f6c.a.WEB_PAYMENT;
            }
            return new m(((b7c.c) bVar).b(cVarD, aVar), revolutPayOrderParametersA.f84316a, revolutPayOrderParametersA.f84317b);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, e, h0Var);
            return null;
        }
    }

    public final String V2() {
        String str;
        RevolutPayRootFlowContract$InputData revolutPayRootFlowContract$InputData = this.B;
        String str2 = revolutPayRootFlowContract$InputData.f84466b;
        String str3 = revolutPayRootFlowContract$InputData.f84467c;
        if (str2 == null) {
            str = "CALLING_ACTIVITY_NULL";
        } else if (str3 == null) {
            str = "CALLING_PACKAGE_NULL";
        } else {
            if (str2.equals(str3)) {
                return str2;
            }
            str = "PACKAGE_MISMATCH";
        }
        Pair pair = new Pair("revpay_verify_reason", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pair2 = new Pair("revpay_verify_calling_activity_pkg", str2);
        if (str3 == null) {
            str3 = "null";
        }
        Pair pair3 = new Pair("revpay_verify_calling_pkg", str3);
        String str4 = revolutPayRootFlowContract$InputData.d;
        Pair[] elements = {pair, pair2, pair3, new Pair("revpay_verify_launched_from_pkg", str4 != null ? str4 : "null")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "RevolutPayVerification", "Revolut Pay Web Payment Activity caller verification failed", null, setY0);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum W2(gim.c r10) {
        /*
            r9 = this;
            com.revolut.feature.revolutpay.impl.external.d r0 = r9.H
            boolean r1 = r10 instanceof a8c.q
            if (r1 == 0) goto L16
            r1 = r10
            a8c.q r1 = (a8c.q) r1
            int r2 = r1.f2177w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f2177w = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            a8c.q r1 = new a8c.q
            r1.<init>(r9, r10)
            goto L14
        L1c:
            java.lang.Object r10 = r8.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.f2177w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            goto L89
        L2b:
            r0 = move-exception
            r10 = r0
            goto La5
        L2f:
            r0 = move-exception
            r10 = r0
            goto Lb2
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3b:
            yhm.o.b(r10)
            com.revolut.feature.revolutpay.impl.external.ui.flow.root.RevolutPayRootFlowContract$InputData r10 = r9.B     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            android.content.Intent r10 = r10.f84465a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            android.os.Bundle r10 = r10.getExtras()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            java.lang.String r2 = "Required value was null."
            if (r10 == 0) goto L9e
            java.lang.String r4 = r9.V2()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            if (r4 != 0) goto L53
            x7c.a r10 = x7c.a.UNVERIFIED     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            return r10
        L53:
            r5 = r2
            q7c.x r2 = r9.E     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            java.lang.String r6 = "methodName"
            r0.getClass()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            java.lang.String r0 = com.revolut.feature.revolutpay.impl.external.d.b(r10, r6)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            if (r0 == 0) goto L98
            java.lang.String r6 = "paymentRequestOrigin"
            java.lang.String r6 = com.revolut.feature.revolutpay.impl.external.d.b(r10, r6)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            if (r6 == 0) goto L92
            java.lang.String r7 = "topLevelOrigin"
            java.lang.String r7 = com.revolut.feature.revolutpay.impl.external.d.b(r10, r7)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            if (r7 == 0) goto L8c
            java.lang.String r5 = "packageName"
            java.lang.String r10 = com.revolut.feature.revolutpay.impl.external.d.b(r10, r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            java.util.Set r4 = zhm.y0.b(r4)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            r8.f2177w = r3     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            r3 = r0
            r5 = r7
            r7 = r4
            r4 = r6
            r6 = r10
            java.lang.Enum r10 = r2.e(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            if (r10 != r1) goto L89
            return r1
        L89:
            x7c.a r10 = (x7c.a) r10     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            return r10
        L8c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            r10.<init>(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            throw r10     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
        L92:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            r10.<init>(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            throw r10     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
        L98:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            r10.<init>(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            throw r10     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
        L9e:
            r5 = r2
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            r10.<init>(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
            throw r10     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2f
        La5:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.WARNING
            r2 = 0
            rd0.d.a(r1, r2, r2, r10, r0)
            x7c.a r10 = x7c.a.UNVERIFIED
            return r10
        Lb2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolutpay.impl.external.ui.flow.root.a.W2(gim.c):java.lang.Enum");
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        RevolutPayRootFlowContract$Step step = (RevolutPayRootFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof RevolutPayRootFlowContract$Step.Entry) {
            return new LayoutViewerScreen(R$layout.screen_transparent);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.K;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.J;
    }
}
