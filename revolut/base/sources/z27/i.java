package z27;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubAssessmentStep f318983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxHubCalendarEvent f318984b;

    public i(TaxHubAssessmentStep step, TaxHubCalendarEvent taxCalendarEvent) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(taxCalendarEvent, "taxCalendarEvent");
        this.f318983a = step;
        this.f318984b = taxCalendarEvent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f318983a, iVar.f318983a) && Intrinsics.f(this.f318984b, iVar.f318984b);
    }

    public final int hashCode() {
        return this.f318984b.hashCode() + (this.f318983a.hashCode() * 31);
    }
}
