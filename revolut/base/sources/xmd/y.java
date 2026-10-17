package xmd;

import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetupBudgetController f307218b;

    public /* synthetic */ y(SetupBudgetController setupBudgetController, int i) {
        this.f307217a = i;
        this.f307218b = setupBudgetController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f307217a;
        SetupBudgetController setupBudgetController = this.f307218b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = SetupBudgetController.X;
                setupBudgetController.f3();
                break;
            default:
                KProperty[] kPropertyArr2 = SetupBudgetController.X;
                setupBudgetController.f3();
                break;
        }
    }
}
