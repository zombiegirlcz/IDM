package q97;

import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsHomeKompotDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class q0 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.r f243771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t97.c productCellProvider, r10.r availabilityInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        this.f243771b = availabilityInteractor;
        this.f243772c = t97.d.HOTELS_POINTS;
    }

    @Override // r97.b
    public final Flow d() {
        return new go.g(Boolean.valueOf(this.f243771b.t()), 2);
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243772c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.d(new TravelHotelsHomeKompotDestination(null, r8g.a.TRANSFERS, null, 5));
    }
}
