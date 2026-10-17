package elj;

import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.a;
import dej.z0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanPacNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanPacNumberTransferConfirmationScreen;
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
        String str;
        z0 z0Var;
        z0 z0Var2;
        int i = this.u;
        EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b) esimMobilePlanPacNumberTransferConfirmationScreen.d()).C2(a.C0620a.f101317a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b) esimMobilePlanPacNumberTransferConfirmationScreen.d();
                y yVar = bVar.u;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                mlj.i iVar = ((g) j2Var.getValue()).f127498c;
                Continuation continuation = null;
                boolean zJ = pd.b.j(iVar != null ? Boolean.valueOf(bVar.f101319q.o(iVar)) : null);
                bVar.H2(yVar, new a6j.a(iVar, zJ, 19));
                if (zJ) {
                    mlj.i iVar2 = ((g) j2Var2.getValue()).f127498c;
                    if (iVar2 == null || (str = iVar2.f206986a) == null) {
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b.J2("Can't submit porting request pac code is null");
                        str = null;
                    }
                    if (str != null) {
                        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = ((g) j2Var2.getValue()).f127496a;
                        if (esimPhoneNumberPortingScheduleOption == null || (z0Var2 = esimPhoneNumberPortingScheduleOption.f100394a) == null) {
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b.J2("Can't submit porting request porting preferred schedule is null");
                            z0Var = null;
                        } else {
                            z0Var = z0Var2;
                        }
                        if (z0Var != null) {
                            bVar.l2(new e38.c(bVar, str, z0Var, continuation, 17), new yi5.b(26));
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
