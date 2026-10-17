package pnh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.trades.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dfl.e f237802w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.wealth.ui.impl.trades.b bVar, dfl.e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f237802w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.v, this.f237802w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r2.G1(r1, r6) == r0) goto L15;
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
            com.revolut.feature.wealth.ui.impl.trades.b r2 = r6.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r7)
            goto L6f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L5a
        L1e:
            yhm.o.b(r7)
            zxd.c r7 = r2.f96052q
            dfl.e r1 = r6.f237802w
            java.lang.String r5 = r1.f114261a
            java.lang.String r1 = r1.f114277y
            efm.r r7 = zxd.c.a(r7, r5, r1)
            pj9.m r1 = new pj9.m
            r5 = 24
            r1.<init>(r5)
            r5 = 0
            efm.r r7 = m70.a.g(r7, r5, r1, r4)
            vkm.d r7 = rd0.e.b(r7)
            zhm.h0 r1 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.d(r7, r1)
            ahe.m0 r1 = new ahe.m0
            r5 = 17
            r1.<init>(r7, r5)
            njj.l r7 = new njj.l
            r5 = 13
            r7.<init>(r1, r5)
            r6.u = r4
            java.lang.Object r7 = vkm.q.x(r7, r6)
            if (r7 != r0) goto L5a
            goto L6e
        L5a:
            java.lang.String r7 = (java.lang.String) r7
            f9i.c r1 = new f9i.c
            f9i.e r5 = new f9i.e
            r5.<init>(r7, r4)
            r1.<init>(r5)
            r6.u = r3
            java.lang.Object r7 = r2.G1(r1, r6)
            if (r7 != r0) goto L6f
        L6e:
            return r0
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pnh.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
