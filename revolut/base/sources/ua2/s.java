package ua2;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f278532w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278532w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f278532w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.f278532w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        t tVar = this.f278532w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Iterable iterable = (List) data.getContent();
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    zm3.a aVar2 = (zm3.a) obj3;
                    if ((aVar2 instanceof zm3.f) || (aVar2 instanceof zm3.e)) {
                        arrayList.add(obj3);
                    }
                }
                tVar.H2(tVar.f278535r, new r(0, arrayList));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.H2(tVar.f278535r, new u4e.l(data2, 20));
                break;
        }
        return Unit.f186387a;
    }
}
