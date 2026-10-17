package ej6;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountWrapper f126731b;

    public /* synthetic */ d0(AccountWrapper accountWrapper, int i) {
        this.f126730a = i;
        this.f126731b = accountWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f126730a) {
            case 0:
                return l.a((l) obj2, null, null, this.f126731b, null, null, null, i0.UNAVAILABLE, 59);
            case 1:
                return l.a((l) obj2, null, null, this.f126731b, null, null, null, i0.UNAVAILABLE, 59);
            default:
                List balanceGroups = (List) obj2;
                Intrinsics.checkNotNullParameter(balanceGroups, "balanceGroups");
                List<k1j.b> list = balanceGroups;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (k1j.b bVar : list) {
                    List list2 = bVar.f180284c;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!Intrinsics.f(((BalanceWrapper) obj3).f99404a, this.f126731b.getId())) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList.add(k1j.b.a(bVar, arrayList2));
                }
                return arrayList;
        }
    }
}
