package poe;

import com.revolut.data.model.Data;
import com.revolut.feature.tax_residency.impl.screens.rationales.RationalesScreenContract$InputData;
import efm.r;
import jki.p;
import joe.o;
import kotlin.jvm.internal.Intrinsics;
import pij.d1;
import po9.w;
import skm.a2;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yme.a f237969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RationalesScreenContract$InputData f237970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f237971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f237972s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yme.a taxResidencyInteractor, RationalesScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f237969p = taxResidencyInteractor;
        this.f237970q = inputData;
        this.f237972s = new f(new Data(null, null, false, 7, null), null);
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f237972s;
    }

    public final void y2() {
        a2 a2Var = this.f237971r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        wi0.b countryCode = this.f237970q.f90104a;
        hoe.a aVar = (hoe.a) this.f237969p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        o oVar = (o) aVar.f154277a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        r rVarDoOnNext = oVar.f.f(new joe.g(countryCode), false).doOnNext(new w(1, new d1(this, 27)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        this.f237971r = l.a1(this, rd0.e.b(mo3.a.n(rVarDoOnNext)), null, null, null, 7);
    }
}
