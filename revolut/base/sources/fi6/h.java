package fi6;

import ard.c0;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.vaults.api.VaultsApi$Toggles;
import djb.k;
import djb.m;
import efm.r;
import fg8.e0;
import fg8.i0;
import g48.r0;
import h30.l;
import h6e.f;
import io3.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.x2;
import s6e.z;
import skm.p0;
import vf0.p;
import vkm.q;
import wsg.n;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f135308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f135309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.n f135310c;
    public final r0 d;
    public final ang.f e;
    public final bd3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final twg.c f135311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hj8.a f135312h;
    public final y45.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final djb.n f135313j;
    public final psi.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f135314l;

    public h(g6e.d subaccountInteractor, n walletInteractor, al4.n creditCardInteractor, r0 jointInteractor, ang.f userInteractor, bd3.a cashbackInteractor, twg.c juniorOpenBankingPocketsInteractor, hj8.a juniorProfileInteractor, y45.i loanProductInteractor, djb.n savingsAccountsDetailsInteractor, psi.a accountPocketsComparator, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(jointInteractor, "jointInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(juniorOpenBankingPocketsInteractor, "juniorOpenBankingPocketsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(accountPocketsComparator, "accountPocketsComparator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f135308a = subaccountInteractor;
        this.f135309b = walletInteractor;
        this.f135310c = creditCardInteractor;
        this.d = jointInteractor;
        this.e = userInteractor;
        this.f = cashbackInteractor;
        this.f135311g = juniorOpenBankingPocketsInteractor;
        this.f135312h = juniorProfileInteractor;
        this.i = loanProductInteractor;
        this.f135313j = savingsAccountsDetailsInteractor;
        this.k = accountPocketsComparator;
        this.f135314l = featureToggleInteractor;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            io3.d dVar = (io3.d) obj2;
            if (dVar.f == k.ACTIVE && l.D(xi0.b.Companion, dVar.f163147c)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List b(ArrayList arrayList, List list, List list2) {
        List[] listArr = {list, list2};
        for (int i = 0; i < 2; i++) {
            if (listArr[i] != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    io3.d dVar = (io3.d) obj2;
                    if (list != null && list.contains(dVar.f163145a)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
        }
        return arrayList;
    }

    public static List c(List list, List list2, List list3) {
        List[] listArr = {list2, list3};
        for (int i = 0; i < 2; i++) {
            if (listArr[i] != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj2;
                    if (list2 != null && d0.T(list2, savingsAccountDetails.f86460a.f234885h.getPocketId())) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        return list;
    }

    public final r d(final List list, final List list2, boolean z, boolean z3) {
        r e;
        od0.i iVar;
        r rVarJust;
        r rVarJust2;
        g6e.d dVar;
        Flow gVar;
        r k;
        io3.l lVar = io3.l.CURRENT;
        io3.i iVar2 = io3.i.INTERNAL;
        n nVar = this.f135309b;
        r a7 = nim.a.w(osg.b.e(nVar, true, lVar, null, iVar2, null, null, null, 100), new eh1.d(this, list, list2, 1));
        r b4 = nim.a.w(osg.b.e(nVar, true, io3.l.MERCHANT, null, iVar2, null, null, null, 100), new eh1.d(this, list, list2, 5));
        akg.n nVarV = nim.a.v(this.d.i(false), new fg8.g(13));
        kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
        final int i = 2;
        r c2 = pd.b.r(rd0.e.c(nVarV, gVar2), new Function1(this) { // from class: fi6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f135295b;

            {
                this.f135295b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                List list3 = list2;
                List list4 = list;
                h hVar = this.f135295b;
                int i3 = 0;
                switch (i2) {
                    case 0:
                        List loans = (List) obj2;
                        Intrinsics.checkNotNullParameter(loans, "loans");
                        hVar.getClass();
                        List[] listArr = {list4, list3};
                        while (i3 < 2) {
                            if (listArr[i3] != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : loans) {
                                    Loan loan = (Loan) obj3;
                                    if (list4 != null && list4.contains(loan.f70108a)) {
                                        arrayList.add(obj3);
                                    }
                                }
                                return arrayList;
                            }
                            i3++;
                        }
                        return loans;
                    case 1:
                        Map profilesMap = (Map) obj2;
                        Intrinsics.checkNotNullParameter(profilesMap, "profilesMap");
                        Collection collectionValues = profilesMap.values();
                        ArrayList arrayList2 = new ArrayList(w.t(collectionValues, 10));
                        Iterator it8 = collectionValues.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(nim.a.v(rd0.e.b(((rnb.i) hVar.f135313j).f(new m(((JuniorBankingProfile) it8.next()).f77103j), w4l.i.f294643c)), new fg8.g(12)));
                        }
                        return arrayList2.isEmpty() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(u0.k(arrayList2), new eh1.d(hVar, list4, list3, 6));
                    case 2:
                        n38.a jointAccount = (n38.a) obj2;
                        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
                        return nim.a.w(osg.b.e(hVar.f135309b, true, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, l38.a.c(jointAccount), 36), new eh1.d(hVar, list4, list3, 3));
                    case 3:
                        List cashbackBoxes = (List) obj2;
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        hVar.getClass();
                        List[] listArr2 = {list4, list3};
                        while (i3 < 2) {
                            if (listArr2[i3] != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : cashbackBoxes) {
                                    uc3.a aVar = (uc3.a) obj4;
                                    if (list4 != null && list4.contains(aVar.f278974b.f163145a)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                return arrayList3;
                            }
                            i3++;
                        }
                        return cashbackBoxes;
                    default:
                        Map juniorPocketsMap = (Map) obj2;
                        Intrinsics.checkNotNullParameter(juniorPocketsMap, "juniorPocketsMap");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(juniorPocketsMap.size()));
                        for (Map.Entry entry : juniorPocketsMap.entrySet()) {
                            Object key = entry.getKey();
                            List list5 = (List) entry.getValue();
                            hVar.getClass();
                            List[] listArr3 = {list4, list3};
                            int i5 = 0;
                            while (true) {
                                if (i5 >= 2) {
                                }
                                if (listArr3[i5] == null) {
                                    i5++;
                                } else {
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj5 : list5) {
                                        bs8.a aVar2 = (bs8.a) obj5;
                                        if (list4 != null && list4.contains(aVar2.f18076a)) {
                                            arrayList4.add(obj5);
                                        }
                                    }
                                    list5 = arrayList4;
                                }
                                break;
                            }
                            linkedHashMap.put(key, list5);
                        }
                        return linkedHashMap;
                }
            }
        });
        x2 x2Var = (x2) this.f135310c;
        w4l.i loadingStrategy = w4l.i.f294643c;
        r rVarC = rd0.e.c(new c0(mo3.a.g(x2Var.l(loadingStrategy), null, new i0(11), 1), this, list, list2, 9), gVar2);
        f0 f0Var = f0.f322471a;
        r d = ue0.e.E(rVarC, f0Var);
        od0.i iVar3 = od0.i.f224256b;
        if (z) {
            final int i2 = 0;
            e = nim.a.w(this.i.d(loadingStrategy), new Function1(this) { // from class: fi6.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f135295b;

                {
                    this.f135295b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i22 = i2;
                    List list3 = list;
                    List list4 = list2;
                    h hVar = this.f135295b;
                    int i3 = 0;
                    switch (i22) {
                        case 0:
                            List loans = (List) obj2;
                            Intrinsics.checkNotNullParameter(loans, "loans");
                            hVar.getClass();
                            List[] listArr = {list4, list3};
                            while (i3 < 2) {
                                if (listArr[i3] != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj3 : loans) {
                                        Loan loan = (Loan) obj3;
                                        if (list4 != null && list4.contains(loan.f70108a)) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    return arrayList;
                                }
                                i3++;
                            }
                            return loans;
                        case 1:
                            Map profilesMap = (Map) obj2;
                            Intrinsics.checkNotNullParameter(profilesMap, "profilesMap");
                            Collection collectionValues = profilesMap.values();
                            ArrayList arrayList2 = new ArrayList(w.t(collectionValues, 10));
                            Iterator it8 = collectionValues.iterator();
                            while (it8.hasNext()) {
                                arrayList2.add(nim.a.v(rd0.e.b(((rnb.i) hVar.f135313j).f(new m(((JuniorBankingProfile) it8.next()).f77103j), w4l.i.f294643c)), new fg8.g(12)));
                            }
                            return arrayList2.isEmpty() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(u0.k(arrayList2), new eh1.d(hVar, list4, list3, 6));
                        case 2:
                            n38.a jointAccount = (n38.a) obj2;
                            Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
                            return nim.a.w(osg.b.e(hVar.f135309b, true, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, l38.a.c(jointAccount), 36), new eh1.d(hVar, list4, list3, 3));
                        case 3:
                            List cashbackBoxes = (List) obj2;
                            Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                            hVar.getClass();
                            List[] listArr2 = {list4, list3};
                            while (i3 < 2) {
                                if (listArr2[i3] != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj4 : cashbackBoxes) {
                                        uc3.a aVar = (uc3.a) obj4;
                                        if (list4 != null && list4.contains(aVar.f278974b.f163145a)) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    return arrayList3;
                                }
                                i3++;
                            }
                            return cashbackBoxes;
                        default:
                            Map juniorPocketsMap = (Map) obj2;
                            Intrinsics.checkNotNullParameter(juniorPocketsMap, "juniorPocketsMap");
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(juniorPocketsMap.size()));
                            for (Map.Entry entry : juniorPocketsMap.entrySet()) {
                                Object key = entry.getKey();
                                List list5 = (List) entry.getValue();
                                hVar.getClass();
                                List[] listArr3 = {list4, list3};
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= 2) {
                                    }
                                    if (listArr3[i5] == null) {
                                        i5++;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj5 : list5) {
                                            bs8.a aVar2 = (bs8.a) obj5;
                                            if (list4 != null && list4.contains(aVar2.f18076a)) {
                                                arrayList4.add(obj5);
                                            }
                                        }
                                        list5 = arrayList4;
                                    }
                                    break;
                                }
                                linkedHashMap.put(key, list5);
                            }
                            return linkedHashMap;
                    }
                }
            }).map(new e0(8, new fg8.g(11)));
            Intrinsics.h(e);
        } else {
            od0.i.Companion.getClass();
            e = r.just(iVar3);
            Intrinsics.h(e);
        }
        djb.n nVar2 = this.f135313j;
        if (z3) {
            iVar = iVar3;
            rVarJust = nim.a.w(((rnb.i) nVar2).f(k.b.f115282a, loadingStrategy), new eh1.d(this, list, list2, 2)).map(new e0(6, new fg8.g(9)));
            Intrinsics.h(rVarJust);
        } else {
            iVar = iVar3;
            od0.i.Companion.getClass();
            rVarJust = r.just(iVar);
            Intrinsics.h(rVarJust);
        }
        if (z3) {
            rVarJust2 = nim.a.w(((rnb.i) nVar2).f(k.a.f115281a, loadingStrategy), new eh1.d(this, list, list2, 4)).map(new e0(7, new fg8.g(10)));
            Intrinsics.h(rVarJust2);
        } else {
            od0.i.Companion.getClass();
            rVarJust2 = r.just(iVar);
            Intrinsics.h(rVarJust2);
        }
        boolean zC = ((jte.d) this.f135314l).c(VaultsApi$Toggles.JointSubaccounts.f94695c);
        g6e.d dVar2 = this.f135308a;
        if (zC) {
            gVar = ((z) dVar2).w(f.d.f149639a, loadingStrategy);
            dVar = dVar2;
        } else {
            dVar = dVar2;
            gVar = new go.g(new Data(f0Var, null, false, 6, null), 2);
        }
        jhi.k kVarU = nim.a.u(new f(this, list, list2, null), nim.a.v(u0.m(((z) dVar).o(loadingStrategy), gVar), new fg8.g(14)));
        kotlinx.coroutines.d dVar3 = p0.f264003c;
        r h2 = rd0.e.c(kVarU, dVar3);
        final int i3 = 3;
        r i5 = nim.a.w(this.f.c(loadingStrategy), new Function1(this) { // from class: fi6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f135295b;

            {
                this.f135295b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i3;
                List list3 = list2;
                List list4 = list;
                h hVar = this.f135295b;
                int i32 = 0;
                switch (i22) {
                    case 0:
                        List loans = (List) obj2;
                        Intrinsics.checkNotNullParameter(loans, "loans");
                        hVar.getClass();
                        List[] listArr = {list4, list3};
                        while (i32 < 2) {
                            if (listArr[i32] != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : loans) {
                                    Loan loan = (Loan) obj3;
                                    if (list4 != null && list4.contains(loan.f70108a)) {
                                        arrayList.add(obj3);
                                    }
                                }
                                return arrayList;
                            }
                            i32++;
                        }
                        return loans;
                    case 1:
                        Map profilesMap = (Map) obj2;
                        Intrinsics.checkNotNullParameter(profilesMap, "profilesMap");
                        Collection collectionValues = profilesMap.values();
                        ArrayList arrayList2 = new ArrayList(w.t(collectionValues, 10));
                        Iterator it8 = collectionValues.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(nim.a.v(rd0.e.b(((rnb.i) hVar.f135313j).f(new m(((JuniorBankingProfile) it8.next()).f77103j), w4l.i.f294643c)), new fg8.g(12)));
                        }
                        return arrayList2.isEmpty() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(u0.k(arrayList2), new eh1.d(hVar, list4, list3, 6));
                    case 2:
                        n38.a jointAccount = (n38.a) obj2;
                        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
                        return nim.a.w(osg.b.e(hVar.f135309b, true, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, l38.a.c(jointAccount), 36), new eh1.d(hVar, list4, list3, 3));
                    case 3:
                        List cashbackBoxes = (List) obj2;
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        hVar.getClass();
                        List[] listArr2 = {list4, list3};
                        while (i32 < 2) {
                            if (listArr2[i32] != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : cashbackBoxes) {
                                    uc3.a aVar = (uc3.a) obj4;
                                    if (list4 != null && list4.contains(aVar.f278974b.f163145a)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                return arrayList3;
                            }
                            i32++;
                        }
                        return cashbackBoxes;
                    default:
                        Map juniorPocketsMap = (Map) obj2;
                        Intrinsics.checkNotNullParameter(juniorPocketsMap, "juniorPocketsMap");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(juniorPocketsMap.size()));
                        for (Map.Entry entry : juniorPocketsMap.entrySet()) {
                            Object key = entry.getKey();
                            List list5 = (List) entry.getValue();
                            hVar.getClass();
                            List[] listArr3 = {list4, list3};
                            int i59 = 0;
                            while (true) {
                                if (i59 >= 2) {
                                }
                                if (listArr3[i59] == null) {
                                    i59++;
                                } else {
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj5 : list5) {
                                        bs8.a aVar2 = (bs8.a) obj5;
                                        if (list4 != null && list4.contains(aVar2.f18076a)) {
                                            arrayList4.add(obj5);
                                        }
                                    }
                                    list5 = arrayList4;
                                }
                                break;
                            }
                            linkedHashMap.put(key, list5);
                        }
                        return linkedHashMap;
                }
            }
        });
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        twg.c cVar = this.f135311g;
        r g3 = rVarJust2;
        r f = rVarJust;
        final int i6 = 4;
        r j2 = nim.a.w(rd0.e.c(q.Q(new ae8.c(bla.b.b((jla.h) cVar.d, ne8.a.f214420c.a()), 9), new f5h.b((Continuation) null, cVar, 13)), gVar2), new Function1(this) { // from class: fi6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f135295b;

            {
                this.f135295b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i6;
                List list3 = list2;
                List list4 = list;
                h hVar = this.f135295b;
                int i32 = 0;
                switch (i22) {
                    case 0:
                        List loans = (List) obj2;
                        Intrinsics.checkNotNullParameter(loans, "loans");
                        hVar.getClass();
                        List[] listArr = {list4, list3};
                        while (i32 < 2) {
                            if (listArr[i32] != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : loans) {
                                    Loan loan = (Loan) obj3;
                                    if (list4 != null && list4.contains(loan.f70108a)) {
                                        arrayList.add(obj3);
                                    }
                                }
                                return arrayList;
                            }
                            i32++;
                        }
                        return loans;
                    case 1:
                        Map profilesMap = (Map) obj2;
                        Intrinsics.checkNotNullParameter(profilesMap, "profilesMap");
                        Collection collectionValues = profilesMap.values();
                        ArrayList arrayList2 = new ArrayList(w.t(collectionValues, 10));
                        Iterator it8 = collectionValues.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(nim.a.v(rd0.e.b(((rnb.i) hVar.f135313j).f(new m(((JuniorBankingProfile) it8.next()).f77103j), w4l.i.f294643c)), new fg8.g(12)));
                        }
                        return arrayList2.isEmpty() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(u0.k(arrayList2), new eh1.d(hVar, list4, list3, 6));
                    case 2:
                        n38.a jointAccount = (n38.a) obj2;
                        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
                        return nim.a.w(osg.b.e(hVar.f135309b, true, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, l38.a.c(jointAccount), 36), new eh1.d(hVar, list4, list3, 3));
                    case 3:
                        List cashbackBoxes = (List) obj2;
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        hVar.getClass();
                        List[] listArr2 = {list4, list3};
                        while (i32 < 2) {
                            if (listArr2[i32] != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : cashbackBoxes) {
                                    uc3.a aVar = (uc3.a) obj4;
                                    if (list4 != null && list4.contains(aVar.f278974b.f163145a)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                return arrayList3;
                            }
                            i32++;
                        }
                        return cashbackBoxes;
                    default:
                        Map juniorPocketsMap = (Map) obj2;
                        Intrinsics.checkNotNullParameter(juniorPocketsMap, "juniorPocketsMap");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(juniorPocketsMap.size()));
                        for (Map.Entry entry : juniorPocketsMap.entrySet()) {
                            Object key = entry.getKey();
                            List list5 = (List) entry.getValue();
                            hVar.getClass();
                            List[] listArr3 = {list4, list3};
                            int i59 = 0;
                            while (true) {
                                if (i59 >= 2) {
                                }
                                if (listArr3[i59] == null) {
                                    i59++;
                                } else {
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj5 : list5) {
                                        bs8.a aVar2 = (bs8.a) obj5;
                                        if (list4 != null && list4.contains(aVar2.f18076a)) {
                                            arrayList4.add(obj5);
                                        }
                                    }
                                    list5 = arrayList4;
                                }
                                break;
                            }
                            linkedHashMap.put(key, list5);
                        }
                        return linkedHashMap;
                }
            }
        });
        if (z3) {
            final int i21 = 1;
            k = rd0.e.c(new dfj.f(boh.f.e(((nj8.n) this.f135312h).k(null, loadingStrategy), new Function1(this) { // from class: fi6.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f135295b;

                {
                    this.f135295b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i22 = i21;
                    List list3 = list2;
                    List list4 = list;
                    h hVar = this.f135295b;
                    int i32 = 0;
                    switch (i22) {
                        case 0:
                            List loans = (List) obj2;
                            Intrinsics.checkNotNullParameter(loans, "loans");
                            hVar.getClass();
                            List[] listArr = {list4, list3};
                            while (i32 < 2) {
                                if (listArr[i32] != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj3 : loans) {
                                        Loan loan = (Loan) obj3;
                                        if (list4 != null && list4.contains(loan.f70108a)) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    return arrayList;
                                }
                                i32++;
                            }
                            return loans;
                        case 1:
                            Map profilesMap = (Map) obj2;
                            Intrinsics.checkNotNullParameter(profilesMap, "profilesMap");
                            Collection collectionValues = profilesMap.values();
                            ArrayList arrayList2 = new ArrayList(w.t(collectionValues, 10));
                            Iterator it8 = collectionValues.iterator();
                            while (it8.hasNext()) {
                                arrayList2.add(nim.a.v(rd0.e.b(((rnb.i) hVar.f135313j).f(new m(((JuniorBankingProfile) it8.next()).f77103j), w4l.i.f294643c)), new fg8.g(12)));
                            }
                            return arrayList2.isEmpty() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(u0.k(arrayList2), new eh1.d(hVar, list4, list3, 6));
                        case 2:
                            n38.a jointAccount = (n38.a) obj2;
                            Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
                            return nim.a.w(osg.b.e(hVar.f135309b, true, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, l38.a.c(jointAccount), 36), new eh1.d(hVar, list4, list3, 3));
                        case 3:
                            List cashbackBoxes = (List) obj2;
                            Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                            hVar.getClass();
                            List[] listArr2 = {list4, list3};
                            while (i32 < 2) {
                                if (listArr2[i32] != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj4 : cashbackBoxes) {
                                        uc3.a aVar = (uc3.a) obj4;
                                        if (list4 != null && list4.contains(aVar.f278974b.f163145a)) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    return arrayList3;
                                }
                                i32++;
                            }
                            return cashbackBoxes;
                        default:
                            Map juniorPocketsMap = (Map) obj2;
                            Intrinsics.checkNotNullParameter(juniorPocketsMap, "juniorPocketsMap");
                            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(juniorPocketsMap.size()));
                            for (Map.Entry entry : juniorPocketsMap.entrySet()) {
                                Object key = entry.getKey();
                                List list5 = (List) entry.getValue();
                                hVar.getClass();
                                List[] listArr3 = {list4, list3};
                                int i59 = 0;
                                while (true) {
                                    if (i59 >= 2) {
                                    }
                                    if (listArr3[i59] == null) {
                                        i59++;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj5 : list5) {
                                            bs8.a aVar2 = (bs8.a) obj5;
                                            if (list4 != null && list4.contains(aVar2.f18076a)) {
                                                arrayList4.add(obj5);
                                            }
                                        }
                                        list5 = arrayList4;
                                    }
                                    break;
                                }
                                linkedHashMap.put(key, list5);
                            }
                            return linkedHashMap;
                    }
                }
            }), 25), dVar3);
        } else {
            od0.i.Companion.getClass();
            k = r.just(iVar);
            Intrinsics.checkNotNullExpressionValue(k, "just(...)");
        }
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(g3, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i5, "i");
        Intrinsics.checkNotNullParameter(j2, "j");
        Intrinsics.checkNotNullParameter(k, "k");
        r rVarCombineLatest = r.combineLatest(v.k(a7, b4, c2, d, e, f, g3, h2, i5, j2, k), new vf0.n(new p(2), 10));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        r map = rVarCombineLatest.map(new e0(9, new fca.d(this, 21)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
