package r3b;

import b8f.z;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.home.a f251264w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, com.revolut.feature.retail.cfd.impl.screens.home.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f251264w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f251264w, continuation);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(1, this.f251264w, continuation);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(2, this.f251264w, continuation);
                sVar3.v = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s(3, this.f251264w, continuation);
                sVar4.v = obj2;
                return sVar4;
            case 4:
                s sVar5 = new s(4, this.f251264w, continuation);
                sVar5.v = obj2;
                return sVar5;
            case 5:
                s sVar6 = new s(5, this.f251264w, continuation);
                sVar6.v = obj2;
                return sVar6;
            case 6:
                s sVar7 = new s(6, this.f251264w, continuation);
                sVar7.v = obj2;
                return sVar7;
            case 7:
                s sVar8 = new s(7, this.f251264w, continuation);
                sVar8.v = obj2;
                return sVar8;
            case 8:
                s sVar9 = new s(8, this.f251264w, continuation);
                sVar9.v = obj2;
                return sVar9;
            default:
                s sVar10 = new s(9, this.f251264w, continuation);
                sVar10.v = obj2;
                return sVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.retail.cfd.impl.screens.home.a aVar = this.f251264w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new qna.p(data, 29));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new t(data2, 0));
                break;
            case 2:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new z(gVar, 14));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new t(data3, 1));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new t(data4, 2));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.E.k(data5);
                break;
            case 6:
                List list = (List) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new q2j.j(list, 19));
                break;
            case 7:
                Data data6 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new t(data6, 3));
                break;
            case 8:
                Data data7 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) data7.getContent();
                if (hVar != null) {
                    f2b.b bVar = aVar.B;
                    List list2 = hVar.f251239a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        a0.x(((y49.h) it8.next()).f310853l, arrayList);
                    }
                    ((f3b.f) bVar).c(arrayList, f2b.a.CFD_HOME);
                }
                aVar.H2(aVar.F, new t(data7, 4));
                break;
            default:
                Data data8 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new t(data8, 5));
                break;
        }
        return Unit.f186387a;
    }
}
