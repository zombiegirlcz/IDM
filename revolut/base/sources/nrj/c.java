package nrj;

import abf.n;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.edit_cycle.AnalyticsEditCycleScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AnalyticsEditCycleScreen f218653w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AnalyticsEditCycleScreen analyticsEditCycleScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f218653w = analyticsEditCycleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f218653w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f218653w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f218653w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        uzi.c cVar;
        int i = this.u;
        int i2 = 1;
        AnalyticsEditCycleScreen analyticsEditCycleScreen = this.f218653w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarH3 = analyticsEditCycleScreen.T2();
                Intrinsics.h(menuItemId);
                hVarH3.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (Intrinsics.f(menuItemId, "RESET_CYCLE_MENU_ITEM_ID")) {
                    uzi.b.Companion.getClass();
                    hVarH3.v2(new e(new uzi.b(uzi.c.MONTHLY, 1)));
                }
                return Unit.f186387a;
            case 1:
                g6 g6Var = (g6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarH32 = analyticsEditCycleScreen.T2();
                String tabId = g6Var.f54199a;
                hVarH32.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                if (Intrinsics.f(tabId, "TAB_ID_MONTHLY")) {
                    cVar = uzi.c.MONTHLY;
                } else {
                    if (!Intrinsics.f(tabId, "TAB_ID_WEEKLY")) {
                        throw new IllegalStateException(j6.a.q("Unknown selected tabId: ", tabId));
                    }
                    cVar = uzi.c.WEEKLY;
                }
                hVarH32.x2(new nrd.g(cVar, i2));
                return Unit.f186387a;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                int iIntValue = ((Number) pair.f186386b).intValue();
                h hVarH33 = analyticsEditCycleScreen.T2();
                hVarH33.getClass();
                hVarH33.x2(new n(hVarH33, iIntValue, 21));
                return Unit.f186387a;
        }
    }
}
