package f9b;

import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf.c f132888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f132889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f132890c;

    public /* synthetic */ a(yf.c cVar, boolean z, boolean z3) {
        this.f132888a = cVar;
        this.f132889b = z;
        this.f132890c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mpi.d dVar;
        BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) ((WeakReference) this.f132888a.b).get();
        if (baseDelegatesActivity == null || (dVar = (mpi.d) baseDelegatesActivity.b(mpi.d.class)) == null) {
            return;
        }
        if (this.f132889b) {
            dVar.Q(this.f132890c ? mpi.b.STATUS_VIEW : mpi.b.BOTTOM_DIALOG);
        } else {
            dVar.O();
        }
    }
}
