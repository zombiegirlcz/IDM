package yu7;

import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsurancePortal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f316900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SchemeInsurancePortal f316901b;

    public g(List eligibleCardsIds, SchemeInsurancePortal website) {
        Intrinsics.checkNotNullParameter(eligibleCardsIds, "eligibleCardsIds");
        Intrinsics.checkNotNullParameter(website, "website");
        this.f316900a = eligibleCardsIds;
        this.f316901b = website;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f316900a, gVar.f316900a) && Intrinsics.f(this.f316901b, gVar.f316901b);
    }

    public final int hashCode() {
        return this.f316901b.hashCode() + (this.f316900a.hashCode() * 31);
    }
}
