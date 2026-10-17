package ska;

import au6.k0;
import com.revolut.feature.product_article.impl.network.ProductArticleConfigService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pti.s;
import ro7.n;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleConfigService f263786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f263787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f263788c;
    public final mk0.a d;
    public final x4l.c e;
    public final hlm.c f;

    public e(ProductArticleConfigService service, ne0.j memoryCache, ue0.c storage, l80.e dateProvider, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f263786a = service;
        this.f263787b = memoryCache;
        this.f263788c = storage;
        this.d = personalisationStorage;
        Continuation continuation = null;
        this.e = new x4l.c(new s(this, continuation, 11), new n(this, 10), new k0(this, 9), new se4.c(this, continuation, 8), new c(this, continuation, 0));
        this.f = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, gim.c r13) {
        /*
            r11 = this;
            java.lang.String r0 = "PRODUCT_ARTICLE_SHOWN_TIME"
            mk0.a r1 = r11.d
            boolean r2 = r13 instanceof ska.d
            if (r2 == 0) goto L17
            r2 = r13
            ska.d r2 = (ska.d) r2
            int r3 = r2.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.z = r3
            goto L1c
        L17:
            ska.d r2 = new ska.d
            r2.<init>(r11, r13)
        L1c:
            java.lang.Object r13 = r2.f263784x
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.z
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L4a
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L35
            hlm.a r12 = r2.v
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L32:
            r13 = move-exception
            goto La5
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            int r12 = r2.f263783w
            hlm.a r4 = r2.v
            java.lang.String r6 = r2.u
            yhm.o.b(r13)
            r13 = r4
            r4 = r12
            r12 = r6
            goto L5f
        L4a:
            yhm.o.b(r13)
            r2.u = r12
            hlm.c r13 = r11.f
            r2.v = r13
            r4 = 0
            r2.f263783w = r4
            r2.z = r6
            java.lang.Object r6 = r13.lock(r7, r2)
            if (r6 != r3) goto L5f
            goto L9b
        L5f:
            int r6 = ska.a.f263781a     // Catch: java.lang.Throwable -> L73
            tk0.f r6 = new tk0.f     // Catch: java.lang.Throwable -> L73
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = r1.a(r6)     // Catch: java.lang.Throwable -> L73
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L73
            if (r6 == 0) goto L78
            java.util.LinkedHashMap r6 = zhm.r0.z(r6)     // Catch: java.lang.Throwable -> L73
            goto L7d
        L73:
            r12 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
            goto La5
        L78:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L73
            r6.<init>()     // Catch: java.lang.Throwable -> L73
        L7d:
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L73
            r6.put(r12, r8)     // Catch: java.lang.Throwable -> L73
            tk0.f r12 = new tk0.f     // Catch: java.lang.Throwable -> L73
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L73
            r2.u = r7     // Catch: java.lang.Throwable -> L73
            r2.v = r13     // Catch: java.lang.Throwable -> L73
            r2.f263783w = r4     // Catch: java.lang.Throwable -> L73
            r2.z = r5     // Catch: java.lang.Throwable -> L73
            java.lang.Object r12 = r1.e(r12, r6, r2)     // Catch: java.lang.Throwable -> L73
            if (r12 != r3) goto L9c
        L9b:
            return r3
        L9c:
            r12 = r13
        L9d:
            kotlin.Unit r13 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L32
            r12.unlock(r7)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        La5:
            r12.unlock(r7)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ska.e.a(java.lang.String, gim.c):java.lang.Object");
    }
}
