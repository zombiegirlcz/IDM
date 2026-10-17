package jcg;

import i9g.h0;
import j9g.t;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p8g.b f172793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p8g.d f172794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f172795n;
    public final t o;

    public c(p8g.b dropOffSearchInteractor, p8g.d travelHotelsLocationsInteractor, h0 travelHotelsPropertySearchParamsInteractor, t travelHotelsLocationMapper) {
        Intrinsics.checkNotNullParameter(dropOffSearchInteractor, "dropOffSearchInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsLocationsInteractor, "travelHotelsLocationsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertySearchParamsInteractor, "travelHotelsPropertySearchParamsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsLocationMapper, "travelHotelsLocationMapper");
        this.f172793l = dropOffSearchInteractor;
        this.f172794m = travelHotelsLocationsInteractor;
        this.f172795n = travelHotelsPropertySearchParamsInteractor;
        this.o = travelHotelsLocationMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(jcg.f r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof jcg.b
            if (r0 == 0) goto L13
            r0 = r9
            jcg.b r0 = (jcg.b) r0
            int r1 = r0.f172792w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172792w = r1
            goto L18
        L13:
            jcg.b r0 = new jcg.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172792w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L85
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            boolean r9 = r8 instanceof jcg.d
            if (r9 == 0) goto L60
            jcg.d r8 = (jcg.d) r8
            com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff r8 = r8.f172796a
            java.lang.String r9 = r8.f97918h
            if (r9 == 0) goto L5e
            gcg.q r0 = new gcg.q
            com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData$BookablePreview r1 = new com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData$BookablePreview
            com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyPreview r2 = new com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyPreview
            java.lang.String r3 = r8.e
            r2.<init>(r9, r3)
            com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoffSearchParameters r8 = r8.f97919j
            java.time.LocalDate r3 = r8.f97926c
            java.time.LocalDate r4 = r8.d
            java.lang.String r8 = r8.e
            java.util.List r5 = hx7.a.E(r8)
            r6 = 16
            r1.<init>(r2, r3, r4, r5, r6)
            r0.<init>(r1)
            return r0
        L5e:
            r8 = 0
            return r8
        L60:
            boolean r9 = r8 instanceof jcg.e
            if (r9 == 0) goto L8b
            jcg.e r8 = (jcg.e) r8
            com.revolut.feature_travel_hotels_models.location.HotelsLocation r8 = r8.f172797a
            j9g.t r9 = r7.o
            r9.getClass()
            java.lang.String r9 = "location"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            com.revolut.feature_travel_hotels_models.property.search.LocationType r8 = ta6.a.X(r8)
            i9g.h0 r9 = r7.f172795n
            pfm.h r8 = r9.m(r8)
            r0.f172792w = r3
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            gcg.k$c r8 = new gcg.k$c
            r8.<init>(r3)
            return r8
        L8b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jcg.c.Z2(jcg.f, gim.c):java.lang.Object");
    }
}
