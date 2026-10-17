package ox2;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.impl.card_design.card_personalisation_info.CardPersonalisationInfoScreenContract$InputData;
import ffk.t;
import go.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements dli.b {
    public final CardPersonalisationInfoScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f230540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f230541q;

    public b(n stateMapper, CardPersonalisationInfoScreenContract$InputData inputData, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.o = inputData;
        this.f230540p = pricingPlanInteractor;
        this.f230541q = mra.d.b(this, new c(inputData.f64677a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        hha.d dVar = this.o.f64678b;
        t tVar = this.f230540p;
        l.a1(this, yh5.b.d(dVar != null ? new g(new Data(dVar, null, false, 6, null), 2) : rd0.e.b(tVar.q()), rd0.e.b(tVar.n())), null, null, new oli.f(this, null, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f230541q;
    }
}
