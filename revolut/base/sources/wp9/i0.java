package wp9;

import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299187a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplitBillsSummaryScreenContract$Step f299188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c f299189c;

    public /* synthetic */ i0(SplitBillsSummaryScreenContract$Step splitBillsSummaryScreenContract$Step, com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar) {
        this.f299188b = splitBillsSummaryScreenContract$Step;
        this.f299189c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f299187a) {
            case 0:
                bq9.c output = (bq9.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar = this.f299189c;
                cVar.H2(cVar.z, new wp5.v(output, this.f299188b, 3));
                return Unit.f186387a;
            default:
                fq9.e output2 = (fq9.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((SplitBillsSummaryScreenContract$Step.ItemizationMembers) this.f299188b).f79246a.f79277a.f79225a;
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar2 = this.f299189c;
                cVar2.H2(cVar2.z, new wp5.v(str, output2, 2));
                return Unit.f186387a;
        }
    }

    public /* synthetic */ i0(com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar, SplitBillsSummaryScreenContract$Step splitBillsSummaryScreenContract$Step) {
        this.f299189c = cVar;
        this.f299188b = splitBillsSummaryScreenContract$Step;
    }
}
