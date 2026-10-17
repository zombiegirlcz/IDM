package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungeNewPassesService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements d {

    @NotNull
    public static final e Companion = new e();
    public static final long e;
    public static final long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungeNewPassesService f156216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f156218c;
    public final x4l.c d;

    static {
        pkm.e eVar = pkm.e.SECONDS;
        e = kotlin.time.c.h(1L, eVar);
        f = kotlin.time.c.h(5L, eVar);
    }

    public g(AirportLoungeNewPassesService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f156216a = service;
        this.f156217b = storage;
        this.f156218c = memoryCache;
        Continuation continuation = null;
        int i = 3;
        this.d = new x4l.c(new e6d.f(this, continuation, 19), new hw9.a(this, i), new hw9.b(this, i), new hbg.h(this, continuation, 28), new b(this, continuation, 1));
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
    public final java.lang.Object a(java.lang.String r9, svi.s r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof hwi.f
            if (r0 == 0) goto L13
            r0 = r11
            hwi.f r0 = (hwi.f) r0
            int r1 = r0.f156210w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156210w = r1
            goto L18
        L13:
            hwi.f r0 = new hwi.f
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156210w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L4b
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r11)
            java.lang.String r11 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r11)
            gwi.a0 r11 = new gwi.a0
            java.lang.String r2 = r10.f265982b
            java.lang.String r10 = r10.f265983c
            r11.<init>(r2, r10)
            r0.f156210w = r3
            com.revolut.retail.feature.airportlounges.impl.network.AirportLoungeNewPassesService r10 = r8.f156216a
            java.lang.Object r11 = r10.assignPassengerToLoungePassByPassId(r9, r11, r0)
            if (r11 != r1) goto L4b
            return r1
        L4b:
            retrofit2.Response r11 = (retrofit2.Response) r11
            boolean r9 = r11.isSuccessful()
            if (r9 == 0) goto L99
            ulm.u0 r9 = r11.headers()
            java.lang.String r10 = "Retry-After"
            java.lang.String r10 = r9.a(r10)
            if (r10 == 0) goto L69
            kotlin.time.b r10 = b(r10)
            if (r10 == 0) goto L69
            long r0 = r10.f187924a
        L67:
            r4 = r0
            goto L6c
        L69:
            long r0 = hwi.g.e
            goto L67
        L6c:
            java.lang.String r10 = "X-Retry-Timeout"
            java.lang.String r9 = r9.a(r10)
            if (r9 == 0) goto L7e
            kotlin.time.b r9 = b(r9)
            if (r9 == 0) goto L7e
            long r9 = r9.f187924a
        L7c:
            r6 = r9
            goto L81
        L7e:
            long r9 = hwi.g.f
            goto L7c
        L81:
            java.lang.Object r9 = r11.body()
            if (r9 == 0) goto L91
            gwi.d0 r9 = (gwi.d0) r9
            java.lang.String r3 = r9.f147369a
            hwi.d1 r2 = new hwi.d1
            r2.<init>(r3, r4, r6)
            return r2
        L91:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        L99:
            retrofit2.HttpException r9 = new retrofit2.HttpException
            r9.<init>(r11)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hwi.g.a(java.lang.String, svi.s, gim.c):java.lang.Object");
    }
}
