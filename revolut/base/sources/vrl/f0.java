package vrl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4l.a f291631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m4l.j f291632c;

    public /* synthetic */ f0(l4l.a aVar, m4l.j jVar, int i) {
        this.f291630a = i;
        this.f291631b = aVar;
        this.f291632c = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291630a) {
            case 0:
                Optional balanceGroupOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(balanceGroupOptional, "balanceGroupOptional");
                return balanceGroupOptional.map(new bpd.a(new f0(this.f291631b, this.f291632c, 2), 21));
            case 1:
                List list = ((k1j.b) obj2).f180284c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof BalanceWrapper.VaultBalanceWrapper) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = arrayList.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        pcd.s sVar = ((BalanceWrapper.VaultBalanceWrapper) it8.next()).f99452h;
                        pcd.s sVar2 = sVar.f234885h.getPocketId() != null ? sVar : null;
                        if (sVar2 != null) {
                            arrayList2.add(sVar2);
                        }
                    } else {
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        Iterator it9 = arrayList2.iterator();
                        while (true) {
                            boolean zHasNext = it9.hasNext();
                            l4l.a aVar = this.f291631b;
                            if (!zHasNext) {
                                return new xdf.h(new TextLocalisedClause(R$string.wealth_trading_pocket_picker_group_pockets, null, null, 14), aVar, arrayList3);
                            }
                            arrayList3.add(new SourcePocket.VaultWrapper((pcd.s) it9.next(), null, aVar, this.f291632c));
                        }
                    }
                }
                break;
            case 2:
                List list2 = ((k1j.b) obj2).f180284c;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof BalanceWrapper.SavingsBalanceWrapper) {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it10 = arrayList4.iterator();
                while (true) {
                    SavingsAccountDetails savingsAccountDetails = null;
                    if (it10.hasNext()) {
                        SavingsAccountDetails savingsAccountDetails2 = ((BalanceWrapper.SavingsBalanceWrapper) it10.next()).f99439h;
                        pcd.s sVar3 = savingsAccountDetails2.f86460a;
                        if (sVar3.e == pcd.l0.SAVINGS && sVar3.f234885h.getPocketId() != null) {
                            savingsAccountDetails = savingsAccountDetails2;
                        }
                        if (savingsAccountDetails != null) {
                            arrayList5.add(savingsAccountDetails);
                        }
                    } else {
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                        Iterator it11 = arrayList5.iterator();
                        while (true) {
                            boolean zHasNext2 = it11.hasNext();
                            l4l.a aVar2 = this.f291631b;
                            if (!zHasNext2) {
                                return new xdf.h(new TextLocalisedClause(R$string.wealth_trading_pocket_picker_group_savings, null, null, 14), aVar2, arrayList6);
                            }
                            arrayList6.add(new SourcePocket.Savings((SavingsAccountDetails) it11.next(), null, aVar2, this.f291632c));
                        }
                    }
                }
                break;
            default:
                Optional balanceGroupOptional2 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(balanceGroupOptional2, "balanceGroupOptional");
                return balanceGroupOptional2.map(new bpd.a(new f0(this.f291631b, this.f291632c, 1), 20));
        }
    }
}
