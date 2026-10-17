package lic;

import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends yji.n implements kic.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PerkDetailsFlowContract$InputData f195457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bgc.e f195458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gic.h f195459n;

    public i(PerkDetailsFlowContract$InputData inputData, bgc.e rewardsInteractor, gic.h rewardActionNavigator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(rewardActionNavigator, "rewardActionNavigator");
        this.f195457l = inputData;
        this.f195458m = rewardsInteractor;
        this.f195459n = rewardActionNavigator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(lic.i r10, com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof lic.h
            if (r0 == 0) goto L14
            r0 = r12
            lic.h r0 = (lic.h) r0
            int r1 = r0.f195456x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f195456x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            lic.h r0 = new lic.h
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f195456x
            r7 = 2
            r8 = 0
            r9 = 1
            if (r1 == 0) goto L3c
            if (r1 == r9) goto L35
            if (r1 != r7) goto L2d
            yhm.o.b(r12)
            goto L92
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo r11 = r5.u
            yhm.o.b(r12)
            r1 = r10
            goto L5f
        L3c:
            yhm.o.b(r12)
            al6.c r2 = new al6.c
            r12 = 23
            r2.<init>(r12)
            iuf.y r3 = new iuf.y
            r12 = 8
            r3.<init>(r10, r11, r12)
            l40.j r4 = new l40.j
            r4.<init>(r10, r8, r12)
            r5.u = r11
            r5.f195456x = r9
            r6 = 1
            r1 = r10
            java.lang.Object r12 = n14.k.R(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5f
            goto L91
        L5f:
            nii.e r12 = (nii.e) r12
            boolean r10 = r12 instanceof nii.d
            if (r10 == 0) goto L95
            nii.d r12 = (nii.d) r12
            nii.n1 r10 = r12.f216134b
            boolean r10 = r10 instanceof nii.l1
            if (r10 == 0) goto L95
            java.lang.String r10 = r11.f84919a
            if (r10 == 0) goto L95
            r5.u = r8
            r5.f195456x = r7
            gic.h r10 = r1.f195459n
            com.revolut.feature.rewards.api.model.rewards.RewardAction$OpenUrl r12 = new com.revolut.feature.rewards.api.model.rewards.RewardAction$OpenUrl
            java.lang.String r1 = r11.f84920b
            java.lang.String r2 = r11.f84921c
            boolean r11 = r11.d
            r12.<init>(r1, r2, r9, r11)
            efm.b r10 = r10.c3(r12)
            java.lang.Object r10 = nim.a.a(r10, r5)
            if (r10 != r0) goto L8d
            goto L8f
        L8d:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L8f:
            if (r10 != r0) goto L92
        L91:
            return r0
        L92:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L95:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lic.i.Z2(lic.i, com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo, gim.c):java.lang.Object");
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        kic.e action = (kic.e) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return pd.b.n(p0.f264003c, new l34.a(this, action, null, 26));
    }
}
