package dv4;

import al4.n;
import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.x2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b f118029w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f118029w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f118029w, continuation, 0);
            default:
                return new d(this.f118029w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b bVar = this.f118029w;
                    n nVar = bVar.f69648p;
                    String str = bVar.o.f69638a;
                    this.v = 1;
                    obj2 = ((x2) nVar).O(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (Iterable) obj2) {
                    if (obj3 instanceof ul4.a) {
                        arrayList.add(obj3);
                    }
                }
                return d0.d0(arrayList);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b bVar2 = this.f118029w;
                d dVar = new d(bVar2, null, 0);
                this.v = 1;
                Object objP2 = bVar2.p2(this, dVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
