package ood;

import com.revolut.retail.feature.api.trips.models.Trip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f227093a = vkm.q.c(new t0(zhm.f0.f322471a, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w0 f227094b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final boolean a(Trip trip) {
        ?? A;
        Object v0Var;
        j2 j2Var = this.f227093a;
        w0 w0Var = (w0) j2Var.getValue();
        w0 w0Var2 = this.f227094b;
        if (trip != null) {
            List listA = w0Var.a();
            A = new ArrayList();
            for (Object obj2 : listA) {
                if (!Intrinsics.f(((Trip) obj2).f99263a, trip.f99263a)) {
                    A.add(obj2);
                }
            }
        } else {
            A = w0Var.a();
        }
        int i = 0;
        if (w0Var instanceof t0) {
            return false;
        }
        if (w0Var instanceof v0) {
            t0 t0Var = new t0(A, null);
            j2Var.getClass();
            j2Var.g(null, t0Var);
            return true;
        }
        if (!(w0Var instanceof u0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (trip != null) {
            Iterable iterable = (Iterable) A;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(((Trip) it8.next()).d, ((u0) w0Var).f227085b) && (i = i + 1) < 0) {
                        zhm.v.r();
                        throw null;
                    }
                }
            }
            v0Var = i > 1 ? new v0(A, ((u0) w0Var).f227085b) : new t0(A, null);
        } else {
            v0Var = w0Var2 instanceof v0 ? new v0(A, ((u0) w0Var).f227085b) : new t0(A, null);
        }
        j2Var.getClass();
        j2Var.g(null, v0Var);
        return true;
    }

    public final void b(List selectedTrips) {
        Object v0Var;
        Intrinsics.checkNotNullParameter(selectedTrips, "selectedTrips");
        j2 j2Var = this.f227093a;
        w0 w0Var = (w0) j2Var.getValue();
        List listA = w0Var.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : selectedTrips) {
            Trip trip = (Trip) obj2;
            List list = listA;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(((Trip) it8.next()).f99263a, trip.f99263a)) {
                        break;
                    }
                }
            }
            arrayList.add(obj2);
        }
        if (!arrayList.isEmpty()) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "TripsStateHolder", "Trying to update the state with non existent trips", null, h0Var);
            return;
        }
        if (selectedTrips.isEmpty()) {
            v0Var = new t0(listA, null);
        } else if (selectedTrips.size() == 1) {
            Trip trip2 = (Trip) zhm.d0.b0(selectedTrips);
            v0Var = new u0(trip2.f99263a, listA, trip2.d);
        } else {
            wi0.b bVar = ((Trip) zhm.d0.b0(selectedTrips)).d;
            List list2 = selectedTrips;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    if (!Intrinsics.f(((Trip) it9.next()).d, bVar)) {
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "TripsStateHolder", "Trying to update the state with trips from different countries", null, h0Var2);
                        return;
                    }
                }
            }
            v0Var = new v0(listA, bVar);
        }
        j2Var.getClass();
        j2Var.g(null, v0Var);
        this.f227094b = w0Var;
    }
}
