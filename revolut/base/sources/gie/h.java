package gie;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Flow f144133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f144134x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Flow flow, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f144133w = flow;
        this.f144134x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.f144133w, this.f144134x, continuation);
        hVar.v = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (vkm.q.u(r0, r11, r10) != r1) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.u
            r3 = 14
            r4 = 2
            r5 = 1
            r6 = 3
            r7 = 0
            if (r2 == 0) goto L2a
            if (r2 == r5) goto L26
            if (r2 == r4) goto L22
            if (r2 != r6) goto L1a
            yhm.o.b(r11)
            goto L84
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            yhm.o.b(r11)
            goto L64
        L26:
            yhm.o.b(r11)
            goto L3a
        L2a:
            yhm.o.b(r11)
            r10.v = r0
            r10.u = r5
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r11 = skm.k0.b(r8, r10)
            if (r11 != r1) goto L3a
            goto L83
        L3a:
            kotlinx.coroutines.flow.Flow r11 = r10.f144133w
            jhi.b r11 = mo3.a.g(r11, r7, r7, r6)
            kotlin.time.b$a r2 = kotlin.time.b.INSTANCE
            r8 = 5000(0x1388, double:2.4703E-320)
            pkm.e r2 = pkm.e.MILLISECONDS
            long r8 = kotlin.time.c.h(r8, r2)
            vkm.f r11 = zi0.c.M(r11, r7, r8, r7)
            g23.j r2 = new g23.j
            r2.<init>(r6, r3, r7)
            zhm.h0 r5 = zhm.h0.f322473a
            vkm.y r11 = rd0.e.e(r11, r5, r2)
            r10.v = r0
            r10.u = r4
            java.lang.Object r11 = vkm.q.x(r11, r10)
            if (r11 != r1) goto L64
            goto L83
        L64:
            com.revolut.feature.tab.accounts.api.model.AccountContent r11 = (com.revolut.feature.tab.accounts.api.model.AccountContent) r11
            gie.i r2 = r10.f144134x
            lie.b r2 = r2.f144135l
            lie.i r2 = (lie.i) r2
            r2.getClass()
            lb0.b0 r4 = new lb0.b0
            r4.<init>(r2, r11, r7, r3)
            vkm.v1 r11 = new vkm.v1
            r11.<init>(r4)
            r10.v = r7
            r10.u = r6
            java.lang.Object r11 = vkm.q.u(r0, r11, r10)
            if (r11 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gie.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
