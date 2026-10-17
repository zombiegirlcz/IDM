package d38;

import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110931a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f110932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f110933c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public f(Flow flow, int i, g gVar, String str, InvestTransactionsFilter investTransactionsFilter) {
        this.f110932b = flow;
        this.d = i;
        this.e = gVar;
        this.f110933c = str;
        this.f = investTransactionsFilter;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f110931a) {
            case 0:
                Object objCollect = this.f110932b.collect(new e(flowCollector, this.d, (g) this.e, this.f110933c, (InvestTransactionsFilter) this.f), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f110932b.collect(new e(this.d, 1, flowCollector, (ge5.g) this.e, this.f110933c, (xi0.b) this.f), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public f(Flow flow, ge5.g gVar, String str, int i, xi0.b bVar) {
        this.f110932b = flow;
        this.e = gVar;
        this.f110933c = str;
        this.d = i;
        this.f = bVar;
    }
}
