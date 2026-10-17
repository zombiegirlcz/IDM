package m2j;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import djb.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f202063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BalancesInteractor$InputData f202064c;
    public final /* synthetic */ AccountId.Joint d;

    public /* synthetic */ n(q qVar, BalancesInteractor$InputData balancesInteractor$InputData, AccountId.Joint joint, int i) {
        this.f202062a = i;
        this.f202063b = qVar;
        this.f202064c = balancesInteractor$InputData;
        this.d = joint;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202062a) {
            case 0:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list = pockets;
                int iB = q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    String str = ((io3.d) it8.next()).f163147c;
                    xi0.b.Companion.getClass();
                    linkedHashMap.put(str, xi0.a.a(str));
                }
                List listB = q.b(pockets, this.f202064c, new m2g.c(13));
                ArrayList<io3.d> arrayList = new ArrayList();
                for (Object obj3 : listB) {
                    if (cp5.d.A((xi0.b) linkedHashMap.get(((io3.d) obj3).f163147c))) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (io3.d dVar : arrayList) {
                    xi0.a aVar = xi0.b.Companion;
                    String str2 = dVar.f163147c;
                    aVar.getClass();
                    arrayList2.add(new BalanceWrapper.PocketBalanceWrapper(this.f202063b.f202070g.a(xi0.a.a(str2)), dVar, this.d, null, k1j.a.JOINT_ACCOUNT));
                }
                return new b(new k1j.b(k1j.c.JOINT_ACCOUNT, q.a(R$string.payments_balance_picker_section_joint_title), arrayList2, 4));
            case 1:
                if (!((Boolean) obj2).booleanValue()) {
                    efm.r rVarJust = efm.r.just(new Data(a.f202010a, null, false, 6, null));
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                q qVar = this.f202063b;
                return pd.b.r(((rnb.i) qVar.k).f(k.a.f115281a, w4l.j.f294644c), new n(qVar, this.f202064c, this.d, 2));
            default:
                ejb.b info = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(info, "info");
                q qVar2 = this.f202063b;
                djb.u uVar = qVar2.f202075n;
                List list2 = info.f126837b;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(((SavingsAccountDetails) it9.next()).f86460a);
                }
                return nim.a.w(((rnb.x) uVar).a(arrayList3, w4l.j.f294644c), new li8.n(qVar2, info, this.f202064c, this.d, 15));
        }
    }
}
