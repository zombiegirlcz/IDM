package vmj;

import cli.n;
import cli.y;
import cli.z;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreenContract$InputData;
import dfj.g3;
import dfj.k3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vdl.c1;
import vfg.m;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends oki.h implements z {
    public final EsimShareQrCodeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g3 f290610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k3 f290611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ymj.a f290612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f290613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f290614t;

    public j(EsimShareQrCodeScreenContract$InputData inputData, g3 contentInteractor, k3 imageInteractor, ymj.a shotDialogModelBuilder, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contentInteractor, "contentInteractor");
        Intrinsics.checkNotNullParameter(imageInteractor, "imageInteractor");
        Intrinsics.checkNotNullParameter(shotDialogModelBuilder, "shotDialogModelBuilder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f290610p = contentInteractor;
        this.f290611q = imageInteractor;
        this.f290612r = shotDialogModelBuilder;
        this.f290613s = mra.d.b(this, new h(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f290614t = new vii.b(w4l.i.f294643c);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f290614t, new c1(continuation, this, 17)), null, null, new m(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f290613s;
    }
}
