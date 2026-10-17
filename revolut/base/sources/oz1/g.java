package oz1;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmendment;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.Authorisation;
import j02.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function3 {
    public /* synthetic */ List u;
    public /* synthetic */ List v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        g gVar = new g(3, (Continuation) obj4);
        gVar.u = (List) obj2;
        gVar.v = (List) obj3;
        return gVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = this.u;
        List list2 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            Authorisation authorisation = ((ApmPaymentAuthorisationSummary) obj3).u;
            if ((authorisation != null ? authorisation.f62006a : null) != s.VALIDATING) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new ApmPaymentAuthorisationPendingAction.Mandate((ApmPaymentAuthorisationSummary) it8.next()));
        }
        List list3 = list2;
        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            arrayList3.add(new ApmPaymentAuthorisationPendingAction.Amendment((ApmPaymentAuthorisationAmendment) it9.next()));
        }
        return d0.E0(arrayList3, arrayList2);
    }
}
