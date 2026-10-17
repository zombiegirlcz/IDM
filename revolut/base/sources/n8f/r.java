package n8f;

import com.revolut.data.model.Data;
import fnc.z;
import i6f.j0;
import i6f.m0;
import i6f.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f213388w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213388w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f213388w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f213388w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            case 2:
                r rVar3 = new r(this.f213388w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
            case 3:
                r rVar4 = new r(this.f213388w, continuation, 3);
                rVar4.v = obj2;
                return rVar4;
            case 4:
                r rVar5 = new r(this.f213388w, continuation, 4);
                rVar5.v = obj2;
                return rVar5;
            default:
                r rVar6 = new r(this.f213388w, continuation, 5);
                rVar6.v = obj2;
                return rVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((jlc.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r) create((b7f.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((r) create((j6f.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((r) create((r6f.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((d1h.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        s sVar = this.f213388w;
        switch (i) {
            case 0:
                jlc.r rVar = (jlc.r) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f213394w, new z(rVar, 2));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f213394w, new mtl.k(data, 26));
                break;
            case 2:
                b7f.c cVar = (b7f.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f213394w, new j0(cVar, i2));
                break;
            case 3:
                j6f.a aVar4 = (j6f.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f213394w, new o0(aVar4, i2));
                break;
            case 4:
                r6f.e eVar = (r6f.e) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f213394w, new m0(eVar, i2));
                break;
            default:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.f213394w, new b8f.z(gVar, 13));
                break;
        }
        return Unit.f186387a;
    }
}
