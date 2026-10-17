package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2;

import gim.i;
import java.util.Set;
import jqd.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f87815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f87816x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Set set, e eVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = set;
        this.f87815w = eVar;
        this.f87816x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f87815w, this.f87816x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r13 == r2) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e r0 = r12.f87815w
            yki.i r1 = r0.f87824t
            kqd.e r0 = r0.f87820p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r12.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L16
            yhm.o.b(r13)
            goto L63
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            yhm.o.b(r13)
            goto L39
        L22:
            yhm.o.b(r13)
            java.util.Set r13 = r12.v
            r3 = r13
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L39
            r12.u = r5
            java.lang.Object r13 = r0.a(r13, r12)
            if (r13 != r2) goto L39
            goto L62
        L39:
            jqd.g r13 = r12.f87816x
            jqd.f r13 = (jqd.f) r13
            zm3.l r7 = r13.f177706a
            java.lang.String r8 = r13.f177708c
            dj0.d r3 = r13.f177707b
            krf.c r10 = r13.d
            r12.u = r4
            vkm.z1 r13 = r0.f
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue r0 = new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue
            com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$PeerToPeerTransfer r6 = new com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$PeerToPeerTransfer
            xi0.b r9 = r3.f115083b
            zld.a r11 = zld.a.ACTIVE
            r6.<init>(r7, r8, r9, r10, r11)
            r0.<init>(r6, r3)
            java.lang.Object r13 = r13.emit(r0, r12)
            if (r13 != r2) goto L5e
            goto L60
        L5e:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L60:
            if (r13 != r2) goto L63
        L62:
            return r2
        L63:
            kpj.a r13 = new kpj.a
            r0 = 4
            r13.<init>(r0)
            oki.h.E2(r1, r13)
            boolean r13 = r1.e(r5)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
