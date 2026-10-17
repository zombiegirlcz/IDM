package e8h;

import com.revolut.feature.wealth.impl.data.network.free_stocks.FreeStocksService;
import dp4.z0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f123697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f123698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreeStocksService f123699c;
    public final x4l.c d;

    public j(ne0.j memoryCache, ue0.c storage, FreeStocksService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f123697a = memoryCache;
        this.f123698b = storage;
        this.f123699c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new e6d.f(this, continuation, 1), new e87.e(this, 4), new e54.r(this, 11), new dze.n(this, continuation, 21), new z0(this, continuation, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof e8h.i
            if (r0 == 0) goto L13
            r0 = r7
            e8h.i r0 = (e8h.i) r0
            int r1 = r0.f123693x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f123693x = r1
            goto L18
        L13:
            e8h.i r0 = new e8h.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f123693x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.u
            yhm.o.b(r7)
            return r0
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.u
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            yhm.o.b(r7)
            goto L56
        L3c:
            yhm.o.b(r7)
            ds4.y r7 = new ds4.y
            r2 = 26
            r5 = 0
            r7.<init>(r6, r5, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.u = r5
            r0.f123693x = r4
            java.lang.Object r7 = skm.e0.J(r2, r7, r0)
            if (r7 != r1) goto L56
            goto L67
        L56:
            r2 = r7
            yzg.d r2 = (yzg.d) r2
            kotlin.Unit r4 = kotlin.Unit.f186387a
            r0.u = r7
            r0.f123693x = r3
            x4l.c r3 = r6.d
            java.lang.Object r0 = r3.f(r4, r2, r0)
            if (r0 != r1) goto L68
        L67:
            return r1
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e8h.j.a(gim.c):java.lang.Object");
    }
}
