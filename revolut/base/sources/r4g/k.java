package r4g;

import cli.n;
import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements i {
    public final TravelFlightsAirlinesFilterScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f251459p;

    public k(n stateMapper, TravelFlightsAirlinesFilterScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        Set set = inputData.f93238b;
        m70.a.c(t0.f186434a);
        this.f251459p = mra.d.b(this, new g("", set, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f251459p;
    }
}
