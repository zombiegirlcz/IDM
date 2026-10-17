package o2g;

import c1g.u;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h implements dli.b {
    public final TravelExperiencesItineraryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hyf.b f221621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f221622q;

    public e(n stateMapper, TravelExperiencesItineraryScreenContract$InputData inputData, hyf.b travelExperiencesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelExperiencesInteractor, "travelExperiencesInteractor");
        this.o = inputData;
        this.f221621p = travelExperiencesInteractor;
        this.f221622q = mra.d.b(this, new c(new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String experienceId = this.o.f93079a;
        u uVar = (u) this.f221621p;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        l.a1(this, nim.a.v(uVar.c(experienceId), new c09.a(uVar)), null, null, new nwc.f(this, null, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f221622q;
    }
}
