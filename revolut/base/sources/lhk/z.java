package lhk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f195389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f195390x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(e0 e0Var, k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f195389w = e0Var;
        this.f195390x = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f195389w, this.f195390x, continuation, 0);
            case 1:
                return new z(this.f195389w, this.f195390x, continuation, 1);
            case 2:
                return new z(this.f195389w, this.f195390x, continuation, 2);
            case 3:
                return new z(this.f195389w, this.f195390x, continuation, 3);
            default:
                return new z(this.f195389w, this.f195390x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r0 r0Var = this.f195389w.f195333m;
                this.v = 1;
                Object objH = r0Var.h(this.f195390x, this);
                return objH == aVar ? aVar : objH;
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
                e0 e0Var = this.f195389w;
                z zVar = new z(e0Var, this.f195390x, null, 0);
                this.v = 1;
                Object objZ2 = e0Var.f195335p.Z2(zVar, this);
                return objZ2 == aVar2 ? aVar2 : objZ2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var2 = this.f195389w;
                z zVar2 = new z(e0Var2, this.f195390x, null, 1);
                this.v = 1;
                Object objZ22 = e0Var2.o.Z2(zVar2, this);
                return objZ22 == aVar3 ? aVar3 : objZ22;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var3 = this.f195389w;
                k kVar = this.f195390x;
                z zVar3 = new z(e0Var3, kVar, null, 2);
                this.v = 1;
                Object objK3 = e0.k3(e0Var3, kVar, zVar3, this);
                return objK3 == aVar4 ? aVar4 : objK3;
            default:
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
                this.v = 1;
                e0 e0Var4 = this.f195389w;
                Object objU = do3.q.u(e0Var4, new z(e0Var4, this.f195390x, null, 3), this);
                return objU == aVar5 ? aVar5 : objU;
        }
    }
}
