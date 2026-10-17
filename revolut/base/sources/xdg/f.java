package xdg;

import i9g.b0;
import i9g.h0;
import i9g.l;
import i9g.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f304445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f304446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f304447n;
    public final b0 o;

    public f(n travelHotelsBookingInteractor, l draftInteractor, h0 searchParamsInteractor, b0 travelHotelsPropertyInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsBookingInteractor, "travelHotelsBookingInteractor");
        Intrinsics.checkNotNullParameter(draftInteractor, "draftInteractor");
        Intrinsics.checkNotNullParameter(searchParamsInteractor, "searchParamsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        this.f304445l = travelHotelsBookingInteractor;
        this.f304446m = draftInteractor;
        this.f304447n = searchParamsInteractor;
        this.o = travelHotelsPropertyInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xdg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r8, com.revolut.feature_travel_hotels_models.property.room.BedOption r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof xdg.c
            if (r0 == 0) goto L13
            r0 = r10
            xdg.c r0 = (xdg.c) r0
            int r1 = r0.f304441x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304441x = r1
            goto L18
        L13:
            xdg.c r0 = new xdg.c
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304441x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            com.revolut.feature_travel_hotels_models.property.room.BedOption r9 = r0.u
            yhm.o.b(r10)
            goto L4c
        L38:
            yhm.o.b(r10)
            i9g.l r10 = r7.f304446m
            efm.k r8 = r10.d(r8)
            r0.u = r9
            r0.f304441x = r4
            java.lang.Object r10 = nim.a.i(r8, r0)
            if (r10 != r1) goto L4c
            goto L7a
        L4c:
            afi.a r10 = (afi.a) r10
            r8 = 0
            if (r10 == 0) goto L6f
            cgi.c r2 = new cgi.c
            com.revolut.feature_travel_hotels_models.property.HotelsProperty r4 = r10.f4101b
            java.lang.String r4 = r4.f97981a
            i9g.h0 r5 = r7.f304447n
            dgi.c r6 = r5.d()
            java.time.LocalDate r6 = r6.f114672b
            dgi.c r5 = r5.d()
            java.time.LocalDate r5 = r5.f114673c
            java.util.List r10 = r10.e
            java.lang.String r10 = hx7.a.F(r10)
            r2.<init>(r4, r6, r5, r10)
            goto L70
        L6f:
            r2 = r8
        L70:
            r0.u = r8
            r0.f304441x = r3
            java.lang.Object r8 = r7.b3(r2, r9, r0)
            if (r8 != r1) goto L7b
        L7a:
            return r1
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xdg.f.Z2(java.lang.String, com.revolut.feature_travel_hotels_models.property.room.BedOption, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0156, code lost:
    
        if (vkm.q.z(r0, r2) != r3) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2 A[Catch: NoSuchElementException -> 0x0047, TryCatch #0 {NoSuchElementException -> 0x0047, blocks: (B:17:0x0042, B:50:0x010a, B:22:0x004c, B:44:0x00e2, B:47:0x0105, B:25:0x0053, B:31:0x006f, B:35:0x007f, B:39:0x00ca, B:36:0x00a2, B:37:0x00a7, B:38:0x00a8, B:52:0x010d, B:28:0x0061), top: B:59:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(cgi.c r30, com.revolut.feature_travel_hotels_models.property.room.BedOption r31, gim.c r32) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xdg.f.b3(cgi.c, com.revolut.feature_travel_hotels_models.property.room.BedOption, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum c3(com.revolut.feature_travel_hotels_models.property.room.BedOption r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xdg.e
            if (r0 == 0) goto L13
            r0 = r7
            xdg.e r0 = (xdg.e) r0
            int r1 = r0.f304444w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304444w = r1
            goto L18
        L13:
            xdg.e r0 = new xdg.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304444w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L7d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.String r6 = r6.f98088b
            java.util.List r6 = zhm.u.c(r6)
            i9g.n r7 = r5.f304445l
            r7.getClass()
            java.lang.String r2 = "bookingTokensList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            fag.t0 r7 = r7.f159820a
            r7.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            com.revolut.feature.travel.hotels.impl.network.TravelHotelsService r7 = r7.f133374a
            cag.e r2 = new cag.e
            r2.<init>(r6)
            efm.d0 r6 = r7.checkSelectedRoomsPrice(r2)
            fag.o0 r7 = new fag.o0
            r2 = 6
            r7.<init>(r2)
            fag.m0 r2 = new fag.m0
            r4 = 10
            r2.<init>(r7, r4)
            r6.getClass()
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            ufm.n r6 = te0.w.i0(r7)
            r0.f304444w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L7d
            return r1
        L7d:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = zhm.d0.b0(r7)
            sei.b r6 = (sei.b) r6
            sei.a r6 = r6.f262200b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xdg.f.c3(com.revolut.feature_travel_hotels_models.property.room.BedOption, gim.c):java.lang.Enum");
    }
}
