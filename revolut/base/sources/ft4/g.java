package ft4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.feature.credit.card.impl.ui.instalment.transactions.InstalmentTransactionsScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InstalmentTransactionsScreen f137904w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(InstalmentTransactionsScreen instalmentTransactionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f137904w = instalmentTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f137904w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f137904w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f137904w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        aii.r nVar;
        int i = this.u;
        InstalmentTransactionsScreen instalmentTransactionsScreen = this.f137904w;
        switch (i) {
            case 0:
                ai aiVar = (ai) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarD = instalmentTransactionsScreen.d();
                String tabId = aiVar.f53687a;
                i0 i0Var = (i0) qVarD;
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                if (!Intrinsics.f(tabId, "id_instalment_tab_credit")) {
                    if (Intrinsics.f(tabId, "id_instalment_tab_debit")) {
                        hVar = h.DEBIT;
                    }
                    return Unit.f186387a;
                }
                hVar = h.CREDIT;
                i0Var.H2(i0Var.v, new fs2.k(hVar, 5));
                return Unit.f186387a;
            case 1:
                Object obj3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarD2 = instalmentTransactionsScreen.d();
                yx4.a aVar3 = yx4.b.Companion;
                Intrinsics.h(obj3);
                aVar3.getClass();
                yx4.b item = yx4.a.a(obj3);
                i0 i0Var2 = (i0) qVarD2;
                i0Var2.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                String str = item.f317544a;
                if (Intrinsics.f(str, "id_instalment_transactions_action_button")) {
                    Set set = i0Var2.I2().f137909c;
                    ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
                    Iterator it8 = set.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((a3) it8.next()).f272581b);
                    }
                    Set setI1 = zhm.d0.i1(arrayList);
                    int i2 = b0.f137896a[((m) ((j2) i0Var2.v.f22677a).getValue()).f137921b.ordinal()];
                    if (i2 == 1) {
                        nVar = new n(setI1);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar = new o(setI1);
                    }
                    i0Var2.C2(nVar);
                } else if (Intrinsics.f(str, "ERROR_STATE_ID")) {
                    i0Var2.n2(new fo1.b0(i0Var2, null, 5), new whi.b(6));
                } else {
                    Object obj4 = item.f317546c;
                    if (obj4 instanceof SelectableDelegate.Model) {
                        koi.j jVar = ((SelectableDelegate.Model) obj4).f53305b;
                        RowDelegate.Model model = jVar instanceof RowDelegate.Model ? (RowDelegate.Model) jVar : null;
                        Object obj5 = model != null ? model.u : null;
                        a3 a3Var = obj5 instanceof a3 ? (a3) obj5 : null;
                        if (a3Var != null) {
                            i0Var2.n2(new fjd.g0(i0Var2, a3Var, null, 16), new whi.b(6));
                        }
                    }
                }
                return Unit.f186387a;
            default:
                String query = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarD3 = instalmentTransactionsScreen.d();
                Intrinsics.h(query);
                i0 i0Var3 = (i0) qVarD3;
                i0Var3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                j2 j2Var = i0Var3.u;
                j2Var.getClass();
                j2Var.g(null, query);
                return Unit.f186387a;
        }
    }
}
