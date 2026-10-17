package xf1;

import com.revolut.feature.add.new_product.impl.repository.AddNewProductTrackingService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddNewProductTrackingService f304768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f304769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f304770c;

    public f(AddNewProductTrackingService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f304768a = service;
        this.f304769b = memoryCache;
        this.f304770c = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xf1.i r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof xf1.e
            if (r0 == 0) goto L13
            r0 = r9
            xf1.e r0 = (xf1.e) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            xf1.e r0 = new xf1.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f304766x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.a r8 = r0.v
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L72
        L2d:
            r9 = move-exception
            goto L7e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r8 = r0.f304765w
            hlm.a r2 = r0.v
            xf1.i r4 = r0.u
            yhm.o.b(r9)
            r9 = r2
            r2 = r8
            r8 = r4
            goto L59
        L44:
            yhm.o.b(r9)
            r0.u = r8
            hlm.c r9 = r7.f304770c
            r0.v = r9
            r2 = 0
            r0.f304765w = r2
            r0.z = r4
            java.lang.Object r4 = r9.lock(r5, r0)
            if (r4 != r1) goto L59
            goto L70
        L59:
            xec.c0 r4 = new xec.c0     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r8, r7, r5, r3)     // Catch: java.lang.Throwable -> L7a
            skm.p0 r8 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L7a
            elm.f r8 = elm.f.f127540b     // Catch: java.lang.Throwable -> L7a
            r0.u = r5     // Catch: java.lang.Throwable -> L7a
            r0.v = r9     // Catch: java.lang.Throwable -> L7a
            r0.f304765w = r2     // Catch: java.lang.Throwable -> L7a
            r0.z = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r8 = skm.e0.J(r8, r4, r0)     // Catch: java.lang.Throwable -> L7a
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            r8 = r9
        L72:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r8.unlock(r5)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L7a:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7e:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xf1.f.a(xf1.i, gim.c):java.lang.Object");
    }
}
