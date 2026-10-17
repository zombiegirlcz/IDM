package gtd;

import com.revolut.retail.feature.api.trips.models.Trip;
import fg8.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f146590b;

    public /* synthetic */ n(p pVar, int i) {
        this.f146589a = i;
        this.f146590b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f146589a) {
            case 0:
                g0j.a travel = (g0j.a) obj2;
                Intrinsics.checkNotNullParameter(travel, "travel");
                p pVar = this.f146590b;
                return nim.a.v(u0.m(pVar.f146594r.a(travel), boh.f.e(nim.a.v(j0j.a.a(pVar.f146595s.f136941a), new fo9.a(3)), new n(pVar, 1))), new gqd.s(pVar, travel, 6));
            default:
                od0.i activeTrip = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(activeTrip, "activeTrip");
                if (!activeTrip.d()) {
                    od0.i.Companion.getClass();
                    return new go.g(zi0.c.P(od0.i.f224256b, false, null, 3), 2);
                }
                p pVar2 = this.f146590b;
                fod.k kVar = pVar2.f146595s;
                Trip trip = (Trip) activeTrip.c();
                kVar.getClass();
                Intrinsics.checkNotNullParameter(trip, "trip");
                return nim.a.A(nim.a.v(boh.f.e(kVar.e(u.c(trip)), new y(kVar, trip, 25)), new gqd.s(pVar2, activeTrip, 7)), new gs2.t(6));
        }
    }
}
