package mvj;

import cli.g;
import cli.k;
import cli.y;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements dli.b {
    public final TravelItineraryRemoveEventContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yuj.a f209265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f209266q;

    public b(TravelItineraryRemoveEventContract$InputData inputData, yuj.a interactor, c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f209265p = interactor;
        this.f209266q = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f209266q;
    }
}
