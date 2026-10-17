package z27;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubAssessmentStep f319003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds6.q f319004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaxHubCalendarEvent f319005c;

    public y(TaxHubAssessmentStep step, ds6.q taxAuthority, TaxHubCalendarEvent taxCalendarEvent) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(taxAuthority, "taxAuthority");
        Intrinsics.checkNotNullParameter(taxCalendarEvent, "taxCalendarEvent");
        this.f319003a = step;
        this.f319004b = taxAuthority;
        this.f319005c = taxCalendarEvent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f319003a, yVar.f319003a) && Intrinsics.f(this.f319004b, yVar.f319004b) && Intrinsics.f(this.f319005c, yVar.f319005c);
    }

    public final int hashCode() {
        return this.f319005c.hashCode() + ((this.f319004b.hashCode() + (this.f319003a.hashCode() * 31)) * 31);
    }
}
