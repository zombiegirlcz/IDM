package com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r10 == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (r10 == r3) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c r0 = r9.v
            com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$InputData r1 = r0.o
            hw3.n r2 = r0.f68527p
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r9.u
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L2b
            if (r4 == r8) goto L27
            if (r4 == r7) goto L22
            if (r4 != r6) goto L1a
            yhm.o.b(r10)
            goto L64
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            yhm.o.b(r10)
            goto L99
        L27:
            yhm.o.b(r10)
            goto L39
        L2b:
            yhm.o.b(r10)
            ft3.j1 r10 = r1.f68523a
            r9.u = r8
            java.lang.Object r10 = hw3.n.a(r2, r10, r9)
            if (r10 != r3) goto L39
            goto L98
        L39:
            au3.m r10 = (au3.m) r10
            int[] r4 = oj4.d.f225728a
            int r10 = r10.ordinal()
            r10 = r4[r10]
            if (r10 == r8) goto La1
            r4 = 16
            if (r10 == r7) goto L80
            if (r10 != r6) goto L7a
            ft3.j1 r10 = r1.f68523a
            r9.u = r6
            p24.v r1 = r2.f156081a
            r1.getClass()
            osk.m r2 = new osk.m
            r2.<init>(r1, r10, r5, r4)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r9)
            if (r10 != r3) goto L64
            goto L98
        L64:
            com.revolut.feature.credit.application.plugins.api.models.WaitingListPromptContent r10 = (com.revolut.feature.credit.application.plugins.api.models.WaitingListPromptContent) r10
            com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step$Prompt r1 = new com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step$Prompt
            r1.<init>(r10)
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            java.lang.String r3 = "Unknown waiting list status"
            java.lang.String r4 = "WaitingListV3FlowModel"
            rd0.d.a(r2, r4, r3, r5, r10)
        L78:
            r2 = r1
            goto La4
        L7a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L80:
            ft3.j1 r10 = r1.f68523a
            r9.u = r7
            p24.v r1 = r2.f156081a
            r1.getClass()
            osk.m r2 = new osk.m
            r2.<init>(r1, r10, r5, r4)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r9)
            if (r10 != r3) goto L99
        L98:
            return r3
        L99:
            com.revolut.feature.credit.application.plugins.api.models.WaitingListPromptContent r10 = (com.revolut.feature.credit.application.plugins.api.models.WaitingListPromptContent) r10
            com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step$Prompt r1 = new com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step$Prompt
            r1.<init>(r10)
            goto L78
        La1:
            com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step$Dashboard r1 = com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$Step.Dashboard.f68524a
            goto L78
        La4:
            yki.i r1 = r0.f68529r
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
