package s38;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r0 f259472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cu8.r0 f259473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f259474n;

    public n(r0 jointAccountsInteractor, cu8.r0 kycRequiredActionTransformer, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f259472l = jointAccountsInteractor;
        this.f259473m = kycRequiredActionTransformer;
        this.f259474n = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(n38.d0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s38.k
            if (r0 == 0) goto L13
            r0 = r6
            s38.k r0 = (s38.k) r0
            int r1 = r0.f259469x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259469x = r1
            goto L18
        L13:
            s38.k r0 = new s38.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259469x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n38.d0 r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f259469x = r3
            cu8.r0 r6 = r4.f259473m
            java.lang.Object r6 = ks8.m.b(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            ks8.j r6 = (ks8.j) r6
            boolean r0 = r6 instanceof ks8.j.a
            if (r0 == 0) goto L52
            com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig$Invite r6 = new com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig$Invite
            r6.<init>(r5, r3)
            com.revolut.kompot.common.ParcelableDestination r5 = r6.f98274b
            r4.A2(r5)
            goto L61
        L52:
            boolean r5 = r6 instanceof ks8.i
            if (r5 == 0) goto L64
            ks8.i r6 = (ks8.i) r6
            com.revolut.retail.core.navigation.FeatureCommand r5 = r6.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            r4.A2(r5)
        L61:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L64:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s38.n.Z2(n38.d0, gim.c):java.lang.Object");
    }
}
