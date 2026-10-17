package jn3;

import com.bumptech.glide.d;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import hx7.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jq9.b0;
import jq9.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;
import zhm.d0;
import zm3.e;
import zm3.f;
import zm3.g;
import zm3.i;
import zm3.j;
import zm3.l;
import zm3.n;
import zm3.o;
import zm3.p;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final List a(ArrayList arrayList, Set currencies, Map currenciesWithLimitedCountries) {
        Object obj2;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(currencies, "preselectedCurrencies");
        Intrinsics.checkNotNullParameter(currenciesWithLimitedCountries, "currenciesWithLimitedCountries");
        if (!currencies.isEmpty() && !currenciesWithLimitedCountries.isEmpty()) {
            Intrinsics.checkNotNullParameter(currenciesWithLimitedCountries, "currenciesWithLimitedCountries");
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = currencies.iterator();
            while (it8.hasNext()) {
                Set set = (Set) currenciesWithLimitedCountries.get((b) it8.next());
                if (set != null) {
                    arrayList2.add(set);
                }
            }
            Iterator it9 = arrayList2.iterator();
            if (it9.hasNext()) {
                Object next = it9.next();
                while (it9.hasNext()) {
                    next = d0.h0((Set) next, (Set) it9.next());
                }
                obj2 = next;
            } else {
                obj2 = null;
            }
            Set set2 = (Set) obj2;
            if (set2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (set2.contains(d.c(q.s((zm3.a) obj3)))) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            }
        }
        return arrayList;
    }

    public static final List b(List list, Set currencies, Map currenciesWithLimitedCountries) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(currenciesWithLimitedCountries, "currenciesWithLimitedCountries");
        if (!currencies.isEmpty() && !currenciesWithLimitedCountries.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it8 = currencies.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                b bVar = (b) it8.next();
                b bVar2 = currenciesWithLimitedCountries.containsKey(bVar) ? bVar : null;
                if (bVar2 != null) {
                    arrayList.add(bVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                boolean z = arrayList.size() == 1;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    t tVar = (t) obj2;
                    b0 b0Var = tVar instanceof b0 ? (b0) tVar : null;
                    if (b0Var == null ? true : z ? d0.T(arrayList, b0Var.f177496a.e) : false) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
        }
        return list;
    }

    public static final ArrayList c(List list, ContactsFilter filter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (d((zm3.a) obj2, filter)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final boolean d(zm3.a aVar, ContactsFilter contactsFilter) {
        String strE;
        if (contactsFilter instanceof ContactsFilter.Phone) {
            if (aVar instanceof i) {
                return Intrinsics.f(((i) aVar).f323351b, ((ContactsFilter.Phone) contactsFilter).f66033a);
            }
            if (aVar instanceof f) {
                return Intrinsics.f(((f) aVar).f323345a, ((ContactsFilter.Phone) contactsFilter).f66033a);
            }
            if (aVar instanceof o) {
                return Intrinsics.f(((o) aVar).f323376a, ((ContactsFilter.Phone) contactsFilter).f66033a);
            }
            if ((aVar instanceof j) || (aVar instanceof e) || (aVar instanceof n)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (contactsFilter instanceof ContactsFilter.Country) {
            l lVar = aVar instanceof l ? (l) aVar : null;
            return Intrinsics.f(lVar != null ? lVar.getCountry() : null, ((ContactsFilter.Country) contactsFilter).f66030a.f297794a);
        }
        if (contactsFilter instanceof ContactsFilter.Code) {
            l lVar2 = aVar instanceof l ? (l) aVar : null;
            return Intrinsics.f(lVar2 != null ? lVar2.getCode() : null, ((ContactsFilter.Code) contactsFilter).f66028a);
        }
        if (contactsFilter instanceof ContactsFilter.Contact) {
            zm3.a aVar2 = ((ContactsFilter.Contact) contactsFilter).f66029a;
            if ((aVar2 instanceof g) || (aVar2 instanceof p)) {
                strE = q.E(aVar2);
            } else {
                if (!(aVar2 instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                strE = ((l) aVar2).getCode();
            }
            if ((aVar instanceof g) || (aVar instanceof p)) {
                return Intrinsics.f(q.E(aVar), strE);
            }
            if (aVar instanceof l) {
                return Intrinsics.f(((l) aVar).getCode(), strE);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (contactsFilter instanceof ContactsFilter.And) {
            List list = ((ContactsFilter.And) contactsFilter).f66027a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (!d(aVar, (ContactsFilter) it8.next())) {
                }
            }
            return true;
        }
        if (contactsFilter instanceof ContactsFilter.Or) {
            List list2 = ((ContactsFilter.Or) contactsFilter).f66032a;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    if (d(aVar, (ContactsFilter) it9.next())) {
                        return true;
                    }
                }
            }
        } else {
            if (!(contactsFilter instanceof ContactsFilter.Not)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!d(aVar, ((ContactsFilter.Not) contactsFilter).f66031a)) {
                return true;
            }
        }
        return false;
    }
}
