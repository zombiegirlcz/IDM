package d5g;

import cli.n;
import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_status.TravelFlightsBookingStatusScreenContract$InputData;
import cvi.j;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import vkm.q;
import vkm.t0;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends h implements e {
    public final TravelFlightsBookingStatusScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b4g.f f111416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f111417q;

    public f(n stateMapper, TravelFlightsBookingStatusScreenContract$InputData inputData, b4g.f repository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.o = inputData;
        this.f111416p = repository;
        this.f111417q = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Object objPutIfAbsent;
        String bookingId = this.o.f93283a;
        b4g.f fVar = this.f111416p;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        ConcurrentHashMap concurrentHashMap = fVar.e;
        Object objC = concurrentHashMap.get(bookingId);
        Continuation continuation = null;
        if (objC == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(bookingId, (objC = q.c(null)))) != null) {
            objC = objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getOrPut(...)");
        l.a1(this, new t0((Flow) objC, 1), null, null, new j(this, continuation, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f111417q;
    }
}
