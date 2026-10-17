package lhk;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingConflict;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.sso.impl.domain.models.AuthResult;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nii.n1;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f195316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f195317x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f195316w = obj3;
        this.f195317x = obj4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0((e0) this.f195316w, (dj0.d) this.f195317x, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0((e0) this.f195316w, (i0) this.f195317x, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0((com.revolut.feature.contacts.impl.ui_kompot.add_contact.a) this.f195316w, (zm3.a) this.f195317x, continuation, 2);
                a0Var3.v = obj2;
                return a0Var3;
            case 3:
                return new a0((n1) this.v, (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a) this.f195316w, (String) this.f195317x, continuation, 3);
            case 4:
                a0 a0Var4 = new a0((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a) this.f195316w, (String) this.f195317x, continuation, 4);
                a0Var4.v = obj2;
                return a0Var4;
            case 5:
                a0 a0Var5 = new a0((loc.b) this.f195316w, (String) this.f195317x, continuation, 5);
                a0Var5.v = obj2;
                return a0Var5;
            case 6:
                a0 a0Var6 = new a0((loc.b) this.f195316w, (pdh.c) this.f195317x, continuation, 6);
                a0Var6.v = obj2;
                return a0Var6;
            case 7:
                return new a0((lrk.r) this.v, (tqk.a) this.f195316w, (String) this.f195317x, continuation, 7);
            case 8:
                a0 a0Var7 = new a0((com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a) this.f195316w, (dj0.d) this.f195317x, continuation, 8);
                a0Var7.v = obj2;
                return a0Var7;
            case 9:
                a0 a0Var8 = new a0((m62.p) this.f195316w, (ApmOnboardingConflict) this.f195317x, continuation, 9);
                a0Var8.v = obj2;
                return a0Var8;
            case 10:
                a0 a0Var9 = new a0((m6i.r) this.f195316w, (AccountWrapper) this.f195317x, continuation, 10);
                a0Var9.v = obj2;
                return a0Var9;
            case 11:
                a0 a0Var10 = new a0((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f195316w, (dj0.d) this.f195317x, continuation, 11);
                a0Var10.v = obj2;
                return a0Var10;
            case 12:
                a0 a0Var11 = new a0((mn1.b0) this.f195316w, (String) this.f195317x, continuation, 12);
                a0Var11.v = obj2;
                return a0Var11;
            case 13:
                a0 a0Var12 = new a0((com.revolut.sso.impl.ui.manual_review.b) this.f195316w, (AuthResult.EvidenceRequired) this.f195317x, continuation, 13);
                a0Var12.v = obj2;
                return a0Var12;
            case 14:
                return new a0((Class) this.v, (mo.c) this.f195316w, (String) this.f195317x, continuation, 14);
            case 15:
                a0 a0Var13 = new a0((com.revolut.feature.rev_points.impl.ui.transactions.details.b) this.f195316w, (RevPointsTransaction) this.f195317x, continuation, 15);
                a0Var13.v = obj2;
                return a0Var13;
            case 16:
                a0 a0Var14 = new a0((com.revolut.feature.store.impl.ui.orders.see_all.a) this.f195316w, (String) this.f195317x, continuation, 16);
                a0Var14.v = obj2;
                return a0Var14;
            case 17:
                return new a0((n7i.s) this.v, (io3.d) this.f195316w, (x5i.d) this.f195317x, continuation, 17);
            case 18:
                return new a0((n7i.s) this.v, (pcd.s) this.f195316w, (x5i.d) this.f195317x, continuation, 18);
            case 19:
                a0 a0Var15 = new a0((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) this.f195316w, (w6c.h) this.f195317x, continuation, 19);
                a0Var15.v = obj2;
                return a0Var15;
            case 20:
                return new a0((nli.e) this.v, (List) this.f195316w, (List) this.f195317x, continuation, 20);
            case 21:
                a0 a0Var16 = new a0((com.revolut.feature.sca_prompt.impl.trusted_entities.a) this.f195316w, (RecipientPaymentsSettings) this.f195317x, continuation, 21);
                a0Var16.v = obj2;
                return a0Var16;
            case 22:
                a0 a0Var17 = new a0((nw5.i) this.f195316w, (xi0.b) this.f195317x, continuation, 22);
                a0Var17.v = obj2;
                return a0Var17;
            case 23:
                a0 a0Var18 = new a0((com.revolut.feature.card_design.impl.card_design.d) this.f195316w, (n93.h) this.f195317x, continuation, 23);
                a0Var18.v = obj2;
                return a0Var18;
            case 24:
                a0 a0Var19 = new a0((com.revolut.feature.referrals.impl.personalized_tracking.a) this.f195316w, (String) this.f195317x, continuation, 24);
                a0Var19.v = obj2;
                return a0Var19;
            case 25:
                return new a0((o22.n) this.v, (o22.a) this.f195316w, (String) this.f195317x, continuation, 25);
            case 26:
                a0 a0Var20 = new a0((String) this.f195316w, (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) this.f195317x, continuation, 26);
                a0Var20.v = obj2;
                return a0Var20;
            case 27:
                a0 a0Var21 = new a0((Flow) this.f195316w, (skm.r) this.f195317x, continuation, 27);
                a0Var21.v = obj2;
                return a0Var21;
            case 28:
                return new a0((o36.d) this.v, (wd6.e) this.f195316w, (xi0.b) this.f195317x, continuation, 28);
            default:
                a0 a0Var22 = new a0((mii.k) this.f195316w, (o3d.e) this.f195317x, continuation, 29);
                a0Var22.v = obj2;
                return a0Var22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((a0) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((a0) create((alc.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((a0) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((a0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((a0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((a0) create((whf.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((a0) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((a0) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((a0) create((tji.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((a0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0449 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x047c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v26 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f195316w = obj2;
        this.f195317x = obj3;
    }
}
