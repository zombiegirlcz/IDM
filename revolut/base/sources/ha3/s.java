package ha3;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import v6l.a0;
import v6l.b0;
import v6l.b1;
import v6l.e0;
import v6l.i0;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f150424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f150425x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(x xVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f150424w = xVar;
        this.f150425x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f150424w, this.f150425x, continuation, 0);
            case 1:
                return new s(this.f150424w, this.f150425x, continuation, 1);
            case 2:
                return new s(this.f150424w, this.f150425x, continuation, 2);
            case 3:
                return new s(this.f150424w, this.f150425x, continuation, 3);
            case 4:
                return new s(this.f150424w, this.f150425x, continuation, 4);
            case 5:
                return new s(this.f150424w, this.f150425x, continuation, 5);
            case 6:
                return new s(this.f150424w, this.f150425x, continuation, 6);
            case 7:
                return new s(this.f150424w, this.f150425x, continuation, 7);
            case 8:
                return new s(this.f150424w, this.f150425x, continuation, 8);
            case 9:
                return new s(this.f150424w, this.f150425x, continuation, 9);
            case 10:
                return new s(this.f150424w, this.f150425x, continuation, 10);
            case 11:
                return new s(this.f150424w, this.f150425x, continuation, 11);
            case 12:
                return new s(this.f150424w, this.f150425x, continuation, 12);
            case 13:
                return new s(this.f150424w, this.f150425x, continuation, 13);
            case 14:
                return new s(this.f150424w, this.f150425x, continuation, 14);
            case 15:
                return new s(this.f150424w, this.f150425x, continuation, 15);
            default:
                return new s(this.f150424w, this.f150425x, continuation, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar = this.f150424w.f;
                    this.v = 1;
                    b1 b1Var = (b1) sVar.f319829a;
                    b1Var.getClass();
                    String id10 = this.f150425x;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    d0<p6l.q> d0VarConfirmCardDelivered = b1Var.f286424a.confirmCardDelivered(id10);
                    v6l.k kVar = new v6l.k(15, new v6e.d(17));
                    d0VarConfirmCardDelivered.getClass();
                    ufm.i iVar = new ufm.i(new ufm.i(d0VarConfirmCardDelivered, kVar, 1), new v6l.k(16, new v6l.v(b1Var, 2)), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                    Object objB = nim.a.b(te0.w.i0(iVar), this);
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
                return Unit.f186387a;
            case 1:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar2 = this.f150424w.f;
                    this.v = 1;
                    b1 b1Var2 = (b1) sVar2.f319829a;
                    b1Var2.getClass();
                    String id11 = this.f150425x;
                    Intrinsics.checkNotNullParameter(id11, "id");
                    d0<p6l.q> d0VarBlock = b1Var2.f286424a.block(id11);
                    e0 e0Var = new e0(2, new b0(12));
                    d0VarBlock.getClass();
                    pfm.a aVar = new pfm.a(new ufm.i(d0VarBlock, e0Var, 1), new e0(3, new v6l.d0(b1Var2, 9)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                    Object objA = nim.a.a(te0.w.g0(aVar), this);
                    if (objA != obj4) {
                        objA = Unit.f186387a;
                    }
                    if (objA == obj4) {
                        return obj4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar3 = this.f150424w.f;
                    this.v = 1;
                    if (sVar3.c(this.f150425x, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar4 = this.f150424w.f;
                    this.v = 1;
                    b1 b1Var3 = (b1) sVar4.f319829a;
                    b1Var3.getClass();
                    String id12 = this.f150425x;
                    Intrinsics.checkNotNullParameter(id12, "id");
                    pfm.t tVarL = b1Var3.n(id12).l(new z6l.a(sVar4, 0));
                    Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                    Object objA2 = nim.a.a(tVarL, this);
                    if (objA2 != obj5) {
                        objA2 = Unit.f186387a;
                    }
                    if (objA2 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                Object obj6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar5 = this.f150424w.f;
                    this.v = 1;
                    b1 b1Var4 = (b1) sVar5.f319829a;
                    b1Var4.getClass();
                    String cardId = this.f150425x;
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    pfm.a aVarE = te0.w.g0(b1Var4.f286424a.deleteLimit(cardId)).e(new pfm.h(new v6l.x(b1Var4, 2), 2));
                    efm.b bVarIgnoreElements = mo3.a.n(b1Var4.f286432n.f(new i0(cardId), true)).ignoreElements();
                    Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                    pfm.a aVarE2 = aVarE.e(ue0.e.v(bVarIgnoreElements));
                    Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                    Object objA3 = nim.a.a(aVarE2, this);
                    if (objA3 != obj6) {
                        objA3 = Unit.f186387a;
                    }
                    if (objA3 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar6 = this.f150424w.f;
                    this.v = 1;
                    if (sVar6.f(this.f150425x, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z6l.s sVar7 = this.f150424w.f;
                this.v = 1;
                Object objH = sVar7.h(this.f150425x, this);
                return objH == aVar4 ? aVar4 : objH;
            case 7:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z6l.s sVar8 = this.f150424w.f;
                this.v = 1;
                Object objJ = sVar8.j(this.f150425x, this);
                return objJ == aVar5 ? aVar5 : objJ;
            case 8:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z6l.s sVar9 = this.f150424w.f;
                this.v = 1;
                Object objK = sVar9.k(this.f150425x, this);
                return objK == aVar6 ? aVar6 : objK;
            case 9:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z6l.s sVar10 = this.f150424w.f;
                this.v = 1;
                Object objZ = sVar10.z(this.f150425x, this);
                return objZ == aVar7 ? aVar7 : objZ;
            case 10:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar11 = this.f150424w.f;
                    this.v = 1;
                    if (sVar11.A(this.f150425x, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z6l.s sVar12 = this.f150424w.f;
                this.v = 1;
                Object objB2 = sVar12.B(this.f150425x, this);
                return objB2 == aVar9 ? aVar9 : objB2;
            case 12:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar13 = this.f150424w.f;
                    this.v = 1;
                    if (sVar13.D(this.f150425x, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar14 = this.f150424w.f;
                    this.v = 1;
                    if (sVar14.E(this.f150425x, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z6l.s sVar15 = this.f150424w.f;
                this.v = 1;
                Object objF = sVar15.F(this.f150425x, this);
                return objF == aVar12 ? aVar12 : objF;
            case 15:
                Object obj7 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar16 = this.f150424w.f;
                    this.v = 1;
                    b1 b1Var5 = (b1) sVar16.f319829a;
                    b1Var5.getClass();
                    String id13 = this.f150425x;
                    Intrinsics.checkNotNullParameter(id13, "id");
                    pfm.r rVarG0 = te0.w.g0(b1Var5.f286424a.resetPinTries(id13));
                    pfm.n nVar = new pfm.n(new to7.f(b1Var5, id13, 9), 1);
                    Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                    pfm.a aVarE3 = rVarG0.e(nVar).e(new pfm.h(new v6l.x(b1Var5, 1), 2));
                    Intrinsics.checkNotNullExpressionValue(aVarE3, "andThen(...)");
                    Object objA4 = nim.a.a(aVarE3, this);
                    if (objA4 != obj7) {
                        objA4 = Unit.f186387a;
                    }
                    if (objA4 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj8 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar17 = this.f150424w.f;
                    this.v = 1;
                    b1 b1Var6 = (b1) sVar17.f319829a;
                    b1Var6.getClass();
                    String id14 = this.f150425x;
                    Intrinsics.checkNotNullParameter(id14, "id");
                    d0<p6l.q> d0VarUnblock = b1Var6.f286424a.unblock(id14);
                    a0 a0Var = new a0(29, new b0(10));
                    d0VarUnblock.getClass();
                    pfm.a aVar13 = new pfm.a(new ufm.i(d0VarUnblock, a0Var, 1), new e0(0, new v6l.d0(b1Var6, 7)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar13, "flatMapCompletable(...)");
                    Object objA5 = nim.a.a(te0.w.g0(aVar13), this);
                    if (objA5 != obj8) {
                        objA5 = Unit.f186387a;
                    }
                    if (objA5 == obj8) {
                        return obj8;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
