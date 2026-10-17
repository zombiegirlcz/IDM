package tjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f271726b;

    public /* synthetic */ f(h0 h0Var, int i) {
        this.f271725a = i;
        this.f271726b = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f271725a;
        h0 h0Var = this.f271726b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair.f186386b;
                ArrayList<WealthAccount> arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (jjh.b.b((WealthAccount) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (WealthAccount wealthAccount : arrayList) {
                    arrayList2.add(new s6e.v(vkm.q.Q(h0Var.L.a(jjh.b.c(wealthAccount), w4l.h.f294642c), new sdi.a(null, wealthAccount, h0Var, 9)), wealthAccount, 24));
                }
                return !arrayList2.isEmpty() ? new s6e.v(new j23.b((Flow[]) zhm.d0.d1(arrayList2).toArray(new Flow[0]), 25), tradingLegalEntityInformation, 23) : new go.g(new dih.b(zhm.f0.f322471a, tradingLegalEntityInformation), 2);
            default:
                bih.h hVar = (bih.h) obj2;
                h hVar2 = h0.Companion;
                Map map = ((bih.h) h0Var.b3()).d;
                if (map == null) {
                    map = ((bih.h) h0Var.b3()).f15496a;
                }
                return bih.h.a(hVar, map, null, null, null, null, 38);
        }
    }
}
