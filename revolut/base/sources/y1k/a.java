package y1k;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.shared.recurring_payments.models.RecurringPaymentEndCriteria;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import ibd.h;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import jli.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n68.w;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import prf.f;
import q2k.e;
import qua.p;
import ufm.i;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
public interface a {
    static i a(a aVar, final String str, final String beneficiaryId, final b sourceCurrency, final b targetCurrency, final long j2, final long j3, final long j5, final c scheduledPeriod, final TransferScheduleEndsOn endsOn, final String str2, final f fVar, final UltimateDebtor ultimateDebtor, final rtf.c cVar, final kq2.c cVar2, final Map map, FundingSource fundingSource) {
        e eVar = (e) aVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(scheduledPeriod, "scheduledPeriod");
        Intrinsics.checkNotNullParameter(endsOn, "endsOn");
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        i iVar = new i(new ufm.c(new Callable() { // from class: q2k.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                RecurringPaymentEndCriteria.Date date;
                LocalDate localDateI = jli.b.i(oc.c.I(j5));
                String str3 = str;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                h hVar = h.EXTERNAL;
                jli.c cVar3 = scheduledPeriod;
                Period periodL = jli.e.l(cVar3);
                TransferScheduleEndsOn transferScheduleEndsOn = endsOn;
                if (transferScheduleEndsOn instanceof TransferScheduleEndsOn.Date) {
                    date = new RecurringPaymentEndCriteria.Date(oc.c.I(((TransferScheduleEndsOn.Date) transferScheduleEndsOn).f104288a));
                } else {
                    if (!Intrinsics.f(transferScheduleEndsOn, TransferScheduleEndsOn.Never.f104289a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    date = null;
                }
                ibd.e eVar2 = new ibd.e(str4, periodL, hVar, null, localDateI, null, null, null, date, null, null, 1768);
                xi0.b bVar = sourceCurrency;
                String str5 = bVar.f306286a;
                String str6 = targetCurrency.f306286a;
                dj0.d dVar = new dj0.d(j3, bVar);
                String str7 = str2;
                String str8 = str7 == null ? null : str7;
                krf.c cVarI = mra.d.i(cVar);
                int i = d.f241735a[cVar3.ordinal()];
                int dayOfWeek = 1;
                if (i == 1) {
                    dayOfWeek = localDateI.getDayOfWeek();
                } else if (i == 2) {
                    dayOfWeek = localDateI.getDayOfMonth();
                }
                return new p(eVar2, ibd.f.ACTIVE, beneficiaryId, null, null, null, dVar, str5, str6, Long.valueOf(j2), null, null, str8, fVar, cVarI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, dayOfWeek, null, null, null, null, null, cVar2, null, map, null, null, ultimateDebtor, null, null, null, null, null, null, null, null, null, null, null, null, -29648, 33549661);
            }
        }, 2), new q09.c(26, new w((Object) eVar, str, (Serializable) cVar, (Object) fundingSource, 29)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        i iVar2 = new i(iVar, new q09.c(28, new q2k.b(eVar, sourceCurrency, accountId, beneficiaryId, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
