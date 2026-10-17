package v1g;

import c1g.u;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import up2.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements g {
    public final TravelExperiencesCategoriesFiltersScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hyf.b f285313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f285314q;

    public i(n stateMapper, TravelExperiencesCategoriesFiltersScreenContract$InputData inputData, hyf.b travelExperiencesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelExperiencesInteractor, "travelExperiencesInteractor");
        this.o = inputData;
        this.f285313p = travelExperiencesInteractor;
        this.f285314q = mra.d.b(this, new e(new Data(null, null, false, 7, null), inputData.f93044a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, nim.a.v(((u) this.f285313p).a(this.o.f93045b), new v0k.g(16)), null, null, new q(this, null, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f285314q;
    }
}
