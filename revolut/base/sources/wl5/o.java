package wl5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.y;
import xvh.a;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f298423w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298423w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f298423w, continuation, 0);
            case 1:
                return new o(this.f298423w, continuation, 1);
            case 2:
                return new o(this.f298423w, continuation, 2);
            default:
                return new o(this.f298423w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                s sVar = this.f298423w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    sl5.f fVar = sVar.f298429q;
                    this.v = 1;
                    ufm.i iVar = new ufm.i(new ufm.i(((b6d.r) fVar.f264150b).g(a.b.f309269a), new sl3.r(new sl5.a(new sl3.i(8), 0), 14), 1), new sl3.r(new sl5.a(fVar, 1), 15), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                    Object objB = nim.a.b(iVar, this);
                    if (objB != obj3) {
                        objB = Unit.f186387a;
                    }
                    if (objB != obj3) {
                        objB = Unit.f186387a;
                    }
                    if (objB == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                xl5.b bVar = sVar.f298432t;
                y model = bVar.f306938c;
                if (model != null) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    bVar.f306937b = xl5.a.SHOWN;
                    bVar.f306938c = model;
                    j60.a aVar = bVar.f306936a;
                    if (aVar.j()) {
                        aVar.A(model);
                    } else {
                        aVar.x(model);
                    }
                }
                sVar.n2(new o(sVar, null, 3), new whi.b(6));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    yl5.a aVar3 = yl5.a.REMOVE;
                    s sVar2 = this.f298423w;
                    l lVar = new l(sVar2, null, 1);
                    this.v = 1;
                    if (s.A2(sVar2, aVar3, lVar, this) == aVar2) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    yl5.a aVar5 = yl5.a.UPDATE;
                    s sVar3 = this.f298423w;
                    q qVar = new q(sVar3, null, 0);
                    this.v = 1;
                    if (s.A2(sVar3, aVar5, qVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    yl5.a aVar7 = yl5.a.CREATE;
                    s sVar4 = this.f298423w;
                    q qVar2 = new q(sVar4, null, 1);
                    this.v = 1;
                    if (s.A2(sVar4, aVar7, qVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
