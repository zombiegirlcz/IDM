package gmj;

import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.t0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanPhoneNumberLabelEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimMobilePlanPhoneNumberLabelEditScreen esimMobilePlanPhoneNumberLabelEditScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanPhoneNumberLabelEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 29;
        EsimMobilePlanPhoneNumberLabelEditScreen esimMobilePlanPhoneNumberLabelEditScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                esimMobilePlanPhoneNumberLabelEditScreen.d().B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE3 = esimMobilePlanPhoneNumberLabelEditScreen.d();
                EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData esimMobilePlanPhoneNumberLabelEditScreenContract$InputData = iVarE3.o;
                String str = esimMobilePlanPhoneNumberLabelEditScreenContract$InputData.f101390a;
                String str2 = esimMobilePlanPhoneNumberLabelEditScreenContract$InputData.f101391b.f100470a;
                String str3 = ((e) ((j2) iVarE3.f144873r.f22677a).getValue()).f144863a;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                iVarE3.l2(new g0a.e(11, iVarE3, str, str2, str4, null), new gd3.i(iVarE3, i2));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE32 = esimMobilePlanPhoneNumberLabelEditScreen.d();
                EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData esimMobilePlanPhoneNumberLabelEditScreenContract$InputData2 = iVarE32.o;
                String str5 = esimMobilePlanPhoneNumberLabelEditScreenContract$InputData2.f101390a;
                String str6 = esimMobilePlanPhoneNumberLabelEditScreenContract$InputData2.f101391b.f100470a;
                m70.a.c(t0.f186434a);
                iVarE32.l2(new g0a.e(11, iVarE32, str5, str6, "", null), new gd3.i(iVarE32, i2));
                break;
        }
        return Unit.f186387a;
    }
}
