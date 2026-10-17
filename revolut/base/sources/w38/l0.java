package w38;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nce.a;
import v38.c;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f294189w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(q0 q0Var, ProductAccountId productAccountId, Continuation continuation) {
        super(2, continuation);
        this.v = q0Var;
        this.f294189w = productAccountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l0 l0Var = new l0(this.v, this.f294189w, continuation);
        l0Var.u = obj2;
        return l0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l0) create((v38.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.d0 iVar;
        r38.b bVar = this.v.e;
        v38.c cVar = (v38.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!(cVar instanceof v38.a)) {
            if ((cVar instanceof v38.b) || (cVar instanceof v38.d) || (cVar instanceof c.a)) {
                return new go.g(new Data(null, null, false, 7, null), 2);
            }
            throw new NoWhenBranchMatchedException();
        }
        n38.a aVar2 = ((v38.a) cVar).f285854a;
        AccountId.Joint accountId = l38.a.c(aVar2);
        r38.l lVar = (r38.l) bVar;
        lVar.getClass();
        ProductAccountId productAccountId = this.f294189w;
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.r rVarG = lVar.g(zhm.y0.b(productAccountId), accountId);
        AccountId.Joint accountId2 = l38.a.c(aVar2);
        r38.l lVar2 = (r38.l) bVar;
        lVar2.getClass();
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        String str = productAccountId.f89729a;
        u38.m.Companion.getClass();
        if (Intrinsics.f(str, u38.m.e)) {
            iVar = efm.d0.m(a.C1197a.f214179a);
            Intrinsics.checkNotNullExpressionValue(iVar, "just(...)");
        } else {
            efm.d0 d0VarZ = lVar2.f251216b.z(accountId2, productAccountId.f89729a);
            r25.c cVar2 = new r25.c(18, new r38.d(lVar2, 0));
            d0VarZ.getClass();
            iVar = new ufm.i(d0VarZ, cVar2, 1);
        }
        efm.r rVarX = iVar.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r map = te0.w.l(rVarG, rVarX).map(new vz4.c(new hsd.d(aVar2), 23));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}
