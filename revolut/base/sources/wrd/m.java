package wrd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_historical_values.CustomAssetHistoricalValuesController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomAssetHistoricalValuesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CustomAssetHistoricalValuesController customAssetHistoricalValuesController, Continuation continuation) {
        super(2, continuation);
        this.v = customAssetHistoricalValuesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        if (((a) ((j2) sVar.f299571q.f22677a).getValue()).f299551c && gVar != null) {
            if (gVar instanceof e) {
                sVar.n2(new p(sVar, null), new whi.b(6));
            } else {
                if (!(gVar instanceof f)) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar.n2(new q(sVar, ((f) gVar).f299557a, null), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
