package hea;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a f151677w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f151677w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(0, this.f151677w, continuation);
            case 1:
                return new y(1, this.f151677w, continuation);
            case 2:
                return new y(2, this.f151677w, continuation);
            case 3:
                return new y(3, this.f151677w, continuation);
            case 4:
                return new y(4, this.f151677w, continuation);
            case 5:
                return new y(5, this.f151677w, continuation);
            default:
                return new y(6, this.f151677w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar2 = this.f151677w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.z zVarF = ue0.e.F(aVar2.Q.a(), new kn2.a(0));
                    this.v = 1;
                    obj2 = nim.a.b(zVarF, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.H2(aVar2.U, new h56.a((kn2.a) obj2, 25));
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar4 = this.f151677w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarA = ((ang.b) aVar4.E).a();
                    this.v = 1;
                    obj2 = nim.a.b(d0VarA, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                if (l71.f.i((l71.d) obj2)) {
                    yji.l.a1(aVar4, vkm.q.q(aVar4.U.B(new he4.r(6))), null, null, new z(0, aVar4, null), 3);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar6 = this.f151677w;
                g0 g0Var = new g0(aVar6, null);
                this.v = 1;
                Object objP2 = aVar6.p2(this, g0Var);
                return objP2 == aVar5 ? aVar5 : objP2;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    uea.f fVar = this.f151677w.f80860r;
                    this.v = 1;
                    x4l.c cVar = fVar.f279329h;
                    Object obj3 = Unit.f186387a;
                    Object objF = cVar.f(obj3, Boolean.FALSE, this);
                    if (objF == aVar7) {
                        obj3 = objF;
                    }
                    if (obj3 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    kda.b bVar = this.f151677w.G;
                    this.v = 1;
                    if (bVar.C0("LIST_ID_CLOSE_ACCOUNT_BTN", this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    kda.b bVar2 = this.f151677w.G;
                    this.v = 1;
                    if (bVar2.closeAccount(this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar11 = this.f151677w;
                gca.l lVar = new gca.l(aVar11, null, 12);
                this.v = 1;
                Object objB = pu7.a.B(aVar11.k, "TOGGLE_HIDE_ACCOUNT_DETAILS", lVar, this);
                return objB == aVar10 ? aVar10 : objB;
        }
    }
}
