package q8d;

import aii.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f243060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f243061x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(p pVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f243060w = pVar;
        this.f243061x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f243060w, this.f243061x, continuation, 0);
            case 1:
                return new l(this.f243060w, this.f243061x, continuation, 1);
            default:
                return new l(this.f243060w, this.f243061x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.n nVarC1;
        aii.n nVarC12;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    x xVar = this.f243060w.f243067q;
                    this.v = 1;
                    if (gc0.c.m(xVar, this.f243061x, "QuickHelpSeeAllScreenModel", this) == aVar) {
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
                p pVar = this.f243060w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    lde.j jVar = pVar.f243068r;
                    this.v = 1;
                    obj2 = jVar.a(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                u uVar = (u) obj2;
                if (uVar != null && (nVarC1 = pVar.C1(uVar)) != null) {
                    return nVarC1;
                }
                pVar.y2(this.f243061x);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                p pVar2 = this.f243060w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    lde.j jVar2 = pVar2.f243068r;
                    this.v = 1;
                    obj2 = jVar2.b(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                u uVar2 = (u) obj2;
                if (uVar2 != null && (nVarC12 = pVar2.C1(uVar2)) != null) {
                    return nVarC12;
                }
                pVar2.y2(this.f243061x);
                return Unit.f186387a;
        }
    }
}
