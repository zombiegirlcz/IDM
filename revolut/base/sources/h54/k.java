package h54;

import ft3.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149479w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f149479w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f149479w, continuation, 0);
            case 1:
                return new k(this.f149479w, continuation, 1);
            case 2:
                return new k(this.f149479w, continuation, 2);
            case 3:
                return new k(this.f149479w, continuation, 3);
            case 4:
                return new k(this.f149479w, continuation, 4);
            case 5:
                return new k(this.f149479w, continuation, 5);
            case 6:
                return new k(this.f149479w, continuation, 6);
            case 7:
                return new k(this.f149479w, continuation, 7);
            case 8:
                return new k(this.f149479w, continuation, 8);
            case 9:
                return new k(this.f149479w, continuation, 9);
            case 10:
                return new k(this.f149479w, continuation, 10);
            case 11:
                return new k(this.f149479w, continuation, 11);
            case 12:
                return new k(this.f149479w, continuation, 12);
            case 13:
                return new k(this.f149479w, continuation, 13);
            case 14:
                return new k(this.f149479w, continuation, 14);
            case 15:
                return new k(this.f149479w, continuation, 15);
            case 16:
                return new k(this.f149479w, continuation, 16);
            default:
                return new k(this.f149479w, continuation, 17);
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
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar = this.f149479w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar, null, null, this, 3) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (dVar.X2(true, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar2 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar2, null, null, this, 3) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (dVar.X2(true, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar3 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar3, null, null, this, 3) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar4 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar4, null, null, this, 3) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar5 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar5, null, null, this, 3) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar6 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar6, null, null, this, 3) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (dVar.X2(true, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar7 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar7, null, null, this, 3) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar8 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar8, null, null, this, 3) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar9 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar9, null, null, this, 3) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar10 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar10, null, null, this, 3) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar11 = dVar.H;
                    this.v = 1;
                    if (j54.v.r(vVar11, null, null, this, 3) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.feature.credit.application.plugins.impl.ui.application.d.I2(dVar, this);
                    if (obj2 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i100 != 1) {
                        if (i100 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                dVar.H2(dVar.P, new b94.r((it3.d) obj2, i2));
                this.v = 2;
                if (dVar.V2(this) == aVar15) {
                    return aVar15;
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (dVar.X2(true, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (dVar.X2(false, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xq3.j jVar = dVar.f67094t;
                j1 j1Var = dVar.M2().f137810a;
                this.v = 1;
                xr3.k kVar = jVar.f308077a;
                kVar.getClass();
                xnl.f fVar = new xnl.f(kVar, j1Var, continuation, 5);
                p0 p0Var = p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, fVar, this);
                return objJ == aVar18 ? aVar18 : objJ;
        }
    }
}
