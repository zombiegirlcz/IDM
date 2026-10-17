package suf;

import com.revolut.feature.transport.impl.data.TransportService;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import cvf.i;
import cvf.m;
import cvf.y;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pti.s;
import skm.e0;
import skm.p0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportService f265753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vuf.h f265754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f265755c;
    public final ue0.c d;
    public final l80.e e;
    public final wj0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f265756g;

    public h(TransportService service, vuf.h purchasedTransitTicketsDao, j memoryCache, ue0.c storage, l80.e dateProvider, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(purchasedTransitTicketsDao, "purchasedTransitTicketsDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f265753a = service;
        this.f265754b = purchasedTransitTicketsDao;
        this.f265755c = memoryCache;
        this.d = storage;
        this.e = dateProvider;
        this.f = idempotencyKeyHolder;
        Continuation continuation = null;
        this.f265756g = new x4l.c(new s(this, continuation, 14), new sl5.a(this, 20), new a(this, 0), new se4.c(this, continuation, 21), new ska.c(this, continuation, 4));
    }

    public static final ArrayList a(h hVar, List list) {
        vuf.h hVar2 = hVar.f265754b;
        LocalDateTime localDateTimeC = hVar.c();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            PurchasedTransitTicket purchasedTransitTicketA = yuf.a.a((i) it8.next(), localDateTimeC);
            if (purchasedTransitTicketA != null) {
                arrayList.add(purchasedTransitTicketA);
            }
        }
        List listA = hVar2.a();
        ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
        Iterator it9 = listA.iterator();
        while (it9.hasNext()) {
            arrayList2.add(vuf.b.c((vuf.e) it9.next(), localDateTimeC));
        }
        ArrayList arrayListE0 = d0.E0(arrayList2, arrayList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayListE0) {
            if (hashSet.add(((PurchasedTransitTicket) obj2).getF92682a())) {
                arrayList3.add(obj2);
            }
        }
        hVar.f265755c.f("USER_TRANSIT_TICKETS_KEY", arrayList3);
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it10 = arrayList3.iterator();
        while (it10.hasNext()) {
            arrayList4.add(vuf.b.f((PurchasedTransitTicket) it10.next(), localDateTimeC));
        }
        hVar2.c(arrayList4);
        return arrayList3;
    }

    public final Object b(bxf.c cVar, String str, gim.c cVar2) throws Throwable {
        List<bxf.a> list = cVar.f19674b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (bxf.a aVar : list) {
            arrayList.add(new m(aVar.f19671a, aVar.f19672b));
        }
        sma.f fVar = new sma.f(this, cVar, new y(str, arrayList), (Continuation) null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, fVar, cVar2);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final LocalDateTime c() {
        return ((l80.f) this.e).f();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.ArrayList r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof suf.f
            if (r0 == 0) goto L13
            r0 = r7
            suf.f r0 = (suf.f) r0
            int r1 = r0.f265750w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f265750w = r1
            goto L18
        L13:
            suf.f r0 = new suf.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f265750w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28
            goto L48
        L28:
            r6 = move-exception
            goto L4b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            suf.g r7 = new suf.g     // Catch: java.lang.Exception -> L28
            r2 = 0
            r7.<init>(r5, r6, r4, r2)     // Catch: java.lang.Exception -> L28
            skm.p0 r6 = skm.p0.f264001a     // Catch: java.lang.Exception -> L28
            elm.f r6 = elm.f.f127540b     // Catch: java.lang.Exception -> L28
            r0.f265750w = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = skm.e0.J(r6, r7, r0)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L48
            return r1
        L48:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L28
            return r7
        L4b:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "Error fetching RevPoints"
            rd0.d.a(r0, r1, r4, r6, r7)
            zhm.f0 r6 = zhm.f0.f322471a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: suf.h.d(java.util.ArrayList, gim.c):java.lang.Object");
    }
}
