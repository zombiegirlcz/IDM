package wf6;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.onboarding.api.workflow.WorkflowFeatureConfig;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements ke6.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f296993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.a f296994b;

    public j0(sri.m navigator, oe6.a externalInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.f296993a = navigator;
        this.f296994b = externalInstitutionsInteractor;
    }

    public static CompositeCommand b(String str, jf0.c cVar) {
        FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
        String str2 = cVar.f173627a;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = k9.KYC;
        companion.getClass();
        return com.revolut.retail.core.navigation.a.c(featureCommand, new FeatureCommand(new WorkflowFeatureConfig(new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, str2, AnalyticsProduct.Companion.b(k9Var), (WorkflowConfiguration.Extras) null, 102), true)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "penny-institution-auth");
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
            boolean r0 = r7 instanceof wf6.i0
            if (r0 == 0) goto L13
            r0 = r7
            wf6.i0 r0 = (wf6.i0) r0
            int r1 = r0.f296990w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296990w = r1
            goto L1a
        L13:
            wf6.i0 r0 = new wf6.i0
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296990w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L70
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            oe6.a r7 = r5.f296994b
            xg6.j r7 = (xg6.j) r7
            r71.a r7 = r7.f305582a
            w21.o r7 = (w21.o) r7
            w21.c r2 = new w21.c
            r4 = 1
            r2.<init>(r7, r4)
            ufm.c r7 = new ufm.c
            r4 = 2
            r7.<init>(r2, r4)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            ufm.n r7 = te0.w.i0(r7)
            hta.a r2 = new hta.a
            r2.<init>(r5, r6, r4)
            wf6.o r6 = new wf6.o
            r4 = 4
            r6.<init>(r4, r2)
            ufm.i r2 = new ufm.i
            r4 = 1
            r2.<init>(r7, r6, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            r0.f296990w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L70
            return r1
        L70:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r6.<init>(r7)
            q06.h r7 = new q06.h
            r0 = 0
            r7.<init>(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wf6.j0.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new w21.c((w21.o) ((xg6.j) this.f296994b).f305582a, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        pfm.z zVarD = new pfm.a(te0.w.i0(cVar), new o(3, new w38.v(this, deeplink, 28)), 4).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
