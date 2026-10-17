package h40;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f149263w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149263w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f149263w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f149263w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            case 2:
                m mVar3 = new m(this.f149263w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
            default:
                m mVar4 = new m(this.f149263w, continuation, 3);
                mVar4.v = obj2;
                return mVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 8;
        n nVar = this.f149263w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.H2(nVar.f149267s, new h1k.k(data, i2));
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.H2(nVar.f149267s, new h1k.k(data2, 9));
                return Unit.f186387a;
            case 2:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ArrayList<kse.a> arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((kse.a) obj3).f189439g == kse.e.RESOLVED) {
                        arrayList.add(obj3);
                    }
                }
                int iB = q0.b(w.t(arrayList, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (kse.a aVar4 : arrayList) {
                    linkedHashMap.put(aVar4.f189436a, aVar4.f189440h);
                }
                return nim.a.v(nVar.f149265q.b(d0.d1(linkedHashMap.keySet()), w4l.h.f294642c), new awk.j(linkedHashMap, i2));
            default:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Pair pair = (Pair) data3.getContent();
                if (pair == null) {
                    return Unit.f186387a;
                }
                nVar.H2(nVar.f149267s, new eh1.d((List) pair.f186385a, i2, (List) pair.f186386b));
                return Unit.f186387a;
        }
    }
}
