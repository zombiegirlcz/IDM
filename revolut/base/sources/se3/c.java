package se3;

import com.revolut.feature.category_boost.impl.data.service.CategoryBoostService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import nfj.i;
import org.jetbrains.annotations.NotNull;
import pti.s;
import scl.e;
import scl.h;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategoryBoostService f262095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f262096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f262097c;

    public c(CategoryBoostService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f262095a = service;
        this.f262096b = memoryCache;
        Continuation continuation = null;
        this.f262097c = new x4l.c(new s(this, continuation, 10), new e(this, 9), new h(this, 4), new rp1.c(2, 3, continuation), new i(3, 20, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof se3.b
            if (r0 == 0) goto L13
            r0 = r6
            se3.b r0 = (se3.b) r0
            int r1 = r0.f262094w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f262094w = r1
            goto L18
        L13:
            se3.b r0 = new se3.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f262094w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            r0.f262094w = r3
            kotlin.Unit r6 = kotlin.Unit.f186387a
            w4l.h r2 = w4l.h.f294642c
            x4l.c r4 = r5.f262097c
            vkm.d r6 = r4.b(r6, r2)
            r2 = 0
            r4 = 3
            jhi.b r6 = mo3.a.g(r6, r2, r2, r4)
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            we3.d r6 = (we3.d) r6
            java.util.ArrayList r6 = r6.f296619a
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: se3.c.a(gim.c):java.lang.Object");
    }
}
