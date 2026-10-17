package wrd;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_historical_values.CustomAssetHistoricalValuesController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$Events;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomAssetHistoricalValuesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CustomAssetHistoricalValuesController customAssetHistoricalValuesController, Continuation continuation) {
        super(2, continuation);
        this.v = customAssetHistoricalValuesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d dVarE3 = this.v.R2();
        Object obj3 = model.u;
        g gVar = obj3 instanceof g ? (g) obj3 : null;
        s sVar = (s) dVarE3;
        y yVar = sVar.f299571q;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        if (!((a) j2Var.getValue()).f299551c && gVar != null) {
            if (gVar instanceof e) {
                dj0.d dVar = ((a) j2Var2.getValue()).f299549a.f99218c;
                if (dVar != null) {
                    sVar.l1().M0(new TotalWealthContract$Events.AdjustCurrentValue(dVar, ((a) j2Var2.getValue()).f299549a.f99216a, ((a) j2Var2.getValue()).f299549a.k));
                }
            } else {
                if (!(gVar instanceof f)) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar.l1().M0(new TotalWealthContract$Events.AdjustHistoricalValue(((a) j2Var2.getValue()).f299549a.f99216a, ((f) gVar).f299557a));
            }
        }
        return Unit.f186387a;
    }
}
