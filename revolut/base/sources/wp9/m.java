package wp9;

import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SplitBillsSummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(SplitBillsSummaryScreen splitBillsSummaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = splitBillsSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.v, continuation, 0);
            case 1:
                return new m(this.v, continuation, 1);
            case 2:
                return new m(this.v, continuation, 2);
            default:
                return new m(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((m) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x039a, code lost:
    
        r6.add(new com.revolut.feature.payments.bills_chooser.api.splits.MoneySplit.Amount(r10, false, r7.f79209b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0115, code lost:
    
        r4.add(new com.revolut.feature.payments.bills_chooser.api.splits.MoneySplit.Percentage(r9, r6.d, ((java.lang.Number) zhm.r0.h(r6.f299199a, r2)).intValue()));
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp9.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
