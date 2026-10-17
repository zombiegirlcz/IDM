package cm8;

import cli.n;
import cli.y;
import com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.JuniorInviteCreationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends oki.h implements h {
    public final JuniorInviteCreationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zq.a f25165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f25166q;

    public k(n stateMapper, JuniorInviteCreationScreenContract$InputData inputData, zq.a juniorRemoteLoginInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorRemoteLoginInteractor, "juniorRemoteLoginInteractor");
        this.o = inputData;
        this.f25165p = juniorRemoteLoginInteractor;
        this.f25166q = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, q.P(new cbf.c(this.f25165p.u(this.o.f77223a, w4l.i.f294643c), 10), 1), null, new c65.i(this, null, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f25166q;
    }
}
