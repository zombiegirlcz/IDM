package mrc;

import cli.y;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.status.SalarySwitchStatusContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends oki.h implements b {
    public final SalarySwitchStatusContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aqc.k f208110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wsg.n f208111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f208112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f208113s;

    public l(cli.n stateMapper, SalarySwitchStatusContract$InputData inputData, aqc.k salarySwitchProcessInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(salarySwitchProcessInteractor, "salarySwitchProcessInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = inputData;
        this.f208110p = salarySwitchProcessInteractor;
        this.f208111q = walletInteractor;
        this.f208112r = new vii.b();
        this.f208113s = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        j jVar = new j(0, continuation, this);
        vii.b bVar = this.f208112r;
        wkm.l lVarQ = q.Q(bVar, jVar);
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new k(0, null, this), 3);
        yji.l.a1(this, rd0.e.n(q.Q(bVar, new j(1, continuation, this)), h0Var), null, null, new k(1, null, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f208113s;
    }
}
