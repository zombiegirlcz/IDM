package fm1;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import dj0.d;
import em1.a;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final Biller a(em1.a aVar) {
        cm1.a aVar2;
        String str;
        String str2;
        cm1.a aVar3;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        String name = aVar.getName();
        if (name == null) {
            name = "";
        }
        String estimatedArrival = aVar.getEstimatedArrival();
        String frequency = aVar.getFrequency();
        Biller.Details details = null;
        if (frequency != null) {
            cm1.a[] aVarArrValues = cm1.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar3 = null;
                    break;
                }
                aVar3 = aVarArrValues[i];
                if (a0.z(aVar3.name(), frequency, true)) {
                    break;
                }
                i++;
            }
            aVar2 = aVar3;
        } else {
            aVar2 = null;
        }
        String dueDate = aVar.getDueDate();
        LocalDate localDate = dueDate != null ? LocalDate.parse(dueDate, DateTimeFormatter.ofPattern("yyyy-MM-dd")) : null;
        String logoUrl = aVar.getLogoUrl();
        jo3.a amount = aVar.getAmount();
        d dVarO = amount != null ? mo3.a.o(amount) : null;
        boolean zJ = pd.b.j(aVar.getIsNewPayment());
        boolean zJ2 = pd.b.j(aVar.getIsReferenceKnown());
        boolean zJ3 = pd.b.j(aVar.getPrioritized());
        a.C0735a details2 = aVar.getDetails();
        if (details2 != null) {
            String id11 = details2.getId();
            if (id11 == null) {
                m70.a.c(t0.f186434a);
                str = "";
            } else {
                str = id11;
            }
            String shortName = details2.getShortName();
            if (shortName == null) {
                m70.a.c(t0.f186434a);
                str2 = "";
            } else {
                str2 = shortName;
            }
            details = new Biller.Details(str, str2, details2.getUserLabel(), details2.getInstitutionCode(), pd.b.j(details2.getIsPostpaidPhoneProvider()));
        }
        return new Biller(id10, name, estimatedArrival, aVar2, localDate, dVarO, logoUrl, zJ, zJ2, zJ3, details);
    }
}
