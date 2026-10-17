package n8i;

import aw0.f4;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import q6i.r;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyTopupScreen f213428w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(MoveMoneyTopupScreen moveMoneyTopupScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213428w = moveMoneyTopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f213428w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f213428w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f213428w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            case 3:
                h hVar4 = new h(this.f213428w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
            default:
                h hVar5 = new h(this.f213428w, continuation, 4);
                hVar5.v = obj2;
                return hVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((q6i.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x5i.a aVar = 0;
        MoveMoneyTopupScreen moveMoneyTopupScreen = this.f213428w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarD = moveMoneyTopupScreen.d();
                Intrinsics.h(id10);
                com.revolut.feature_move_money.impl.topup.a aVar3 = (com.revolut.feature_move_money.impl.topup.a) uVarD;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                k kVar = (k) ((q) ((j2) aVar3.M.f22677a).getValue()).f213461a.getContent();
                if (kVar != null) {
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    aVar = kVar.f213439a.f260363b;
                }
                if (aVar == 0) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ((g6i.c) aVar3.f97424w).b3(id10, aVar);
                return Unit.f186387a;
            case 1:
                Object event = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.topup.a aVar5 = (com.revolut.feature_move_money.impl.topup.a) moveMoneyTopupScreen.d();
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                boolean z = event instanceof koi.j;
                koi.j jVar = z ? (koi.j) event : null;
                if (jVar != null) {
                    jVar.getF52781a();
                }
                qv0.p pVar = event instanceof qv0.p ? (qv0.p) event : null;
                Object f52202l = pVar != null ? pVar.getF() : null;
                koi.j jVar2 = z ? (koi.j) event : null;
                if (Intrinsics.f(jVar2 != null ? jVar2.getF52781a() : null, "ERROR_STATE_ID")) {
                    aVar5.N2();
                } else {
                    aVar5.H.d3(f52202l, event, new v9(1, aVar5, com.revolut.feature_move_money.impl.topup.a.class, "applyPatch", "applyPatch(Lcom/revolut/feature_move_money/impl/topup/MoveMoneyTopupScreenContract$TopupModelExtension$PatchModel;)V", 0, 21));
                }
                return Unit.f186387a;
            case 2:
                q6i.r reason = (q6i.r) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.topup.a aVar7 = (com.revolut.feature_move_money.impl.topup.a) moveMoneyTopupScreen.d();
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (Intrinsics.f(reason, r.a.f242633a)) {
                    aVar7.l2(new c1(aVar7, aVar, 1), new yi5.b(26));
                } else if (Intrinsics.f(reason, r.b.f242634a)) {
                    aVar7.l2(new c1(aVar7, aVar, 2), new yi5.b(26));
                } else {
                    if (!(reason instanceof q6i.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((g6i.c) aVar7.f97424w).Z2(((q6i.q) reason).f242632a);
                }
                return Unit.f186387a;
            case 3:
                f4 data = (f4) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarD2 = moveMoneyTopupScreen.d();
                Intrinsics.h(data);
                com.revolut.feature_move_money.impl.topup.a aVar9 = (com.revolut.feature_move_money.impl.topup.a) uVarD2;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                aVar9.G.b(new f4("CENTER_AMOUNT_TOPUP_ID", data.f10304b));
                return Unit.f186387a;
            default:
                ty0.a data2 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarD3 = moveMoneyTopupScreen.d();
                Intrinsics.h(data2);
                com.revolut.feature_move_money.impl.topup.a aVar11 = (com.revolut.feature_move_money.impl.topup.a) uVarD3;
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                ((g6i.i) aVar11.f97425x).d3(data2);
                return Unit.f186387a;
        }
    }
}
