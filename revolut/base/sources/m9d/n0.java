package m9d;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g1 f203728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f203729x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(g1 g1Var, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f203728w = g1Var;
        this.f203729x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n0(this.f203728w, this.f203729x, continuation, 0);
            case 1:
                return new n0(this.f203728w, this.f203729x, continuation, 1);
            case 2:
                return new n0(this.f203728w, this.f203729x, continuation, 2);
            case 3:
                return new n0(this.f203728w, this.f203729x, continuation, 3);
            default:
                return new n0(this.f203728w, this.f203729x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n0) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    md0.e eVar = (md0.e) this.f203728w.f203701s;
                    eVar.getClass();
                    String id10 = this.f203729x;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    gd0.f fVar = eVar.f204465a;
                    kd0.a domain = eVar.f204466b;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(domain, "domain");
                    pfm.r rVarG0 = te0.w.g0(fVar.f143027a.closeIncidentsItem(id10, domain.a()));
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(domain, "domain");
                    efm.d0 d0VarFirstOrError = m70.a.g(fVar.d.f(domain, false), null, null, 3).firstOrError();
                    g9j.v vVar = new g9j.v(new g31.e(id10, fVar, domain), 12);
                    d0VarFirstOrError.getClass();
                    pfm.a aVar2 = new pfm.a(d0VarFirstOrError, vVar, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                    pfm.a aVarE = rVarG0.e(aVar2);
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = this.f203728w.f203704x;
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f203729x, null, bool, this, 2);
                return objX1 == aVar3 ? aVar3 : objX1;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                g1 g1Var = this.f203728w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    lde.j jVar = g1Var.F;
                    this.v = 1;
                    obj2 = jVar.a(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aii.u uVar = (aii.u) obj2;
                if (uVar != null && (nVarC1 = g1Var.C1(uVar)) != null) {
                    return nVarC1;
                }
                g1Var.A2(this.f203729x);
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                g1 g1Var2 = this.f203728w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    lde.j jVar2 = g1Var2.F;
                    this.v = 1;
                    obj2 = jVar2.b(this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aii.u uVar2 = (aii.u) obj2;
                if (uVar2 != null && (nVarC12 = g1Var2.C1(uVar2)) != null) {
                    return nVarC12;
                }
                g1Var2.A2(this.f203729x);
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarC = ((md0.e) this.f203728w.f203701s).c(this.f203729x);
                    this.v = 1;
                    if (nim.a.a(aVarC, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
