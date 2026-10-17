package vgk;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$State;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import vkm.j2;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d f289209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zm3.l f289210x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar, zm3.l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f289209w = dVar;
        this.f289210x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f289209w, this.f289210x, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f289209w, this.f289210x, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        hha.d dVar = (hha.d) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(dVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        zm3.l contact = this.f289210x;
        switch (i) {
            case 0:
                hha.d newPlan = (hha.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar = this.f289209w;
                ahk.a aVar2 = dVar.f103013r;
                boolean z = ((FamilyPlanFlowContract$State) ((j2) dVar.f103018y.f22677a).getValue()).f102981a;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(newPlan, "newPlan");
                Intrinsics.checkNotNullParameter(contact, "contact");
                yji.l.a1(dVar, dVar.X1(new y0("ID_STATUS_MEMBER_INVITED", z ? new j0((Clause) new TextLocalisedClause(R$string.family_plans_invite_member_success_title, v.k(hx7.q.v(contact), dok.g.d(newPlan, null)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094) : new j0((Clause) new TextLocalisedClause(R$string.family_plans_invite_member_success_dialog_title, v.k(hx7.q.v(contact), dok.g.d(newPlan, null)), null, 12), (Clause) new TextLocalisedClause(R$string.family_plans_invite_member_success_dialog_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new r(dVar, null, 0), 3);
                break;
            default:
                hha.d newPlan2 = (hha.d) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar2 = this.f289209w;
                ahk.a aVar4 = dVar2.f103013r;
                boolean z3 = ((FamilyPlanFlowContract$State) ((j2) dVar2.f103018y.f22677a).getValue()).f102981a;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(newPlan2, "newPlan");
                Intrinsics.checkNotNullParameter(contact, "contact");
                yji.l.a1(dVar2, dVar2.X1(new y0("ID_STATUS_WELCOME_DUO", z3 ? new j0((Clause) new TextLocalisedClause(R$string.plan_switching_success_welcome_to_duo_title, u.c(dok.g.d(newPlan2, null)), null, 12), (Clause) new TextLocalisedClause(R$string.family_plans_invite_member_success_title, v.k(hx7.q.v(contact), dok.g.d(newPlan2, null)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092) : new j0((Clause) new TextLocalisedClause(R$string.family_plans_invite_member_welcome_to_plan_success_dialog_title, u.c(dok.g.d(newPlan2, null)), null, 12), (Clause) new TextLocalisedClause(R$string.family_plans_invite_member_welcome_to_plan_success_dialog_description, u.c(hx7.q.v(contact)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new r(dVar2, null, 2), 3);
                break;
        }
        return Unit.f186387a;
    }
}
