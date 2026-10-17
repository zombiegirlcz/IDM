package com.revolut.feature.junior_coparent.impl.ui.confirmation.flow;

import a5h.g;
import com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.CoparentConfirmationFlowContract$Step;
import cu8.r0;
import he8.b;
import he8.c;
import he8.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q78.e;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f76877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f76878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0 f76879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f76880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f76881t;

    public a(c inputData, g juniorCoparentInvitationInteractor, gte.a featureToggleInteractor, r0 kycRequiredActionTransformer, e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorCoparentInvitationInteractor, "juniorCoparentInvitationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.o = inputData;
        this.f76877p = juniorCoparentInvitationInteractor;
        this.f76878q = featureToggleInteractor;
        this.f76879r = kycRequiredActionTransformer;
        this.f76880s = juniorAccountDestinationResolver;
        h1c.c cVar = new h1c.c(this, 28);
        this.f76881t = cp5.d.a(this, CoparentConfirmationFlowContract$Step.Confirmation.f76876a, f0.f322471a, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a r7, java.lang.String r8, gim.c r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof he8.i
            if (r0 == 0) goto L17
            r0 = r9
            he8.i r0 = (he8.i) r0
            int r1 = r0.f151600x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f151600x = r1
        L15:
            r5 = r0
            goto L1d
        L17:
            he8.i r0 = new he8.i
            r0.<init>(r7, r9)
            goto L15
        L1d:
            java.lang.Object r9 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f151600x
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a r7 = r5.u
            yhm.o.b(r9)
            goto L4a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            yhm.o.b(r9)
            q78.e r1 = r7.f76880s
            r5.u = r7
            r5.f151600x = r2
            r3 = 0
            r4 = 0
            r6 = 6
            r2 = r8
            java.lang.Object r9 = u68.b.c(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4a
            return r0
        L4a:
            aii.u r9 = (aii.u) r9
            r7.C1(r9)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a.I2(com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a r19, gim.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a.J2(com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f76881t;
    }
}
