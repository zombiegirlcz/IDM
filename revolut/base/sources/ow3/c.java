package ow3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements dq3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f230296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f230297b;

    public c(gte.a featureToggleInteractor, e cancellationInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cancellationInteractor, "cancellationInteractor");
        this.f230296a = featureToggleInteractor;
        this.f230297b = cancellationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r21, boolean r22, gim.c r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            boolean r3 = r2 instanceof ow3.b
            if (r3 == 0) goto L19
            r3 = r2
            ow3.b r3 = (ow3.b) r3
            int r4 = r3.f230295y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f230295y = r4
            goto L1e
        L19:
            ow3.b r3 = new ow3.b
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f230293w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f230295y
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L3c
            if (r5 != r6) goto L34
            boolean r1 = r3.v
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r3 = r3.u
            yhm.o.b(r2)
            r5 = r1
            r1 = r3
            goto L5e
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            yhm.o.b(r2)
            com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$CreditDropoutForm r2 = com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$CreditDropoutForm.f66276c
            gte.a r5 = r0.f230296a
            jte.d r5 = (jte.d) r5
            boolean r2 = r5.c(r2)
            if (r2 == 0) goto L71
            java.lang.String r2 = r1.f66892b
            r3.u = r1
            r5 = r22
            r3.v = r5
            r3.f230295y = r6
            ow3.e r6 = r0.f230297b
            java.lang.Object r2 = r6.c(r2, r7, r3)
            if (r2 != r4) goto L5e
            return r4
        L5e:
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig r2 = (com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig) r2
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$FeedbackForm r2 = r2.f66305c
            if (r2 == 0) goto L6f
            com.revolut.retail.core.navigation.FeatureCommand r3 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$DropOutForm r4 = new com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$DropOutForm
            r4.<init>(r1, r2, r5, r7)
            r3.<init>(r4)
            return r3
        L6f:
            r7 = r5
            goto L74
        L71:
            r5 = r22
            goto L6f
        L74:
            com.revolut.retail.core.navigation.ActivityNavigateCommand r9 = new com.revolut.retail.core.navigation.ActivityNavigateCommand
            p54.b r2 = p54.g.Companion
            r2.getClass()
            r10 = r9
            com.revolut.retail.core.navigation.ExplicitActivityDestination r9 = p54.b.f233004b
            com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration r2 = new com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration
            p54.c r3 = p54.c.CLOSE
            com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration r4 = new com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration
            grl.k9 r5 = grl.k9.Credit
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r6 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r6 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r5 = com.google.android.gms.internal.mlkit_vision_face.a.h(r5, r6, r5)
            r6 = 22
            java.lang.String r8 = "CREDIT_DROP_OUT_FLOW"
            r4.<init>(r6, r5, r8)
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r6 = com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration.a(r1, r8)
            r8 = 10
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r18 = 0
            r19 = 1020(0x3fc, float:1.43E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r8 = r10
            r10 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ow3.c.a(com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration, boolean, gim.c):java.lang.Object");
    }
}
