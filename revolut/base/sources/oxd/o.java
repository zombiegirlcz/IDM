package oxd;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreenContract$InputData;
import e0f.r1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends oki.h implements k {
    public final AutoTopUpMethodsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u51.a f230779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f230780q;

    public o(cli.n stateMapper, AutoTopUpMethodsScreenContract$InputData inputData, u51.a topupMethodsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        this.o = inputData;
        this.f230779p = topupMethodsInteractor;
        this.f230780q = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nim.a.v(((r1) this.f230779p).j(this.o.f88198a.f306286a, yte.n.CURRENT, w4l.h.f294642c, null, null), new m(this, 0)), null, null, new n(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f230780q;
    }
}
