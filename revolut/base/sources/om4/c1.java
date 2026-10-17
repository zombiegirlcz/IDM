package om4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class c1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f226540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f226541x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(r1 r1Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226540w = r1Var;
        this.f226541x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c1(this.f226540w, this.f226541x, continuation, 0);
            case 1:
                return new c1(this.f226540w, this.f226541x, continuation, 1);
            case 2:
                return new c1(this.f226540w, this.f226541x, continuation, 2);
            case 3:
                return new c1(this.f226540w, this.f226541x, continuation, 3);
            case 4:
                return new c1(this.f226540w, this.f226541x, continuation, 4);
            case 5:
                return new c1(this.f226540w, this.f226541x, continuation, 5);
            case 6:
                return new c1(this.f226540w, this.f226541x, continuation, 6);
            case 7:
                return new c1(this.f226540w, this.f226541x, continuation, 7);
            case 8:
                return new c1(this.f226540w, this.f226541x, continuation, 8);
            case 9:
                return new c1(this.f226540w, this.f226541x, continuation, 9);
            case 10:
                return new c1(this.f226540w, this.f226541x, continuation, 10);
            case 11:
                return new c1(this.f226540w, this.f226541x, continuation, 11);
            case 12:
                return new c1(this.f226540w, this.f226541x, continuation, 12);
            default:
                return new c1(this.f226540w, this.f226541x, continuation, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f226540w.n(this.f226541x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f226540w.o(this.f226541x, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    al4.n nVar = this.f226540w.f226678a;
                    this.v = 1;
                    Object objD = ((x2) nVar).f226745a.i.d(this.f226541x, false, this);
                    if (objD != aVar3) {
                        objD = Unit.f186387a;
                    }
                    if (objD != aVar3) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar3) {
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
                    this.v = 1;
                    if (this.f226540w.n(this.f226541x, this) == aVar4) {
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
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f226540w.o(this.f226541x, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    al4.n nVar2 = this.f226540w.f226678a;
                    this.v = 1;
                    Object objD2 = ((x2) nVar2).f226745a.i.d(this.f226541x, false, this);
                    if (objD2 != aVar6) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 != aVar6) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    Object objD3 = this.f226540w.e.d(this.f226541x, this);
                    if (objD3 != aVar7) {
                        objD3 = Unit.f186387a;
                    }
                    if (objD3 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f226540w.o(this.f226541x, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    Object objD4 = this.f226540w.e.d(this.f226541x, this);
                    if (objD4 != aVar9) {
                        objD4 = Unit.f186387a;
                    }
                    if (objD4 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    al4.n nVar3 = this.f226540w.f226678a;
                    this.v = 1;
                    if (((x2) nVar3).K(this.f226541x, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    al4.n nVar4 = this.f226540w.f226678a;
                    this.v = 1;
                    Object objD5 = ((x2) nVar4).f226745a.i.d(this.f226541x, false, this);
                    if (objD5 != aVar11) {
                        objD5 = Unit.f186387a;
                    }
                    if (objD5 != aVar11) {
                        objD5 = Unit.f186387a;
                    }
                    if (objD5 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f226540w.o(this.f226541x, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    al4.n nVar5 = this.f226540w.f226678a;
                    this.v = 1;
                    if (((x2) nVar5).N(this.f226541x, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f226540w.n(this.f226541x, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
