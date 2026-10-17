package plj;

import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDonorDetailsRequest;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingOwnerAccountTypeRequest;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPowerOfAttorneyRequest;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPreferredScheduleRequest;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a;
import dej.z0;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b) esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.d()).C2(a.C0621a.f101354a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b) esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.d();
                y yVar = bVar.f101355p;
                EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider = ((e) ((j2) yVar.f22677a).getValue()).f237416a;
                j2 j2Var = (j2) yVar.f22677a;
                EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = ((e) j2Var.getValue()).f237417b;
                EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = ((e) j2Var.getValue()).f237418c;
                LocalDate localDate = ((e) j2Var.getValue()).d;
                EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType = ((e) j2Var.getValue()).e;
                if (esimPhoneNumberPortingServiceProvider == null) {
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b.I2("Can't submit porting request, selectedServiceProvider is null");
                } else if (esimPhoneNumberPortingContractType == null) {
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b.I2("Can't submit porting request, selectedContractType is null");
                } else if (esimPhoneNumberPortingScheduleOption == null) {
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b.I2("Can't submit porting request, selectedPortingSchedule is null");
                } else {
                    z0 z0Var = esimPhoneNumberPortingScheduleOption.f100394a;
                    if (z0Var == z0.SPECIFIC_DATE && localDate == null) {
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b.I2("Can't submit porting request, selectedPortingSchedule is SPECIFIC_DATE and specifiedPortingDate is null");
                    } else if (esimPhoneNumberPortingOwnerAccountType == null) {
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b.I2("Can't submit porting request, selectedPhoneNumberType is null");
                    } else {
                        List list = esimPhoneNumberPortingOwnerAccountType.f100368b;
                        EsimPhoneNumberPortingPowerOfAttorneyRequest esimPhoneNumberPortingPowerOfAttorneyRequest = new EsimPhoneNumberPortingPowerOfAttorneyRequest(new EsimPhoneNumberPortingDonorDetailsRequest(esimPhoneNumberPortingServiceProvider, new EsimPhoneNumberPortingOwnerAccountTypeRequest(esimPhoneNumberPortingOwnerAccountType.f100367a, null), esimPhoneNumberPortingContractType), new EsimPhoneNumberPortingPreferredScheduleRequest(z0Var, localDate));
                        if (ue0.e.n(list)) {
                            bVar.C2(new h(esimPhoneNumberPortingPowerOfAttorneyRequest));
                        } else {
                            bVar.C2(new g(esimPhoneNumberPortingPowerOfAttorneyRequest, list));
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
