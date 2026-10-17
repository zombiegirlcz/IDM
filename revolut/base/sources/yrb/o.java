package yrb;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f316228w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Continuation continuation, s sVar) {
        super(2, continuation);
        this.u = i;
        this.f316228w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(0, continuation, this.f316228w);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(1, continuation, this.f316228w);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(2, continuation, this.f316228w);
                oVar3.v = obj2;
                return oVar3;
            case 3:
                o oVar4 = new o(3, continuation, this.f316228w);
                oVar4.v = obj2;
                return oVar4;
            case 4:
                o oVar5 = new o(4, continuation, this.f316228w);
                oVar5.v = obj2;
                return oVar5;
            default:
                o oVar6 = new o(5, continuation, this.f316228w);
                oVar6.v = obj2;
                return oVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        s sVar = this.f316228w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.X2(sVar.z, new yfd.u(data, 22));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.X2(sVar.z, new yfd.u(data2, 23));
                break;
            case 2:
                c1b.i iVar = (c1b.i) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.f316241x.k(iVar);
                break;
            case 3:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qrb.a aVar5 = (qrb.a) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                vki.a aVar6 = sVar.z;
                w wVar = ((x) ((j2) aVar6.f22677a).getValue()).f;
                if (wVar.f316249a == 100 && wVar.f316250b) {
                    sVar.X2(aVar6, new a94.e(sVar, aVar5, iIntValue, 15));
                }
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.X2(sVar.z, new yfd.u(data3, 24));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.X2(sVar.z, new yfd.u(data4, 25));
                break;
        }
        return Unit.f186387a;
    }
}
