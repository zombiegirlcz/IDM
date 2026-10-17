package t50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import t50.i;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z30.e f268025w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, z30.e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = uVar;
        this.f268025w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, this.f268025w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        z30.e eVar = this.f268025w;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            Object objP2 = uVar.p2(this, new sb4.i(uVar, uVar.J2(eVar), null, 14));
            if (objP2 != aVar) {
                objP2 = Unit.f186387a;
            }
            if (objP2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        s50.e eVar2 = uVar.f268030q;
        h hVar = uVar.o;
        eVar2.b(hVar.f268017b.a().indexOf(eVar), hVar.f268016a);
        uVar.C2(i.a.f268019a);
        return Unit.f186387a;
    }
}
