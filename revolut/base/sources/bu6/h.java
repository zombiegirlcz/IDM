package bu6;

import com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatReminder;
import java.time.Month;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ps6.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final fs6.b a(String str) {
        fs6.b bVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        fs6.b[] bVarArrValues = fs6.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (a0.z(bVar.name(), str, true)) {
                break;
            }
            i++;
        }
        return bVar == null ? fs6.b.UNKNOWN : bVar;
    }

    public static final FreelancerVatReminder b(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f239411a;
        boolean z = jVar.f239412b;
        fs6.b bVarA = a(jVar.f239413c);
        Integer num = jVar.d;
        return new FreelancerVatReminder(str, z, bVarA, num != null ? Month.of(num.intValue()) : null);
    }

    public static final FreelancerVatReminder c(yt6.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String id10 = bVar.getId();
        boolean enabled = bVar.getEnabled();
        fs6.b bVarA = a(bVar.getAssessmentPeriod());
        Integer closingMonth = bVar.getClosingMonth();
        return new FreelancerVatReminder(id10, enabled, bVarA, closingMonth != null ? Month.of(closingMonth.intValue()) : null);
    }

    public static final j d(FreelancerVatReminder freelancerVatReminder) {
        Intrinsics.checkNotNullParameter(freelancerVatReminder, "<this>");
        String str = freelancerVatReminder.f73497a;
        boolean z = freelancerVatReminder.f73498b;
        String strName = freelancerVatReminder.f73499c.name();
        Month month = freelancerVatReminder.d;
        return new j(month != null ? Integer.valueOf(month.getValue()) : null, str, strName, z);
    }
}
