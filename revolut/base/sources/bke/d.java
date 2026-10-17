package bke;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pfm.z;
import tnb.g0;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f16361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16361w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f16361w, continuation, 0);
            case 1:
                return new d(this.f16361w, continuation, 1);
            case 2:
                return new d(this.f16361w, continuation, 2);
            case 3:
                return new d(this.f16361w, continuation, 3);
            case 4:
                return new d(this.f16361w, continuation, 4);
            default:
                return new d(this.f16361w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                ji5.i iVar = this.f16361w.f16381w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(zi0.c.w(iVar.a(true)), null, new bk6.n(3), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        ((yhm.m) obj2).getClass();
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                if (((ec5.c) obj2).f124432a == ec5.j.NOT_STARTED) {
                    this.v = 2;
                    if (iVar.c(null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g0 g0Var = this.f16361w.G;
                this.v = 1;
                Object objG = g0Var.g(this);
                return objG == aVar2 ? aVar2 : objG;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    x xVar = this.f16361w;
                    a3i.q qVar = new a3i.q(xVar, null, 15);
                    this.v = 1;
                    if (xVar.Y2(this, qVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    qje.d dVar = this.f16361w.O;
                    this.v = 1;
                    z1 z1Var = dVar.f246832a;
                    Object obj3 = Unit.f186387a;
                    Object objEmit = z1Var.emit(obj3, this);
                    if (objEmit == aVar4) {
                        obj3 = objEmit;
                    }
                    if (obj3 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vkm.d dVarA = this.f16361w.Q.a(w4l.i.f294643c);
                this.v = 1;
                Object objX = vkm.q.x(dVarA, this);
                return objX == aVar5 ? aVar5 : objX;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                x xVar2 = this.f16361w;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    z zVarK = xVar2.E.k();
                    this.v = 1;
                    if (nim.a.b(zVarK, this) != aVar6) {
                    }
                    return aVar6;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0VarValidateRestriction = xVar2.F.validateRestriction();
                this.v = 2;
                Object objB = nim.a.b(d0VarValidateRestriction, this);
                if (objB != aVar6) {
                    return objB;
                }
                return aVar6;
        }
    }
}
