package ib6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f160101w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f160101w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f160101w, continuation, 0);
            case 1:
                return new k(this.f160101w, continuation, 1);
            case 2:
                return new k(this.f160101w, continuation, 2);
            default:
                return new k(this.f160101w, continuation, 3);
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
                this.v = 1;
                Object objI2 = n.I2(this.f160101w, false, this);
                return objI2 == aVar ? aVar : objI2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                n nVar = this.f160101w;
                if (i2 == 0) {
                    o.b(obj2);
                    k kVar = new k(nVar, null, 0);
                    this.v = 1;
                    obj2 = u0.b0(nVar.X(), "DEACTIVATE_BUTTON_TAG", kVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nVar.C2(new d((yvh.b) obj2));
                return Unit.f186387a;
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
                this.v = 1;
                Object objI22 = n.I2(this.f160101w, true, this);
                return objI22 == aVar3 ? aVar3 : objI22;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                n nVar2 = this.f160101w;
                if (i5 == 0) {
                    o.b(obj2);
                    k kVar2 = new k(nVar2, null, 2);
                    this.v = 1;
                    obj2 = u0.b0(nVar2.X(), "SAVE_BUTTON_TAG", kVar2, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nVar2.C2(new d((yvh.b) obj2));
                return Unit.f186387a;
        }
    }
}
