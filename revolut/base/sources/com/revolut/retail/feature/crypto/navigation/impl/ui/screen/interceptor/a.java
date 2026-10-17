package com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor;

import eaj.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (nim.a.b(r7, r6) == r0) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            eaj.f r3 = r6.v
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L57
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L2c
        L1e:
            yhm.o.b(r7)
            ji5.m r7 = r3.f124273r
            r6.u = r4
            java.lang.Object r7 = r7.c(r4, r6)
            if (r7 != r0) goto L2c
            goto L46
        L2c:
            com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData r7 = r3.f124272q
            boolean r1 = r7 instanceof com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData.Deeplink
            if (r1 == 0) goto L47
            wli.x r1 = r3.f124271p
            com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData$Deeplink r7 = (com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData.Deeplink) r7
            java.lang.String r7 = r7.f100027a
            r4 = 6
            r5 = 0
            efm.d0 r7 = lg0.b.s1(r1, r7, r5, r5, r4)
            r6.u = r2
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r0) goto L57
        L46:
            return r0
        L47:
            boolean r0 = r7 instanceof com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData.Navigation
            if (r0 == 0) goto L5f
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData$Navigation r7 = (com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData.Navigation) r7
            com.revolut.retail.core.navigation.NaviCommand r7 = r7.f100028a
            r0.<init>(r7)
            r3.C1(r0)
        L57:
            aii.q r7 = aii.q.f5292a
            r3.v2(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L5f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
