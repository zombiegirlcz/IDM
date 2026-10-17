package god;

import a07.p;
import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.TripsCountryPickerContract$InputData;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements dli.b {
    public final TripsCountryPickerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f145149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j0j.a f145150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f145151r;

    public m(TripsCountryPickerContract$InputData inputData, i interactor, j0j.a tripsInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(tripsInteractor, "tripsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f145149p = interactor;
        this.f145150q = tripsInteractor;
        Map map = inputData.f87605a;
        this.f145151r = mra.d.b(this, new a(map == null ? r0.g() : map, 7), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, this.f145149p.e("", false, null), null, new l(this, continuation, 0), 3);
        if (this.o.f87605a == null) {
            yji.l.b1(this, q.q(new p(j0j.a.a(this.f145150q), 18)), null, new l(this, continuation, 1), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f145151r;
    }
}
