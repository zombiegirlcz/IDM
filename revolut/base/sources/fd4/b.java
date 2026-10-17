package fd4;

import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c f133916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f133917x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar, h1 h1Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f133916w = cVar;
        this.f133917x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f133916w, this.f133917x, continuation, 0);
            case 1:
                return new b(this.f133916w, this.f133917x, continuation, 1);
            case 2:
                return new b(this.f133916w, this.f133917x, continuation, 2);
            default:
                return new b(this.f133916w, this.f133917x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar = this.f133916w;
                if (i == 0) {
                    o.b(obj2);
                    ow3.e eVar = cVar.u;
                    this.v = 1;
                    if (eVar.a(this.f133917x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                h.D2(cVar.f67875w);
                return Unit.f186387a;
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
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar2 = this.f133916w;
                b bVar = new b(cVar2, this.f133917x, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(cVar2.k, "cancel application", bVar, this);
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
                lx3.b bVar2 = this.f133916w.f67871q;
                this.v = 1;
                Object objD = bVar2.d(this.f133917x, this);
                return objD == aVar3 ? aVar3 : objD;
            default:
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
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c cVar3 = this.f133916w;
                b bVar3 = new b(cVar3, this.f133917x, null, 2);
                this.v = 1;
                Object objB2 = pu7.a.B(cVar3.k, "get permissions info", bVar3, this);
                return objB2 == aVar4 ? aVar4 : objB2;
        }
    }
}
