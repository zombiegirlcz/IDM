package com.revolut.feature.junior.isa.impl.ui.jisa_details.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import ra8.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ CoroutineScope v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f76801w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CoroutineScope coroutineScope, c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = coroutineScope;
        this.f76801w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f76801w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r10 == r3) goto L26;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            ra8.c r0 = r9.f76801w
            yki.i r1 = r0.f252792q
            hj8.a r2 = r0.o
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r9.u
            r5 = 6
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L27
            if (r4 == r7) goto L21
            if (r4 != r6) goto L19
            yhm.o.b(r10)
            goto L8d
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L25
            goto L38
        L25:
            r10 = move-exception
            goto L3d
        L27:
            yhm.o.b(r10)
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L25
            r9.u = r7     // Catch: java.lang.Throwable -> L25
            r10 = r2
            nj8.n r10 = (nj8.n) r10     // Catch: java.lang.Throwable -> L25
            java.lang.Object r10 = r10.n(r7, r9)     // Catch: java.lang.Throwable -> L25
            if (r10 != r3) goto L38
            goto L8c
        L38:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L25
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L25
            goto L43
        L3d:
            yhm.m$a r4 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r10)
        L43:
            java.lang.Throwable r10 = yhm.m.a(r10)
            if (r10 == 0) goto L58
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r8, r8, r10, r0)
            oki.h.D2(r1)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L58:
            com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.JuniorIsaDetailsFlowContract$InputData r10 = r0.f252791p
            java.lang.String r10 = r10.f76799a
            w4l.j r4 = w4l.j.f294644c
            wkm.l r10 = hj8.a.d(r2, r10, r4)
            zfd.e r10 = zi0.c.w(r10)
            r6d.h r2 = new r6d.h
            r4 = 24
            r2.<init>(r4)
            jhi.b r10 = mo3.a.g(r10, r8, r2, r7)
            q97.g3 r2 = new q97.g3
            r4 = 9
            r2.<init>(r10, r4)
            qtb.o r10 = new qtb.o
            r4 = 3
            r10.<init>(r4, r5, r8)
            zhm.h0 r4 = zhm.h0.f322473a
            vkm.y r10 = rd0.e.e(r2, r4, r10)
            r9.u = r6
            java.lang.Object r10 = vkm.q.z(r10, r9)
            if (r10 != r3) goto L8d
        L8c:
            return r3
        L8d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r2)
            if (r10 == 0) goto L9f
            yki.i r10 = r0.f252792q
            com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.JuniorIsaDetailsFlowContract$Step$JuniorIsaDetails r1 = com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.JuniorIsaDetailsFlowContract$Step.JuniorIsaDetails.f76800a
            oki.h.u2(r0, r10, r1, r8, r5)
            goto La2
        L9f:
            oki.h.D2(r1)
        La2:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
