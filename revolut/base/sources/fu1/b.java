package fu1;

import kotlin.jvm.internal.Intrinsics;
import ku1.c;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements wt1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f138075a;

    public b(c confirmationObservable) {
        Intrinsics.checkNotNullParameter(confirmationObservable, "confirmationObservable");
        this.f138075a = confirmationObservable;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof fu1.a
            if (r0 == 0) goto L13
            r0 = r8
            fu1.a r0 = (fu1.a) r0
            int r1 = r0.f138074w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138074w = r1
            goto L18
        L13:
            fu1.a r0 = new fu1.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138074w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            ku1.c r8 = r7.f138075a
            ku1.b r8 = (ku1.b) r8
            ihm.j r8 = r8.f189595a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f138074w = r3
            clm.a r3 = clm.a.FIRST_OR_DEFAULT
            java.lang.Object r8 = nim.a.g(r8, r3, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r0 = 0
            if (r8 != 0) goto L59
            com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination r8 = new com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination
            com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination$StartType$OpenBlikConfirmation r1 = new com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination$StartType$OpenBlikConfirmation
            r1.<init>(r0)
            r8.<init>(r1)
            return r8
        L59:
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r1 = rd0.c.INFO
            r5 = 0
            r6 = 16
            java.lang.String r2 = "APM-BLIK"
            java.lang.String r3 = "Trying to navigate, but confirmation already shown"
            r4 = 0
            rd0.d.b(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fu1.b.a(gim.c):java.lang.Object");
    }
}
