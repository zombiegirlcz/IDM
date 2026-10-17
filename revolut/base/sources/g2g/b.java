package g2g;

import c1g.u;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends jki.g implements n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperiencesFilterScreenContract$InputData f140052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hyf.b f140053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f140054r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TravelExperiencesFilterScreenContract$InputData inputData, jki.p stateMapper, hyf.b travelExperiencesInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(travelExperiencesInteractor, "travelExperiencesInteractor");
        this.f140052p = inputData;
        this.f140053q = travelExperiencesInteractor;
        this.f140054r = new l(new Data(null, null, false, 7, null), inputData.f93069a);
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f140054r;
    }

    public final void y2() {
        yji.l.a1(this, nim.a.v(((u) this.f140053q).a(this.f140052p.f93070b), new g1.b(this, 18)), null, null, new g06.k(this, null, 6), 3);
    }
}
