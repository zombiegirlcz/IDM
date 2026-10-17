package com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import x1a.g;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7 == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r1.a(r7, r6) == r2) goto L26;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            x1a.g r0 = r6.v
            k1a.g r1 = r0.f302360p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            yhm.o.b(r7)
            goto L6a
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L51
        L20:
            yhm.o.b(r7)
            com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData r7 = r0.o
            boolean r3 = r7 instanceof com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData.RemoveParticipant
            if (r3 == 0) goto L57
            com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData$RemoveParticipant r7 = (com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData.RemoveParticipant) r7
            java.lang.String r3 = r7.f79892a
            java.lang.String r7 = r7.f79893b
            r6.u = r5
            a1a.d r1 = r1.f180184a
            r1.getClass()
            a1a.b r4 = new a1a.b
            r5 = 0
            r4.<init>(r1, r3, r7, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r4, r6)
            if (r7 != r2) goto L47
            goto L49
        L47:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L49:
            if (r7 != r2) goto L4c
            goto L4e
        L4c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L4e:
            if (r7 != r2) goto L51
            goto L69
        L51:
            x1a.a r7 = x1a.a.f302355a
            r0.C2(r7)
            goto L6f
        L57:
            boolean r3 = r7 instanceof com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData.CancelSplit
            if (r3 == 0) goto L72
            com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData$CancelSplit r7 = (com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData.CancelSplit) r7
            com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit r7 = r7.f79891a
            java.lang.String r7 = r7.f79920a
            r6.u = r4
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r2) goto L6a
        L69:
            return r2
        L6a:
            x1a.b r7 = x1a.b.f302356a
            r0.C2(r7)
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L72:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
