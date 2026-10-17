package androidx.view;

import android.content.IntentSender;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.profileinstaller.DeviceProfileWriter;
import androidx.profileinstaller.ProfileInstaller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.contract.ActivityResultContract;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsController;
import fci.l0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6794c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(int i, StockFinancialsStatementsController stockFinancialsStatementsController, Integer num) {
        this.f6792a = 3;
        this.f6794c = i;
        this.f6793b = stockFinancialsStatementsController;
        this.d = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6792a) {
            case 0:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0((ComponentActivity$activityResultRegistry$1) this.f6793b, this.f6794c, (ActivityResultContract.SynchronousResult) this.d);
                break;
            case 1:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$1((ComponentActivity$activityResultRegistry$1) this.f6793b, this.f6794c, (IntentSender.SendIntentException) this.d);
                break;
            case 2:
                l0 l0Var = (l0) this.f6793b;
                ArrayList arrayList = (ArrayList) this.d;
                l0Var.e = null;
                l0Var.d(this.f6794c + 1, arrayList);
                break;
            case 3:
                StockFinancialsStatementsController stockFinancialsStatementsController = (StockFinancialsStatementsController) this.f6793b;
                Integer num = (Integer) this.d;
                if (this.f6794c == stockFinancialsStatementsController.Q) {
                    if (num != null) {
                        stockFinancialsStatementsController.d3().d.setCurrentItem(num.intValue(), false);
                    }
                    stockFinancialsStatementsController.S = false;
                    break;
                }
                break;
            case 4:
                TripsListController tripsListController = (TripsListController) this.f6793b;
                RecyclerView recyclerView = (RecyclerView) this.d;
                if (tripsListController.j0 == this.f6794c) {
                    recyclerView.setItemAnimator(tripsListController.i0);
                }
                break;
            case 5:
                ((DrmSessionEventListener.EventDispatcher) this.f6793b).lambda$drmSessionAcquired$0((DrmSessionEventListener) this.d, this.f6794c);
                break;
            case 6:
                ((DeviceProfileWriter) this.f6793b).lambda$result$0(this.f6794c, this.d);
                break;
            default:
                ((ProfileInstaller.DiagnosticsCallback) this.f6793b).onResultReceived(this.f6794c, this.d);
                break;
        }
    }

    public /* synthetic */ j(Object obj2, int i, Object obj3, int i2) {
        this.f6792a = i2;
        this.f6793b = obj2;
        this.f6794c = i;
        this.d = obj3;
    }

    public /* synthetic */ j(Object obj2, Object obj3, int i, int i2) {
        this.f6792a = i2;
        this.f6793b = obj2;
        this.d = obj3;
        this.f6794c = i;
    }
}
