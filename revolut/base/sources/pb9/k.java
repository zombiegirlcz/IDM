package pb9;

import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends oki.h implements b {

    @NotNull
    public static final i Companion = new i();
    public final fk3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f234671p;

    public k(OnboardingProductLifecycleFlowContract$InputData inputData, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.o = configurationInteractor;
        this.f234671p = cp5.d.a(this, new OnboardingProductLifecycleFlowContract$Step(inputData.f78480a, inputData.f78481b), f0.f322471a, new p5f.c(this, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$Step r5, boolean r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof pb9.j
            if (r0 == 0) goto L13
            r0 = r7
            pb9.j r0 = (pb9.j) r0
            int r1 = r0.f234670y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f234670y = r1
            goto L18
        L13:
            pb9.j r0 = new pb9.j
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f234668w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f234670y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r6 = r0.v
            com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$Step r5 = r0.u
            yhm.o.b(r7)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            fk3.a r7 = r4.o
            ik3.c r7 = (ik3.c) r7
            efm.d0 r7 = r7.f()
            r0.u = r5
            r0.v = r6
            r0.f234670y = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.util.List r7 = (java.util.List) r7
            wi0.b r5 = r5.f78482a
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L64
            pb9.d r5 = new pb9.d
            i89.a r6 = i89.a.CAN_NOT_OPEN_ACCOUNT_FOREIGN_APPLICANT
            int r6 = r6.a()
            r5.<init>(r6)
            r4.C2(r5)
            goto L71
        L64:
            if (r6 == 0) goto L6c
            pb9.e r5 = pb9.e.f234664a
            r4.C2(r5)
            goto L71
        L6c:
            pb9.c r5 = pb9.c.f234662a
            r4.C2(r5)
        L71:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pb9.k.I2(com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$Step, boolean, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f234671p;
    }
}
