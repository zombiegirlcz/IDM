package b6i;

import aw0.f4;
import com.revolut.feature_move_money.impl.amount.MoveMoneyAmountScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q6i.r;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyAmountScreen f12834w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(MoveMoneyAmountScreen moveMoneyAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12834w = moveMoneyAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v0 v0Var = new v0(this.f12834w, continuation, 0);
                v0Var.v = obj2;
                return v0Var;
            case 1:
                v0 v0Var2 = new v0(this.f12834w, continuation, 1);
                v0Var2.v = obj2;
                return v0Var2;
            case 2:
                v0 v0Var3 = new v0(this.f12834w, continuation, 2);
                v0Var3.v = obj2;
                return v0Var3;
            case 3:
                v0 v0Var4 = new v0(this.f12834w, continuation, 3);
                v0Var4.v = obj2;
                return v0Var4;
            case 4:
                v0 v0Var5 = new v0(this.f12834w, continuation, 4);
                v0Var5.v = obj2;
                return v0Var5;
            default:
                v0 v0Var6 = new v0(this.f12834w, continuation, 5);
                v0Var6.v = obj2;
                return v0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v0) create((q6i.v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v0) create((q6i.v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v0) create((q6i.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((v0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((v0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v0) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MoveMoneyAmountScreen moveMoneyAmountScreen = this.f12834w;
        switch (i) {
            case 0:
                q6i.v vVar = (q6i.v) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD = moveMoneyAmountScreen.d();
                Intrinsics.h(vVar);
                ((com.revolut.feature_move_money.impl.amount.c) nVarD).U2(vVar, j.TOP);
                return Unit.f186387a;
            case 1:
                q6i.v vVar2 = (q6i.v) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD2 = moveMoneyAmountScreen.d();
                Intrinsics.h(vVar2);
                ((com.revolut.feature_move_money.impl.amount.c) nVarD2).U2(vVar2, j.BOTTOM);
                return Unit.f186387a;
            case 2:
                q6i.r reason = (q6i.r) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD3 = moveMoneyAmountScreen.d();
                Intrinsics.h(reason);
                com.revolut.feature_move_money.impl.amount.c cVar = (com.revolut.feature_move_money.impl.amount.c) nVarD3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (reason.equals(r.a.f242633a)) {
                    cVar.l2(new av7.l(cVar, new p(cVar, 0), null, 13), new yi5.b(26));
                } else if (reason.equals(r.b.f242634a)) {
                    cVar.l2(new av7.l(cVar, new p(cVar, 1), null, 13), new yi5.b(26));
                } else {
                    if (!(reason instanceof q6i.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((g6i.c) cVar.F).Z2(((q6i.q) reason).f242632a);
                }
                return Unit.f186387a;
            case 3:
                String id10 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD4 = moveMoneyAmountScreen.d();
                Intrinsics.h(id10);
                com.revolut.feature_move_money.impl.amount.c cVar2 = (com.revolut.feature_move_money.impl.amount.c) nVarD4;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                s6i.e eVar = cVar2.Q2().f12783a;
                if (eVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ((g6i.c) cVar2.F).b3(id10, (x5i.a) v13.d.n(cVar2.Q2().f12785c, eVar).f186386b);
                return Unit.f186387a;
            case 4:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD5 = moveMoneyAmountScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature_move_money.impl.amount.c cVar3 = (com.revolut.feature_move_money.impl.amount.c) nVarD5;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ((g6i.i) cVar3.G).d3(clickData);
                return Unit.f186387a;
            default:
                f4 focusData = (f4) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD6 = moveMoneyAmountScreen.d();
                Intrinsics.h(focusData);
                com.revolut.feature_move_money.impl.amount.c cVar4 = (com.revolut.feature_move_money.impl.amount.c) nVarD6;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                cVar4.f97293y.b(focusData);
                return Unit.f186387a;
        }
    }
}
