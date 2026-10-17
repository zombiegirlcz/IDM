package whe;

import android.view.View;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import eoi.r;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f297624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f297625c;

    public /* synthetic */ b(View view, c cVar, int i) {
        this.f297623a = i;
        this.f297624b = view;
        this.f297625c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f297623a) {
            case 0:
                c cVar = this.f297625c;
                sjf.e eVar = cVar.f297628c;
                TransactionsPerformanceTracker$Scenario transactionsPerformanceTracker$Scenario = TransactionsPerformanceTracker$Scenario.HOME_UI;
                eVar.c(transactionsPerformanceTracker$Scenario, "balanceDrawn");
                cVar.f297631j = true;
                if (cVar.f297629g) {
                    eVar.b(transactionsPerformanceTracker$Scenario);
                    r.e("legacyDuration", false);
                }
                break;
            default:
                c cVar2 = this.f297625c;
                sjf.e eVar2 = cVar2.f297628c;
                TransactionsPerformanceTracker$Scenario transactionsPerformanceTracker$Scenario2 = TransactionsPerformanceTracker$Scenario.HOME_UI;
                eVar2.c(transactionsPerformanceTracker$Scenario2, "itemsDrawn");
                cVar2.f297629g = true;
                if (cVar2.f297631j) {
                    eVar2.b(transactionsPerformanceTracker$Scenario2);
                    r.e("legacyDuration", false);
                }
                break;
        }
    }
}
