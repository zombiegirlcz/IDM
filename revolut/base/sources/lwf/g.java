package lwf;

import com.revolut.data.model.Data;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lkf.v;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransitSectionScreenContract$InputData f200453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ouf.a f200454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f200455r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f200456s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TransitSectionScreenContract$InputData inputData, ouf.a transportInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f200453p = inputData;
        this.f200454q = transportInteractor;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f200455r = z1VarB;
        this.f200456s = new c(new Data(null, null, true, 3, null), inputData.f92553c);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, new v(this.f200455r, this, 9), null, null, new lph.h(this, null, 11), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.f200456s;
    }
}
