package cie;

import android.view.View;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f24461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountsController f24462c;

    public /* synthetic */ d(View view, AccountsController accountsController, int i) {
        this.f24460a = i;
        this.f24461b = view;
        this.f24462c = accountsController;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24460a;
        AccountsController accountsController = this.f24462c;
        switch (i) {
            case 0:
                aoi.g.a().f("FIRST_SCREEN_LAUNCH");
                KProperty[] kPropertyArr = AccountsController.O0;
                ((sjf.e) accountsController.A0.getValue()).c(TransactionsPerformanceTracker$Scenario.HOME_UI, "screenDrawn");
                break;
            default:
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                dVar.Q.c3();
                if (dVar.l0 && dVar.f89705n0) {
                    dVar.n2(new s0(2, dVar, null), new whi.b(6));
                    break;
                }
                break;
        }
    }
}
