package s95;

import dj0.d;
import f95.c;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f261114a = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static final c a(r95.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String facilityId = aVar.getFacilityId();
        boolean isUserSalaried = aVar.getIsUserSalaried();
        boolean isLimitOverWarningThreshold = aVar.getIsLimitOverWarningThreshold();
        boolean isLimitExceeded = aVar.getIsLimitExceeded();
        boolean isRestricted = aVar.getIsRestricted();
        boolean isTerminated = aVar.getIsTerminated();
        long amount = aVar.getSpentAmount().getAmount();
        xi0.a aVar2 = b.Companion;
        String currency = aVar.getSpentAmount().getCurrency();
        aVar2.getClass();
        d dVar = new d(amount, xi0.a.a(currency));
        d dVar2 = new d(aVar.getLimitAmount().getAmount(), xi0.a.a(aVar.getLimitAmount().getCurrency()));
        String apr = aVar.getApr();
        d dVar3 = new d(aVar.getAccruedChargesAmount().getAmount(), xi0.a.a(aVar.getAccruedChargesAmount().getCurrency()));
        String nextInterestChargeDate = aVar.getNextInterestChargeDate();
        DateTimeFormatter dateTimeFormatter = f261114a;
        LocalDate localDate = nextInterestChargeDate != null ? LocalDate.parse(nextInterestChargeDate, dateTimeFormatter) : null;
        String overdraftTimeLimitDueDate = aVar.getOverdraftTimeLimitDueDate();
        return new c(facilityId, isUserSalaried, isLimitOverWarningThreshold, isLimitExceeded, isRestricted, isTerminated, dVar, dVar2, apr, dVar3, localDate, overdraftTimeLimitDueDate != null ? LocalDate.parse(overdraftTimeLimitDueDate, dateTimeFormatter) : null);
    }
}
