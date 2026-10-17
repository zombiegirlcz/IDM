package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungeNewPassesService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements h {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f156227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f156228c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungeNewPassesService f156229a;

    static {
        pkm.e eVar = pkm.e.SECONDS;
        f156227b = kotlin.time.c.h(1L, eVar);
        f156228c = kotlin.time.c.h(5L, eVar);
    }

    public k(AirportLoungeNewPassesService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f156229a = service;
    }

    public static kotlin.time.b b(String str) {
        Long lN = kotlin.text.z.n(str);
        if (lN != null) {
            if (lN.longValue() <= 0) {
                lN = null;
            }
            if (lN != null) {
                return new kotlin.time.b(kotlin.time.c.h(lN.longValue(), pkm.e.SECONDS));
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof hwi.j
            if (r0 == 0) goto L13
            r0 = r10
            hwi.j r0 = (hwi.j) r0
            int r1 = r0.f156225w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156225w = r1
            goto L18
        L13:
            hwi.j r0 = new hwi.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156225w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L3d
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            r0.f156225w = r3
            com.revolut.retail.feature.airportlounges.impl.network.AirportLoungeNewPassesService r10 = r8.f156229a
            java.lang.Object r10 = r10.putPassRefund(r9, r0)
            if (r10 != r1) goto L3d
            return r1
        L3d:
            retrofit2.Response r10 = (retrofit2.Response) r10
            boolean r9 = r10.isSuccessful()
            if (r9 == 0) goto L8b
            ulm.u0 r9 = r10.headers()
            java.lang.String r0 = "Retry-After"
            java.lang.String r0 = r9.a(r0)
            if (r0 == 0) goto L5b
            kotlin.time.b r0 = b(r0)
            if (r0 == 0) goto L5b
            long r0 = r0.f187924a
        L59:
            r4 = r0
            goto L5e
        L5b:
            long r0 = hwi.k.f156227b
            goto L59
        L5e:
            java.lang.String r0 = "X-Retry-Timeout"
            java.lang.String r9 = r9.a(r0)
            if (r9 == 0) goto L70
            kotlin.time.b r9 = b(r9)
            if (r9 == 0) goto L70
            long r0 = r9.f187924a
        L6e:
            r6 = r0
            goto L73
        L70:
            long r0 = hwi.k.f156228c
            goto L6e
        L73:
            java.lang.Object r9 = r10.body()
            if (r9 == 0) goto L83
            gwi.e1 r9 = (gwi.e1) r9
            java.lang.String r3 = r9.f147377a
            hwi.g1 r2 = new hwi.g1
            r2.<init>(r3, r4, r6)
            return r2
        L83:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        L8b:
            retrofit2.HttpException r9 = new retrofit2.HttpException
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hwi.k.a(java.lang.String, gim.c):java.lang.Object");
    }
}
