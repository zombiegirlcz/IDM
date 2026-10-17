package ulf;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements i1j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280963a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f280964b;

    public b(Set excludedAssetExternalIds) {
        Intrinsics.checkNotNullParameter(excludedAssetExternalIds, "excludedAssetExternalIds");
        this.f280964b = excludedAssetExternalIds;
    }

    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        switch (this.f280963a) {
            case 0:
                Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
                return new v1(new twb.b0(balanceGroupList, this, (Continuation) null, 22));
            default:
                Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
                ArrayList arrayList = new ArrayList();
                Iterator it8 = balanceGroupList.iterator();
                while (it8.hasNext()) {
                    k1j.b bVar = (k1j.b) it8.next();
                    List list = bVar.f180284c;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        BalanceWrapper balanceWrapper = (BalanceWrapper) obj2;
                        Long l2 = balanceWrapper.f99405b;
                        if (l2 == null || l2.longValue() != 0) {
                            if (!this.f280964b.contains(balanceWrapper.getF99406c().f306286a)) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                    k1j.b bVarA = k1j.b.a(bVar, arrayList2);
                    if (bVarA.f180284c.isEmpty()) {
                        bVarA = null;
                    }
                    if (bVarA != null) {
                        arrayList.add(bVarA);
                    }
                }
                return zi0.c.i(arrayList);
        }
    }

    public b(List coveringBalances) {
        Intrinsics.checkNotNullParameter(coveringBalances, "coveringBalances");
        List<BalanceWrapper> list = coveringBalances;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (BalanceWrapper balanceWrapper : list) {
            arrayList.add(new a(balanceWrapper.f99404a, balanceWrapper.getF99407g()));
        }
        this.f280964b = zhm.d0.i1(arrayList);
    }
}
