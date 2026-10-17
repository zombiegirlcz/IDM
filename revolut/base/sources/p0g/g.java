package p0g;

import androidx.room.RxRoom;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.travel.experiences.api.models.search.TravelRecentSearchType;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestinationBrief;
import com.revolut.feature.travel.experiences.api.models.search.recent.TravelRecentSearchLocation;
import com.revolut.feature.travel.experiences.impl.network.search.TravelExperiencesSearchService;
import efm.d0;
import java.lang.reflect.Type;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ozc.j0;
import ozc.n;
import sx2.h;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesSearchService f231537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.f f231538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f231539c;
    public final j d;
    public final w4l.f e;

    public g(TravelExperiencesSearchService service, t0g.f recentSearchDao, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(recentSearchDao, "recentSearchDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f231537a = service;
        this.f231538b = recentSearchDao;
        this.f231539c = storage;
        this.d = memoryCache;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: p0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f231531b;

            {
                this.f231531b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String destinationId = (String) obj2;
                        TravelSearchDestinationBrief destination = (TravelSearchDestinationBrief) obj3;
                        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
                        Intrinsics.checkNotNullParameter(destination, "destination");
                        ue0.c cVar = this.f231531b.f231539c;
                        String strA = g.a(destinationId);
                        Intrinsics.checkNotNullParameter(destination, "<this>");
                        c0g.b bVar = new c0g.b(destination.f92891a, destination.f92892b);
                        Type type = TypeToken.get(c0g.b.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        cVar.G(bVar, strA, type);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String destinationId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(destinationId2, "destinationId");
                        d0<c0g.b> destination2 = this.f231531b.f231537a.getDestination(destinationId2);
                        j0 j0Var = new j0(21, new n(29));
                        destination2.getClass();
                        i iVar = new i(destination2, j0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String destinationId3 = (String) obj2;
                        TravelSearchDestinationBrief destination3 = (TravelSearchDestinationBrief) obj3;
                        Intrinsics.checkNotNullParameter(destinationId3, "destinationId");
                        Intrinsics.checkNotNullParameter(destination3, "destination");
                        this.f231531b.d.f(g.a(destinationId3), destination3);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: p0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f231534b;

            {
                this.f231534b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String destinationId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
                        return (TravelSearchDestinationBrief) this.f231534b.d.get(g.a(destinationId));
                    default:
                        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
                        ue0.c cVar = this.f231534b.f231539c;
                        String strA = g.a(destinationId);
                        Type type = TypeToken.get(c0g.b.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        c0g.b bVar = (c0g.b) cVar.T2(strA, type);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        return new TravelSearchDestinationBrief(bVar.getId(), bVar.getName());
                }
            }
        };
        final int i3 = 2;
        Function2 function22 = new Function2(this) { // from class: p0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f231531b;

            {
                this.f231531b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String destinationId = (String) obj2;
                        TravelSearchDestinationBrief destination = (TravelSearchDestinationBrief) obj3;
                        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
                        Intrinsics.checkNotNullParameter(destination, "destination");
                        ue0.c cVar = this.f231531b.f231539c;
                        String strA = g.a(destinationId);
                        Intrinsics.checkNotNullParameter(destination, "<this>");
                        c0g.b bVar = new c0g.b(destination.f92891a, destination.f92892b);
                        Type type = TypeToken.get(c0g.b.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        cVar.G(bVar, strA, type);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String destinationId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(destinationId2, "destinationId");
                        d0<c0g.b> destination2 = this.f231531b.f231537a.getDestination(destinationId2);
                        j0 j0Var = new j0(21, new n(29));
                        destination2.getClass();
                        i iVar = new i(destination2, j0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String destinationId3 = (String) obj2;
                        TravelSearchDestinationBrief destination3 = (TravelSearchDestinationBrief) obj3;
                        Intrinsics.checkNotNullParameter(destinationId3, "destinationId");
                        Intrinsics.checkNotNullParameter(destination3, "destination");
                        this.f231531b.d.f(g.a(destinationId3), destination3);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 1;
        Function1 function12 = new Function1(this) { // from class: p0g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f231534b;

            {
                this.f231534b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String destinationId = (String) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
                        return (TravelSearchDestinationBrief) this.f231534b.d.get(g.a(destinationId));
                    default:
                        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
                        ue0.c cVar = this.f231534b.f231539c;
                        String strA = g.a(destinationId);
                        Type type = TypeToken.get(c0g.b.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        c0g.b bVar = (c0g.b) cVar.T2(strA, type);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        return new TravelSearchDestinationBrief(bVar.getId(), bVar.getName());
                }
            }
        };
        final int i6 = 0;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: p0g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f231531b;

            {
                this.f231531b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        String destinationId = (String) obj2;
                        TravelSearchDestinationBrief destination = (TravelSearchDestinationBrief) obj3;
                        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
                        Intrinsics.checkNotNullParameter(destination, "destination");
                        ue0.c cVar = this.f231531b.f231539c;
                        String strA = g.a(destinationId);
                        Intrinsics.checkNotNullParameter(destination, "<this>");
                        c0g.b bVar = new c0g.b(destination.f92891a, destination.f92892b);
                        Type type = TypeToken.get(c0g.b.class).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        cVar.G(bVar, strA, type);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String destinationId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(destinationId2, "destinationId");
                        d0<c0g.b> destination2 = this.f231531b.f231537a.getDestination(destinationId2);
                        j0 j0Var = new j0(21, new n(29));
                        destination2.getClass();
                        i iVar = new i(destination2, j0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String destinationId3 = (String) obj2;
                        TravelSearchDestinationBrief destination3 = (TravelSearchDestinationBrief) obj3;
                        Intrinsics.checkNotNullParameter(destinationId3, "destinationId");
                        Intrinsics.checkNotNullParameter(destination3, "destination");
                        this.f231531b.d.f(g.a(destinationId3), destination3);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(String str) {
        return j6.a.q("DESTINATION_BRIEF_", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p0g.e
            if (r0 == 0) goto L13
            r0 = r7
            p0g.e r0 = (p0g.e) r0
            int r1 = r0.f231535w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231535w = r1
            goto L18
        L13:
            p0g.e r0 = new p0g.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f231535w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            t0g.f r7 = r6.f231538b
            androidx.room.RoomDatabase r7 = r7.f267032a
            java.lang.String r2 = "travel_experiences_recent_search_destination"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            szb.g r4 = new szb.g
            r5 = 16
            r4.<init>(r5)
            r5 = 0
            efm.r r7 = androidx.room.RxRoom.createObservable(r7, r5, r2, r4)
            p0g.b r2 = new p0g.b
            r4 = 1
            r2.<init>(r4)
            ozc.j0 r4 = new ozc.j0
            r5 = 23
            r4.<init>(r5, r2)
            efm.r r7 = r7.map(r4)
            java.lang.String r2 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            efm.r r7 = te0.w.f0(r7)
            r0.f231535w = r3
            java.lang.Object r7 = nim.a.c(r7, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0g.g.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, org.joda.time.DateTime r7, org.joda.time.DateTime r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof p0g.f
            if (r0 == 0) goto L13
            r0 = r9
            p0g.f r0 = (p0g.f) r0
            int r1 = r0.f231536w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231536w = r1
            goto L18
        L13:
            p0g.f r0 = new p0g.f
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f231536w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            goto La3
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r9)
            r9 = 0
            if (r7 == 0) goto L3b
            java.lang.String r7 = boh.f.L(r7)
            goto L3c
        L3b:
            r7 = r9
        L3c:
            if (r8 == 0) goto L42
            java.lang.String r9 = boh.f.L(r8)
        L42:
            qyf.b r8 = qyf.b.DESTINATIONS
            qyf.b r2 = qyf.b.EXPERIENCES
            qyf.b r4 = qyf.b.ATTRACTIONS
            qyf.b[] r8 = new qyf.b[]{r8, r2, r4}
            java.util.List r8 = zhm.v.k(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L61:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r8.next()
            qyf.b r4 = (qyf.b) r4
            java.lang.String r4 = r4.name()
            r2.add(r4)
            goto L61
        L75:
            com.revolut.feature.travel.experiences.impl.network.search.TravelExperiencesSearchService r8 = r5.f231537a
            efm.d0 r6 = r8.getExperiencesSearchByQuery(r6, r7, r9, r2)
            p0g.b r7 = new p0g.b
            r8 = 0
            r7.<init>(r8)
            ozc.j0 r8 = new ozc.j0
            r9 = 22
            r8.<init>(r9, r7)
            r6.getClass()
            ufm.i r7 = new ufm.i
            r9 = 1
            r7.<init>(r6, r8, r9)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            ufm.n r6 = te0.w.i0(r7)
            r0.f231536w = r3
            java.lang.Object r9 = nim.a.b(r6, r0)
            if (r9 != r1) goto La3
            return r1
        La3:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p0g.g.c(java.lang.String, org.joda.time.DateTime, org.joda.time.DateTime, gim.c):java.lang.Object");
    }

    public final Object d(TravelRecentSearchLocation travelRecentSearchLocation, gim.i iVar) {
        u0g.g gVar;
        Intrinsics.checkNotNullParameter(travelRecentSearchLocation, "<this>");
        TravelRecentSearchType travelRecentSearchType = travelRecentSearchLocation.f;
        if (travelRecentSearchType instanceof TravelRecentSearchType.Attraction) {
            gVar = u0g.g.ATTRACTION;
        } else if (travelRecentSearchType instanceof TravelRecentSearchType.Destination) {
            gVar = u0g.g.DESTINATION;
        } else {
            if (!(travelRecentSearchType instanceof TravelRecentSearchType.Experience)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = u0g.g.EXPERIENCE;
        }
        TravelRecentSearchType.Destination destination = travelRecentSearchType instanceof TravelRecentSearchType.Destination ? (TravelRecentSearchType.Destination) travelRecentSearchType : null;
        qyf.a aVar = destination != null ? destination.f92883a : null;
        u0g.f fVar = new u0g.f(travelRecentSearchLocation.f92901a, travelRecentSearchLocation.f92902b, travelRecentSearchLocation.f92903c, travelRecentSearchLocation.d, travelRecentSearchLocation.e, gVar.name(), aVar != null ? aVar.name() : null);
        t0g.f fVar2 = this.f231538b;
        fVar2.getClass();
        Object objA = nim.a.a(w.g0(RxRoom.createCompletable(fVar2.f267032a, false, true, new h(fVar2, fVar, 11))), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
