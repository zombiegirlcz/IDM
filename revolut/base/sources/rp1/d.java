package rp1;

import com.revolut.feature.apm.bills.core.impl.data.network.BillsService;
import com.revolut.feature.apm.bills.core.impl.data.network.BillsServiceV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f256237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xo1.d f256238x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(j jVar, xo1.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f256237w = jVar;
        this.f256238x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f256237w, this.f256238x, continuation, 0);
            default:
                return new d(this.f256237w, this.f256238x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    BillsServiceV2 billsServiceV2 = this.f256237w.f256245b;
                    xo1.d dVar = this.f256238x;
                    String strName = dVar.f307565a.name();
                    String str = dVar.f307566b;
                    String str2 = dVar.f307567c;
                    this.v = 1;
                    obj2 = billsServiceV2.getFormFields(strName, null, str, null, str2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return sp1.a.a((ip1.d) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    BillsService billsService = this.f256237w.f256244a;
                    xo1.d dVar2 = this.f256238x;
                    String strName2 = dVar2.f307565a.name();
                    String str3 = dVar2.f307566b;
                    String str4 = dVar2.f307567c;
                    this.v = 1;
                    obj2 = billsService.getFormFields(strName2, null, str3, null, str4, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return zo1.a.d((yo1.e) obj2);
        }
    }
}
