package m2j;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import com.revolut.retail.feature.balance.picker.api.models.TeenInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.z0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BalancesInteractor$InputData f202061b;

    public /* synthetic */ m(BalancesInteractor$InputData balancesInteractor$InputData) {
        this.f202060a = 6;
        this.f202061b = balancesInteractor$InputData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List juniorPockets = (List) obj2;
        switch (this.f202060a) {
            case 0:
                Intrinsics.checkNotNullParameter(juniorPockets, "juniorPockets");
                k1j.c cVar = k1j.c.YOUTH_POCKETS;
                List<b0> list = juniorPockets;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (b0 b0Var : list) {
                    io3.d dVar = b0Var.f202016b;
                    arrayList.add(new BalanceWrapper.JuniorPocketBalanceWrapper(dVar.f163145a, dVar.d, dVar, hx7.b.c(b0Var.f202015a), b0Var.f202017c, z92.f.j(b0Var.f202016b)));
                }
                return new b(new k1j.b(cVar, null, q.c(arrayList, this.f202061b), 6));
            case 1:
                Intrinsics.checkNotNullParameter(juniorPockets, "juniorSavings");
                k1j.c cVar2 = k1j.c.YOUTH_SAVINGS;
                List<c0> list2 = juniorPockets;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (c0 c0Var : list2) {
                    arrayList2.add(new BalanceWrapper.JuniorSavingsBalanceWrapper(c0Var.f202019b, hx7.b.c(c0Var.f202018a), null));
                }
                return new b(new k1j.b(cVar2, null, q.c(arrayList2, this.f202061b), 6));
            case 2:
                Intrinsics.checkNotNullParameter(juniorPockets, "teenPockets");
                if (juniorPockets.isEmpty()) {
                    return a.f202010a;
                }
                k1j.c cVar3 = k1j.c.TEEN_POCKETS;
                List<k0> list3 = juniorPockets;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                for (k0 k0Var : list3) {
                    io3.d dVar2 = k0Var.f202054b;
                    String str = dVar2.f163145a;
                    String str2 = dVar2.d;
                    TeenProfile teenProfile = k0Var.f202053a;
                    Intrinsics.checkNotNullParameter(teenProfile, "<this>");
                    arrayList3.add(new BalanceWrapper.TeenPocketBalanceWrapper(str, str2, dVar2, new TeenInfo(teenProfile.f90334a, teenProfile.f90335b), z92.f.j(k0Var.f202054b)));
                }
                return new b(new k1j.b(cVar3, null, q.c(arrayList3, this.f202061b), 6));
            case 3:
                Intrinsics.checkNotNullParameter(juniorPockets, "juniorVaults");
                k1j.c cVar4 = k1j.c.YOUTH_VAULTS;
                List<d0> list4 = juniorPockets;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                for (d0 d0Var : list4) {
                    pcd.s sVar = d0Var.f202022b;
                    String str3 = sVar.f234881a;
                    String str4 = sVar.f234885h.f234859a;
                    JuniorInfo juniorInfoC = hx7.b.c(d0Var.f202021a);
                    pcd.s sVar2 = d0Var.f202022b;
                    arrayList4.add(new BalanceWrapper.JuniorVaultBalanceWrapper(str3, str4, sVar, juniorInfoC, new dj0.d(sVar2.f234885h.f234861c, kii.e.u(sVar2, xi0.b.Companion))));
                }
                return new b(new k1j.b(cVar4, null, q.c(arrayList4, this.f202061b), 6));
            case 4:
                Intrinsics.checkNotNullParameter(juniorPockets, "teenVaults");
                if (juniorPockets.isEmpty()) {
                    return a.f202010a;
                }
                k1j.c cVar5 = k1j.c.TEEN_VAULTS;
                List<l0> list5 = juniorPockets;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                for (l0 l0Var : list5) {
                    pcd.s sVar3 = l0Var.f202059b;
                    TeenProfile teenProfile2 = l0Var.f202058a;
                    Intrinsics.checkNotNullParameter(teenProfile2, "<this>");
                    TeenInfo teenInfo = new TeenInfo(teenProfile2.f90334a, teenProfile2.f90335b);
                    pcd.s sVar4 = l0Var.f202059b;
                    arrayList5.add(new BalanceWrapper.TeenVaultBalanceWrapper(sVar3, teenInfo, new dj0.d(sVar4.f234885h.f234861c, kii.e.u(sVar4, xi0.b.Companion))));
                }
                return new b(new k1j.b(cVar5, null, q.c(arrayList5, this.f202061b), 6));
            case 5:
                Intrinsics.checkNotNullParameter(juniorPockets, "pockets");
                List<io3.d> listB = q.b(juniorPockets, this.f202061b, new m2g.c(13));
                ArrayList arrayList6 = new ArrayList(zhm.w.t(listB, 10));
                for (io3.d dVar3 : listB) {
                    xi0.a aVar = xi0.b.Companion;
                    String str5 = dVar3.f163147c;
                    aVar.getClass();
                    arrayList6.add(new BalanceWrapper.PocketBalanceWrapper(com.google.android.gms.internal.mlkit_vision_face.a.o(xi0.a.a(str5).f306286a, " · ", dVar3.d), dVar3, AccountId.Personal.f51414a, null, k1j.a.EXTERNAL_POCKETS));
                }
                return !arrayList6.isEmpty() ? new b(new k1j.b(k1j.c.EXTERNAL_POCKETS, q.a(R$string.payments_balance_picker_section_linked_accounts_title), arrayList6, 4)) : a.f202010a;
            case 6:
                Intrinsics.checkNotNullParameter(juniorPockets, "pockets");
                io3.l lVar = this.f202061b.f99394b;
                Set setI = lVar != null ? z0.i(lVar, io3.l.REVX_FIAT) : null;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : juniorPockets) {
                    io3.d dVar4 = (io3.d) obj3;
                    if (setI == null || setI.isEmpty() || setI.contains(dVar4.e)) {
                        io3.j jVar = dVar4.f163148g;
                        io3.l lVar2 = dVar4.e;
                        if (jVar == io3.j.PERSONAL && dVar4.f163149h == io3.i.INTERNAL && ((setI != null && !setI.isEmpty()) || lVar2 != io3.l.MERCHANT)) {
                            if ((setI != null && !setI.isEmpty()) || lVar2 != io3.l.LOCKED_GIFT) {
                                arrayList7.add(obj3);
                            }
                        }
                    }
                }
                return arrayList7;
            default:
                Intrinsics.checkNotNullParameter(juniorPockets, "balancesByAccount");
                ArrayList arrayListU = zhm.w.u(juniorPockets);
                BalancesInteractor$InputData balancesInteractor$InputData = this.f202061b;
                List balanceWrappers = d.a(arrayListU, balancesInteractor$InputData);
                Set allowedGroups = balancesInteractor$InputData.f99395c;
                Intrinsics.checkNotNullParameter(balanceWrappers, "balanceWrappers");
                Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
                ArrayList arrayList8 = new ArrayList();
                for (Object obj4 : balanceWrappers) {
                    int i = n2j.k.f211579a[((BalanceWrapper) obj4).getF99407g().ordinal()];
                    if (i != 1 ? i != 2 ? false : allowedGroups.contains(k1j.a.JOINT_TRADING_ACCOUNTS) : allowedGroups.contains(k1j.a.TRADING_ACCOUNTS)) {
                        arrayList8.add(obj4);
                    }
                }
                return arrayList8;
        }
    }

    public /* synthetic */ m(BalancesInteractor$InputData balancesInteractor$InputData, n2j.j jVar) {
        this.f202060a = 7;
        this.f202061b = balancesInteractor$InputData;
    }

    public /* synthetic */ m(q qVar, BalancesInteractor$InputData balancesInteractor$InputData, int i) {
        this.f202060a = i;
        this.f202061b = balancesInteractor$InputData;
    }
}
