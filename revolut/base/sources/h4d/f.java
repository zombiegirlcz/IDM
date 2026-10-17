package h4d;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z3d.c f149337w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, z3d.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = hVar;
        this.f149337w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, this.f149337w, continuation, 0);
            case 1:
                return new f(this.v, this.f149337w, continuation, 1);
            default:
                return new f(this.v, this.f149337w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        z3d.c cVar = this.f149337w;
        h hVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVar2 = hVar.f149338a;
                i4d.a aVarC = aVar2.c();
                if (aVarC != null) {
                    aVar2.d(1);
                    aVar2.f(aVarC);
                }
                aVar2.e(n14.e.J(cVar, aVarC != null ? aVarC.d + 1 : -1));
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hVar.f149338a.a(cVar.f319248a.f86866a, cVar.f319249b.f115083b.f306286a);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVar5 = hVar.f149338a;
                aVar5.d(1);
                aVar5.f(n14.e.J(cVar, -1));
                break;
        }
        return Unit.f186387a;
    }
}
