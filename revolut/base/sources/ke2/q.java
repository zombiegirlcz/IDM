package ke2;

import cli.y;
import com.revolut.feature.apm.swish.impl.ui.confirmation.SwishConfirmationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wli.x;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends oki.h implements j {

    @NotNull
    public static final l Companion = new l();
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.apm.swish.impl.domain.a f182965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f182966q;

    public q(cli.n stateMapper, SwishConfirmationScreenContract$InputData inputData, x deeplinkHandler, com.revolut.feature.apm.swish.impl.domain.a swishInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(swishInteractor, "swishInteractor");
        this.o = deeplinkHandler;
        this.f182965p = swishInteractor;
        this.f182966q = mra.d.b(this, new d(inputData.f62920a), stateMapper, null, false, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(ke2.q r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof ke2.o
            if (r0 == 0) goto L13
            r0 = r7
            ke2.o r0 = (ke2.o) r0
            int r1 = r0.f182963w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182963w = r1
            goto L18
        L13:
            ke2.o r0 = new ke2.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182963w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L44
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            ke2.m r7 = new ke2.m
            r2 = 1
            r7.<init>(r6, r3, r2)
            r0.f182963w = r4
            r4 = 6000(0x1770, double:2.9644E-320)
            java.lang.Object r7 = skm.h2.d(r4, r7, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus r7 = (com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus) r7
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$Pending r0 = com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus.Pending.f62904a
            if (r7 != 0) goto L4b
            r7 = r0
        L4b:
            boolean r1 = r7.equals(r0)
            if (r1 == 0) goto L57
            ke2.g r7 = ke2.g.f182959a
            r6.C2(r7)
            goto L64
        L57:
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$PendingUserAction r1 = com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus.PendingUserAction.f62905a
            boolean r2 = r7.equals(r1)
            if (r2 == 0) goto L67
            ke2.h r7 = ke2.h.f182960a
            r6.C2(r7)
        L64:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L67:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            boolean r2 = r7 instanceof com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus.NotRegistered
            java.lang.String r4 = ")"
            if (r2 == 0) goto L84
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$NotRegistered r7 = (com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus.NotRegistered) r7
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingConflict r7 = r7.e
            if (r7 == 0) goto L7d
            java.lang.Class r7 = r7.getClass()
            java.lang.String r3 = r7.getSimpleName()
        L7d:
            java.lang.String r7 = "NotRegistered(conflictType="
            java.lang.String r7 = p.a.p(r7, r3, r4)
            goto Lb1
        L84:
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto Laf
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto Lac
            boolean r0 = r7 instanceof com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus.Registered
            if (r0 != 0) goto La9
            boolean r0 = r7 instanceof com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus.RemediationRequired
            if (r0 == 0) goto La3
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$RemediationRequired r7 = (com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus.RemediationRequired) r7
            java.lang.String r7 = r7.f62907a
            java.lang.String r0 = "RemediationRequired(workflowId="
            java.lang.String r7 = p.a.p(r0, r7, r4)
            goto Lb1
        La3:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        La9:
            java.lang.String r7 = "Registered"
            goto Lb1
        Lac:
            java.lang.String r7 = "PendingUserAction"
            goto Lb1
        Laf:
            java.lang.String r7 = "Pending"
        Lb1:
            java.lang.String r0 = "Unexpected registration status '"
            java.lang.String r1 = "' after successful registration"
            java.lang.String r7 = p.a.p(r0, r7, r1)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ke2.q.I2(ke2.q, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f182966q;
    }
}
