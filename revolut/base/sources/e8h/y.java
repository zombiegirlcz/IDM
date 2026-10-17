package e8h;

import com.revolut.feature.wealth.impl.data.network.promotions.PromotionsService;
import dp4.a1;
import dp4.f1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromotionsService f123734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej9.c f123735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f123736c;

    public y(PromotionsService service, ej9.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f123734a = service;
        this.f123735b = storage;
        this.f123736c = memoryCache;
        Continuation continuation = null;
        new x4l.c(new a1(this, continuation, 10), new e87.e(this, 5), new e54.r(this, 12), new e0b.c(this, continuation, 26), new f1(this, continuation, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(e8h.y r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof e8h.x
            if (r0 == 0) goto L13
            r0 = r6
            e8h.x r0 = (e8h.x) r0
            int r1 = r0.f123733w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f123733w = r1
            goto L18
        L13:
            e8h.x r0 = new e8h.x
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f123733w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L40
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.wealth.impl.data.network.promotions.PromotionsService r4 = r4.f123734a     // Catch: java.lang.Throwable -> L40
            r0.f123733w = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = r4.getPromotion(r5, r0)     // Catch: java.lang.Throwable -> L40
            if (r6 != r1) goto L3d
            return r1
        L3d:
            z7h.a r6 = (z7h.a) r6     // Catch: java.lang.Throwable -> L40
            return r6
        L40:
            r4 = move-exception
            boolean r5 = r4 instanceof retrofit2.HttpException
            if (r5 == 0) goto L56
            r5 = r4
            retrofit2.HttpException r5 = (retrofit2.HttpException) r5
            int r5 = r5.code()
            r6 = 403(0x193, float:5.65E-43)
            if (r5 != r6) goto L56
            com.revolut.feature.wealth.api.domain.exceptions.PromotionNotAvailableException r4 = new com.revolut.feature.wealth.api.domain.exceptions.PromotionNotAvailableException
            r4.<init>()
            throw r4
        L56:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e8h.y.a(e8h.y, java.lang.String, gim.c):java.lang.Object");
    }
}
