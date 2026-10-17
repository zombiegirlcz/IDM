package rp1;

import com.revolut.feature.apm.bills.core.api.model.search.nz.BillSearchNzResult;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import com.revolut.feature.apm.bills.core.impl.data.network.BillsService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lp1.a;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bp1.a f256239w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, bp1.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f256239w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f256239w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            BillsService billsService = this.v.f256244a;
            bp1.a aVar2 = this.f256239w;
            LinkedHashMap linkedHashMap = aVar2.f17543b;
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new a.C1122a((String) entry.getKey(), (String) entry.getValue()));
            }
            lp1.a aVar3 = new lp1.a(aVar2.f17542a, arrayList);
            this.u = 1;
            obj2 = billsService.searchBill(aVar3, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        lp1.b bVar = (lp1.b) obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        xo1.g gVar = xo1.g.NZ_BILLS;
        jo3.a amount = bVar.getAmount();
        dj0.d dVarO = amount != null ? mo3.a.o(amount) : null;
        jo3.a totalAmount = bVar.getTotalAmount();
        dj0.d dVarO2 = totalAmount != null ? mo3.a.o(totalAmount) : null;
        ServiceProvider serviceProviderT = hx7.a.t(bVar.getServiceProvider());
        boolean amountEditable = bVar.getAmountEditable();
        Boolean allowScheduling = bVar.getAllowScheduling();
        boolean zBooleanValue = allowScheduling != null ? allowScheduling.booleanValue() : false;
        Boolean allowRecurring = bVar.getAllowRecurring();
        return new BillSearchNzResult(gVar, dVarO, dVarO2, serviceProviderT, amountEditable, zBooleanValue, allowRecurring != null ? allowRecurring.booleanValue() : false);
    }
}
