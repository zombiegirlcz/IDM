package xkj;

import aw0.n6;
import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDonorDetailsRequest;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingOwnerAccountTypeRequest;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPreferredScheduleRequest;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.a;
import dej.z0;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import xec.c0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanDynamicFormNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanDynamicFormNumberTransferConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) esimMobilePlanDynamicFormNumberTransferConfirmationScreen.R2()).C2(a.C0618a.f101278a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) esimMobilePlanDynamicFormNumberTransferConfirmationScreen.R2();
                y yVar = bVar.f101285x;
                EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider = ((g) ((j2) yVar.f22677a).getValue()).f306819a;
                j2 j2Var = (j2) yVar.f22677a;
                EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = ((g) j2Var.getValue()).f306820b;
                EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = ((g) j2Var.getValue()).f306821c;
                LocalDate localDate = ((g) j2Var.getValue()).d;
                EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType = ((g) j2Var.getValue()).e;
                if ((esimPhoneNumberPortingScheduleOption != null ? esimPhoneNumberPortingScheduleOption.f100394a : null) == z0.SPECIFIC_DATE && localDate == null) {
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b.K2("Can't submit porting request, selectedPortingSchedule is SPECIFIC_DATE and specifiedPortingDate is null");
                } else {
                    zkj.a aVar3 = bVar.f101280q;
                    LinkedHashMap userInputs = r0.p(((g) j2Var.getValue()).f, ((g) j2Var.getValue()).f306822g);
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(userInputs, "userInputs");
                    EsimPhoneNumberPortingDynamicFormRequest esimPhoneNumberPortingDynamicFormRequest = new EsimPhoneNumberPortingDynamicFormRequest(new EsimPhoneNumberPortingDonorDetailsRequest(esimPhoneNumberPortingServiceProvider, esimPhoneNumberPortingOwnerAccountType != null ? new EsimPhoneNumberPortingOwnerAccountTypeRequest(esimPhoneNumberPortingOwnerAccountType.f100367a, null) : null, esimPhoneNumberPortingContractType), new EsimPhoneNumberPortingPreferredScheduleRequest(esimPhoneNumberPortingScheduleOption != null ? esimPhoneNumberPortingScheduleOption.f100394a : null, localDate), zkj.a.a(userInputs));
                    if (ue0.e.n(esimPhoneNumberPortingOwnerAccountType != null ? esimPhoneNumberPortingOwnerAccountType.f100368b : null)) {
                        bVar.l2(new c0(bVar, esimPhoneNumberPortingDynamicFormRequest, null, 26), new yi5.b(26));
                    } else {
                        List list = esimPhoneNumberPortingOwnerAccountType.f100368b;
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        bVar.C2(new h(esimPhoneNumberPortingDynamicFormRequest, list));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
