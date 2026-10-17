package ji4;

import ii4.g0;
import it3.d;
import kotlin.jvm.internal.Intrinsics;
import py3.e;
import xq3.c;
import xq3.j;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements li4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f174346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f174347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sp3.a f174348c;
    public final e d;

    public b(j creditApplicationLifecycleInteractor, c creditApplicationClientMonitoringInteractor, sp3.a creditDataMonitoringFacade, e incorrectPluginCreditApplicationErrorChecker) {
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationClientMonitoringInteractor, "creditApplicationClientMonitoringInteractor");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(incorrectPluginCreditApplicationErrorChecker, "incorrectPluginCreditApplicationErrorChecker");
        this.f174346a = creditApplicationLifecycleInteractor;
        this.f174347b = creditApplicationClientMonitoringInteractor;
        this.f174348c = creditDataMonitoringFacade;
        this.d = incorrectPluginCreditApplicationErrorChecker;
    }

    @Override // li4.b
    public final Boolean a(g0 g0Var, d dVar) {
        ks3.b bVar = g0Var.f161525b;
        ks3.b bVar2 = ks3.b.BEHAVIORAL_DATA_CAPTURE;
        if (bVar == bVar2) {
            return Boolean.valueOf((dVar != null ? dVar.f168325c : null) == bVar2);
        }
        throw new IllegalArgumentException(("BehavioralCapturePollingFactory should only handle BEHAVIORAL_DATA_CAPTURE plugin, but received: " + bVar).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // li4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ii4.g0 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ji4.a
            if (r0 == 0) goto L13
            r0 = r10
            ji4.a r0 = (ji4.a) r0
            int r1 = r0.f174345x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174345x = r1
            goto L1a
        L13:
            ji4.a r0 = new ji4.a
            gim.c r10 = (gim.c) r10
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174345x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            yhm.o.b(r10)
            goto L99
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            ii4.g0 r9 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L3e
            goto L7f
        L3e:
            r10 = move-exception
            goto L82
        L40:
            ii4.g0 r9 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L3e
            goto L62
        L46:
            yhm.o.b(r10)
            ks3.b r10 = r9.f161525b
            ks3.b r2 = ks3.b.BEHAVIORAL_DATA_CAPTURE
            if (r10 != r2) goto L9d
            sp3.a r10 = r8.f174348c     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r9.f161524a     // Catch: java.lang.Throwable -> L3e
            zhm.h0 r7 = zhm.h0.f322473a     // Catch: java.lang.Throwable -> L3e
            r0.u = r9     // Catch: java.lang.Throwable -> L3e
            r0.f174345x = r5     // Catch: java.lang.Throwable -> L3e
            qq3.g r10 = (qq3.g) r10     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r10 = r10.c(r0, r2, r7)     // Catch: java.lang.Throwable -> L3e
            if (r10 != r1) goto L62
            goto L98
        L62:
            xq3.c r10 = r8.f174347b     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r9.f161524a     // Catch: java.lang.Throwable -> L3e
            r0.u = r9     // Catch: java.lang.Throwable -> L3e
            r0.f174345x = r4     // Catch: java.lang.Throwable -> L3e
            xr3.k r10 = r10.f308064a     // Catch: java.lang.Throwable -> L3e
            r10.getClass()     // Catch: java.lang.Throwable -> L3e
            xr3.j r4 = new xr3.j     // Catch: java.lang.Throwable -> L3e
            r4.<init>(r10, r2, r6, r5)     // Catch: java.lang.Throwable -> L3e
            skm.p0 r10 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L3e
            elm.f r10 = elm.f.f127540b     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r10 = skm.e0.J(r10, r4, r0)     // Catch: java.lang.Throwable -> L3e
            if (r10 != r1) goto L7f
            goto L98
        L7f:
            it3.d r10 = (it3.d) r10     // Catch: java.lang.Throwable -> L3e
            return r10
        L82:
            py3.e r2 = r8.d
            boolean r2 = r2.a(r10)
            if (r2 == 0) goto L9c
            java.lang.String r9 = r9.f161524a
            r0.u = r6
            r0.f174345x = r3
            xq3.j r10 = r8.f174346a
            java.lang.Object r10 = r10.f(r9, r0)
            if (r10 != r1) goto L99
        L98:
            return r1
        L99:
            it3.d r10 = (it3.d) r10
            return r10
        L9c:
            throw r10
        L9d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "BehavioralCapturePollingFactory should only handle BEHAVIORAL_DATA_CAPTURE plugin, but received: "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ji4.b.b(ii4.g0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
