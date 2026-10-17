package m2j;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f202056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BalancesInteractor$InputData f202057c;

    public /* synthetic */ l(q qVar, BalancesInteractor$InputData balancesInteractor$InputData, int i) {
        this.f202055a = i;
        this.f202056b = qVar;
        this.f202057c = balancesInteractor$InputData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k1j.a aVar;
        switch (this.f202055a) {
            case 0:
                Boolean vaultsAllowed = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(vaultsAllowed, "vaultsAllowed");
                if (!vaultsAllowed.booleanValue()) {
                    return te0.w.h(new Data(a.f202010a, null, false, 6, null));
                }
                q qVar = this.f202056b;
                j0 j0Var = qVar.f202076p;
                BalancesInteractor$InputData balancesInteractor$InputData = this.f202057c;
                BalancesInteractor$InputData.RegisteredIdentity registeredIdentity = balancesInteractor$InputData.f99396g;
                Intrinsics.checkNotNullParameter(registeredIdentity, "registeredIdentity");
                efm.r rVarFromCallable = efm.r.fromCallable(new h4d.d(j0Var, 20));
                Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
                efm.r rVarSwitchMap = rVarFromCallable.switchMap(new m1i.j0(new g0(j0Var, registeredIdentity, 1), 29));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return nim.a.w(rVarSwitchMap, new m(qVar, balancesInteractor$InputData, 4));
            case 1:
                RevPointsPocketState pocketState = (RevPointsPocketState) obj2;
                Intrinsics.checkNotNullParameter(pocketState, "pocketState");
                RevPointsPocketInfo revPointsPocketInfoA = com.revolut.feature_rev_points_pocket_api.model.a.a(pocketState);
                if ((revPointsPocketInfoA != null ? revPointsPocketInfoA.f97786c : null) != ddi.e.OPEN) {
                    return zhm.f0.f322471a;
                }
                List listC = zhm.u.c(new BalanceWrapper.RevPointsPocketBalanceWrapper(revPointsPocketInfoA.e, revPointsPocketInfoA.f97784a, revPointsPocketInfoA.f97785b));
                this.f202056b.getClass();
                return q.c(listC, this.f202057c);
            case 2:
                Boolean vaultsAllowed2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(vaultsAllowed2, "vaultsAllowed");
                if (!vaultsAllowed2.booleanValue()) {
                    return te0.w.h(new Data(a.f202010a, null, false, 6, null));
                }
                q qVar2 = this.f202056b;
                z zVar = qVar2.o;
                BalancesInteractor$InputData balancesInteractor$InputData2 = this.f202057c;
                BalancesInteractor$InputData.RegisteredIdentity registeredIdentity2 = balancesInteractor$InputData2.f99396g;
                Intrinsics.checkNotNullParameter(registeredIdentity2, "registeredIdentity");
                efm.r rVarSwitchMap2 = zVar.b().switchMap(new m1i.j0(new u(zVar, registeredIdentity2, 1), 21));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
                return nim.a.w(rVarSwitchMap2, new m(qVar2, balancesInteractor$InputData2, 3));
            case 3:
                List creditCards = (List) obj2;
                Intrinsics.checkNotNullParameter(creditCards, "creditCards");
                ArrayList arrayList = new ArrayList();
                Iterator it8 = creditCards.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    BalancesInteractor$InputData balancesInteractor$InputData3 = this.f202057c;
                    if (!zHasNext) {
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(new BalanceWrapper.CreditCardBalanceWrapper((CreditCard) it9.next(), null, this.f202056b.f202072j.b(new TextLocalisedClause(R$string.credit_card_common_product_name, null, null, 14)).toString()));
                        }
                        List listC2 = q.c(arrayList2, balancesInteractor$InputData3);
                        return listC2.isEmpty() ? a.f202010a : new b(new k1j.b(k1j.c.CREDIT_CARDS, q.a(com.revolut.retail.feature.balance.picker.api.R$string.payments_balance_picker_section_credit_title), listC2, 4));
                    }
                    Object next = it8.next();
                    if (!balancesInteractor$InputData3.f.contains(((CreditCard) next).f69793b)) {
                        arrayList.add(next);
                    }
                }
                break;
            case 4:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List<io3.d> listB = q.b(pockets, this.f202057c, new m2g.c(13));
                ArrayList arrayList3 = new ArrayList(zhm.w.t(listB, 10));
                for (io3.d dVar : listB) {
                    xi0.a aVar2 = xi0.b.Companion;
                    String str = dVar.f163147c;
                    aVar2.getClass();
                    arrayList3.add(new BalanceWrapper.PocketBalanceWrapper(this.f202056b.f202070g.a(xi0.a.a(str)), dVar, AccountId.Personal.f51414a, null, k1j.a.PRO));
                }
                return new b(new k1j.b(k1j.c.PRO, q.a(com.revolut.retail.feature.balance.picker.api.R$string.payments_balance_picker_section_pro_title), arrayList3, 4));
            default:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                BalancesInteractor$InputData balancesInteractor$InputData4 = this.f202057c;
                Set set = balancesInteractor$InputData4.f;
                Set set2 = balancesInteractor$InputData4.f99395c;
                List listB2 = q.b(pockets2, balancesInteractor$InputData4, new m2g.c(13));
                if (!set.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : listB2) {
                        if (!set.contains(((io3.d) obj3).f163145a)) {
                            arrayList4.add(obj3);
                        }
                    }
                    listB2 = arrayList4;
                }
                ArrayList<io3.d> arrayListF1 = zhm.d0.f1(listB2);
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayListF1, 10));
                Iterator it10 = arrayListF1.iterator();
                while (it10.hasNext()) {
                    t61.a.A(xi0.b.Companion, ((io3.d) it10.next()).f163147c, arrayList5);
                }
                if (!set2.contains(k1j.a.POCKETS)) {
                    arrayListF1.removeIf(new akl.p(new jeg.i(13, arrayList5), 12));
                }
                boolean zContains = set2.contains(k1j.a.CRYPTO);
                q qVar3 = this.f202056b;
                if (zContains) {
                    int i = 14;
                    arrayListF1.removeIf(new akl.p(new lul.d(qVar3, arrayList5, balancesInteractor$InputData4, i), i));
                } else {
                    arrayListF1.removeIf(new akl.p(new jeg.i(qVar3, arrayList5), 13));
                }
                if (!set2.contains(k1j.a.REVOLUT_X_FIAT)) {
                    arrayListF1.removeIf(new akl.p(new jeg.i(11, arrayList5), 15));
                }
                if (set2.contains(k1j.a.COMMODITIES)) {
                    arrayListF1.removeIf(new akl.p(new jeg.i(9, arrayList5), 11));
                } else {
                    arrayListF1.removeIf(new akl.p(new jeg.i(12, arrayList5), 16));
                }
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayListF1, 10));
                for (io3.d dVar2 : arrayListF1) {
                    xi0.a aVar3 = xi0.b.Companion;
                    String str2 = dVar2.f163147c;
                    aVar3.getClass();
                    xi0.b bVarA = xi0.a.a(str2);
                    String strA = qVar3.f202070g.a(bVarA);
                    if (dVar2.e == io3.l.REVX_FIAT && cp5.d.A(bVarA)) {
                        aVar = k1j.a.REVOLUT_X_FIAT;
                    } else if (cp5.d.A(bVarA)) {
                        aVar = k1j.a.POCKETS;
                    } else if (cp5.d.z(bVarA)) {
                        aVar = k1j.a.CRYPTO;
                    } else {
                        if (!cp5.d.y(bVarA)) {
                            throw new IllegalStateException(a0.d.r(bVarA.f306286a, " currency is not supported"));
                        }
                        aVar = k1j.a.COMMODITIES;
                    }
                    arrayList6.add(new BalanceWrapper.PocketBalanceWrapper(strA, dVar2, AccountId.Personal.f51414a, null, aVar));
                }
                return new b(new k1j.b(k1j.c.POCKETS, q.a(com.revolut.retail.feature.balance.picker.api.R$string.payments_balance_picker_section_personal_title), arrayList6, 4));
        }
    }
}
