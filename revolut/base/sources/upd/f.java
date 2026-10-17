package upd;

import ael.q0;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.api.models.income_sorter.a f281965w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f281965w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, this.f281965w, continuation);
        fVar.u = ((Boolean) obj2).booleanValue();
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((f) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!z) {
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        h hVar = this.v;
        ybl.k kVar = hVar.f281969a;
        com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar2 = this.f281965w;
        Intrinsics.checkNotNullParameter(aVar2, "<this>");
        int i = otd.e.f229589a[aVar2.ordinal()];
        if (i == 1) {
            obj3 = TradingAccountType.Gia.f105270a;
        } else {
            if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            obj3 = TradingAccountType.Taa.f105275a;
        }
        return nim.a.v(((q0) kVar).n(y0.b(obj3), w4l.h.f294642c, cfl.m.f23746a), new um7.d(hVar, aVar2));
    }
}
