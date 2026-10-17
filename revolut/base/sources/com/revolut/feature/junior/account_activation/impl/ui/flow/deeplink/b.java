package com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public h0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f76659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f76660x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f76660x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f76660x, continuation);
        bVar.f76659w = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r11 == r3) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.c r0 = r10.f76660x
            com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$InputData r1 = r0.o
            java.lang.Object r2 = r10.f76659w
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r10.v
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L27
            if (r4 == r6) goto L21
            if (r4 != r5) goto L19
            yhm.o.b(r11)
            goto L7b
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            skm.h0 r2 = r10.u
            yhm.o.b(r11)
            goto L4c
        L27:
            yhm.o.b(r11)
            f68.c r11 = new f68.c
            r4 = 1
            r11.<init>(r0, r7, r4)
            r4 = 3
            skm.h0 r11 = skm.e0.g(r2, r7, r7, r11, r4)
            f68.c r8 = new f68.c
            r9 = 0
            r8.<init>(r0, r7, r9)
            skm.h0 r2 = skm.e0.g(r2, r7, r7, r8, r4)
            r10.f76659w = r7
            r10.u = r2
            r10.v = r6
            java.lang.Object r11 = r11.y(r10)
            if (r11 != r3) goto L4c
            goto L7a
        L4c:
            ks8.j r11 = (ks8.j) r11
            boolean r4 = r11 instanceof ks8.i
            if (r4 == 0) goto L66
            r2.f(r7)
            ks8.i r11 = (ks8.i) r11
            com.revolut.retail.core.navigation.FeatureCommand r11 = r11.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = zh9.u0.b(r11)
            r0.C1(r11)
            yki.i r11 = r0.f76664s
            oki.h.D2(r11)
            goto Lac
        L66:
            ks8.j$a r4 = ks8.j.a.f189313a
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r4)
            if (r11 == 0) goto Lbd
            r10.f76659w = r7
            r10.u = r7
            r10.v = r5
            java.lang.Object r11 = r2.i(r10)
            if (r11 != r3) goto L7b
        L7a:
            return r3
        L7b:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L81:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L99
            java.lang.Object r2 = r11.next()
            r3 = r2
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r3 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r3
            java.lang.String r3 = r3.f77101g
            java.lang.String r4 = r1.f76654a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 == 0) goto L81
            r7 = r2
        L99:
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r7 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r7
            if (r7 == 0) goto Laf
            yki.i r1 = r0.f76664s
            com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$Step$Activation r2 = new com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$Step$Activation
            r2.<init>(r7)
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
        Lac:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        Laf:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            java.lang.String r0 = r1.f76654a
            java.lang.String r1 = "Cannot find junior account for activation with code "
            java.lang.String r0 = j6.a.q(r1, r0)
            r11.<init>(r0)
            throw r11
        Lbd:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
