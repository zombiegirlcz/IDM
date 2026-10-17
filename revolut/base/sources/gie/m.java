package gie;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Flow f144139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f144140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ emg.a f144141y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Flow flow, s sVar, emg.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f144139w = flow;
        this.f144140x = sVar;
        this.f144141y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.f144139w, this.f144140x, this.f144141y, continuation);
        mVar.v = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r12 == r1) goto L31;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.u
            r3 = 15
            kotlinx.coroutines.flow.Flow r4 = r11.f144139w
            r5 = 2
            r6 = 1
            r7 = 3
            r8 = 0
            if (r2 == 0) goto L2d
            if (r2 == r6) goto L29
            if (r2 == r5) goto L25
            if (r2 != r7) goto L1d
            yhm.o.b(r12)
            goto Lad
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            yhm.o.b(r12)
            goto L71
        L29:
            yhm.o.b(r12)
            goto L58
        L2d:
            yhm.o.b(r12)
            jhi.b r12 = mo3.a.g(r4, r8, r8, r7)
            kotlin.time.b$a r2 = kotlin.time.b.INSTANCE
            r9 = 5000(0x1388, double:2.4703E-320)
            pkm.e r2 = pkm.e.MILLISECONDS
            long r9 = kotlin.time.c.h(r9, r2)
            vkm.f r12 = zi0.c.M(r12, r8, r9, r8)
            g23.j r2 = new g23.j
            r2.<init>(r7, r3, r8)
            zhm.h0 r9 = zhm.h0.f322473a
            vkm.y r12 = rd0.e.e(r12, r9, r2)
            r11.v = r0
            r11.u = r6
            java.lang.Object r12 = vkm.q.x(r12, r11)
            if (r12 != r1) goto L58
            goto Lac
        L58:
            com.revolut.feature.tab.accounts.api.model.AccountContent r12 = (com.revolut.feature.tab.accounts.api.model.AccountContent) r12
            gie.s r2 = r11.f144140x
            cie.v r2 = r2.f144152p
            boolean r12 = r2.a(r12)
            if (r12 == 0) goto L74
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r11.v = r8
            r11.u = r5
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L71
            goto Lac
        L71:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L74:
            emg.a r12 = r11.f144141y
            kotlinx.coroutines.flow.Flow r2 = r12.d()
            kotlinx.coroutines.flow.Flow r2 = vkm.q.q(r2)
            g6f.l r9 = new g6f.l
            r9.<init>(r12, r8)
            r11.v = r8
            r11.u = r7
            vkm.q.w(r0)
            kotlinx.coroutines.flow.Flow[] r12 = new kotlinx.coroutines.flow.Flow[r5]
            r5 = 0
            r12[r5] = r4
            r12[r6] = r2
            vdl.c1 r2 = new vdl.c1
            r2.<init>(r9, r8, r3)
            vkm.s1 r3 = vkm.s1.f290118a
            java.lang.Object r12 = mif.e0.g(r11, r3, r2, r0, r12)
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r12 != r0) goto La1
            goto La3
        La1:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        La3:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r12 != r0) goto La8
            goto Laa
        La8:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        Laa:
            if (r12 != r1) goto Lad
        Lac:
            return r1
        Lad:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gie.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
