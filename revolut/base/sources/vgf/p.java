package vgf;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import java.time.YearMonth;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransactionsScreen f289120w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(TransactionsScreen transactionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f289120w = transactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f289120w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f289120w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        int i2 = 4;
        YearMonth currentMonth = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.u) {
            case 0:
                com.revolut.core.ui_kit.delegates.t model = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarR2 = this.f289120w.R2();
                Intrinsics.h(model);
                com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) uVarR2;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                ActionWidgetDelegate.a aVar3 = model.f54721a;
                if (Intrinsics.f(aVar3, ActionWidgetDelegate.a.b.f51608a) || Intrinsics.f(aVar3, ActionWidgetDelegate.a.c.f51609a)) {
                    aVar2.n2(new i0(3, aVar2, objArr == true ? 1 : 0), new whi.b(6));
                } else if (Intrinsics.f(aVar3, ActionWidgetDelegate.a.C0395a.f51607a)) {
                    aVar2.n2(new i0(i2, aVar2, objArr2 == true ? 1 : 0), new whi.b(6));
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "TransactionsScreenModel", "Unexpected action widget action " + aVar3, null, null, 16);
                    Unit unit = Unit.f186387a;
                }
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t60.a aVar5 = (t60.a) pair.f186385a;
                t60.a currentVisibilityState = (t60.a) pair.f186386b;
                u uVarR22 = this.f289120w.R2();
                Intrinsics.h(currentVisibilityState);
                com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar6 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) uVarR22;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(currentVisibilityState, "currentVisibilityState");
                UnifiedTransaction unifiedTransaction = (UnifiedTransaction) zhm.d0.e0(currentVisibilityState.f268122c, ((k1) aVar6.f91939w).f289111a);
                if (unifiedTransaction != null) {
                    DateTime dateTime = new DateTime(unifiedTransaction.getF94576c());
                    currentMonth = YearMonth.of(dateTime.getYear(), dateTime.getMonthOfYear());
                }
                if (currentMonth != null) {
                    com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar7 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) aVar6.v;
                    aVar7.getClass();
                    Intrinsics.checkNotNullParameter(currentMonth, "currentMonth");
                    aVar7.H2(aVar7.u, new kp7.q(currentMonth, 4));
                }
                boolean z = false;
                Object[] objArr3 = aVar5 != null && currentVisibilityState.f268120a > aVar5.f268120a;
                if (aVar5 != null) {
                    z = currentVisibilityState.f268120a < aVar5.f268120a;
                }
                if (objArr3 == true) {
                    if (currentVisibilityState.e - currentVisibilityState.f268121b < 50) {
                        int i3 = currentVisibilityState.f268120a;
                        if (!((r) ((j2) aVar6.J.f22677a).getValue()).f289122a.getLoading()) {
                            aVar6.L.k(Integer.valueOf(i3));
                        }
                    }
                } else if (z && (i = currentVisibilityState.f268120a) < 50 && !((r) ((j2) aVar6.J.f22677a).getValue()).f289122a.getLoading()) {
                    aVar6.L.k(Integer.valueOf(i));
                }
                break;
        }
        return Unit.f186387a;
    }
}
