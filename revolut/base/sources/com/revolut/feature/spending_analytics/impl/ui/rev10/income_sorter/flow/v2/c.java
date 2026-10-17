package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2;

import gim.i;
import java.util.Set;
import jqd.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f87817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f87818x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Set set, e eVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = set;
        this.f87817w = eVar;
        this.f87818x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f87817w, this.f87818x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r14 == r2) goto L33;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e r0 = r13.f87817w
            yki.i r1 = r0.f87824t
            kqd.e r0 = r0.f87820p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r13.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L23
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            yhm.o.b(r14)
            goto L88
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            yhm.o.b(r14)
            goto L3a
        L23:
            yhm.o.b(r14)
            java.util.Set r14 = r13.v
            r3 = r14
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L3a
            r13.u = r5
            java.lang.Object r14 = r0.a(r14, r13)
            if (r14 != r2) goto L3a
            goto L87
        L3a:
            jqd.g r14 = r13.f87818x
            jqd.e r14 = (jqd.e) r14
            f5j.a r7 = r14.f177703a
            java.lang.String r8 = r14.f177705c
            dj0.d r3 = r14.f177704b
            krf.c r10 = r14.d
            kq2.c r14 = r14.e
            r6 = -1
            if (r14 != 0) goto L4d
            r14 = r6
            goto L55
        L4d:
            int[] r9 = jqd.a.f177697a
            int r14 = r14.ordinal()
            r14 = r9[r14]
        L55:
            if (r14 == r6) goto L68
            if (r14 == r5) goto L65
            if (r14 != r4) goto L5f
            hzi.d r14 = hzi.d.DEBTOR
        L5d:
            r11 = r14
            goto L6a
        L5f:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L65:
            hzi.d r14 = hzi.d.SHARED
            goto L5d
        L68:
            r14 = 0
            goto L5d
        L6a:
            r13.u = r4
            vkm.z1 r14 = r0.f
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue r0 = new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue
            xi0.b r9 = r3.f115083b
            zld.a r12 = zld.a.ACTIVE
            com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$BankTransfer r6 = new com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$BankTransfer
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.<init>(r6, r3)
            java.lang.Object r14 = r14.emit(r0, r13)
            if (r14 != r2) goto L83
            goto L85
        L83:
            kotlin.Unit r14 = kotlin.Unit.f186387a
        L85:
            if (r14 != r2) goto L88
        L87:
            return r2
        L88:
            kpj.a r14 = new kpj.a
            r0 = 4
            r14.<init>(r0)
            oki.h.E2(r1, r14)
            boolean r14 = r1.e(r5)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
