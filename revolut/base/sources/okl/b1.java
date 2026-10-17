package okl;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class b1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226153w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(com.revolut.sso.impl.ui.auth.n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f226153w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b1(this.f226153w, continuation, 0);
            case 1:
                return new b1(this.f226153w, continuation, 1);
            default:
                return new b1(this.f226153w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.sso.impl.ui.auth.n nVar = this.f226153w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                gu2.e eVar = nVar.v;
                s sVar = new s(nVar, null, 4);
                this.v = 1;
                Object objB = fkl.c.b(eVar, sVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    Set setB = zhm.y0.b(jkl.i.SIGNATURE);
                    this.v = 1;
                    if (nVar.X2(true, setB, new w(nVar, null, 1), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.google.firebase.messaging.t tVar = nVar.U;
                    this.v = 1;
                    tVar.getClass();
                    ad4.c cVar = new ad4.c(tVar, null, 27);
                    skm.p0 p0Var = skm.p0.f264001a;
                    Object objJ = skm.e0.J(elm.f.f127540b, cVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                jkl.i iVar = jkl.i.WEB_AUTHN;
                this.v = 2;
                if (com.revolut.sso.impl.ui.auth.n.U2(nVar, iVar, null, this, 6) == obj3) {
                    return obj3;
                }
                return Unit.f186387a;
        }
    }
}
