package a68;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nj8.n;
import skm.e0;
import te8.z;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f1559w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1559w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f1559w, continuation, 0);
            case 1:
                return new c(this.f1559w, continuation, 1);
            case 2:
                return new c(this.f1559w, continuation, 2);
            case 3:
                return new c(this.f1559w, continuation, 3);
            case 4:
                return new c(this.f1559w, continuation, 4);
            case 5:
                return new c(this.f1559w, continuation, 5);
            case 6:
                return new c(this.f1559w, continuation, 6);
            case 7:
                return new c(this.f1559w, continuation, 7);
            case 8:
                return new c(this.f1559w, continuation, 8);
            case 9:
                return new c(this.f1559w, continuation, 9);
            case 10:
                return new c(this.f1559w, continuation, 10);
            case 11:
                return new c(this.f1559w, continuation, 11);
            default:
                return new c(this.f1559w, continuation, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    e eVar = this.f1559w;
                    eVar.getClass();
                    Object objG = e0.G(new d(eVar, null, 1), this);
                    if (objG != obj3) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    hj8.a aVar2 = this.f1559w.f1561a;
                    this.v = 1;
                    if (((n) aVar2).n(true, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    te8.e eVar2 = this.f1559w.f1562b;
                    this.v = 1;
                    if (eVar2.c(true, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    pfm.a aVarM0 = this.f1559w.f1563c.m0(true);
                    this.v = 1;
                    if (nim.a.a(aVarM0, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    pfm.a aVarC = z.c(this.f1559w.d);
                    this.v = 1;
                    if (nim.a.a(aVarC, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    ic8.b bVar = this.f1559w.f;
                    this.v = 1;
                    if (((i98.e) bVar).d(true, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    hj8.a aVar8 = this.f1559w.f1561a;
                    this.v = 1;
                    if (((n) aVar8).n(true, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    te8.e eVar3 = this.f1559w.f1562b;
                    this.v = 1;
                    if (eVar3.c(true, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    pfm.a aVarM02 = this.f1559w.f1563c.m0(true);
                    this.v = 1;
                    if (nim.a.a(aVarM02, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    pfm.a aVarC2 = z.c(this.f1559w.d);
                    this.v = 1;
                    if (nim.a.a(aVarC2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    hj8.a aVar13 = this.f1559w.f1561a;
                    this.v = 1;
                    if (((n) aVar13).n(true, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    te8.e eVar4 = this.f1559w.f1562b;
                    this.v = 1;
                    if (eVar4.c(true, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    pfm.a aVarM03 = this.f1559w.f1563c.m0(true);
                    this.v = 1;
                    if (nim.a.a(aVarM03, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
