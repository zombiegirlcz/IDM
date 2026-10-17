package xkj;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;
import dej.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanDynamicFormNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanDynamicFormNumberTransferConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        t0 t0Var;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) jVarE3;
        y yVar = bVar.f101285x;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.f101286y;
        EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData = bVar.o;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        String strName = null;
        List list = null;
        strName = null;
        switch (iHashCode) {
            case -1877568592:
                if (listId.equals("ID_NUMBER_TRANSFER_SERVICE_PROVIDER_PICKER")) {
                    List list2 = esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.e.f100353g;
                    if (!ue0.e.n(list2)) {
                        oki.h.v2(aVar2, new EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.ServiceProviderPicker(list2), ModalDestination.Style.POPUP.f98311a);
                    } else {
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b.K2("Can't open ServiceProviderPicker, serviceProviders are null or empty");
                    }
                }
                break;
            case -1240482608:
                if (listId.equals("ID_NUMBER_TRANSFER_PHONE_NUMBER_TYPE_PICKER")) {
                    EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType = ((g) ((j2) yVar.f22677a).getValue()).e;
                    List list3 = esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.e.f100354h;
                    if (esimPhoneNumberPortingOwnerAccountType == null || ue0.e.n(list3)) {
                        if (list3 != null) {
                            List list4 = list3;
                            arrayList = new ArrayList(w.t(list4, 10));
                            Iterator it8 = list4.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(((EsimPhoneNumberPortingOwnerAccountType) it8.next()).f100367a.name());
                            }
                        } else {
                            arrayList = null;
                        }
                        if (esimPhoneNumberPortingOwnerAccountType != null && (t0Var = esimPhoneNumberPortingOwnerAccountType.f100367a) != null) {
                            strName = t0Var.name();
                        }
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b.K2("Can't open PhoneNumberTypePicker, phoneNumberType=" + strName + ", ownerAccountTypes=" + arrayList);
                    } else {
                        oki.h.v2(aVar2, new EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PhoneNumberTypePicker(esimPhoneNumberPortingOwnerAccountType, list3), bottom_dialog);
                    }
                }
                break;
            case -455858296:
                if (listId.equals("ID_NUMBER_TRANSFER_CONTRACT_TYPE_PICKER")) {
                    List list5 = esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.e.i;
                    if (!ue0.e.n(list5)) {
                        oki.h.v2(aVar2, new EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.ContractTypePicker(list5), bottom_dialog);
                    } else {
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b.K2("Can't open ContractTypePicker, contractTypes are null");
                    }
                }
                break;
            case -150455747:
                if (listId.equals("ID_NUMBER_TRANSFER_DATE_OF_PORTABILITY_PICKER")) {
                    List list6 = esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.e.f100355j;
                    if (list6 == null) {
                        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = ((g) ((j2) yVar.f22677a).getValue()).f306820b;
                        if (esimPhoneNumberPortingContractType != null) {
                            list = esimPhoneNumberPortingContractType.d;
                        }
                    } else {
                        list = list6;
                    }
                    if (!ue0.e.n(list)) {
                        oki.h.v2(aVar2, new EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker(((g) ((j2) yVar.f22677a).getValue()).f306820b, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.e.k, list, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f101264c), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                    } else {
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b.K2("Can't open PortingPreferredSchedulePicker, preferredScheduleOptions is null or empty");
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
