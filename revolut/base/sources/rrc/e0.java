package rrc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f256764w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f256764w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e0(this.f256764w, continuation, 0);
            case 1:
                return new e0(this.f256764w, continuation, 1);
            default:
                return new e0(this.f256764w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                f0 f0Var = this.f256764w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    wpc.b bVar = f0Var.v;
                    String strA = f0Var.f256766p.a();
                    this.v = 1;
                    obj2 = ((q) bVar).h(strA, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aii.u uVar = (aii.u) obj2;
                if (uVar == null) {
                    return null;
                }
                f0.K2(f0Var, uVar);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                f0 f0Var2 = this.f256764w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    wpc.b bVar2 = f0Var2.v;
                    String strA2 = f0Var2.f256766p.a();
                    tji.f fVarX = f0Var2.X();
                    this.v = 1;
                    obj2 = ((q) bVar2).i(strA2, fVarX, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aii.u uVar2 = (aii.u) obj2;
                if (uVar2 == null) {
                    return null;
                }
                f0.K2(f0Var2, uVar2);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                f0 f0Var3 = this.f256764w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    wpc.b bVar3 = f0Var3.v;
                    String strA3 = f0Var3.f256766p.a();
                    tji.f fVarX2 = f0Var3.X();
                    this.v = 1;
                    obj2 = ((q) bVar3).j(strA3, fVarX2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aii.u uVar3 = (aii.u) obj2;
                if (uVar3 == null) {
                    return null;
                }
                f0.K2(f0Var3, uVar3);
                return Unit.f186387a;
        }
    }
}
