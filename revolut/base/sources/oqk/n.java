package oqk;

import aqd.n1;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f227970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f227971c;

    public /* synthetic */ n(s sVar, g0 g0Var) {
        this.f227969a = 2;
        this.f227971c = sVar;
        this.f227970b = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarC;
        efm.r rVarB;
        switch (this.f227969a) {
            case 0:
                this.f227970b.f227945n.d(this.f227971c, (t) obj2);
                return Unit.f186387a;
            case 1:
                this.f227970b.f227945n.d(this.f227971c, (t) obj2);
                return Unit.f186387a;
            case 2:
                Boolean loaded = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(loaded, "loaded");
                s sVar = this.f227971c;
                nie.c cVar = sVar.f227987h;
                Continuation continuation = null;
                ProductId f89727a = cVar != null ? cVar.getF89727a() : null;
                int i = f89727a == null ? -1 : u.f227991a[f89727a.ordinal()];
                g0 g0Var = this.f227970b;
                int i2 = 2;
                if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                    rVarC = ((jqk.g) g0Var.f227937a).c(sVar.f227984b, cVar, sVar.f);
                } else {
                    rVarC = efm.r.just(zhm.f0.f322471a);
                    Intrinsics.checkNotNullExpressionValue(rVarC, "just(...)");
                }
                ks0.n nVar = g0Var.k;
                UnifiedTransactionsFilter filter = sVar.f227983a;
                boolean z = sVar.i;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter("", "searchQuery");
                Flow flowA = ((jkg.d) nVar.f189085b).a(new go.g(new jkg.b(new jkg.f(filter, 6, "")), 2));
                if (z) {
                    flowA = new vkm.y(flowA, new m84.c(i2, 28, continuation));
                }
                efm.r rVarG = m70.a.g(rd0.e.c(flowA, kotlin.coroutines.g.f186406a), null, new oq3.e(5), 1);
                AccountId accountId = sVar.e;
                nhf.a aVar = g0Var.f227942j;
                if (Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
                    rVarB = ((njf.j) aVar).f();
                } else {
                    if (!(accountId instanceof AccountId.Joint)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVarB = ((njf.j) aVar).b(accountId);
                }
                efm.r map = te0.w.l(rVarG, rVarB).map(new oq3.f(22, new n(g0Var, sVar, 3))).map(new oq3.f(23, new c(sVar, g0Var)));
                Intrinsics.h(map);
                return te0.w.l(rVarC, map).map(new oq3.f(9, new n1(16, loaded))).doOnNext(new oq3.f(10, new n(g0Var, sVar, 0)));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                k71.q qVar = (k71.q) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    wh whVarA = this.f227970b.f227944m.a((UnifiedTransaction) it8.next(), this.f227971c.f227983a, qVar, new whf.l(new thf.k(1016, true, false, false, false, false)));
                    if (whVarA != null) {
                        arrayList.add(whVarA);
                    }
                }
                return arrayList;
        }
    }

    public /* synthetic */ n(g0 g0Var, s sVar, int i) {
        this.f227969a = i;
        this.f227970b = g0Var;
        this.f227971c = sVar;
    }
}
