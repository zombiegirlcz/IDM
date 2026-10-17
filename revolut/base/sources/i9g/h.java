package i9g;

import fag.t0;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fag.o f159796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f159797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f159798c;
    public final z1 d;

    public h(fag.o repository, t0 travelHotelsRepository, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f159796a = repository;
        this.f159797b = travelHotelsRepository;
        this.f159798c = walletInteractor;
        this.d = vkm.q.a(0, 1, ukm.f.DROP_OLDEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, qei.l r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof i9g.d
            if (r0 == 0) goto L13
            r0 = r10
            i9g.d r0 = (i9g.d) r0
            int r1 = r0.f159785y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159785y = r1
            goto L18
        L13:
            i9g.d r0 = new i9g.d
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f159783w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159785y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus r8 = r0.v
            yhm.o.b(r10)
            return r8
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus r8 = r0.v
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
            goto L68
        L3f:
            java.lang.String r8 = r0.u
            yhm.o.b(r10)
            goto L55
        L45:
            yhm.o.b(r10)
            r0.u = r8
            r0.f159785y = r5
            fag.o r10 = r7.f159796a
            java.lang.Object r10 = r10.a(r8, r9, r0)
            if (r10 != r1) goto L55
            goto L7c
        L55:
            r9 = r10
            com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus r9 = (com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus) r9
            r0.u = r8
            r0.v = r9
            r0.f159785y = r4
            java.lang.Object r10 = r7.b(r8, r0)
            if (r10 != r1) goto L65
            goto L7c
        L65:
            r6 = r9
            r9 = r8
            r8 = r6
        L68:
            kotlin.Pair r10 = new kotlin.Pair
            r10.<init>(r9, r8)
            r9 = 0
            r0.u = r9
            r0.v = r8
            r0.f159785y = r3
            vkm.z1 r9 = r7.d
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L7d
        L7c:
            return r1
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i9g.h.a(java.lang.String, qei.l, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i9g.g
            if (r0 == 0) goto L13
            r0 = r6
            i9g.g r0 = (i9g.g) r0
            int r1 = r0.f159793w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159793w = r1
            goto L18
        L13:
            i9g.g r0 = new i9g.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f159793w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L65
        L27:
            r5 = move-exception
            goto L6a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            r0.f159793w = r3     // Catch: java.lang.Throwable -> L27
            wsg.n r6 = r4.f159798c     // Catch: java.lang.Throwable -> L27
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a     // Catch: java.lang.Throwable -> L27
            ufm.i r6 = r6.x(r2)     // Catch: java.lang.Throwable -> L27
            i25.e r2 = new i25.e     // Catch: java.lang.Throwable -> L27
            r3 = 10
            r2.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> L27
            i52.j r5 = new i52.j     // Catch: java.lang.Throwable -> L27
            r3 = 18
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L27
            pfm.a r2 = new pfm.a     // Catch: java.lang.Throwable -> L27
            r3 = 4
            r2.<init>(r6, r5, r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "flatMapCompletable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = nim.a.a(r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L60
            goto L62
        L60:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27
        L62:
            if (r5 != r1) goto L65
            return r1
        L65:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L70
        L6a:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L70:
            java.lang.Throwable r5 = yhm.m.a(r5)
            if (r5 == 0) goto L7c
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L7b
            goto L7c
        L7b:
            throw r5
        L7c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i9g.h.b(java.lang.String, gim.c):java.lang.Object");
    }
}
