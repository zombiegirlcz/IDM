package com.revolut.feature.kyc.impl.flow.kyc_consolidated;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public wi0.b u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f77743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f77744x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f77744x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f77744x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r8 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f77743w
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.feature.kyc.impl.flow.kyc_consolidated.c r5 = r7.f77744x
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            boolean r0 = r7.v
            wi0.b r1 = r7.u
            yhm.o.b(r8)
            goto L62
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            wi0.b r1 = r7.u
            yhm.o.b(r8)
            goto L4d
        L27:
            yhm.o.b(r8)
            goto L3d
        L2b:
            yhm.o.b(r8)
            com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$InputData r8 = r5.o
            wi0.b r8 = r8.f
            if (r8 != 0) goto L3f
            r7.f77743w = r4
            java.io.Serializable r8 = com.revolut.feature.kyc.impl.flow.kyc_consolidated.c.J2(r5, r7)
            if (r8 != r0) goto L3d
            goto L5f
        L3d:
            wi0.b r8 = (wi0.b) r8
        L3f:
            r7.u = r8
            r7.f77743w = r3
            java.lang.Object r1 = com.revolut.feature.kyc.impl.flow.kyc_consolidated.c.I2(r5, r8, r7)
            if (r1 != r0) goto L4a
            goto L5f
        L4a:
            r6 = r1
            r1 = r8
            r8 = r6
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r7.u = r1
            r7.v = r8
            r7.f77743w = r2
            java.io.Serializable r2 = com.revolut.feature.kyc.impl.flow.kyc_consolidated.c.K2(r5, r1, r7)
            if (r2 != r0) goto L60
        L5f:
            return r0
        L60:
            r0 = r8
            r8 = r2
        L62:
            wi0.b r8 = (wi0.b) r8
            qki.d r2 = r5.f77751x
            pud.b r3 = new pud.b
            r4 = 18
            r3.<init>(r8, r1, r0, r4)
            r5.H2(r2, r3)
            gte.a r0 = r5.v
            com.revolut.feature.kyc.api.KycApi$FeatureToggle$SimplifiedKyc r2 = com.revolut.feature.kyc.api.KycApi$FeatureToggle.SimplifiedKyc.f77466c
            jte.d r0 = (jte.d) r0
            boolean r0 = r0.c(r2)
            if (r0 != 0) goto La6
            if (r8 != 0) goto L85
            com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$Step$SubmitCitizenship r8 = new com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$Step$SubmitCitizenship
            r0 = 0
            r8.<init>(r1, r1, r0)
            goto L9c
        L85:
            com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$Step$RemoteDocs r0 = new com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$Step$RemoteDocs
            qd0.b r1 = r5.f77750w
            s80.b r1 = (s80.b) r1
            java.util.Locale r1 = r1.b()
            java.lang.String r1 = r1.toLanguageTag()
            java.lang.String r2 = "toLanguageTag(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r8, r1)
            r8 = r0
        L9c:
            yki.i r0 = r5.f77752y
            r1 = 0
            r2 = 6
            oki.h.u2(r5, r0, r8, r1, r2)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        La6:
            kotlin.NotImplementedError r8 = new kotlin.NotImplementedError
            java.lang.String r0 = "message"
            java.lang.String r1 = "An operation is not implemented: DROP-3017: route to DocumentCollection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.kyc.impl.flow.kyc_consolidated.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
