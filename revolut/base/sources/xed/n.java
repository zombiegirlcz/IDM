package xed;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends jki.g implements h {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final efd.a f304630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g1 f304631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ped.a f304632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f304633s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SharedCompletedAlertsScreenContract$InputData inputData, efd.a alertsInteractor, p stateMapper, g1 shotDialogDisplayer, ped.a alertsDialogFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(alertsDialogFactory, "alertsDialogFactory");
        this.f304630p = alertsInteractor;
        this.f304631q = shotDialogDisplayer;
        this.f304632r = alertsDialogFactory;
        this.f304633s = new e(inputData.f86730a, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(((l2d.n) this.f304630p).c(new mgd.g(u.c(((e) t2()).f304616a), u.c(mgd.d.COMPLETED), (List) null, (List) null, (Integer) 100, false, (List) null, Constants.TAG_OS_VERSION), true)), null, new x64.b(this, null, 19), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f304633s;
    }
}
