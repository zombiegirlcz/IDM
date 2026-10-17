package ds6;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubCalendarEvent f117246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f117247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaxHubAssessmentStep f117248c;

    public m(TaxHubCalendarEvent calendarEvent, q taxAuthority) {
        Object next;
        Intrinsics.checkNotNullParameter(calendarEvent, "calendarEvent");
        Intrinsics.checkNotNullParameter(taxAuthority, "taxAuthority");
        this.f117246a = calendarEvent;
        this.f117247b = taxAuthority;
        Iterator it8 = calendarEvent.f73488j.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((TaxHubAssessmentStep) next).f73482c == n.ACTIVE) {
                    break;
                }
            }
        }
        this.f117248c = (TaxHubAssessmentStep) next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f117246a, mVar.f117246a) && Intrinsics.f(this.f117247b, mVar.f117247b);
    }

    public final int hashCode() {
        return this.f117247b.hashCode() + (this.f117246a.hashCode() * 31);
    }
}
