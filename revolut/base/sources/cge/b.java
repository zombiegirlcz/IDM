package cge;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f23948w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f23948w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f23948w, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (vkm.q.u(r1, r7, r6) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (vkm.q.u(r1, r7, r6) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cge.c r0 = r6.f23948w
            rge.b r0 = r0.f23949a
            java.lang.Object r1 = r6.v
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L21
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            yhm.o.b(r7)
            goto L6a
        L21:
            yhm.o.b(r7)
            com.revolut.feature.tab.accounts.api.mode.TabAccountsMode$Home r7 = com.revolut.feature.tab.accounts.api.mode.TabAccountsMode.Home.f89466a
            hhe.d r7 = r0.b(r7)
            vge.u0 r7 = r7.a()
            kotlinx.coroutines.flow.Flow r7 = r7.a()
            hhe.d r0 = r0.d()
            r3 = 0
            if (r0 == 0) goto L42
            vge.u0 r0 = r0.a()
            kotlinx.coroutines.flow.Flow r0 = r0.a()
            goto L43
        L42:
            r0 = r3
        L43:
            if (r0 != 0) goto L50
            r6.v = r3
            r6.u = r5
            java.lang.Object r7 = vkm.q.u(r1, r7, r6)
            if (r7 != r2) goto L6a
            goto L69
        L50:
            t38.e r7 = zh9.u0.m(r7, r0)
            ccg.c r0 = new ccg.c
            r5 = 28
            r0.<init>(r5)
            akg.n r7 = nim.a.v(r7, r0)
            r6.v = r3
            r6.u = r4
            java.lang.Object r7 = vkm.q.u(r1, r7, r6)
            if (r7 != r2) goto L6a
        L69:
            return r2
        L6a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cge.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
