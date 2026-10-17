package l25;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f191632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f191633x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(u uVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f191632w = uVar;
        this.f191633x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f191632w, this.f191633x, continuation, 0);
            case 1:
                return new h(this.f191632w, this.f191633x, continuation, 1);
            default:
                return new h(this.f191632w, this.f191633x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f191633x;
        u uVar = this.f191632w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g gVar = new g(uVar, str, null);
                this.v = 1;
                Object objY2 = uVar.Y2(this, gVar);
                return objY2 == aVar ? aVar : objY2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarF = uVar.f191656x.f(false);
                    t tVar = t.f;
                    ufm.i iVar = new ufm.i(d0VarF, new o0(1), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    this.v = 1;
                    obj2 = nim.a.b(iVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                wi0.b bVar = (wi0.b) obj2;
                f15.a aVar3 = uVar.f191650p;
                ux4.i iVar2 = ux4.m.Companion;
                Intrinsics.h(bVar);
                ux4.l lVarA1 = aVar3.a1(bVar);
                iVar2.getClass();
                aVar3.O(ux4.i.a(str, lVarA1));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    xl4.a aVar5 = new xl4.a(str);
                    this.v = 1;
                    if (uVar.C2(aVar5, this) == aVar4) {
                        return aVar4;
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
