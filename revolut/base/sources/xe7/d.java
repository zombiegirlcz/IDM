package xe7;

import com.revolut.feature.incentive_experiment.impl.network.IncentiveExperimentService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import wtc.b0;
import x0f.g;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncentiveExperimentService f304542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f304543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f304544c;
    public final s d;
    public final x4l.c e;

    public d(IncentiveExperimentService service, j memoryCache, ue0.c storage, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f304542a = service;
        this.f304543b = memoryCache;
        this.f304544c = storage;
        this.d = ((ze0.c) forceReloadStrategyFactory).b(60000L);
        Continuation continuation = null;
        this.e = new x4l.c(new b0(this, continuation, 5), new a(this, 0), new x2g.b(this, 22), new g(this, continuation, 12), new wa7.j(this, continuation, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(xe7.d r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof xe7.c
            if (r0 == 0) goto L13
            r0 = r5
            xe7.c r0 = (xe7.c) r0
            int r1 = r0.f304541w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304541w = r1
            goto L18
        L13:
            xe7.c r0 = new xe7.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304541w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.incentive_experiment.impl.network.IncentiveExperimentService r5 = r4.f304542a
            r0.f304541w = r3
            java.lang.Object r5 = r5.getExperiments(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r0 = r5
            ve7.n r0 = (ve7.n) r0
            qe0.s r4 = r4.d
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r4.f(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xe7.d.a(xe7.d, gim.c):java.lang.Object");
    }
}
