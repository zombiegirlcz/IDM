package zlj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zlj.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanPhoneNumberActionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EsimMobilePlanPhoneNumberActionScreen esimMobilePlanPhoneNumberActionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanPhoneNumberActionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) this.v.O.getValue();
        String listId = model.f53228a;
        o oVar = (o) mVar;
        EsimMobilePlanPhoneNumberActionScreenContract$InputData esimMobilePlanPhoneNumberActionScreenContract$InputData = oVar.o;
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1991252456:
                if (listId.equals("ID_GET_STAC_NUMBER")) {
                    oVar.C2(new h(esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a));
                }
                break;
            case -1923019969:
                if (listId.equals("ID_PHONE_NUMBER_CANCEL_PORT_IN")) {
                    oVar.C2(new c(esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a));
                }
                break;
            case -1808080315:
                if (listId.equals("ID_RELEASE_NUMBER")) {
                    oVar.C2(new j(esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a));
                }
                break;
            case -1721787589:
                if (listId.equals("ID_PHONE_NUMBER_COPY_TO_CLIPBOARD")) {
                    oVar.f323298p.c(null, esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a.f100472c, false, new zj9.a(9));
                    oVar.C2(i.a.f323293a);
                }
                break;
            case -1666755776:
                if (listId.equals("ID_PHONE_NUMBER_EDIT_LABEL")) {
                    oVar.C2(new f(esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a));
                }
                break;
            case -1359087810:
                if (listId.equals("ID_PHONE_NUMBER_TRACK_PORT_IN_PROGRESS")) {
                    oVar.C2(new l(esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a));
                }
                break;
            case 515929172:
                if (listId.equals("ID_PHONE_NUMBER_CANCEL_PORT_OUT")) {
                    oVar.C2(new d(esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a));
                }
                break;
            case 1345717251:
                if (listId.equals("ID_GET_PAC_NUMBER")) {
                    oVar.C2(new g(esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a));
                }
                break;
            case 1463630656:
                if (listId.equals("ID_PHONE_NUMBER_TERMINATE")) {
                    oVar.C2(new k(esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a));
                }
                break;
            case 1955345516:
                if (listId.equals("ID_PHONE_NUMBER_CONFIRM_PORTABILITY_DETAILS")) {
                    oVar.C2(new e(esimMobilePlanPhoneNumberActionScreenContract$InputData.f101364a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
