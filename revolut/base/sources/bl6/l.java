package bl6;

import bi2.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import th6.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements dli.b {
    public final rg6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f16485p;

    public l(h inputData, rg6.a pseAppInteractor, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pseAppInteractor, "pseAppInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = pseAppInteractor;
        this.f16485p = mra.d.b(this, new g(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        rg6.a aVar = this.o;
        aVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        b0 b0Var = aVar.f254042a;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, b0Var.f271267c.b(Unit.f186387a, loadingStrategy), null, null, new n(this, null, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f16485p;
    }
}
