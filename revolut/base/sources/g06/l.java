package g06;

import cli.n;
import cli.y;
import com.revolut.feature.customer_present.tips.impl.screen.select_tip.SelectTipScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements h {
    public final t53.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f139362p;

    public l(t53.a tipsInteractor, SelectTipScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(tipsInteractor, "tipsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = tipsInteractor;
        this.f139362p = mra.d.b(this, new e(f0.f322471a, inputData.f71621a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, mo3.a.g(this.o.a(w4l.j.f294644c), null, null, 3), null, null, new k(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f139362p;
    }
}
