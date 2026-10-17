package ilk;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pfk.x;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f162260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f162261q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, x pricingPlanCancelRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanCancelRepository, "pricingPlanCancelRepository");
        this.f162260p = pricingPlanCancelRepository;
        this.f162261q = new d(new Data(null, null, true, 3, null), null);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(nim.a.w(this.f162260p.f235709c.f(Unit.f186387a, false), new ijj.p(24))), null, null, new ibg.g(this, null, 17), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f162261q;
    }
}
