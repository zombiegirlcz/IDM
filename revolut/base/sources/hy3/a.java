package hy3;

import al4.p;
import al4.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import y45.n;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f156718w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j jVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f156718w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f156718w, continuation, 0);
            case 1:
                return new a(this.f156718w, continuation, 1);
            case 2:
                return new a(this.f156718w, continuation, 2);
            case 3:
                return new a(this.f156718w, continuation, 3);
            case 4:
                return new a(this.f156718w, continuation, 4);
            case 5:
                return new a(this.f156718w, continuation, 5);
            default:
                return new a(this.f156718w, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a) create(continuation)).invokeSuspend(Unit.f186387a);
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
                j jVar = this.f156718w;
                p pVar = jVar.f156731a;
                this.v = 1;
                Object objB = j.b(jVar, pVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar2 = this.f156718w;
                u uVar = jVar2.f156732b;
                this.v = 1;
                Object objB2 = j.b(jVar2, uVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
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
                j jVar3 = this.f156718w;
                y45.h hVar = jVar3.f156733c;
                this.v = 1;
                Object objB3 = j.b(jVar3, hVar, this);
                return objB3 == aVar3 ? aVar3 : objB3;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar4 = this.f156718w;
                ti9.h hVar2 = jVar4.d;
                this.v = 1;
                Object objC = j.c(jVar4, hVar2, this);
                return objC == aVar4 ? aVar4 : objC;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar5 = this.f156718w;
                o95.g gVar = jVar5.e;
                this.v = 1;
                Object objC2 = j.c(jVar5, gVar, this);
                return objC2 == aVar5 ? aVar5 : objC2;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar6 = this.f156718w;
                n nVar = jVar6.f;
                this.v = 1;
                Object objC3 = j.c(jVar6, nVar, this);
                return objC3 == aVar6 ? aVar6 : objC3;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar7 = this.f156718w;
                y45.o oVar = jVar7.f156734g;
                this.v = 1;
                Object objC4 = j.c(jVar7, oVar, this);
                return objC4 == aVar7 ? aVar7 : objC4;
        }
    }
}
