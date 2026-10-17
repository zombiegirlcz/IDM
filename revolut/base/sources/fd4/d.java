package fd4;

import efm.r;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c f133919w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f133919w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f133919w, continuation, 0);
            case 1:
                return new d(this.f133919w, continuation, 1);
            case 2:
                return new d(this.f133919w, continuation, 2);
            case 3:
                return new d(this.f133919w, continuation, 3);
            case 4:
                return new d(this.f133919w, continuation, 4);
            default:
                return new d(this.f133919w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar = this.f133919w;
                lx3.b bVar = cVar.f67871q;
                h1 h1VarQ2 = cVar.Q2();
                this.v = 1;
                Object objA = bVar.a(h1VarQ2, this);
                return objA == aVar ? aVar : objA;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar2 = this.f133919w;
                d dVar = new d(cVar2, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(cVar2.k, "confirm accounts and go next plugin", dVar, this);
                return objB == aVar2 ? aVar2 : objB;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar3 = this.f133919w;
                lx3.b bVar2 = cVar3.f67871q;
                h1 h1VarQ22 = cVar3.Q2();
                this.v = 1;
                Object objB2 = bVar2.b(h1VarQ22, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                r rVarG = m70.a.g(this.f133919w.f67872r.a(), null, null, 3);
                this.v = 1;
                Object objC = nim.a.c(rVarG, this);
                return objC == aVar4 ? aVar4 : objC;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar4 = this.f133919w;
                d dVar2 = new d(cVar4, null, 3);
                this.v = 1;
                Object objB3 = pu7.a.B(cVar4.k, "get accounts info", dVar2, this);
                return objB3 == aVar5 ? aVar5 : objB3;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar5 = this.f133919w;
                gd4.c cVar6 = cVar5.f67874t;
                h1 h1VarQ23 = cVar5.Q2();
                av3.e eVar = cVar5.P2().f9899c;
                String str = eVar != null ? eVar.f9895a : null;
                av3.e eVar2 = cVar5.P2().f9899c;
                String str2 = eVar2 != null ? eVar2.f9896b : null;
                this.v = 1;
                Object objA2 = cVar6.a(h1VarQ23, str, str2, this);
                return objA2 == aVar6 ? aVar6 : objA2;
        }
    }
}
