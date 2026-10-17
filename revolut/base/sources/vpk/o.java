package vpk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ qta.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f291247w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f291247w = pVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        qta.d dVar = (qta.d) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(this.f291247w, continuation, 0);
                oVar.v = dVar;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(this.f291247w, continuation, 1);
                oVar2.v = dVar;
                return oVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f291247w;
        switch (i) {
            case 0:
                qta.d dVar = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ipk.b bVar = pVar.f291250c;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                bVar.b(new ipk.f(dVar.f249051a, dVar.f249052b.f306286a, dVar.f249053c.f306286a, io3.h.M(dVar.d), dVar.e));
                break;
            default:
                qta.d dVar2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ipk.b bVar2 = pVar.f291250c;
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                bVar2.b(new ipk.f(dVar2.f249051a, dVar2.f249052b.f306286a, dVar2.f249053c.f306286a, io3.h.M(dVar2.d), dVar2.e));
                break;
        }
        return Unit.f186387a;
    }
}
