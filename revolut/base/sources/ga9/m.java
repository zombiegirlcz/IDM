package ga9;

import dp4.z0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142093w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.onboarding.impl.onboarding.v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142093w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f142093w, continuation, 0);
            case 1:
                return new m(this.f142093w, continuation, 1);
            case 2:
                return new m(this.f142093w, continuation, 2);
            case 3:
                return new m(this.f142093w, continuation, 3);
            case 4:
                return new m(this.f142093w, continuation, 4);
            case 5:
                return new m(this.f142093w, continuation, 5);
            case 6:
                return new m(this.f142093w, continuation, 6);
            default:
                return new m(this.f142093w, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.onboarding.impl.onboarding.v vVar = this.f142093w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    l lVar = new l(vVar, null);
                    this.v = 1;
                    if (vVar.p2(this, lVar) == aVar) {
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
                    s sVar = new s(vVar, continuation, 0);
                    this.v = 1;
                    if (vVar.p2(this, sVar) == aVar2) {
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
                    o oVar = new o(vVar, continuation, i2);
                    this.v = 1;
                    if (vVar.p2(this, oVar) == aVar3) {
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
                try {
                    if (i21 == 0) {
                        yhm.o.b(obj2);
                        pfm.t tVarA = jte.c.a(vVar.F, null, 3);
                        this.v = 1;
                        if (nim.a.a(tVarA, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i21 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    Unit unit = Unit.f186387a;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                try {
                    if (i22 == 0) {
                        yhm.o.b(obj2);
                        efm.b bVarI = ((cpj.b) vVar.G).i();
                        this.v = 1;
                        if (nim.a.a(bVarI, this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i22 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    Unit unit2 = Unit.f186387a;
                    break;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e5, h0Var2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                try {
                    if (i32 == 0) {
                        yhm.o.b(obj2);
                        fn2.c cVar = vVar.H;
                        this.v = 1;
                        if (cVar.l(true, this) == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i32 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    Unit unit3 = Unit.f186387a;
                    break;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Exception e22) {
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e22, h0Var3);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    z0 z0Var = new z0(vVar, continuation, 17);
                    this.v = 1;
                    if (vVar.V2(z0Var, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    twj.f fVar = (twj.f) vVar.A.f138685a;
                    fVar.getClass();
                    pfm.h hVar = new pfm.h(new oma.r(fVar, 28), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    pfm.r rVarG0 = te0.w.g0(hVar);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i43 != 1) {
                        if (i43 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(vVar, null, this, 3) == aVar8) {
                    return aVar8;
                }
                return Unit.f186387a;
        }
    }
}
