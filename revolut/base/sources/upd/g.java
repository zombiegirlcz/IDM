package upd;

import ael.u0;
import com.revolut.core.model.account.AccountId;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingAccount f281966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.api.models.income_sorter.a f281967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ hel.b f281968y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, TradingAccount tradingAccount, com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar, hel.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f281966w = tradingAccount;
        this.f281967x = aVar;
        this.f281968y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, this.f281966w, this.f281967x, this.f281968y, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Map map = (Map) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            wel.e eVar = (wel.e) entry.getKey();
            List list = (List) entry.getValue();
            List<kel.b> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (kel.b bVar : list2) {
                su9.c cVar = this.v.e;
                dj0.d money = bVar.d;
                Intrinsics.checkNotNullParameter(money, "money");
                arrayList2.add(nim.a.v(xam.a.h(new u29.c(money, cVar, (Continuation) null, 6), rd0.e.b(((wsg.n) cVar.f265694b).J(AccountId.Personal.f51414a, w4l.h.f294642c))), new u0(eVar, bVar, list, this.f281966w, this.f281967x, this.f281968y, 19)));
            }
            a0.x(arrayList2, arrayList);
        }
        return zh9.u0.k(arrayList);
    }
}
