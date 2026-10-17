package byi;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b f19838w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f19838w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(0, this.f19838w, continuation);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(1, this.f19838w, continuation);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(2, this.f19838w, continuation);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j(3, this.f19838w, continuation);
                jVar4.v = obj2;
                return jVar4;
            default:
                j jVar5 = new j(4, this.f19838w, continuation);
                jVar5.v = obj2;
                return jVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b bVar = this.f19838w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bVar.H2(bVar.f99130t, new i(data, 0));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bVar.H2(bVar.f99130t, new i(data2, 1));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bVar.H2(bVar.f99130t, new i(data3, 2));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bVar.H2(bVar.f99130t, new i(data4, 3));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bVar.H2(bVar.f99130t, new i(data5, 4));
                break;
        }
        return Unit.f186387a;
    }
}
