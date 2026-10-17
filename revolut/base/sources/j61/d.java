package j61;

import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import sjf.e;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f171659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransactionsPerformanceTracker$Scenario f171660c;

    public /* synthetic */ d(e eVar, TransactionsPerformanceTracker$Scenario transactionsPerformanceTracker$Scenario, int i) {
        this.f171658a = i;
        this.f171659b = eVar;
        this.f171660c = transactionsPerformanceTracker$Scenario;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f171658a) {
            case 0:
                this.f171659b.d(this.f171660c);
                break;
            default:
                this.f171659b.b(this.f171660c);
                break;
        }
        return Unit.f186387a;
    }
}
