package mlj;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen;
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
    public final /* synthetic */ EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen esimMobilePlanPowerOfAttorneyBusinessDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanPowerOfAttorneyBusinessDetailsScreen;
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

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.P.getValue();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        y yVar = jVar.f206991r;
        LinkedHashMap linkedHashMapZ = r0.z(((e) ((j2) yVar.f22677a).getValue()).f206982a);
        Iterator it8 = jVar.o.f101339b.iterator();
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
        linkedHashMapZ.put(listId, new i(text, esimPhoneNumberPortingAttribute != null ? esimPhoneNumberPortingAttribute.f : null, esimPhoneNumberPortingAttribute != null ? esimPhoneNumberPortingAttribute.f100341g : null, false));
        jVar.H2(yVar, new awk.j(linkedHashMapZ, 12));
        return Unit.f186387a;
    }
}
