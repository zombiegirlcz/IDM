package ylh;

import com.revolut.feature.statements.api.models.ProductItemStatementPeriod;
import com.revolut.feature.statements.api.models.ProductStatementPeriod;
import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.feature.statements.api.models.TaxPeriod;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import ylh.z;
import zhm.f0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 implements k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [ylh.b0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ylh.x] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [ylh.y] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v48, types: [zhm.f0] */
    public final LinkedHashMap a(ProductStatementPeriods productStatementPeriods, h0 filteringItemIds, e availablePeriodType, a aVar) {
        boolean z;
        ?? xVar;
        a aVar2;
        a aVar3;
        boolean z3;
        LocalDate localDateWithYear;
        ?? arrayList;
        ProductStatementPeriods productPeriodContent = productStatementPeriods;
        Intrinsics.checkNotNullParameter(productPeriodContent, "productPeriodContent");
        Intrinsics.checkNotNullParameter(filteringItemIds, "filteringItemIds");
        Intrinsics.checkNotNullParameter(availablePeriodType, "availablePeriodType");
        List<ProductStatementPeriod> productPeriods = productPeriodContent.getProductPeriods();
        if (!(productPeriods instanceof Collection) || !productPeriods.isEmpty()) {
            for (ProductStatementPeriod productStatementPeriod : productPeriods) {
                LocalDate from = productStatementPeriod.getFrom();
                LocalDate to6 = productStatementPeriod.getTo();
                if (from == null || (to6 != null && from.compareTo((ChronoLocalDate) to6) > 0)) {
                    productPeriodContent = productStatementPeriods;
                } else {
                    List<ProductStatementPeriod> productPeriods2 = productPeriodContent.getProductPeriods();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(productPeriods2, 10));
                    for (ProductStatementPeriod productStatementPeriod2 : productPeriods2) {
                        LocalDate from2 = productStatementPeriod2.getFrom();
                        if (from2 == null) {
                            arrayList = f0.f322471a;
                        } else {
                            LocalDate to10 = productStatementPeriod2.getTo();
                            if (to10 == null) {
                                to10 = LocalDate.now();
                            }
                            List<ProductItemStatementPeriod> itemPeriods = productStatementPeriod2.getItemPeriods();
                            if (itemPeriods == null) {
                                itemPeriods = f0.f322471a;
                            }
                            ArrayList<ProductItemStatementPeriod> arrayList3 = new ArrayList();
                            for (ProductItemStatementPeriod productItemStatementPeriod : itemPeriods) {
                                productItemStatementPeriod.getFrom();
                                productItemStatementPeriod.getTo();
                                filteringItemIds.contains(productItemStatementPeriod.getItemId());
                            }
                            if (arrayList3.isEmpty()) {
                                Intrinsics.h(to10);
                                arrayList = zhm.u.c(new a(from2, to10));
                            } else {
                                arrayList = new ArrayList(zhm.w.t(arrayList3, 10));
                                for (ProductItemStatementPeriod productItemStatementPeriod2 : arrayList3) {
                                    LocalDate from3 = productItemStatementPeriod2.getFrom();
                                    if (from3 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    LocalDate to11 = productItemStatementPeriod2.getTo();
                                    if (to11 == null) {
                                        to11 = LocalDate.now();
                                    }
                                    Intrinsics.h(to11);
                                    arrayList.add(new a(from3, to11));
                                }
                            }
                        }
                        arrayList2.add(arrayList);
                    }
                    ArrayList arrayListU = zhm.w.u(arrayList2);
                    Iterator it8 = arrayListU.iterator();
                    if (!it8.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next = it8.next();
                    if (it8.hasNext()) {
                        LocalDate localDate = ((a) next).f314705a;
                        while (true) {
                            Object next2 = it8.next();
                            LocalDate localDate2 = ((a) next2).f314705a;
                            if (localDate.compareTo((Object) localDate2) > 0) {
                                next = next2;
                                localDate = localDate2;
                            }
                            if (!it8.hasNext()) {
                                break;
                            }
                            productPeriodContent = productStatementPeriods;
                        }
                    }
                    LocalDate localDate3 = ((a) next).f314705a;
                    Iterator it9 = arrayListU.iterator();
                    if (!it9.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next3 = it9.next();
                    if (it9.hasNext()) {
                        LocalDate localDate4 = ((a) next3).f314706b;
                        while (true) {
                            Object next4 = it9.next();
                            LocalDate localDate5 = ((a) next4).f314706b;
                            if (localDate4.compareTo((Object) localDate5) < 0) {
                                next3 = next4;
                                localDate4 = localDate5;
                            }
                            if (!it9.hasNext()) {
                                break;
                            }
                            productPeriodContent = productStatementPeriods;
                        }
                    }
                    LocalDate localDate6 = ((a) next3).f314706b;
                    EnumEntries enumEntriesA = w.a();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it10 = enumEntriesA.iterator();
                    while (true) {
                        boolean zContains = true;
                        if (!it10.hasNext()) {
                            int iB = q0.b(zhm.w.t(arrayList4, 10));
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                            for (Object obj2 : arrayList4) {
                                int i = c0.f314713a[((w) obj2).ordinal()];
                                if (i == zContains) {
                                    z = zContains;
                                    xVar = new x(new a(localDate3, localDate6));
                                } else if (i == 2) {
                                    z = zContains;
                                    if (aVar != null) {
                                        LocalDate localDate7 = aVar.f314705a;
                                        LocalDate localDate8 = aVar.f314706b;
                                        if (localDate7.compareTo((Object) localDate3) < 0 || localDate7.compareTo((Object) localDate6) > 0) {
                                            localDate7 = localDate3;
                                        }
                                        if (localDate8.compareTo((Object) localDate3) < 0 || localDate8.compareTo((Object) localDate6) > 0) {
                                            localDate8 = localDate6;
                                        }
                                        aVar2 = new a(localDate7, localDate8);
                                    } else {
                                        aVar2 = new a(localDate3, localDate6);
                                    }
                                    xVar = new y(new a(localDate3, localDate6), aVar2);
                                } else if (i == 3) {
                                    boolean z4 = zContains;
                                    ArrayList arrayList5 = new ArrayList();
                                    if (aVar == null) {
                                        LocalDate localDateWithDayOfMonth = localDate6.withDayOfMonth(z4 ? 1 : 0);
                                        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
                                        aVar3 = new a(localDateWithDayOfMonth, localDate6);
                                    } else {
                                        aVar3 = aVar;
                                    }
                                    LocalDate localDate9 = localDate6;
                                    LocalDate localDateWithDayOfMonth2 = localDate3;
                                    LocalDate localDate10 = localDateWithDayOfMonth2;
                                    while (localDateWithDayOfMonth2.compareTo((ChronoLocalDate) localDate6) <= 0) {
                                        LocalDate localDateWithDayOfMonth3 = localDateWithDayOfMonth2.withDayOfMonth(localDateWithDayOfMonth2.lengthOfMonth());
                                        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth3, "withDayOfMonth(...)");
                                        LocalDate localDate11 = (LocalDate) kotlin.ranges.f.d(localDateWithDayOfMonth3, localDate6);
                                        arrayList5.add(new a(localDateWithDayOfMonth2, localDate11));
                                        LocalDate localDate12 = aVar3.f314705a;
                                        if (localDate12.compareTo((Object) localDateWithDayOfMonth2) >= 0 && localDate12.compareTo((Object) localDate11) <= 0) {
                                            localDate10 = localDateWithDayOfMonth2;
                                        }
                                        LocalDate localDate13 = aVar3.f314706b;
                                        if (localDate13.compareTo((Object) localDateWithDayOfMonth2) >= 0 && localDate13.compareTo((Object) localDate11) <= 0) {
                                            localDate9 = localDate11;
                                        }
                                        localDateWithDayOfMonth2 = localDateWithDayOfMonth2.plusMonths(1L).withDayOfMonth(1);
                                        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth2, "withDayOfMonth(...)");
                                    }
                                    z = true;
                                    xVar = new a0(arrayList5, new a(localDate10, localDate9));
                                } else {
                                    if (i != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    TaxPeriod taxPeriod = productPeriodContent.getTaxPeriod();
                                    boolean z6 = taxPeriod.getFrom().compareTo((ChronoLocalDate) taxPeriod.getTo()) < 0 ? zContains : false;
                                    ArrayList arrayList6 = new ArrayList();
                                    a aVar4 = aVar == null ? new a(localDate6, localDate6) : aVar;
                                    LocalDate localDate14 = localDate6;
                                    LocalDate localDate15 = localDate14;
                                    LocalDate localDateWithYear2 = localDate3;
                                    while (localDateWithYear2.compareTo((ChronoLocalDate) localDate6) <= 0) {
                                        if (z6) {
                                            z3 = zContains;
                                            localDateWithYear = taxPeriod.getTo().withYear(localDateWithYear2.getYear());
                                        } else {
                                            z3 = zContains;
                                            localDateWithYear = localDateWithYear2.compareTo((ChronoLocalDate) taxPeriod.getTo().withYear(localDateWithYear2.getYear())) <= 0 ? taxPeriod.getTo().withYear(localDateWithYear2.getYear()) : taxPeriod.getTo().withYear(localDateWithYear2.getYear() + 1);
                                        }
                                        Intrinsics.h(localDateWithYear);
                                        LocalDate localDate16 = (LocalDate) kotlin.ranges.f.d(localDateWithYear, localDate6);
                                        arrayList6.add(new a(localDateWithYear2, localDate16));
                                        LocalDate localDate17 = aVar4.f314706b;
                                        if (localDate17.compareTo((Object) localDateWithYear2) >= 0 && localDate17.compareTo((Object) localDate16) <= 0) {
                                            localDate15 = localDate16;
                                            localDate14 = localDateWithYear2;
                                        }
                                        localDateWithYear2 = localDate16.compareTo((ChronoLocalDate) taxPeriod.getFrom().withYear(localDateWithYear2.getYear())) < 0 ? taxPeriod.getFrom().withYear(localDateWithYear2.getYear()) : taxPeriod.getFrom().withYear(localDateWithYear2.getYear() + 1);
                                        Intrinsics.h(localDateWithYear2);
                                        zContains = z3;
                                    }
                                    xVar = new b0(taxPeriod, arrayList6, new a(localDate14, localDate15));
                                    z = zContains;
                                }
                                linkedHashMap.put(obj2, xVar);
                                productPeriodContent = productStatementPeriods;
                                zContains = z;
                            }
                            return linkedHashMap;
                        }
                        Object next5 = it10.next();
                        w wVar = (w) next5;
                        if (!(availablePeriodType instanceof c)) {
                            if (!(availablePeriodType instanceof d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zContains = ((d) availablePeriodType).f314714a.contains(wVar);
                        }
                        if (zContains) {
                            arrayList4.add(next5);
                        }
                    }
                }
            }
        }
        EnumEntries enumEntriesA2 = w.a();
        int iB2 = q0.b(zhm.w.t(enumEntriesA2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (Object obj3 : enumEntriesA2) {
            linkedHashMap2.put(obj3, z.a.f314740a);
        }
        return linkedHashMap2;
    }
}
