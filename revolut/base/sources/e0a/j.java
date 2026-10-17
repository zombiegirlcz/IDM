package e0a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f121503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f121504x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121504x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f121504x, continuation, 0);
                jVar.f121503w = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f121504x, continuation, 1);
                jVar2.f121503w = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((zx0.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                j2 j2Var = this.f121504x.o;
                zx0.j jVar = (zx0.j) this.f121503w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (jVar == zx0.j.HIDDEN && j2Var.getValue() == fu9.a.SOFT_KEYBOARD) {
                        fu9.a aVar2 = fu9.a.REACTIONS_KEYBOARD;
                        this.f121503w = null;
                        this.v = 1;
                        j2Var.setValue(aVar2);
                        if (Unit.f186387a == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                l lVar = this.f121504x;
                j2 j2Var2 = lVar.o;
                Boolean bool = (Boolean) this.f121503w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (bool.booleanValue()) {
                        zx0.j state = lVar.f121506l.d.getState();
                        state.getClass();
                        if (state == zx0.j.HIDDEN) {
                            if (j2Var2.getValue() == fu9.a.SOFT_KEYBOARD) {
                                fu9.a aVar4 = fu9.a.REACTIONS_KEYBOARD;
                                this.f121503w = null;
                                this.v = 1;
                                j2Var2.setValue(aVar4);
                                if (Unit.f186387a == aVar3) {
                                    return aVar3;
                                }
                            }
                        }
                    }
                    return Unit.f186387a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                return Unit.f186387a;
        }
    }
}
