package ds6;

import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfileSchedule;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f117228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerTaxProfileSchedule f117229b;

    public c(j taxType, FreelancerTaxProfileSchedule schedulingOptions) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(schedulingOptions, "schedulingOptions");
        this.f117228a = taxType;
        this.f117229b = schedulingOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f117228a == cVar.f117228a && this.f117229b.equals(cVar.f117229b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f117229b.hashCode() + (this.f117228a.hashCode() * 31)) * 31);
    }
}
