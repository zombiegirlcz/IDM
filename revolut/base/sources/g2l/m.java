package g2l;

import cli.y;
import com.revolut.retail.feature.travel_status.impl.ui.screens.overview.TravelStatusOverviewScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends oki.h implements dli.b {
    public final ugc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f140145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f140146q;

    public m(TravelStatusOverviewScreenContract$InputData inputData, ugc.a overviewInteractor, o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(overviewInteractor, "overviewInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = overviewInteractor;
        this.f140145p = new vii.b(w4l.i.f294643c);
        this.f140146q = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f140145p, new f5h.b(continuation, this, 23)), null, null, new g06.k(this, continuation, 8), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (j2 > 0) {
            this.f140145p.a();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f140146q;
    }
}
