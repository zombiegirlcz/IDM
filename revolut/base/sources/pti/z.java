package pti;

import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftSlotPrebookingService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftSlotPrebookingService f239769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f239770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Json f239771c;
    public final ue0.c d;
    public final sf0.h e;
    public final x4l.c f;

    public z(AsftSlotPrebookingService service, ne0.j memoryCache, Json json, ue0.c storage, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f239769a = service;
        this.f239770b = memoryCache;
        this.f239771c = json;
        this.d = storage;
        this.e = serverErrorParser;
        Continuation continuation = null;
        this.f = new x4l.c(new d(this, continuation, 2), new pth.l(this, 1), new plb.g(this, 29), new pnb.b(this, continuation, 14), new p24.q(this, continuation, 13));
    }

    public static final kotlin.time.b a(z zVar, Response response, String str) {
        Long lN;
        String strA = response.headers().a(str);
        if (strA == null || (lN = kotlin.text.z.n(strA)) == null) {
            return null;
        }
        return new kotlin.time.b(kotlin.time.c.h(Math.abs(lN.longValue()), pkm.e.SECONDS));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(bti.o r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof pti.x
            if (r0 == 0) goto L13
            r0 = r9
            pti.x r0 = (pti.x) r0
            int r1 = r0.f239766x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239766x = r1
            goto L18
        L13:
            pti.x r0 = new pti.x
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239766x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            pti.z r8 = r0.u
            yhm.o.b(r9)
            goto L5b
        L38:
            yhm.o.b(r9)
            java.lang.String r9 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            oti.t1 r9 = new oti.t1
            java.lang.String r2 = r8.f18615a
            java.lang.String r5 = r8.f18616b
            java.lang.String r6 = r8.f18617c
            int r8 = r8.d
            r9.<init>(r2, r5, r6, r8)
            r0.u = r7
            r0.f239766x = r4
            com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftSlotPrebookingService r8 = r7.f239769a
            java.lang.Object r9 = r8.postAcquireBookingSlot(r9, r0)
            if (r9 != r1) goto L5a
            goto L7b
        L5a:
            r8 = r7
        L5b:
            retrofit2.Response r9 = (retrofit2.Response) r9
            pqc.k r2 = new pqc.k
            r4 = 17
            r5 = 0
            r2.<init>(r7, r5, r4)
            r0.u = r5
            r0.f239766x = r3
            r8.getClass()
            prl.k r3 = new prl.k
            r3.<init>(r9, r2, r8, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r3, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pti.z.b(bti.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pti.y
            if (r0 == 0) goto L13
            r0 = r8
            pti.y r0 = (pti.y) r0
            int r1 = r0.f239768x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239768x = r1
            goto L18
        L13:
            pti.y r0 = new pti.y
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239768x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            pti.z r7 = r0.u
            yhm.o.b(r8)
            goto L49
        L38:
            yhm.o.b(r8)
            r0.u = r6
            r0.f239768x = r4
            com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftSlotPrebookingService r8 = r6.f239769a
            java.lang.Object r8 = r8.getBookingSlotStatus(r7, r0)
            if (r8 != r1) goto L48
            goto L68
        L48:
            r7 = r6
        L49:
            retrofit2.Response r8 = (retrofit2.Response) r8
            prl.k r2 = new prl.k
            r4 = 5
            r5 = 0
            r2.<init>(r6, r5, r4)
            r0.u = r5
            r0.f239768x = r3
            r7.getClass()
            prl.k r3 = new prl.k
            r3.<init>(r8, r2, r7, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r3, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pti.z.c(java.lang.String, gim.c):java.lang.Object");
    }
}
