package tuj;

import com.revolut.retail.feature.impl.travel_trips.data.network.TravelTripsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pti.s;
import puj.h;
import th6.p;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelTripsService f274617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f274618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f274619c;
    public final x4l.c d;
    public final x4l.c e;

    public g(TravelTripsService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f274617a = service;
        this.f274618b = memoryCache;
        this.f274619c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new p(this, continuation, 2), new Function1(this) { // from class: tuj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f274608b;

            {
                this.f274608b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String itineraryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
                        j jVar = this.f274608b.f274618b;
                        g.Companion.getClass();
                        return (puj.e) jVar.get(c.a(itineraryId));
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (h) this.f274608b.f274618b.get("CURRENT_ITINERARY");
                }
            }
        }, new Function2(this) { // from class: tuj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f274610b;

            {
                this.f274610b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String itineraryId = (String) obj2;
                        puj.e domain = (puj.e) obj3;
                        Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = this.f274610b.f274618b;
                        g.Companion.getClass();
                        jVar.f(c.a(itineraryId), domain);
                        break;
                    default:
                        h domain2 = (h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f274610b.f274618b.f("CURRENT_ITINERARY", domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new tna.p(this, continuation, 14), new sne.e(this, continuation, 7));
        final int i2 = 1;
        this.e = new x4l.c(new s(this, continuation, 19), new Function1(this) { // from class: tuj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f274608b;

            {
                this.f274608b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String itineraryId = (String) obj2;
                        Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
                        j jVar = this.f274608b.f274618b;
                        g.Companion.getClass();
                        return (puj.e) jVar.get(c.a(itineraryId));
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (h) this.f274608b.f274618b.get("CURRENT_ITINERARY");
                }
            }
        }, new Function2(this) { // from class: tuj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f274610b;

            {
                this.f274610b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String itineraryId = (String) obj2;
                        puj.e domain = (puj.e) obj3;
                        Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        j jVar = this.f274610b.f274618b;
                        g.Companion.getClass();
                        jVar.f(c.a(itineraryId), domain);
                        break;
                    default:
                        h domain2 = (h) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f274610b.f274618b.f("CURRENT_ITINERARY", domain2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new tk5.c(this, continuation, 19), new ska.c(this, continuation, 12));
    }

    public static final boolean a(g gVar, Throwable th10) {
        Integer numM;
        gVar.getClass();
        return (th10 == null || (numM = n14.e.m(th10)) == null || numM.intValue() != 404) ? false : true;
    }
}
