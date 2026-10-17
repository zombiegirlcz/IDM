package elf;

import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class a2 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ ItemizationReceiptDeletionData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b2 f127295w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(ItemizationReceiptDeletionData itemizationReceiptDeletionData, b2 b2Var, Continuation continuation) {
        super(2, continuation);
        this.v = itemizationReceiptDeletionData;
        this.f127295w = b2Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a2(this.v, this.f127295w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (((mr9.a) r1).c((com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData.GroupBill) r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            yhm.o.b(r6)
            goto L57
        L19:
            yhm.o.b(r6)
            com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData r6 = r5.v
            boolean r1 = r6 instanceof com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData.SplitBill
            elf.b2 r4 = r5.f127295w
            if (r1 == 0) goto L44
            v0a.c r1 = r4.f127300l
            com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData$SplitBill r6 = (com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData.SplitBill) r6
            r5.u = r3
            q1a.b r1 = (q1a.b) r1
            u71.a r1 = r1.f241408a
            java.lang.String r2 = r6.f79916a
            java.lang.String r3 = r6.f79917b
            java.util.List r6 = r6.f79918c
            efm.b r6 = r1.deleteSplitBillReceipt(r2, r3, r6)
            java.lang.Object r6 = nim.a.a(r6, r5)
            if (r6 != r0) goto L3f
            goto L41
        L3f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L41:
            if (r6 != r0) goto L57
            goto L56
        L44:
            boolean r1 = r6 instanceof com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData.GroupBill
            if (r1 == 0) goto L5a
            mq9.f r1 = r4.f127301m
            com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData$GroupBill r6 = (com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData.GroupBill) r6
            r5.u = r2
            mr9.a r1 = (mr9.a) r1
            java.lang.Object r6 = r1.c(r6, r5)
            if (r6 != r0) goto L57
        L56:
            return r0
        L57:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L5a:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.a2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
