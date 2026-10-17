package ayf;

import ahd.y;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.t;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final txf.e f11174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f11175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f11176c;
    public final Set d;
    public final Set e;

    public n(txf.e travelBookingRepository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(travelBookingRepository, "travelBookingRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f11174a = travelBookingRepository;
        this.f11175b = dateProvider;
        this.f11176c = new ConcurrentHashMap();
        hxf.d[] elements = {hxf.d.FAILED, hxf.d.CANCELLED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.y0(elements);
        hxf.d[] elements2 = {hxf.d.PENDING, hxf.d.CONFIRMED};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        this.e = kotlin.collections.d.y0(elements2);
    }

    public static final ArrayList a(n nVar, List list, Function2 function2) {
        LocalDate localDateE = ((l80.f) nVar.f11175b).e();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Boolean) function2.invoke(localDateE, (hxf.a) obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final List b(n nVar, List list, boolean z) {
        nVar.getClass();
        return z ? d0.P0(list, new i()) : d0.P0(list, new j());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(ayf.n r9, gim.c r10) {
        /*
            txf.e r0 = r9.f11174a
            boolean r1 = r10 instanceof ayf.k
            if (r1 == 0) goto L15
            r1 = r10
            ayf.k r1 = (ayf.k) r1
            int r2 = r1.f11169y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f11169y = r2
            goto L1a
        L15:
            ayf.k r1 = new ayf.k
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.f11167w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f11169y
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            int r9 = r1.v
            java.util.Iterator r3 = r1.u
            yhm.o.b(r10)
            goto L47
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            yhm.o.b(r10)
            java.util.concurrent.ConcurrentHashMap r9 = r9.f11176c
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r3 = r9
            r9 = r4
        L47:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto La8
            java.lang.Object r10 = r3.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r6 = r10.getValue()
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            int r6 = r6.get()
            if (r6 <= 0) goto L82
            java.lang.Object r10 = r10.getKey()
            hxf.c r10 = (hxf.c) r10
            r1.getClass()
            r1.u = r3
            r1.v = r9
            r1.f11169y = r5
            w4l.f r6 = r0.d
            efm.b r10 = r6.g(r10, r4)
            java.lang.Object r10 = nim.a.a(r10, r1)
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            if (r10 != r6) goto L7d
            goto L7f
        L7d:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L7f:
            if (r10 != r2) goto L47
            return r2
        L82:
            java.lang.Object r10 = r10.getKey()
            hxf.c r10 = (hxf.c) r10
            r0.getClass()
            java.lang.String r6 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r6)
            ne0.d r6 = r0.f275391b
            java.lang.String r10 = i2b.a.a(r10)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "KEY_TRAVEL_BOOKINGS_"
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            r6.remove(r10)
            goto L47
        La8:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ayf.n.c(ayf.n, gim.c):java.lang.Object");
    }

    public final an9.g d(hxf.c request, boolean z, List list) {
        ConcurrentHashMap concurrentHashMap = this.f11176c;
        Object atomicInteger = concurrentHashMap.get(request);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger();
            concurrentHashMap.put(request, atomicInteger);
        }
        ((AtomicInteger) atomicInteger).incrementAndGet();
        txf.e eVar = this.f11174a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        List listC = u.c(new t(rd0.e.b(eVar.d.f(request, z)), new awd.b(this, request, (Continuation) null)));
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new a3i.i(((exf.a) it8.next()).a(), this, 26));
        }
        Flow[] flowArr = (Flow[]) d0.E0(arrayList, listC).toArray(new Flow[0]);
        return new an9.g(vkm.q.J((Flow[]) Arrays.copyOf(flowArr, flowArr.length)), 1);
    }

    public final h e(List bookingEventNotifiers, List list) {
        Intrinsics.checkNotNullParameter(bookingEventNotifiers, "bookingEventNotifiers");
        return new h(d(new hxf.c(hxf.d.CONFIRMED, 3, ((l80.f) this.f11175b).e(), list), false, bookingEventNotifiers), this, true, 0);
    }

    public final h f(List bookingEventNotifiers, boolean z, List list) {
        Intrinsics.checkNotNullParameter(bookingEventNotifiers, "bookingEventNotifiers");
        return new h(new y(d(new hxf.c(null, null, null, list), z, bookingEventNotifiers), this, new a(this, 0), 3), this, false, 0);
    }
}
