package n1g;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mll.c0;
import nii.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f211334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f211334w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f211334w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f211334w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(this.f211334w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((y0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        r rVar = this.f211334w;
        switch (i) {
            case 0:
                y0 y0Var = (y0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar2 = this.f211334w;
                yji.l.a1(rVar2, rVar2.X1(y0Var), null, null, new c0(y0Var, rVar2, (Continuation) null, 15), 3);
                rVar2.x2(new n0c.o(24));
                break;
            case 1:
                yhm.r rVar3 = (yhm.r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.x2(new afg.h(9, (Data) rVar3.f314201a, (Data) rVar3.f314202b, (Data) rVar3.f314203c));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.x2(new mtl.k(data, 17));
                break;
        }
        return Unit.f186387a;
    }
}
