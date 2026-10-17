package lic;

import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PerkDetailsFlowContract$InputData f195471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bgc.e f195472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jx0.a f195473n;

    public s(PerkDetailsFlowContract$InputData inputData, bgc.e rewardsInteractor, jx0.a perkReloadController) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(perkReloadController, "perkReloadController");
        this.f195471l = inputData;
        this.f195472m = rewardsInteractor;
        this.f195473n = perkReloadController;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (b3(r8) == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.rewards.api.model.rewards.RewardFooterAction.Cancel r21, gim.c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof lic.p
            if (r2 == 0) goto L18
            r2 = r1
            lic.p r2 = (lic.p) r2
            int r3 = r2.f195469w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f195469w = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            lic.p r2 = new lic.p
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.f195469w
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 == r4) goto L38
            if (r3 != r9) goto L30
            yhm.o.b(r1)
            goto L8d
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            yhm.o.b(r1)
            goto L7e
        L3c:
            yhm.o.b(r1)
            nii.c0 r10 = new nii.c0
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.rewards.impl.R$string.perks_rewards_subscription_cancellation_loading_title
            r3 = 14
            r5 = 0
            r11.<init>(r1, r5, r5, r3)
            r18 = 0
            r19 = 1918(0x77e, float:2.688E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            al6.c r1 = new al6.c
            r3 = 25
            r1.<init>(r3)
            iuf.y r6 = new iuf.y
            r3 = 10
            r7 = r21
            r6.<init>(r7, r3)
            lic.q r7 = new lic.q
            r7.<init>(r0, r5)
            r8.f195469w = r4
            tji.f r3 = r0.q2()
            r5 = r1
            r4 = r10
            java.lang.Object r1 = n14.k.P(r3, r4, r5, r6, r7, r8)
            if (r1 != r2) goto L7e
            goto L8c
        L7e:
            nii.e r1 = (nii.e) r1
            boolean r1 = r1 instanceof nii.d
            if (r1 == 0) goto L90
            r8.f195469w = r9
            java.lang.Object r1 = r0.b3(r8)
            if (r1 != r2) goto L8d
        L8c:
            return r2
        L8d:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L90:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lic.s.Z2(com.revolut.feature.rewards.api.model.rewards.RewardFooterAction$Cancel, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lic.r
            if (r0 == 0) goto L13
            r0 = r5
            lic.r r0 = (lic.r) r0
            int r1 = r0.f195470w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195470w = r1
            goto L18
        L13:
            lic.r r0 = new lic.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195470w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L51
        L27:
            r5 = move-exception
            goto L41
        L29:
            r5 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            jx0.a r5 = r4.f195473n     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f195470w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r5.x(r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L51
            return r1
        L41:
            java.lang.String r0 = "SubscriptionCancellationHandler"
            java.lang.String r1 = "reloadPerkDetails"
            java.util.Set r0 = m72.b.w(r0, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
        L51:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L54:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lic.s.b3(gim.c):java.lang.Object");
    }
}
