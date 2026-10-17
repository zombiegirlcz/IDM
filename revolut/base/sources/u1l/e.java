package u1l;

import com.revolut.retail.feature.travel_status.impl.data.service.TravelStatusService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th6.p;
import tp8.l;
import tx0.p4;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelStatusService f276437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f276438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f276439c;
    public final x4l.c d;

    public e(TravelStatusService service, ue0.c storage, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f276437a = service;
        this.f276438b = storage;
        this.f276439c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new p(this, continuation, 3), new p4(this, 14), new l(this, 21), new tz6.e(this, continuation, 10), new sne.e(this, continuation, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof u1l.d
            if (r0 == 0) goto L13
            r0 = r6
            u1l.d r0 = (u1l.d) r0
            int r1 = r0.f276436w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276436w = r1
            goto L18
        L13:
            u1l.d r0 = new u1l.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f276436w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f276436w = r3
            com.revolut.retail.feature.travel_status.impl.data.service.TravelStatusService r6 = r4.f276437a
            java.lang.Object r6 = r6.validate(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            s1l.a1 r6 = (s1l.a1) r6
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = r6.f259159a
            if (r5 == 0) goto L4e
            a2l.a r6 = new a2l.a
            r6.<init>(r5)
            return r6
        L4e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1l.e.a(java.lang.String, gim.c):java.lang.Object");
    }
}
