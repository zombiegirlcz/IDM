package bij;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import dfj.k0;
import dfj.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends oki.h implements f {
    public final k0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eij.a f15524p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f15525q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f15526r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f15527s;

    public k(n stateMapper, k0 esimInstallationStateInteractor, eij.a esimInstallationStatePicker, u connectivityTroubleshootingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationStatePicker, "esimInstallationStatePicker");
        Intrinsics.checkNotNullParameter(connectivityTroubleshootingInteractor, "connectivityTroubleshootingInteractor");
        this.o = esimInstallationStateInteractor;
        this.f15524p = esimInstallationStatePicker;
        this.f15525q = connectivityTroubleshootingInteractor;
        this.f15526r = mra.d.b(this, new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f15527s = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        i iVar = new i(0, this, continuation);
        vii.b bVar = this.f15527s;
        yji.l.a1(this, nim.a.v(q.Q(bVar, iVar), new h(this, 0)), null, null, new j(0, this, null), 3);
        yji.l.a1(this, q.Q(bVar, new i(1, this, continuation)), null, null, new j(1, this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f15526r;
    }
}
