package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f102995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f102996x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f102995w = str;
        this.f102996x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f102995w, this.f102996x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d r3 = r0.v
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L1c
            if (r2 != r5) goto L14
            yhm.o.b(r23)
            r2 = r23
            goto L2d
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            yhm.o.b(r23)
            vgk.p r2 = new vgk.p
            r2.<init>(r3, r4, r5)
            r0.u = r5
            java.lang.Object r2 = r3.p2(r0, r2)
            if (r2 != r1) goto L2d
            return r1
        L2d:
            lha.b r2 = (lha.b) r2
            if (r2 == 0) goto Lae
            int r1 = r2.f195198b
            int r6 = r2.f195197a
            if (r6 != 0) goto Lae
            vgk.i r6 = com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d.Companion
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_management_add_member_limit_error_title
            r7 = 14
            r8.<init>(r6, r4, r4, r7)
            com.revolut.core.ui_kit.models.TextLocalisedQuantityClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedQuantityClause
            int r10 = com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals.family_plans_management_add_member_limit_error_description
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.List r12 = zhm.u.c(r1)
            r13 = 0
            r14 = 24
            r9.<init>(r10, r11, r12, r13, r14)
            java.time.Period r1 = r2.f195199c
            int r2 = r1.getYears()
            if (r2 != r5) goto L7a
            org.joda.time.Period r2 = jli.e.f175841a
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r2 = r1.getYears()
            if (r2 <= 0) goto L7a
            int r2 = r1.getMonths()
            if (r2 != 0) goto L7a
            int r1 = r1.getDays()
            if (r1 != 0) goto L7a
            goto L7b
        L7a:
            r9 = r4
        L7b:
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_management_add_member_limit_error_remove_slot_cta
            r10.<init>(r1, r4, r4, r7)
            nii.z r7 = new nii.z
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 32756(0x7ff4, float:4.5901E-41)
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            nii.y0 r1 = new nii.y0
            r2 = 0
            r5 = 5
            r1.<init>(r4, r7, r2, r5)
            kotlinx.coroutines.flow.Flow r1 = r3.X1(r1)
            vfg.m r2 = new vfg.m
            r2.<init>(r3, r4, r5)
            r5 = 3
            skm.a2 r1 = yji.l.b1(r3, r1, r4, r2, r5)
            return r1
        Lae:
            yki.i r4 = r3.z
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step$ContactPicker r5 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step$ContactPicker
            java.lang.String r1 = r0.f102995w
            r5.<init>(r1)
            r8 = 0
            r9 = 12
            boolean r6 = r0.f102996x
            r7 = 0
            oki.h.t2(r3, r4, r5, r6, r7, r8, r9)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
