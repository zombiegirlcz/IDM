package ae8;

import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nj8.n;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a5h.g f3508w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(a5h.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3508w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f3508w, continuation, 0);
            case 1:
                return new f(this.f3508w, continuation, 1);
            case 2:
                return new f(this.f3508w, continuation, 2);
            case 3:
                return new f(this.f3508w, continuation, 3);
            case 4:
                return new f(this.f3508w, continuation, 4);
            case 5:
                return new f(this.f3508w, continuation, 5);
            default:
                return new f(this.f3508w, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    hj8.a aVar2 = (hj8.a) this.f3508w.f1407c;
                    this.v = 1;
                    if (((n) aVar2).n(true, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    te8.e eVar = (te8.e) this.f3508w.d;
                    this.v = 1;
                    if (eVar.c(true, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    pfm.a aVarM0 = ((wsg.n) this.f3508w.f1406b).m0(true);
                    this.v = 1;
                    if (nim.a.a(aVarM0, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    fe8.a aVar6 = (fe8.a) this.f3508w.e;
                    this.v = 1;
                    x4l.c cVar = ((fe8.i) aVar6).f134472g;
                    Object obj3 = Unit.f186387a;
                    Object objD = cVar.d(obj3, true, this);
                    if (objD == aVar5) {
                        obj3 = objD;
                    }
                    if (obj3 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    pfm.h hVarE = ((x) ((l93.f) this.f3508w.f)).E();
                    this.v = 1;
                    if (nim.a.a(hVarE, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    fe8.a aVar9 = (fe8.a) this.f3508w.e;
                    this.v = 1;
                    x4l.c cVar2 = ((fe8.i) aVar9).f134472g;
                    Object obj4 = Unit.f186387a;
                    Object objD2 = cVar2.d(obj4, false, this);
                    if (objD2 == aVar8) {
                        obj4 = objD2;
                    }
                    if (obj4 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    fe8.a aVar11 = (fe8.a) this.f3508w.e;
                    this.v = 1;
                    x4l.c cVar3 = ((fe8.i) aVar11).i;
                    Object obj5 = Unit.f186387a;
                    Object objD3 = cVar3.d(obj5, true, this);
                    if (objD3 == aVar10) {
                        obj5 = objD3;
                    }
                    if (obj5 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
