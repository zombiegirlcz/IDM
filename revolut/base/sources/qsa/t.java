package qsa;

import djc.z;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f248787w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, Continuation continuation, u uVar) {
        super(2, continuation);
        this.u = i;
        this.f248787w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(0, continuation, this.f248787w);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(1, continuation, this.f248787w);
                tVar2.v = obj2;
                return tVar2;
            default:
                t tVar3 = new t(2, continuation, this.f248787w);
                tVar3.v = obj2;
                return tVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((t) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u uVar = this.f248787w;
        switch (i) {
            case 0:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.C, new z(20, iVar));
                break;
            case 1:
                j jVar = (j) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.C, new qgf.o(jVar, 26));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.C, new q2j.j(list, 15));
                break;
        }
        return Unit.f186387a;
    }
}
