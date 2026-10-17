package kkj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPorting;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreen;
import gmj.f;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zlj.i;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a f185085b;

    public /* synthetic */ n(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar, int i) {
        this.f185084a = i;
        this.f185085b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress;
        int i = this.f185084a;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar = this.f185085b;
        switch (i) {
            case 0:
                gmj.f result = (gmj.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, f.a.f144864a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.f101250r.getClass();
                aVar.X1(new mii.k("ID_PHONE_NUMBER_LABEL_UPDATE_SUCCESS", new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_label_updated_title, null, null, 14), null, null, null, 28));
                return Unit.f186387a;
            case 1:
                com.revolut.kompot.navigable.vc.modal.a aVar2 = aVar.f101254x;
                zlj.i result2 = (zlj.i) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof zlj.f) {
                    oki.h.v2(aVar2, new EsimMobilePlanMyNumbersScreenContract$ModalStep.EditLabel(((zlj.f) result2).f323290a), ModalDestination.Style.POPUP.f98311a);
                } else if (Intrinsics.f(result2, i.a.f323293a)) {
                    aVar.f101250r.getClass();
                    aVar.X1(nkj.d.a());
                } else {
                    boolean z = result2 instanceof zlj.d;
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    if (z) {
                        oki.h.v2(aVar2, new EsimMobilePlanMyNumbersScreenContract$ModalStep.CancelPortOut(((zlj.d) result2).f323288a), bottom_dialog);
                    } else if (result2 instanceof zlj.k) {
                        oki.h.v2(aVar2, new EsimMobilePlanMyNumbersScreenContract$ModalStep.TerminatePhoneNumber(((zlj.k) result2).f323295a), bottom_dialog);
                    } else if (result2 instanceof zlj.g) {
                        oki.h.v2(aVar2, new EsimMobilePlanMyNumbersScreenContract$ModalStep.GetPacCode(((zlj.g) result2).f323291a), bottom_dialog);
                    } else if (result2 instanceof zlj.h) {
                        oki.h.v2(aVar2, new EsimMobilePlanMyNumbersScreenContract$ModalStep.GetStacCode(((zlj.h) result2).f323292a), bottom_dialog);
                    } else if (result2 instanceof zlj.c) {
                        oki.h.v2(aVar2, new EsimMobilePlanMyNumbersScreenContract$ModalStep.CancelPortIn(((zlj.c) result2).f323287a), bottom_dialog);
                    } else if (result2 instanceof zlj.l) {
                        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = ((zlj.l) result2).f323296a;
                        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = esimSubscriptionPhoneNumber.i;
                        if (esimSubscriptionPhoneNumberPorting == null || (esimPhoneNumberPortingProgress = esimSubscriptionPhoneNumberPorting.i) == null) {
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a.J2("Porting progress is null, can't open bottom sheet");
                            return Unit.f186387a;
                        }
                        oki.h.v2(aVar2, new EsimMobilePlanMyNumbersScreenContract$ModalStep.PortInStatus(esimSubscriptionPhoneNumber, esimPhoneNumberPortingProgress), bottom_dialog);
                    } else if (result2 instanceof zlj.j) {
                        oki.h.v2(aVar2, new EsimMobilePlanMyNumbersScreenContract$ModalStep.ReleasePhoneNumber(((zlj.j) result2).f323294a), bottom_dialog);
                    } else {
                        if (!(result2 instanceof zlj.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.I2(((zlj.e) result2).f323289a);
                    }
                }
                return Unit.f186387a;
            case 2:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                aVar.f101250r.getClass();
                aVar.X1(new mii.h(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_number_termination_error_title, null, null, 14), "ID_PHONE_NUMBER_TERMINATION_ERROR"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimMobilePlanMyNumbersScreenModel", null, throwable, h0Var);
                return Boolean.TRUE;
            case 3:
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                aVar.f101250r.getClass();
                aVar.X1(new mii.h(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_number_release_error_title, null, null, 14), "ID_PHONE_NUMBER_RELEASE_ERROR"));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimMobilePlanMyNumbersScreenModel", null, throwable2, h0Var2);
                return Boolean.TRUE;
            default:
                Throwable throwable3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable3, "throwable");
                aVar.f101250r.getClass();
                aVar.X1(new mii.h(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_toast_porting_cancelling_error_title, null, null, 14), "ID_PHONE_NUMBER_PORTING_CANCELLATION_ERROR"));
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimMobilePlanMyNumbersScreenModel", null, throwable3, h0Var3);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ n(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a aVar, EsimMobilePlanPhoneNumberActionScreen esimMobilePlanPhoneNumberActionScreen) {
        this.f185084a = 1;
        this.f185085b = aVar;
    }
}
