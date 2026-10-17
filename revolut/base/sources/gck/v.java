package gck;

import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer.core.models.CountryProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zm3.a f142518b;

    public /* synthetic */ v(qz9.d dVar, zm3.a aVar) {
        this.f142517a = 3;
        this.f142518b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean zB;
        int i = this.f142517a;
        zm3.a aVar = this.f142518b;
        switch (i) {
            case 0:
                od0.i.Companion.getClass();
                return l.a((l) obj2, null, new Data(od0.h.a(aVar), null, false, 6, null), 5);
            case 1:
                List scheduledTransfersData = (List) obj2;
                Intrinsics.checkNotNullParameter(scheduledTransfersData, "scheduledTransfersData");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : scheduledTransfersData) {
                    vua.a aVar2 = ((qua.p) obj3).f249330s;
                    if (Intrinsics.f(aVar2 != null ? aVar2.f : null, ((zm3.l) aVar).getCode())) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 2:
                return lck.c.a((lck.c) obj2, new Data(this.f142518b, null, false, 6, null));
            default:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                List list = (List) kVar.f288454a;
                od0.i iVar = (od0.i) kVar.f288455b;
                do3.n nVar = (do3.n) kVar.f288456c;
                Map map = (Map) kVar.d;
                Long l2 = (Long) ((od0.i) kVar.e).g();
                long jLongValue = l2 != null ? l2.longValue() : 0L;
                ArrayList<MoneyRequest> arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    MoneyRequest moneyRequest = (MoneyRequest) obj4;
                    if (aVar instanceof zm3.i) {
                        zm3.i iVar2 = (zm3.i) aVar;
                        zB = qz9.d.c(moneyRequest, iVar2.f323351b) || qz9.d.a(moneyRequest, iVar2.f323353g);
                    } else if (aVar instanceof zm3.j) {
                        zB = qz9.d.a(moneyRequest, ((zm3.j) aVar).f);
                    } else if (aVar instanceof zm3.f) {
                        zB = qz9.d.c(moneyRequest, ((zm3.f) aVar).f323345a);
                    } else if (aVar instanceof zm3.e) {
                        zB = qz9.d.b(moneyRequest, ((zm3.e) aVar).f323340a);
                    } else if (aVar instanceof zm3.o) {
                        zB = qz9.d.c(moneyRequest, ((zm3.o) aVar).f323376a);
                    } else {
                        if (!(aVar instanceof zm3.n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zB = qz9.d.b(moneyRequest, ((zm3.n) aVar).f323373a);
                    }
                    boolean z = moneyRequest.f60319j.getMillis() < jLongValue;
                    if (zB && !z) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                for (MoneyRequest moneyRequest2 : arrayList2) {
                    String strE = com.revolut.domain.models.moneyrequest.a.e(moneyRequest2.f60320l);
                    if (strE == null) {
                        strE = "";
                    }
                    String str = nVar.f116408a;
                    n38.a aVar3 = (n38.a) iVar.g();
                    if (!moneyRequest2.j(str, aVar3 != null ? aVar3.f211923a : null)) {
                        strE = null;
                    }
                    Set set = dv9.b.f118061a;
                    arrayList3.add(dv9.b.a(moneyRequest2, strE, (CountryProfile) map.get(moneyRequest2.f60323p)));
                }
                return arrayList3;
        }
    }

    public /* synthetic */ v(zm3.a aVar, int i) {
        this.f142517a = i;
        this.f142518b = aVar;
    }
}
