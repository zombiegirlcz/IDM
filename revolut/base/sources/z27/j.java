package z27;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubAssessmentStep f318985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxHubCalendarEvent f318986b;

    public j(TaxHubAssessmentStep step, TaxHubCalendarEvent taxCalendarEvent) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(taxCalendarEvent, "taxCalendarEvent");
        this.f318985a = step;
        this.f318986b = taxCalendarEvent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f318985a, jVar.f318985a) && Intrinsics.f(this.f318986b, jVar.f318986b);
    }

    public final int hashCode() {
        return this.f318986b.hashCode() + (this.f318985a.hashCode() * 31);
    }
}
