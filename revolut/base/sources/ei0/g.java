package ei0;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f126340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f126341b;

    public g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f126340a = j.b(new a01.c(context, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.gms.common.api.OptionalModuleApi[] r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ei0.c
            if (r0 == 0) goto L13
            r0 = r13
            ei0.c r0 = (ei0.c) r0
            int r1 = r0.f126334w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126334w = r1
            goto L18
        L13:
            ei0.c r0 = new ei0.c
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126334w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L71
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r4 = rd0.c.INFO
            ei0.d r9 = ei0.d.f126335a
            r10 = 31
            r6 = 0
            r7 = 0
            r8 = 0
            r5 = r12
            java.lang.String r12 = kotlin.collections.d.d0(r5, r6, r7, r8, r9, r10)
            r13 = r5
            java.lang.String r2 = "Checking availability of modules: "
            java.lang.String r6 = j6.a.q(r2, r12)
            r9 = 16
            java.lang.String r5 = "ModuleInstaller"
            rd0.d.b(r4, r5, r6, r7, r8, r9)
            kotlin.Lazy r12 = r11.f126340a
            java.lang.Object r12 = r12.getValue()
            com.google.android.gms.common.moduleinstall.ModuleInstallClient r12 = (com.google.android.gms.common.moduleinstall.ModuleInstallClient) r12
            int r2 = r13.length
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r2)
            com.google.android.gms.common.api.OptionalModuleApi[] r13 = (com.google.android.gms.common.api.OptionalModuleApi[]) r13
            com.google.android.gms.tasks.Task r12 = r12.areModulesAvailable(r13)
            java.lang.String r13 = "areModulesAvailable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)
            r0.f126334w = r3
            java.lang.Object r13 = jh.d.b(r12, r0)
            if (r13 != r1) goto L71
            return r1
        L71:
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse r13 = (com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse) r13
            boolean r12 = r13.areModulesAvailable()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ei0.g.a(com.google.android.gms.common.api.OptionalModuleApi[], gim.c):java.lang.Object");
    }
}
