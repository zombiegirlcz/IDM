package ua5;

import com.revolut.feature.credit.post_termination_plan.impl.network.PostTerminationPlanService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rch.o;
import th6.p;
import tx0.g4;
import u7k.f0;
import w4l.k;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostTerminationPlanService f278545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f278546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final la5.a f278547c;
    public final x4l.c d;

    public e(PostTerminationPlanService networkService, xx4.d memoryCache, la5.a planDao) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(planDao, "planDao");
        this.f278545a = networkService;
        this.f278546b = memoryCache;
        this.f278547c = planDao;
        Continuation continuation = null;
        int i = 0;
        this.d = new x4l.c(new p(this, continuation, 5), new g4(1, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i, 9), new o(2, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i, 15), new f0(this, continuation, 13), new ska.c(this, continuation, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ua5.e r4, java.lang.String r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof ua5.d
            if (r0 == 0) goto L16
            r0 = r6
            ua5.d r0 = (ua5.d) r0
            int r1 = r0.f278544w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f278544w = r1
            goto L1b
        L16:
            ua5.d r0 = new ua5.d
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278544w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L4d
            goto L48
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            ua5.a r6 = new ua5.a
            r6.<init>(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L4d
            x4l.c r4 = r4.d     // Catch: java.lang.Throwable -> L4d
            r0.f278544w = r3     // Catch: java.lang.Throwable -> L4d
            r5 = 0
            java.lang.Object r4 = r4.d(r6, r5, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L48
            return r1
        L48:
            kotlin.Unit r4 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L4d
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L4d
            goto L54
        L4d:
            r4 = move-exception
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.n r4 = yhm.o.a(r4)
        L54:
            java.lang.Throwable r4 = yhm.m.a(r4)
            if (r4 == 0) goto L64
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.WARNING
            r0 = 0
            rd0.d.a(r6, r0, r0, r4, r5)
        L64:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ua5.e.a(ua5.e, java.lang.String, gim.c):java.lang.Object");
    }

    public final vkm.d b(String planId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.d.b(new a(planId), loadingStrategy);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f278545a, eVar.f278545a) && Intrinsics.f(this.f278546b, eVar.f278546b) && Intrinsics.f(this.f278547c, eVar.f278547c);
    }

    public final int hashCode() {
        return this.f278547c.hashCode() + ((this.f278546b.hashCode() + (this.f278545a.hashCode() * 31)) * 31);
    }
}
