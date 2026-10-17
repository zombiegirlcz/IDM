package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CommodityOrderEditScreenContract$ModalStep.Tutorial f99854w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, CommodityOrderEditScreenContract$ModalStep.Tutorial tutorial, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f99854w = tutorial;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f99854w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r10 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r6.O2(r10, r9) == r0) goto L33;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep$Tutorial r2 = r9.f99854w
            r3 = 3
            r4 = 2
            r5 = 1
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r6 = r9.v
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 == r4) goto L13
            if (r1 != r3) goto L18
        L13:
            yhm.o.b(r10)
            goto L98
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            yhm.o.b(r10)
            goto L4e
        L24:
            yhm.o.b(r10)
            l6j.b r10 = r6.F
            l6j.a r1 = r2.d
            r9.u = r5
            s6j.a r10 = (s6j.a) r10
            n6j.c r10 = r10.f260370a
            aie.v r5 = new aie.v
            r7 = 11
            r8 = 0
            r5.<init>(r10, r1, r8, r7)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r5, r9)
            if (r10 != r0) goto L44
            goto L46
        L44:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L46:
            if (r10 != r0) goto L49
            goto L4b
        L49:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L4b:
            if (r10 != r0) goto L4e
            goto L97
        L4e:
            wd6.h r10 = r2.f99846b
            int[] r1 = d7j.h1.f112004a
            int r2 = r10.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L8f;
                case 2: goto L8f;
                case 3: goto L7b;
                case 4: goto L61;
                case 5: goto L61;
                case 6: goto L61;
                case 7: goto L61;
                default: goto L5b;
            }
        L5b:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r10 = " order type is not supported"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            hx7.e.n(r0)
            goto L98
        L7b:
            r9.u = r3
            d7j.q0 r10 = new d7j.q0
            r1 = 5
            r10.<init>(r6, r1)
            java.lang.Object r10 = r6.P2(r9, r10)
            if (r10 != r0) goto L8a
            goto L8c
        L8a:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L8c:
            if (r10 != r0) goto L98
            goto L97
        L8f:
            r9.u = r4
            java.lang.Object r10 = r6.O2(r10, r9)
            if (r10 != r0) goto L98
        L97:
            return r0
        L98:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
