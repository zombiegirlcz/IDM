package vgg;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vch.s0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b f289182w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f289182w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(this.f289182w, continuation, 0);
                yVar.v = obj2;
                return yVar;
            case 1:
                y yVar2 = new y(this.f289182w, continuation, 1);
                yVar2.v = obj2;
                return yVar2;
            default:
                y yVar3 = new y(this.f289182w, continuation, 2);
                yVar3.v = obj2;
                return yVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        int i = this.u;
        com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar = this.f289182w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f94277w, new s0(data, 10));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar2 = this.f289182w;
                bVar2.H2(bVar2.f94277w, new s0(data2, 9));
                hfg.e eVar = (hfg.e) data2.getContent();
                if (eVar != null && (list = eVar.k) != null) {
                    if (list.size() == 1 && list.contains(hfg.b0.GIFT_CARDS)) {
                        hfg.e eVar2 = (hfg.e) data2.getContent();
                        yji.l.a1(bVar2, rd0.e.n(bVar2.f94274r.c(eVar2 != null ? eVar2.f151830n : null, w4l.i.f294643c), h0.f322473a), null, null, new y(bVar2, null, 0), 3);
                    }
                }
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f94277w, new s0(data3, 11));
                break;
        }
        return Unit.f186387a;
    }
}
