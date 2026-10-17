package ara;

import com.revolut.feature.push_to_card.api.model.CardEligibility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardEligibility f8605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8606b;

    public k(CardEligibility data, String firstNineDigits) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(firstNineDigits, "firstNineDigits");
        this.f8605a = data;
        this.f8606b = firstNineDigits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f8605a, kVar.f8605a) && Intrinsics.f(this.f8606b, kVar.f8606b);
    }

    public final int hashCode() {
        return this.f8606b.hashCode() + (this.f8605a.hashCode() * 31);
    }
}
