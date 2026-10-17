package e65;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv6.e f122912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Loan f122913c;

    public /* synthetic */ q(rv6.e eVar, Loan loan, int i) {
        this.f122911a = i;
        this.f122912b = eVar;
        this.f122913c = loan;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f122911a) {
            case 0:
                Object objCollect = this.f122912b.collect(new p(flowCollector, this.f122913c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f122912b.collect(new p(flowCollector, this.f122913c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
