package vkj;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreen;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanDynamicFormBusinessDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimMobilePlanDynamicFormBusinessDetailsScreen esimMobilePlanDynamicFormBusinessDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanDynamicFormBusinessDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        n nVar = (n) hVarE3;
        y yVar = nVar.u;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        Iterator it8 = nVar.o.d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((EsimPhoneNumberPortingAttribute) next).f100338a, listId)) {
                break;
            }
        }
        EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute = (EsimPhoneNumberPortingAttribute) next;
        if (esimPhoneNumberPortingAttribute != null) {
            LinkedHashMap linkedHashMapZ = r0.z(((e) ((j2) yVar.f22677a).getValue()).f289969a);
            linkedHashMapZ.put(listId, new zkj.b(text, esimPhoneNumberPortingAttribute.f100341g));
            nVar.H2(yVar, new awk.j(linkedHashMapZ, 21));
        }
        return Unit.f186387a;
    }
}
