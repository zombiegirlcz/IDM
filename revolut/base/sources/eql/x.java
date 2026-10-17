package eql;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f128521w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(c0 c0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f128521w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f128521w, continuation, 0);
            case 1:
                return new x(this.f128521w, continuation, 1);
            default:
                return new x(this.f128521w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((x) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        c0 c0Var = this.f128521w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    p0 p0Var = p0.f264001a;
                    elm.f fVar = elm.f.f127540b;
                    w wVar = new w(c0Var, null, 0);
                    this.v = 1;
                    obj2 = e0.J(fVar, wVar, this);
                    if (obj2 != aVar) {
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                akl.k kVar = c0Var.o;
                String str = ((rqk.k) c0Var.u).f256593p;
                jkl.i iVar = jkl.i.BANK_ID;
                cjl.s sVar = cjl.s.GLOBAL;
                this.v = 2;
                Object objB = akl.k.b(kVar, sVar, str, (String) obj2, iVar, this);
                if (objB != aVar) {
                    return objB;
                }
                return aVar;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    p0 p0Var2 = p0.f264001a;
                    elm.f fVar2 = elm.f.f127540b;
                    w wVar2 = new w(c0Var, null, 1);
                    this.v = 1;
                    obj2 = e0.J(fVar2, wVar2, this);
                    if (obj2 != aVar2) {
                    }
                    return aVar2;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                akl.k kVar2 = c0Var.o;
                String str2 = ((rqk.k) c0Var.u).f256593p;
                jkl.i iVar2 = jkl.i.DAP;
                cjl.s sVar2 = cjl.s.GLOBAL;
                this.v = 2;
                Object objB2 = akl.k.b(kVar2, sVar2, str2, (String) obj2, iVar2, this);
                if (objB2 != aVar2) {
                    return objB2;
                }
                return aVar2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    p0 p0Var3 = p0.f264001a;
                    elm.f fVar3 = elm.f.f127540b;
                    w wVar3 = new w(c0Var, null, 2);
                    this.v = 1;
                    obj2 = e0.J(fVar3, wVar3, this);
                    if (obj2 == aVar3) {
                    }
                    return aVar3;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                akl.k kVar3 = c0Var.o;
                String str3 = ((rqk.k) c0Var.u).f256593p;
                jkl.i iVar3 = jkl.i.UAE_PASS;
                cjl.s sVar3 = cjl.s.GLOBAL;
                this.v = 2;
                Object objB3 = akl.k.b(kVar3, sVar3, str3, (String) obj2, iVar3, this);
                if (objB3 != aVar3) {
                    return objB3;
                }
                return aVar3;
        }
    }
}
