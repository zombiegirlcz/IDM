package plj;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep;
import dej.t0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;
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
        t0 t0Var;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b) iVarE3;
        y yVar = bVar.f101355p;
        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData = bVar.o;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.f101356q;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        switch (iHashCode) {
            case -1877568592:
                if (listId.equals("ID_NUMBER_TRANSFER_SERVICE_PROVIDER_PICKER")) {
                    oki.h.v2(aVar2, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.ServiceProviderPicker(esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.e.e), ModalDestination.Style.POPUP.f98311a);
                }
                break;
            case -1240482608:
                if (listId.equals("ID_NUMBER_TRANSFER_PHONE_NUMBER_TYPE_PICKER")) {
                    EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType = ((e) ((j2) yVar.f22677a).getValue()).e;
                    ArrayList arrayList = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.e.f;
                    if (esimPhoneNumberPortingOwnerAccountType == null || arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((EsimPhoneNumberPortingOwnerAccountType) it8.next()).f100367a.name());
                        }
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b.I2("Can't open PhoneNumberTypePicker, phoneNumberType=" + ((esimPhoneNumberPortingOwnerAccountType == null || (t0Var = esimPhoneNumberPortingOwnerAccountType.f100367a) == null) ? null : t0Var.name()) + " ownerAccountTypes=" + arrayList2);
                    } else {
                        oki.h.v2(aVar2, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.PhoneNumberTypePicker(esimPhoneNumberPortingOwnerAccountType, arrayList), bottom_dialog);
                    }
                }
                break;
            case -455858296:
                if (listId.equals("ID_NUMBER_TRANSFER_CONTRACT_TYPE_PICKER")) {
                    oki.h.v2(aVar2, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.ContractTypePicker(esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.e.f100377g), bottom_dialog);
                }
                break;
            case -150455747:
                if (listId.equals("ID_NUMBER_TRANSFER_DATE_OF_PORTABILITY_PICKER")) {
                    EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = ((e) ((j2) yVar.f22677a).getValue()).f237417b;
                    if (esimPhoneNumberPortingContractType != null) {
                        oki.h.v2(aVar2, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker(esimPhoneNumberPortingContractType, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.e.f100378h, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.f101342c), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                    } else {
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b.I2("Can't open PortingPreferredSchedulePicker, selectedContractType is null");
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
