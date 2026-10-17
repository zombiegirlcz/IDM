package gh8;

import g37.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_graduation.impl.ui.screen.identification.a f143887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.junior_graduation.impl.ui.screen.identification.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f143887w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f143887w, continuation, 0);
            case 1:
                return new k(this.f143887w, continuation, 1);
            case 2:
                return new k(this.f143887w, continuation, 2);
            default:
                return new k(this.f143887w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        com.revolut.feature.junior_graduation.impl.ui.screen.identification.a aVar = this.f143887w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    z zVar = new z(aVar, continuation, 29);
                    this.v = 1;
                    if (aVar.p2(this, zVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m mVar = new m(aVar, null);
                this.v = 1;
                Object objP2 = aVar.p2(this, mVar);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 2:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    rul.e eVar = aVar.f76941p;
                    this.v = 1;
                    xg8.j jVar = (xg8.j) ((xg8.a) eVar.f257630b);
                    jVar.getClass();
                    xg8.h hVar = new xg8.h(jVar, continuation, i3);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, hVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        aVar.C2(e.f143883a);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                Object objB = aVar.f76942q.b(this);
                if (objB != obj3) {
                    objB = Unit.f186387a;
                }
                if (objB == obj3) {
                    return obj3;
                }
                aVar.C2(e.f143883a);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    k kVar = new k(aVar, continuation, i2);
                    this.v = 1;
                    if (u0.b0(aVar.X(), "LOADING_TAG_GRADUATION_WELCOME_SECONDARY", kVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
