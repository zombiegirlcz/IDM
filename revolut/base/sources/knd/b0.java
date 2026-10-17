package knd;

import com.revolut.feature.categorisation.api.model.AnalyticsAccountPocketSource;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b0 b0Var = new b0(2, continuation);
        b0Var.u = obj2;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Map map = (Map) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        ArrayList arrayListU = p.a.u(obj2);
        for (Map.Entry entry : map.entrySet()) {
            AnalyticsAccount analyticsAccount = (AnalyticsAccount) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(new GroupingExtraData.SourceAccount.AccountPocketSource(analyticsAccount, (AnalyticsAccountPocketSource) it8.next()));
            }
            zhm.a0.x(arrayList, arrayListU);
        }
        return new GroupingExtraData.SourceAccount(arrayListU);
    }
}
