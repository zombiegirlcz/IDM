package i0e;

import com.revolut.feature.statements.api.models.ProductItemStatementPeriod;
import com.revolut.feature.statements.api.models.ProductStatementPeriod;
import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.TaxPeriod;
import i0e.b0;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v47, types: [zhm.f0] */
    public final LinkedHashMap a(ProductStatementPeriods productStatementPeriods, Set filteringItemIds, io3.h availablePeriodType, StatementPeriod statementPeriod) {
        Set setY0;
        Iterator it8;
        b0 yVar;
        StatementPeriod statementPeriod2;
        StatementPeriod statementPeriod3;
        LocalDate start;
        ?? arrayList;
        ProductStatementPeriods productPeriodContent = productStatementPeriods;
        Intrinsics.checkNotNullParameter(productPeriodContent, "productPeriodContent");
        Intrinsics.checkNotNullParameter(filteringItemIds, "filteringItemIds");
        Intrinsics.checkNotNullParameter(availablePeriodType, "availablePeriodType");
        List<ProductStatementPeriod> productPeriods = productPeriodContent.getProductPeriods();
        boolean z = productPeriods instanceof Collection;
        b0.a aVar = b0.a.f157358a;
        if (!z || !productPeriods.isEmpty()) {
            for (ProductStatementPeriod productStatementPeriod : productPeriods) {
                LocalDate from = productStatementPeriod.getFrom();
                LocalDate to6 = productStatementPeriod.getTo();
                if (from != null && (to6 == null || from.compareTo((ChronoLocalDate) to6) <= 0)) {
                    List<ProductStatementPeriod> productPeriods2 = productPeriodContent.getProductPeriods();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(productPeriods2, 10));
                    for (ProductStatementPeriod productStatementPeriod2 : productPeriods2) {
                        LocalDate from2 = productStatementPeriod2.getFrom();
                        if (from2 == null) {
                            arrayList = zhm.f0.f322471a;
                        } else {
                            LocalDate to10 = productStatementPeriod2.getTo();
                            if (to10 == null) {
                                to10 = LocalDate.now();
                            }
                            List<ProductItemStatementPeriod> itemPeriods = productStatementPeriod2.getItemPeriods();
                            if (itemPeriods == null) {
                                itemPeriods = zhm.f0.f322471a;
                            }
                            ArrayList<ProductItemStatementPeriod> arrayList3 = new ArrayList();
                            for (Object obj2 : itemPeriods) {
                                ProductItemStatementPeriod productItemStatementPeriod = (ProductItemStatementPeriod) obj2;
                                LocalDate from3 = productItemStatementPeriod.getFrom();
                                LocalDate to11 = productItemStatementPeriod.getTo();
                                if (filteringItemIds.contains(productItemStatementPeriod.getItemId()) && from3 != null && (to11 == null || to11.compareTo((ChronoLocalDate) from3) >= 0)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                Intrinsics.h(to10);
                                arrayList = zhm.u.c(new StatementPeriod(from2, to10));
                            } else {
                                arrayList = new ArrayList(zhm.w.t(arrayList3, 10));
                                for (ProductItemStatementPeriod productItemStatementPeriod2 : arrayList3) {
                                    LocalDate from4 = productItemStatementPeriod2.getFrom();
                                    if (from4 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    LocalDate to12 = productItemStatementPeriod2.getTo();
                                    if (to12 == null) {
                                        to12 = LocalDate.now();
                                    }
                                    Intrinsics.h(to12);
                                    arrayList.add(new StatementPeriod(from4, to12));
                                }
                            }
                        }
                        arrayList2.add(arrayList);
                    }
                    ArrayList arrayListU = zhm.w.u(arrayList2);
                    Iterator it9 = arrayListU.iterator();
                    if (!it9.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next = it9.next();
                    if (it9.hasNext()) {
                        LocalDate start2 = ((StatementPeriod) next).getStart();
                        while (true) {
                            Object next2 = it9.next();
                            LocalDate start3 = ((StatementPeriod) next2).getStart();
                            if (start2.compareTo((Object) start3) > 0) {
                                next = next2;
                                start2 = start3;
                            }
                            if (!it9.hasNext()) {
                                break;
                            }
                            productPeriodContent = productStatementPeriods;
                        }
                    }
                    LocalDate start4 = ((StatementPeriod) next).getStart();
                    Iterator it10 = arrayListU.iterator();
                    if (!it10.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next3 = it10.next();
                    if (it10.hasNext()) {
                        LocalDate end2 = ((StatementPeriod) next3).getEnd();
                        while (true) {
                            Object next4 = it10.next();
                            LocalDate end3 = ((StatementPeriod) next4).getEnd();
                            if (end2.compareTo((Object) end3) < 0) {
                                next3 = next4;
                                end2 = end3;
                            }
                            if (!it10.hasNext()) {
                                break;
                            }
                            productPeriodContent = productStatementPeriods;
                        }
                    }
                    LocalDate end4 = ((StatementPeriod) next3).getEnd();
                    if (availablePeriodType instanceof a) {
                        StatementPeriodType[] elements = {StatementPeriodType.ALL_TIME, StatementPeriodType.MONTH, StatementPeriodType.TAX_YEAR, StatementPeriodType.CUSTOM};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        setY0 = kotlin.collections.d.y0(elements);
                    } else {
                        if (!(availablePeriodType instanceof b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        setY0 = ((b) availablePeriodType).f157355a;
                    }
                    Set set = setY0;
                    int iB = q0.b(zhm.w.t(set, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    Iterator it11 = set.iterator();
                    while (it11.hasNext()) {
                        Object next5 = it11.next();
                        switch (f0.f157368a[((StatementPeriodType) next5).ordinal()]) {
                            case 1:
                                it8 = it11;
                                yVar = new y(new StatementPeriod(start4, end4));
                                break;
                            case 2:
                                it8 = it11;
                                if (statementPeriod != null) {
                                    LocalDate start5 = statementPeriod.getStart();
                                    LocalDate start6 = (start5.compareTo((Object) start4) < 0 || start5.compareTo((Object) end4) > 0) ? start4 : statementPeriod.getStart();
                                    LocalDate end5 = statementPeriod.getEnd();
                                    statementPeriod2 = new StatementPeriod(start6, (end5.compareTo((Object) start4) < 0 || end5.compareTo((Object) end4) > 0) ? end4 : statementPeriod.getEnd());
                                } else {
                                    statementPeriod2 = new StatementPeriod(start4, end4);
                                }
                                yVar = new a0(new StatementPeriod(start4, end4), statementPeriod2);
                                break;
                            case 3:
                                it8 = it11;
                                aim.e eVarA = bzd.a.a(new StatementPeriod(start4, end4));
                                yVar = new d0(eVarA, bzd.a.b(eVarA, statementPeriod));
                                break;
                            case 4:
                                it8 = it11;
                                TaxPeriod taxPeriod = productPeriodContent.getTaxPeriod();
                                boolean z3 = taxPeriod.getFrom().compareTo((ChronoLocalDate) taxPeriod.getTo()) < 0;
                                ArrayList arrayList4 = new ArrayList();
                                StatementPeriod statementPeriod4 = statementPeriod == null ? new StatementPeriod(end4, end4) : statementPeriod;
                                LocalDate start7 = end4;
                                LocalDate end6 = start7;
                                LocalDate localDate = start4;
                                while (localDate.compareTo((ChronoLocalDate) end4) <= 0) {
                                    LocalDate localDateWithYear = (!z3 && localDate.compareTo((ChronoLocalDate) taxPeriod.getTo().withYear(localDate.getYear())) > 0) ? taxPeriod.getTo().withYear(localDate.getYear() + 1) : taxPeriod.getTo().withYear(localDate.getYear());
                                    Intrinsics.h(localDateWithYear);
                                    StatementPeriod statementPeriod5 = new StatementPeriod(localDate, (LocalDate) kotlin.ranges.f.d(localDateWithYear, end4));
                                    arrayList4.add(statementPeriod5);
                                    LocalDate start8 = statementPeriod5.getStart();
                                    LocalDate end7 = statementPeriod5.getEnd();
                                    boolean z4 = z3;
                                    LocalDate end8 = statementPeriod4.getEnd();
                                    if (end8.compareTo((Object) start8) >= 0 && end8.compareTo((Object) end7) <= 0) {
                                        start7 = statementPeriod5.getStart();
                                        end6 = statementPeriod5.getEnd();
                                    }
                                    LocalDate localDateWithYear2 = statementPeriod5.getEnd().compareTo((ChronoLocalDate) taxPeriod.getFrom().withYear(localDate.getYear())) < 0 ? taxPeriod.getFrom().withYear(localDate.getYear()) : taxPeriod.getFrom().withYear(localDate.getYear() + 1);
                                    Intrinsics.h(localDateWithYear2);
                                    localDate = localDateWithYear2;
                                    z3 = z4;
                                }
                                yVar = new e0(taxPeriod, arrayList4, new StatementPeriod(start7, end6));
                                break;
                            case 5:
                                ArrayList arrayList5 = new ArrayList();
                                if (statementPeriod == null) {
                                    LocalDate localDateWithDayOfYear = end4.withDayOfYear(1);
                                    LocalDate localDateMinusYears = end4.withDayOfYear(1).minusYears(1L);
                                    LocalDate localDateMinusDays = localDateMinusYears.plusYears(1L).minusDays(1L);
                                    if (localDateWithDayOfYear.compareTo((ChronoLocalDate) start4) <= 0) {
                                        LocalDate localDateWithDayOfYear2 = end4.withDayOfYear(1);
                                        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfYear2, "withDayOfYear(...)");
                                        statementPeriod3 = new StatementPeriod(localDateWithDayOfYear2, end4);
                                    } else {
                                        Intrinsics.h(localDateMinusDays);
                                        statementPeriod3 = new StatementPeriod(localDateMinusYears, localDateMinusDays);
                                    }
                                } else {
                                    statementPeriod3 = statementPeriod;
                                }
                                LocalDate end9 = end4;
                                LocalDate localDateWithDayOfYear3 = start4;
                                LocalDate start9 = localDateWithDayOfYear3;
                                while (localDateWithDayOfYear3.compareTo((ChronoLocalDate) end4) <= 0) {
                                    LocalDate localDateWithDayOfYear4 = localDateWithDayOfYear3.withDayOfYear(localDateWithDayOfYear3.lengthOfYear());
                                    Intrinsics.checkNotNullExpressionValue(localDateWithDayOfYear4, "withDayOfYear(...)");
                                    StatementPeriod statementPeriod6 = new StatementPeriod(localDateWithDayOfYear3, (LocalDate) kotlin.ranges.f.d(localDateWithDayOfYear4, end4));
                                    arrayList5.add(statementPeriod6);
                                    LocalDate start10 = statementPeriod6.getStart();
                                    LocalDate end10 = statementPeriod6.getEnd();
                                    Iterator it12 = it11;
                                    LocalDate start11 = statementPeriod3.getStart();
                                    if (start11.compareTo((Object) start10) >= 0 && start11.compareTo((Object) end10) <= 0) {
                                        start9 = statementPeriod6.getStart();
                                    }
                                    LocalDate start12 = statementPeriod6.getStart();
                                    LocalDate end11 = statementPeriod6.getEnd();
                                    LocalDate end12 = statementPeriod3.getEnd();
                                    if (end12.compareTo((Object) start12) >= 0 && end12.compareTo((Object) end11) <= 0) {
                                        end9 = statementPeriod6.getEnd();
                                    }
                                    localDateWithDayOfYear3 = localDateWithDayOfYear3.plusYears(1L).withDayOfYear(1);
                                    Intrinsics.checkNotNullExpressionValue(localDateWithDayOfYear3, "withDayOfYear(...)");
                                    it11 = it12;
                                }
                                it8 = it11;
                                yVar = new z(arrayList5, new StatementPeriod(start9, end9));
                                break;
                            case 6:
                                LocalDate localDateNow = LocalDate.now();
                                ArrayList<StatementPeriod> arrayList6 = new ArrayList();
                                int i = 12;
                                LocalDate localDateOf = LocalDate.of(localDateNow.getYear() - 1, 12, 31);
                                if (start4.compareTo((ChronoLocalDate) localDateOf) > 0) {
                                    yVar = aVar;
                                } else {
                                    int year = start4.getYear();
                                    while (year <= localDateOf.getYear()) {
                                        LocalDate localDateOf2 = year == start4.getYear() ? start4 : LocalDate.of(year, 1, 1);
                                        LocalDate localDateOf3 = LocalDate.of(year, i, 31);
                                        Intrinsics.h(localDateOf2);
                                        Intrinsics.h(localDateOf3);
                                        arrayList6.add(new StatementPeriod(localDateOf2, (LocalDate) kotlin.ranges.f.d(localDateOf3, end4)));
                                        year++;
                                        i = 12;
                                    }
                                    if (statementPeriod != null) {
                                        start = start4;
                                        for (StatementPeriod statementPeriod7 : arrayList6) {
                                            LocalDate start13 = statementPeriod7.getStart();
                                            LocalDate end13 = statementPeriod7.getEnd();
                                            LocalDate start14 = statementPeriod.getStart();
                                            if (start14.compareTo((Object) start13) >= 0 && start14.compareTo((Object) end13) <= 0) {
                                                start = statementPeriod7.getStart();
                                            }
                                            LocalDate start15 = statementPeriod7.getStart();
                                            LocalDate end14 = statementPeriod7.getEnd();
                                            LocalDate end15 = statementPeriod.getEnd();
                                            if (end15.compareTo((Object) start15) >= 0 && end15.compareTo((Object) end14) <= 0) {
                                                localDateOf = statementPeriod7.getEnd();
                                            }
                                        }
                                    } else if (arrayList6.isEmpty()) {
                                        start = start4;
                                    } else {
                                        StatementPeriod statementPeriod8 = (StatementPeriod) zhm.d0.m0(arrayList6);
                                        start = statementPeriod8.getStart();
                                        localDateOf = statementPeriod8.getEnd();
                                    }
                                    Intrinsics.h(localDateOf);
                                    yVar = new c0(arrayList6, new StatementPeriod(start, localDateOf));
                                }
                                it8 = it11;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        linkedHashMap.put(next5, yVar);
                        productPeriodContent = productStatementPeriods;
                        it11 = it8;
                    }
                    return linkedHashMap;
                }
                productPeriodContent = productStatementPeriods;
            }
        }
        EnumEntries entries = StatementPeriodType.getEntries();
        int iB2 = q0.b(zhm.w.t(entries, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 < 16 ? 16 : iB2);
        for (Object obj3 : entries) {
            linkedHashMap2.put(obj3, aVar);
        }
        return linkedHashMap2;
    }
}
