package dmj;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckout;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import com.revolut.retail.feature.esim.api.model.EsimTermsConsent;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberPurchaseStatusDialogFactory;
import dfj.r1;
import dfj.s1;
import dfj.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.u1;
import nii.w1;
import nii.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c f116176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f116176w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q0 q0Var = new q0(0, this.f116176w, continuation);
                q0Var.v = obj2;
                return q0Var;
            case 1:
                q0 q0Var2 = new q0(1, this.f116176w, continuation);
                q0Var2.v = obj2;
                return q0Var2;
            case 2:
                q0 q0Var3 = new q0(2, this.f116176w, continuation);
                q0Var3.v = obj2;
                return q0Var3;
            default:
                q0 q0Var4 = new q0(3, this.f116176w, continuation);
                q0Var4.v = obj2;
                return q0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q0) create((s1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimTerms esimTerms;
        List list;
        y0 y0Var;
        int i = this.u;
        LinkedHashMap linkedHashMap = null;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar = this.f116176w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.z, new dcf.g0(data, 22));
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                EsimPhoneNumberCheckout esimPhoneNumberCheckout = (EsimPhoneNumberCheckout) data2.getContent();
                if (esimPhoneNumberCheckout != null && (esimTerms = esimPhoneNumberCheckout.f100319b) != null && (list = esimTerms.f100529g) != null) {
                    List list2 = list;
                    int iB = zhm.q0.b(zhm.w.t(list2, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        linkedHashMap2.put((EsimTermsConsent) it8.next(), Boolean.FALSE);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                cVar.H2(cVar.z, new afa.w(data2, linkedHashMap, 1));
                return Unit.f186387a;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.z, new dcf.g0(data3, 23));
                return Unit.f186387a;
            default:
                s1 s1Var = (s1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar2 = this.f116176w;
                EsimMobilePlanPhoneNumberPurchaseStatusDialogFactory esimMobilePlanPhoneNumberPurchaseStatusDialogFactory = cVar2.f101388x;
                if (Intrinsics.f(s1Var, s1.b.f114101a)) {
                    esimMobilePlanPhoneNumberPurchaseStatusDialogFactory.getClass();
                    y0Var = new y0("ID_LOADING_DIALOG", new nii.c0(new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_status_sheet_loading_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_status_sheet_loading_subtitle, null, null, 14), null, false, null, false, false, null, 1916), false, 4);
                } else if (s1Var instanceof r1) {
                    boolean z = ((r1) s1Var).f114086a;
                    esimMobilePlanPhoneNumberPurchaseStatusDialogFactory.getClass();
                    y0Var = new y0("ID_SUCCESS_DIALOG", new nii.j0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_status_sheet_success_title, null, null, 14), (Clause) (z ? new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_status_sheet_success_ready_subtitle, null, null, 14) : new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_status_sheet_success_subtitle, null, null, 14)), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_status_sheet_success_cta, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4076), false, 4);
                } else if (s1Var instanceof t1) {
                    dj0.d lackingMoney = ((t1) s1Var).f114111a;
                    esimMobilePlanPhoneNumberPurchaseStatusDialogFactory.getClass();
                    Intrinsics.checkNotNullParameter(lackingMoney, "lackingMoney");
                    y0Var = new y0("ID_INSUFFICIENT_FUNDS", new nii.z(new TextLocalisedClause(R$string.esim_checkout_insufficient_funds_title, null, null, 14), new TextLocalisedClause(R$string.esim_checkout_insufficient_funds_subtitle, zhm.u.c(new MoneyClause(lackingMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.esim_checkout_insufficient_funds_top_up_button, null, null, 14), null, null, new EsimMobilePlanPhoneNumberPurchaseStatusDialogFactory.PhoneNumberCheckoutErrorDialogPayload.InsufficientFunds(lackingMoney), false, null, null, null, null, null, null, 32628), false, 4);
                } else if (Intrinsics.f(s1Var, s1.c.f114102a)) {
                    esimMobilePlanPhoneNumberPurchaseStatusDialogFactory.getClass();
                    y0Var = new y0("ID_PHONE_NUMBER_NO_LONGER_AVAILABLE", new nii.z(new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_status_sheet_error_phone_number_taken_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_status_sheet_error_phone_number_taken_subtitle, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_status_sheet_error_phone_number_taken_cta, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                } else {
                    if (!Intrinsics.f(s1Var, s1.d.f114103a) && !Intrinsics.f(s1Var, s1.a.f114100a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    esimMobilePlanPhoneNumberPurchaseStatusDialogFactory.getClass();
                    y0Var = new y0("ID_GENERAL_ERROR_DIALOG", new nii.z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                }
                yji.l.a1(cVar2, cVar2.X1(y0Var), null, null, new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.b(y0Var, cVar2, null), 3);
                return Unit.f186387a;
        }
    }
}
