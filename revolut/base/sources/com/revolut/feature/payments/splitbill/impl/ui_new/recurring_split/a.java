package com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split;

import gim.i;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ RecurringSplitFlowContract$LaunchMode v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f79905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f79906x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RecurringSplitFlowContract$LaunchMode recurringSplitFlowContract$LaunchMode, d dVar, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(1, continuation);
        this.v = recurringSplitFlowContract$LaunchMode;
        this.f79905w = dVar;
        this.f79906x = linkedHashMap;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f79905w, this.f79906x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r14 == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r14 == r2) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.d r0 = r13.f79905w
            k1a.g r1 = r0.f79910q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r13.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            yhm.o.b(r14)
            goto L70
        L14:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1c:
            yhm.o.b(r14)
            goto L3e
        L20:
            yhm.o.b(r14)
            com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$LaunchMode$Creation r14 = com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$LaunchMode.Creation.f79898a
            com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$LaunchMode r3 = r13.v
            boolean r14 = kotlin.jvm.internal.Intrinsics.f(r3, r14)
            java.util.LinkedHashMap r6 = r13.f79906x
            if (r14 == 0) goto L41
            com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$InputData r14 = r0.o
            qua.p r0 = r14.f79896a
            java.lang.String r14 = r14.f79897b
            r13.u = r5
            java.lang.Object r14 = r1.b(r0, r6, r14, r13)
            if (r14 != r2) goto L3e
            goto L6f
        L3e:
            com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit r14 = (com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit) r14
            return r14
        L41:
            boolean r14 = r3 instanceof com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$LaunchMode.Update
            if (r14 == 0) goto L73
            com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$LaunchMode$Update r3 = (com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$LaunchMode.Update) r3
            java.lang.String r9 = r3.f79899a
            java.lang.String r14 = r3.d
            r13.u = r4
            r1.getClass()
            java.util.ArrayList r0 = k1a.g.c(r6)
            a1a.d r8 = r1.f180184a
            com.revolut.feature.payments.splitbill.models.recurringsplit.c r10 = new com.revolut.feature.payments.splitbill.models.recurringsplit.c
            r10.<init>(r14, r0)
            r8.getClass()
            a1a.c r7 = new a1a.c
            r11 = 0
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            skm.p0 r14 = skm.p0.f264001a
            elm.f r14 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r14, r7, r13)
            if (r14 != r2) goto L70
        L6f:
            return r2
        L70:
            com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit r14 = (com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit) r14
            return r14
        L73:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
