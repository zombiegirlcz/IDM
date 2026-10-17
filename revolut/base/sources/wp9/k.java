package wp9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SplitBillsSummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SplitBillsSummaryScreen splitBillsSummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = splitBillsSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVarD = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) yVarD;
        cVar.getClass();
        SplitBillItem splitBillItem = obj3 instanceof SplitBillItem ? (SplitBillItem) obj3 : null;
        if (splitBillItem == null) {
            hx7.e.h(new IllegalArgumentException(a0.d.m(obj3, "Unknown parcel: ")));
        } else {
            cVar.K2(splitBillItem);
        }
        return Unit.f186387a;
    }
}
