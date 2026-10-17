package f62;

import c12.r;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$InputData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements r {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IrisRegistrationFlowContract$InputData f132382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c62.e f132383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f132384c;

    public i(IrisRegistrationFlowContract$InputData inputData, c62.e irisInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(irisInteractor, "irisInteractor");
        this.f132382a = inputData;
        this.f132383b = irisInteractor;
        this.f132384c = new AtomicBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // c12.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof f62.h
            if (r0 == 0) goto L13
            r0 = r6
            f62.h r0 = (f62.h) r0
            int r1 = r0.f132381w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132381w = r1
            goto L1a
        L13:
            f62.h r0 = new f62.h
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132381w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "IRIS_REGISTRATION_PENDING"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 != 0) goto L3f
            c12.p r5 = c12.p.f20345a
            return r5
        L3f:
            com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$InputData r5 = r4.f132382a
            com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile r5 = r5.f62523b
            i02.j r6 = i02.j.ONBOARDING
            r0.f132381w = r3
            c62.e r2 = r4.f132383b
            c62.i r2 = (c62.i) r2
            java.lang.Object r6 = r2.a(r5, r6, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus r6 = (com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus) r6
            com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus$Active r5 = com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus.Active.f61936a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto L64
            c12.o r5 = new c12.o
            kotlin.Unit r6 = kotlin.Unit.f186387a
            r5.<init>(r6)
            return r5
        L64:
            com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus$Pending r5 = com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus.Pending.f61941a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            r0 = 0
            if (r5 == 0) goto L92
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f132384c
            r6 = 0
            boolean r5 = r5.compareAndSet(r3, r6)
            if (r5 == 0) goto L7c
            c12.n r5 = new c12.n
            r5.<init>()
            return r5
        L7c:
            c12.l r5 = new c12.l
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.apm.core.api.R$string.apm_registration_pending_dialog_title
            r2 = 14
            r6.<init>(r1, r0, r0, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.apm.core.api.R$string.apm_registration_pending_dialog_subtitle
            r1.<init>(r3, r0, r0, r2)
            r5.<init>(r6, r1)
            return r5
        L92:
            boolean r5 = r6 instanceof com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus.NotRegistered
            if (r5 != 0) goto La1
            boolean r5 = r6 instanceof com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus.RemediationRequired
            if (r5 == 0) goto L9b
            goto La1
        L9b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        La1:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected IRIS status while polling registration: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r0, r0, r5, r6)
            c12.m r5 = c12.m.f20342a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f62.i.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
