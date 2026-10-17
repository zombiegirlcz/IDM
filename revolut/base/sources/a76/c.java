package a76;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.youTransactor.uCube.rpc.Constants;
import dw.j;
import e2f.i0;
import e2f.j0;
import efm.k;
import gqh.o;
import gyi.d0;
import ip0.f7;
import ip0.g7;
import ip0.nb0;
import ip0.pb0;
import ip0.q10;
import ip0.t10;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;
import lk0.g;
import nii.h0;
import nii.u1;
import nii.w1;
import rfm.h;
import rfm.u;
import tl7.f;
import vkm.j2;
import vr.l;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends q implements Function0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 1;
        int i2 = 2;
        Continuation continuation = null;
        switch (this.f) {
            case 0:
                g gVar = ((e) this.receiver).f1774b;
                if (gVar != null) {
                    u uVarG = k.g(gVar);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                h hVar = h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            case 1:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.a aVar = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.a) this.receiver;
                f.R(aVar.f75467t, R$string.car_insurance_question_penalty_points_learn_more_title, R$string.car_insurance_question_penalty_points_learn_more_subtitle, v.k(new TextLocalisedClause(R$string.car_insurance_question_penalty_points_learn_more_subtitle_email, null, new Click(30, (Integer) null, (Object) null, "DIALOG_EMAIL_CLAUSE_ITEM", false), 10), new TextLocalisedClause(R$string.car_insurance_question_penalty_points_learn_more_subtitle_phone, null, new Click(30, (Integer) null, (Object) null, "DIALOG_PHONE_CLAUSE_ITEM", false), 10)), null, null, new an4.f(aVar, i), null, null, Constants.TAG_EMV_L2_CHECKSUM);
                return Unit.f186387a;
            case 2:
                ((zw.g) this.receiver).b();
                return Unit.f186387a;
            case 3:
                ((zw.g) this.receiver).b();
                return Unit.f186387a;
            case 4:
                return Boolean.valueOf(((y91.b) this.receiver).a("ACCOUNT.pockets"));
            case 5:
                return Boolean.valueOf(((y91.b) this.receiver).a("ACCOUNT.pockets"));
            case 6:
                return Boolean.valueOf(((y91.b) this.receiver).a("ACCOUNT.group_pockets"));
            case 7:
                return Boolean.valueOf(((y91.b) this.receiver).a("ACCOUNT.pockets"));
            case 8:
                return Boolean.valueOf(((y91.b) this.receiver).a("ACCOUNT.pockets"));
            case 9:
                return ((yb0.d) ((j2) ((yb0.h) this.receiver).f312147a.f312151x.f22677a).getValue()).d;
            case 10:
                ((j) this.receiver).d = true;
                return Unit.f186387a;
            case 11:
                ((e2f.b) this.receiver).getClass();
                aim.e eVarB = zhm.u.b();
                g7 g7Var = new g7(new f7());
                yp0.b.l(g7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(g7Var);
                aim.e eVarB2 = zhm.u.b();
                eVarB2.add(new ListSubheaderDelegate.Model("HOW_IT_WORKS_SUB_HEADER_LOADING_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278));
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("HOW_IT_WORKS_LOADING_ITEM_LIST_ID", it8.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList);
                eVarB.addAll(zhm.u.a(eVarB2));
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("REDEEM_OPTIONS_SUB_HEADER_LOADING_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278);
                ArrayList arrayList2 = new ArrayList(2);
                for (int i3 = 0; i3 < 2; i3++) {
                    ip0.f fVar = new ip0.f(a0.d.n("REDEEM_OPTIONS_ITEM_LOADING_LIST_ID", i3));
                    yp0.b.l(fVar, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(fVar);
                }
                int i5 = R$attr.uikit_dp0;
                int i6 = R$attr.uikit_dp4;
                eVarB.addAll(v.k(model, new xk("REDEEM_OPTIONS_GRID_LOADING_LIST_ID", arrayList2, 2, null, null, i5, 0, i6, i6, 63864)));
                eVarB.add(new ListSubheaderDelegate.Model("EXTRA_REDEEM_OPTIONS_LOADING_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278));
                List listK = v.k(new pb0("EXTRA_REDEEM_OPTIONS_LOADING_ITEM_LIST_ID1"), new pb0("EXTRA_REDEEM_OPTIONS_LOADING_ITEM_LIST_ID2"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                eVarB.add(new t10("DESCRIPTION_LOADING_LIST_ID", q10.f165912a));
                return zhm.u.a(eVarB);
            case 12:
                ((i0) this.receiver).getClass();
                aim.e eVarB3 = zhm.u.b();
                g7 g7Var2 = new g7(new f7());
                yp0.b.l(g7Var2, 0, 0, 0, 0, null, false, 63);
                eVarB3.add(g7Var2);
                eVarB3.add(new ListSubheaderDelegate.Model("EXTRA_REDEEM_OPTIONS_LOADING_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278));
                List listK2 = v.k(new pb0("EXTRA_REDEEM_OPTIONS_LOADING_ITEM_LIST_ID1"), new pb0("EXTRA_REDEEM_OPTIONS_LOADING_ITEM_LIST_ID2"));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                eVarB3.addAll(listK2);
                eVarB3.add(new t10("DESCRIPTION_LOADING_LIST_ID", q10.f165912a));
                return zhm.u.a(eVarB3);
            case 13:
                j0 j0Var = (j0) this.receiver;
                j0Var.getClass();
                aim.e eVarB4 = zhm.u.b();
                g7 g7Var3 = new g7(new f7());
                yp0.b.l(g7Var3, 0, 0, 0, 0, null, false, 63);
                eVarB4.add(g7Var3);
                eVarB4.addAll(j0Var.f122071b.a(new Data(null, null, true, 3, null)));
                eVarB4.add(new ListSubheaderDelegate.Model("EXTRA_REDEEM_OPTIONS_LOADING_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278));
                nb0 nb0Var = pb0.Companion;
                List listK3 = v.k(nb0.b(nb0Var, "EXTRA_REDEEM_OPTIONS_LOADING_ITEM_LIST_ID1", false, 0, false, 30), nb0.b(nb0Var, "EXTRA_REDEEM_OPTIONS_LOADING_ITEM_LIST_ID2", false, 0, false, 30));
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                eVarB4.addAll(listK3);
                eVarB4.add(new t10("DESCRIPTION_LOADING_LIST_ID", q10.f165912a));
                return zhm.u.a(eVarB4);
            case 14:
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar = (com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.receiver;
                dVar.getClass();
                dVar.l2(new es.j(dVar, null), new eif.c(1, dVar, com.revolut.biometric_verification.impl.ui.flow.launcher.d.class, "handleFetchInitialInstructionsError", "handleFetchInitialInstructionsError(Ljava/lang/Throwable;)Z", 0, 12));
                return Unit.f186387a;
            case 15:
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar2 = (com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.receiver;
                l lVar = dVar2.H;
                if (lVar == null) {
                    lVar = vr.k.f291446a;
                }
                dVar2.l2(new es.k(dVar2, lVar, continuation, i2), new eif.c(1, dVar2, com.revolut.biometric_verification.impl.ui.flow.launcher.d.class, "handleFetchNextInstructionsError", "handleFetchNextInstructionsError(Ljava/lang/Throwable;)Z", 0, 16));
                return Unit.f186387a;
            case 16:
                ((ey0.d) this.receiver).f130512c = false;
                return Unit.f186387a;
            case 17:
                fs4.g gVar2 = (fs4.g) this.receiver;
                int i21 = com.revolut.feature.credit.core.R$string.credit_card_instalment_hub_item_current_empty;
                gVar2.getClass();
                return fs4.g.a(i21, "id_current_empty_item");
            case 18:
                fs4.g gVar3 = (fs4.g) this.receiver;
                int i22 = com.revolut.feature.credit.core.R$string.credit_card_instalment_hub_item_past_empty;
                gVar3.getClass();
                return fs4.g.a(i22, "id_past_empty_item");
            case 19:
                ((gaa.d) this.receiver).getClass();
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_ownership_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_ownership_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_portability_success_create_random_key, null, null, 14), new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_portability_success_got_it, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            case 20:
                ((gaa.d) this.receiver).getClass();
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_portability_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_portability_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_portability_success_create_random_key, null, null, 14), new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_portability_success_got_it, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            case 21:
                return ((hb0.j) this.receiver).a();
            case 22:
                ((gba.c) this.receiver).getClass();
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_finish_claim_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_finish_claim_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_portability_success_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            case 23:
                ((gba.c) this.receiver).getClass();
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_reply_ownership_claim_decline_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_reply_ownership_claim_decline_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_portability_success_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            case 24:
                ((gba.c) this.receiver).getClass();
                return new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_migration_details_deny_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_migration_details_deny_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_request_portability_success_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
            case 25:
                d0 d0Var = (d0) ((gyi.h) this.receiver);
                d0Var.getClass();
                d0Var.l2(new o(d0Var, continuation, 7), new yi5.b(26));
                return Unit.f186387a;
            case 26:
                hba.h hVar2 = (hba.h) this.receiver;
                int i32 = com.revolut.feature.pix.impl.R$string.pix_reply_ownership_claim_accept_success_title;
                int i33 = com.revolut.feature.pix.impl.R$string.pix_reply_ownership_claim_accept_success_description;
                int i43 = com.revolut.feature.pix.impl.R$string.pix_request_portability_success_got_it;
                Integer numValueOf = Integer.valueOf(i33);
                hVar2.getClass();
                return hba.h.d(i32, i43, numValueOf);
            case 27:
                hba.h hVar3 = (hba.h) this.receiver;
                int i59 = com.revolut.feature.pix.impl.R$string.pix_migration_details_accept_success_title;
                int i66 = com.revolut.feature.pix.impl.R$string.pix_migration_details_accept_success_description;
                int i74 = com.revolut.feature.pix.impl.R$string.pix_request_portability_success_got_it;
                Integer numValueOf2 = Integer.valueOf(i66);
                hVar3.getClass();
                return hba.h.d(i59, i74, numValueOf2);
            case 28:
                hba.h hVar4 = (hba.h) this.receiver;
                int i92 = com.revolut.feature.pix.impl.R$string.pix_migration_details_cancel_success_title;
                int i96 = com.revolut.feature.pix.impl.R$string.pix_migration_details_cancel_success_description;
                int i99 = com.revolut.feature.pix.impl.R$string.pix_request_portability_success_got_it;
                Integer numValueOf3 = Integer.valueOf(i96);
                hVar4.getClass();
                return hba.h.d(i92, i99, numValueOf3);
            default:
                hba.h hVar5 = (hba.h) this.receiver;
                int i100 = com.revolut.feature.pix.impl.R$string.pix_cancel_ownership_success_title;
                int i101 = com.revolut.feature.pix.impl.R$string.pix_cancel_ownership_success_got_it;
                hVar5.getClass();
                return hba.h.d(i100, i101, null);
        }
    }
}
