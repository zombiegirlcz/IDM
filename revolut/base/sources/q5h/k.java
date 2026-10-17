package q5h;

import cli.y;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.screens.additional_services.CommodityAdditionalServicesControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pkf.x;
import q2e.i0;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements h {
    public final kpj.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CommodityAdditionalServicesControllerContract$InputData f242405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f242406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f242407r;

    public k(kpj.f interactor, CommodityAdditionalServicesControllerContract$InputData inputData, m stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f242405p = inputData;
        this.f242406q = mra.d.b(this, new i(0), stateMapper, null, false, 12);
        this.f242407r = new vii.b(w4l.i.f294643c);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f242407r, new x(continuation, this, 27)), null, null, new i0(this, continuation, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f242406q;
    }
}
