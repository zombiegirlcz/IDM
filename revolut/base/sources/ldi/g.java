package ldi;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nxa.v;
import nyb.m;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements a39.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f194138b;

    public g(eub.a revPointsAvailabilityInteractor, int i) {
        this.f194137a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
                this.f194138b = revPointsAvailabilityInteractor;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
                this.f194138b = revPointsAvailabilityInteractor;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
                this.f194138b = revPointsAvailabilityInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
                this.f194138b = revPointsAvailabilityInteractor;
                break;
        }
    }

    @Override // a39.a
    public final Flow a() {
        switch (this.f194137a) {
            case 0:
                return nim.a.v(((nyb.b) this.f194138b).d(), new lbh.a(16));
            case 1:
                return nim.a.v(((nyb.b) this.f194138b).c(), new lv9.c(2));
            case 2:
                return nim.a.v(((nyb.b) this.f194138b).c(), new v(26));
            default:
                return nim.a.v(((nyb.b) this.f194138b).e(), new m(11));
        }
    }
}
