package wp9;

import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$SplitSummaryTab;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c f299191w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f299191w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k0 k0Var = new k0(this.f299191w, continuation, 0);
                k0Var.v = obj2;
                return k0Var;
            default:
                k0 k0Var2 = new k0(this.f299191w, continuation, 1);
                k0Var2.v = obj2;
                return k0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k0) create((k71.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k0) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                k71.q qVar = (k71.q) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar = this.f299191w;
                cVar.H2(cVar.z, new ahf.v(qVar, 7));
                break;
            default:
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                SplitBillsSummaryScreenContract$SplitSummaryTab splitBillsSummaryScreenContract$SplitSummaryTab = (SplitBillsSummaryScreenContract$SplitSummaryTab) hVar.f288433a;
                b0 b0Var = (b0) hVar.f288434b;
                SplitMembersType splitMembersType = (SplitMembersType) hVar.f288435c;
                x xVar = (x) hVar.d;
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar2 = this.f299191w;
                cVar2.H2(cVar2.z, new ryd.f(cVar2, b0Var, splitMembersType, splitBillsSummaryScreenContract$SplitSummaryTab, xVar, 15));
                break;
        }
        return Unit.f186387a;
    }
}
