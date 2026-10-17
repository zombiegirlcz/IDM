package qwe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.flow.e f249903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f249904x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249903w = eVar;
        this.f249904x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f249903w, this.f249904x, continuation, 0);
            default:
                return new n(this.f249903w, this.f249904x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0063 -> B:13:0x0021). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.u
            switch(r0) {
                case 0: goto L69;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1e
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L38
        L1e:
            yhm.o.b(r7)
        L21:
            kotlin.coroutines.CoroutineContext r7 = r6.getContext()
            boolean r7 = skm.e0.x(r7)
            if (r7 == 0) goto L66
            r6.v = r3
            com.revolut.feature.topup_screen.impl.flows.checkout.flow.e r7 = r6.f249903w
            java.lang.String r1 = r6.f249904x
            java.io.Serializable r7 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.K2(r7, r1, r6)
            if (r7 != r0) goto L38
            goto L68
        L38:
            tof.a3 r7 = (tof.a3) r7
            if (r7 == 0) goto L3f
            tof.v6 r7 = r7.f
            goto L40
        L3f:
            r7 = 0
        L40:
            qwe.e r1 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.J2()
            r1.getClass()
            java.util.Set r1 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.Q
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r7 = zhm.d0.T(r1, r7)
            if (r7 == 0) goto L54
            kotlin.Unit r0 = kotlin.Unit.f186387a
            goto L68
        L54:
            qwe.e r7 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.J2()
            r7.getClass()
            long r4 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.P
            r6.v = r2
            java.lang.Object r7 = skm.k0.c(r4, r6)
            if (r7 != r0) goto L21
            goto L68
        L66:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L68:
            return r0
        L69:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.v
            r2 = 1
            if (r1 == 0) goto L7e
            if (r1 != r2) goto L76
            yhm.o.b(r7)
            goto L9a
        L76:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L7e:
            yhm.o.b(r7)
            qwe.m r7 = new qwe.m
            java.lang.String r1 = r6.f249904x
            r3 = 0
            com.revolut.feature.topup_screen.impl.flows.checkout.flow.e r4 = r6.f249903w
            r7.<init>(r4, r1, r3)
            r6.v = r2
            tji.f r1 = r4.X()
            java.lang.String r2 = "CHECKOUT_SCREEN_CTA_TAG"
            java.lang.Object r7 = zh9.u0.b0(r1, r2, r7, r6)
            if (r7 != r0) goto L9a
            goto L9c
        L9a:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qwe.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
