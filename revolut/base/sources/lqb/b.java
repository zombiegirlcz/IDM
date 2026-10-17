package lqb;

import gim.i;
import kka.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mk0.p;
import pfm.t;
import q30.h;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f199292w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f199292w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f199292w, continuation, 0);
            case 1:
                return new b(this.f199292w, continuation, 1);
            case 2:
                return new b(this.f199292w, continuation, 2);
            case 3:
                return new b(this.f199292w, continuation, 3);
            case 4:
                return new b(this.f199292w, continuation, 4);
            case 5:
                return new b(this.f199292w, continuation, 5);
            case 6:
                return new b(this.f199292w, continuation, 6);
            case 7:
                return new b(this.f199292w, continuation, 7);
            case 8:
                return new b(this.f199292w, continuation, 8);
            case 9:
                return new b(this.f199292w, continuation, 9);
            case 10:
                return new b(this.f199292w, continuation, 10);
            case 11:
                return new b(this.f199292w, continuation, 11);
            case 12:
                return new b(this.f199292w, continuation, 12);
            case 13:
                return new b(this.f199292w, continuation, 13);
            case 14:
                return new b(this.f199292w, continuation, 14);
            case 15:
                return new b(this.f199292w, continuation, 15);
            case 16:
                return new b(this.f199292w, continuation, 16);
            default:
                return new b(this.f199292w, continuation, 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        g gVar = this.f199292w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    p pVar = (p) gVar.f199300j;
                    this.v = 1;
                    if (pVar.b(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    j jVar = (j) gVar.k;
                    this.v = 1;
                    if (jVar.a(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, new a(gVar, continuation, 0), this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    zfe.b bVar = (zfe.b) gVar.f199295a;
                    this.v = 1;
                    if (bVar.a(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    yii.b bVar2 = new yii.b((yii.c) gVar.i, null, 1);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, bVar2, this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (e0.o(new c(gVar, continuation, i2), this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    Object objA = nim.a.a(ue0.e.v(((zd0.b) gVar.e).a(sd0.f.FORCE_RELOAD)), this);
                    if (objA != obj5) {
                        objA = Unit.f186387a;
                    }
                    if (objA == obj5) {
                        return obj5;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    q30.i iVar = (q30.i) gVar.d;
                    this.v = 1;
                    if (((h) iVar).g(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                Object obj6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    p0 p0Var3 = p0.f264001a;
                    Object objJ3 = e0.J(zkm.o.f323119a, new a(gVar, continuation, 2), this);
                    if (objJ3 != obj6) {
                        objJ3 = Unit.f186387a;
                    }
                    if (objJ3 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                Object obj7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    p0 p0Var4 = p0.f264001a;
                    Object objJ4 = e0.J(elm.f.f127540b, new b(gVar, continuation, 7), this);
                    if (objJ4 != obj7) {
                        objJ4 = Unit.f186387a;
                    }
                    if (objJ4 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    pfm.a aVarN = ((cpj.b) ((xoj.a) gVar.f199299h)).n();
                    this.v = 1;
                    if (nim.a.a(aVarN, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    t tVarA = jte.c.a((jte.c) gVar.f199298g, null, 3);
                    this.v = 1;
                    if (nim.a.a(tVarA, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                Object obj8 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    p0 p0Var5 = p0.f264001a;
                    Object objJ5 = e0.J(elm.f.f127540b, new b(gVar, continuation, 16), this);
                    if (objJ5 != obj8) {
                        objJ5 = Unit.f186387a;
                    }
                    if (objJ5 == obj8) {
                        return obj8;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                Object obj9 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    p0 p0Var6 = p0.f264001a;
                    Object objJ6 = e0.J(elm.f.f127540b, new b(gVar, continuation, 17), this);
                    if (objJ6 != obj9) {
                        objJ6 = Unit.f186387a;
                    }
                    if (objJ6 == obj9) {
                        return obj9;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    pfm.a aVarR = ((ik3.c) ((fk3.a) gVar.f)).r();
                    this.v = 1;
                    if (nim.a.a(aVarR, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                Object obj10 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    Object objA2 = nim.a.a(((zd0.b) gVar.e).a(sd0.f.LAZY_RELOAD), this);
                    if (objA2 != obj10) {
                        objA2 = Unit.f186387a;
                    }
                    if (objA2 == obj10) {
                        return obj10;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    o.b(obj2);
                    fn2.c cVar = (fn2.c) gVar.f199301l;
                    this.v = 1;
                    if (cVar.l(true, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    ang.c cVar2 = (ang.c) gVar.f199302m;
                    this.v = 1;
                    Object objA3 = cVar2.f7766a.a(w4l.i.f294643c, this);
                    if (objA3 != aVar10) {
                        objA3 = Unit.f186387a;
                    }
                    if (objA3 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
