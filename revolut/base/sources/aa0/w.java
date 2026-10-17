package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements wl2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wl2.f f2745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bm2.a f2746b;

    public w(wl2.f interactor, bm2.a togglesProvider) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(togglesProvider, "togglesProvider");
        this.f2745a = interactor;
        this.f2746b = togglesProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, com.revolut.feature.backend_flow.domain.models.StringValue r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof aa0.v
            if (r0 == 0) goto L13
            r0 = r14
            aa0.v r0 = (aa0.v) r0
            int r1 = r0.f2744w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2744w = r1
            goto L1a
        L13:
            aa0.v r0 = new aa0.v
            gim.c r14 = (gim.c) r14
            r0.<init>(r10, r14)
        L1a:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f2744w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r14)
            goto La1
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            yhm.o.b(r14)
            goto L76
        L39:
            yhm.o.b(r14)
            bm2.a r14 = r10.f2746b
            gte.a r14 = r14.f16759a
            com.revolut.core.backend_flow.api.NewBackendFlowApi$Toggles$EndpointsConfig r2 = com.revolut.core.backend_flow.api.NewBackendFlowApi$Toggles.EndpointsConfig.f51216c
            jte.d r14 = (jte.d) r14
            boolean r14 = r14.c(r2)
            java.lang.String r2 = "error(...)"
            java.lang.String r5 = "value"
            java.lang.String r6 = "itemId"
            java.lang.String r7 = "viewId"
            wl2.f r8 = r10.f2745a
            r9 = 0
            if (r14 == 0) goto L80
            r8.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r5)
            kotlin.NotImplementedError r11 = new kotlin.NotImplementedError
            r11.<init>(r9, r4, r9)
            ufm.c r11 = efm.d0.l(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            r0.f2744w = r4
            java.lang.Object r14 = nim.a.b(r11, r0)
            if (r14 != r1) goto L76
            goto La0
        L76:
            kotlin.jvm.internal.Intrinsics.h(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r11 = r14.booleanValue()
            goto Laa
        L80:
            r8.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r5)
            kotlin.NotImplementedError r11 = new kotlin.NotImplementedError
            r11.<init>(r9, r4, r9)
            ufm.c r11 = efm.d0.l(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            r0.f2744w = r3
            java.lang.Object r14 = nim.a.b(r11, r0)
            if (r14 != r1) goto La1
        La0:
            return r1
        La1:
            kotlin.jvm.internal.Intrinsics.h(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r11 = r14.booleanValue()
        Laa:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: aa0.w.a(java.lang.String, java.lang.String, com.revolut.feature.backend_flow.domain.models.StringValue, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
