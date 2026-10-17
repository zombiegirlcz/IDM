package bs9;

import aqd.n1;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.chat.a f18089w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18089w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0(this.f18089w, continuation, 0);
            case 1:
                return new b0(this.f18089w, continuation, 1);
            case 2:
                return new b0(this.f18089w, continuation, 2);
            case 3:
                return new b0(this.f18089w, continuation, 3);
            case 4:
                return new b0(this.f18089w, continuation, 4);
            case 5:
                return new b0(this.f18089w, continuation, 5);
            default:
                return new b0(this.f18089w, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar2 = this.f18089w;
                    pfm.r rVarB = aVar2.A.b(aVar2.J2().f18116a.f79285a);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar) {
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
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar4 = this.f18089w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarP = aVar4.o.p();
                    this.v = 1;
                    obj2 = nim.a.b(d0VarP, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                pu9.b bVar = aVar4.f79352x;
                String str = ((do3.n) obj2).f116414l;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bVar.a(new dv9.k(str, aVar4.J2().f18116a.f79285a));
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar6 = this.f18089w;
                    pfm.r rVarB2 = aVar6.A.b(aVar6.J2().f18116a.f79285a);
                    this.v = 1;
                    if (nim.a.a(rVarB2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar8 = this.f18089w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarP2 = aVar8.o.p();
                    this.v = 1;
                    obj2 = nim.a.b(d0VarP2, this);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar8.H2(aVar8.W, new a2f.j((do3.n) obj2, 3));
                return Unit.f186387a;
            case 4:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar10 = this.f18089w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    b9k.f fVar = aVar10.o;
                    PaymentGroup group = aVar10.J2().f18116a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(group, "group");
                    pfm.a aVarK = ((pv9.d) ((cv9.a) fVar.e)).k();
                    pv9.i iVar = (pv9.i) fVar.d;
                    String groupId = group.f79285a;
                    Intrinsics.checkNotNullParameter(groupId, "groupId");
                    efm.d0<kv9.f> groupKeys = iVar.f240028a.getGroupKeys(groupId);
                    prl.n nVar = new prl.n(23, new pui.a(12));
                    groupKeys.getClass();
                    ufm.i iVar2 = new ufm.i(groupKeys, nVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    efm.d0 d0VarF = iVar.f240030c.f(false);
                    pv9.d dVar = (pv9.d) iVar.d;
                    ufm.c cVarJ = dVar.j();
                    ufm.c cVar = new ufm.c(new nc0.a(dVar, 13), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                    pfm.a aVar11 = new pfm.a(te0.w.J0(iVar2, d0VarF, cVarJ, cVar), new prl.n(24, new pv9.g(iVar, groupId, 1)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar11, "flatMapCompletable(...)");
                    pfm.a aVarE = aVarK.e(te0.w.g0(aVar11));
                    ufm.b bVarM = efm.d0.m(Boolean.TRUE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    rfm.f0 f0VarF = aVarE.f(bVarM);
                    Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                    pfm.z zVarF = ue0.e.F(f0VarF, Boolean.FALSE);
                    this.v = 1;
                    obj2 = nim.a.b(zVarF, this);
                    if (obj2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar10.H2(aVar10.W, new n1(2, (Boolean) obj2));
                return Unit.f186387a;
            case 5:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar13 = this.f18089w;
                    a41.s sVar = new a41.s(aVar13, (Continuation) null, 20);
                    this.v = 1;
                    if (u0.b0(aVar13.X(), "SETTLE_UP_CTA_BUTTON_TAG", sVar, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar15 = this.f18089w;
                    a3i.q qVar = new a3i.q(aVar15, null, 19);
                    this.v = 1;
                    if (aVar15.p2(this, qVar) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
