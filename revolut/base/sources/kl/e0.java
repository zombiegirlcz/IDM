package kl;

import androidx.lifecycle.ViewModel;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes17.dex */
public final class e0 extends ViewModel {
    public final hl.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OnfidoRemoteConfig f185172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SchedulersProvider f185173m;
    public final WaitingScreenTracker o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CompositeDisposable f185174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f185175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f185176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f185177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f185178t;

    public e0(hl.a workflowTaskDataSource, OnfidoRemoteConfig remoteConfig, SchedulersProvider schedulersProvider, WaitingScreenTracker waitingScreenTracker) {
        Intrinsics.checkNotNullParameter(workflowTaskDataSource, "workflowTaskDataSource");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(waitingScreenTracker, "waitingScreenTracker");
        this.k = workflowTaskDataSource;
        this.f185172l = remoteConfig;
        this.f185173m = schedulersProvider;
        this.o = waitingScreenTracker;
        this.f185174p = new CompositeDisposable();
        j2 j2VarC = vkm.q.c(y.f185251a);
        this.f185175q = j2VarC;
        this.f185176r = j2VarC;
        this.f185177s = "";
        this.f185178t = "";
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f185174p.d();
    }
}
