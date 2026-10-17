package lhk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.extension.PlanSubscribeDialogPayload;
import kkf.r6;
import kotlin.jvm.internal.Intrinsics;
import lhk.d;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends zfk.c {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sf0.h f195332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f195333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ylk.a f195334n;
    public final bgk.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xfk.b f195335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wfk.a f195336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f195337r;

    public e0(sf0.h serverErrorParser, r0 pricingPlanSubscriber, ylk.a statusDialogConfigProvider, bgk.a planTermsWorkflowControllerExtension, xfk.b planDurableTermsControllerExtension, wfk.a globalPlansExtension) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(pricingPlanSubscriber, "pricingPlanSubscriber");
        Intrinsics.checkNotNullParameter(statusDialogConfigProvider, "statusDialogConfigProvider");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
        Intrinsics.checkNotNullParameter(globalPlansExtension, "globalPlansExtension");
        this.f195332l = serverErrorParser;
        this.f195333m = pricingPlanSubscriber;
        this.f195334n = statusDialogConfigProvider;
        this.o = planTermsWorkflowControllerExtension;
        this.f195335p = planDurableTermsControllerExtension;
        this.f195336q = globalPlansExtension;
        this.f195337r = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1, lhk.z] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k3(lhk.e0 r10, lhk.k r11, lhk.z r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.e0.k3(lhk.e0, lhk.k, lhk.z, gim.c):java.lang.Object");
    }

    @Override // zfk.c
    public final r6 Z2(String familyId, String invitationId) {
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        return n3(new a(familyId, invitationId), zfk.l.f322029a);
    }

    @Override // zfk.c
    public final r6 b3(String selectedPlanId, hha.i iVar, String str, zfk.k successStatusSheetMode) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        Intrinsics.checkNotNullParameter(successStatusSheetMode, "successStatusSheetMode");
        return n3(new i(selectedPlanId, iVar, str, false, true), successStatusSheetMode);
    }

    @Override // zfk.c
    public final r6 d3(String giftId, String giftedPlanId, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(giftedPlanId, "giftedPlanId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        return new r6(n3(new b(giftId, giftedPlanId, idempotencyKey), zfk.l.f322029a), 13);
    }

    @Override // zfk.c
    public final r6 e3(hha.i billingPeriod, String referralId, String targetPlanId) {
        Intrinsics.checkNotNullParameter(referralId, "referralId");
        Intrinsics.checkNotNullParameter(targetPlanId, "targetPlanId");
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        return n3(new c(billingPeriod, referralId, targetPlanId), new zfk.k(null));
    }

    @Override // zfk.c
    public final r6 f3(zfk.m successStatusSheetMode) {
        Intrinsics.checkNotNullParameter(successStatusSheetMode, "successStatusSheetMode");
        return n3(new f(d.a.f195326a), successStatusSheetMode);
    }

    @Override // zfk.c
    public final r6 g3(hha.i iVar, String planId, String str) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        return n3(new i(planId, iVar, str, true, false), zfk.l.f322029a);
    }

    @Override // zfk.c
    public final r6 h3(String selectedPlanId, hha.i selectedBilling, zfk.m successStatusSheetMode) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        Intrinsics.checkNotNullParameter(successStatusSheetMode, "successStatusSheetMode");
        return n3(new g(selectedPlanId, selectedBilling), successStatusSheetMode);
    }

    @Override // zfk.c
    public final r6 i3(String planId, hha.i billing, zfk.m successStatusSheetMode) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(billing, "billing");
        Intrinsics.checkNotNullParameter(successStatusSheetMode, "successStatusSheetMode");
        return n3(new f(new e(planId, billing)), successStatusSheetMode);
    }

    @Override // zfk.c
    public final r6 j3(String planId, qha.g gVar) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        return n3(new j(planId, gVar), new zfk.k(null));
    }

    public final void l3() {
        od0.i.Companion.getClass();
        this.f195337r.k(od0.i.f224256b);
    }

    public final void m3(i0 i0Var, PlanSubscribeDialogPayload planSubscribeDialogPayload) {
        n nVar = i0Var.d;
        hha.d dVar = nVar.a().f81129a;
        PricingPlanSubscription pricingPlanSubscriptionA = nVar.a();
        l lVar = nVar instanceof l ? (l) nVar : null;
        zfk.i iVar = new zfk.i(dVar, pricingPlanSubscriptionA, lVar != null ? lVar.f195357b : null, planSubscribeDialogPayload != null ? planSubscribeDialogPayload.f103098a : null);
        od0.i.Companion.getClass();
        this.f195337r.k(od0.h.a(iVar));
    }

    public final r6 n3(k kVar, zfk.m mVar) {
        return new r6(vkm.q.P(new vkm.y(new c0(this, mVar, kVar, null), this.f195337r), 1), 14);
    }
}
