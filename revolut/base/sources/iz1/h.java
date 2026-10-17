package iz1;

import com.revolut.feature.apm.core.impl.data.network.onboarding.ApmOnboardingService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements fx1.a {

    @NotNull
    public static final c Companion = new c();
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmOnboardingService f169829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f169830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qe0.o f169831c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        d = kotlin.time.c.g(2, pkm.e.SECONDS);
    }

    public h(ApmOnboardingService service, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f169829a = service;
        this.f169830b = appCoroutineScope;
        Continuation continuation = null;
        this.f169831c = do3.q.f(new x4l.c(new ghl.l(this, continuation, 17), new iwk.b(16), new iui.b(26), new g(2, 0, continuation), new eci.a(3, 22, continuation)), appCoroutineScope);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r11 == r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r11 == r14) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(iz1.h r11, dx1.b r12, i02.d r13, gim.c r14) {
        /*
            com.revolut.feature.apm.core.impl.data.network.onboarding.ApmOnboardingService r0 = r11.f169829a
            boolean r1 = r14 instanceof iz1.f
            if (r1 == 0) goto L15
            r1 = r14
            iz1.f r1 = (iz1.f) r1
            int r2 = r1.f169828x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f169828x = r2
            goto L1a
        L15:
            iz1.f r1 = new iz1.f
            r1.<init>(r11, r14)
        L1a:
            java.lang.Object r11 = r1.v
            fim.a r14 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f169828x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            dx1.b r12 = r1.u
            yhm.o.b(r11)
            goto L7e
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            dx1.b r12 = r1.u
            yhm.o.b(r11)
            goto L68
        L3c:
            yhm.o.b(r11)
            boolean r11 = r12 instanceof com.revolut.feature.apm.core.api.product.ApmBlik
            if (r11 == 0) goto L52
            java.util.concurrent.CopyOnWriteArrayList r11 = rd0.d.f253311a
            rd0.c r5 = rd0.c.INFO
            r9 = 0
            r10 = 16
            java.lang.String r6 = "BLIK_TAG"
            java.lang.String r7 = "ApmOnboardingRepository: getStatusInternal"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
        L52:
            if (r13 == 0) goto L6f
            bz1.c r11 = new bz1.c
            r11.<init>(r13)
            java.lang.String r13 = r12.getId()
            r1.u = r12
            r1.f169828x = r4
            java.lang.Object r11 = r0.postOnboardingStatus(r13, r11, r1)
            if (r11 != r14) goto L68
            goto L7d
        L68:
            bz1.h r11 = (bz1.h) r11
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus r11 = az1.a.a(r11)
            goto L84
        L6f:
            java.lang.String r11 = r12.getId()
            r1.u = r12
            r1.f169828x = r3
            java.lang.Object r11 = r0.getOnboardingStatus(r11, r1)
            if (r11 != r14) goto L7e
        L7d:
            return r14
        L7e:
            bz1.h r11 = (bz1.h) r11
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus r11 = az1.a.a(r11)
        L84:
            boolean r12 = r12 instanceof com.revolut.feature.apm.core.api.product.ApmBlik
            if (r12 == 0) goto La3
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r0 = rd0.c.INFO
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "ApmOnboardingRepository: OnboardingStatus: "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r2 = r12.toString()
            r4 = 0
            r5 = 16
            java.lang.String r1 = "BLIK_TAG"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
        La3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: iz1.h.b(iz1.h, dx1.b, i02.d, gim.c):java.lang.Object");
    }

    public final Object c(dx1.b bVar, i02.d dVar, gim.c cVar) {
        e eVar = new e(this, bVar, dVar, null, 0);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, eVar, cVar);
    }

    public final Object d(dx1.b bVar, i02.d dVar, gim.c cVar) {
        e eVar = new e(this, bVar, dVar, null, 1);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, eVar, cVar);
    }
}
