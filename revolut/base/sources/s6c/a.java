package s6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment.ExpandableDisclaimerConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f260213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExpandableDisclaimerConfiguration f260214b;

    public a(b breakdownAction, ExpandableDisclaimerConfiguration expandableDisclaimerAction) {
        Intrinsics.checkNotNullParameter(breakdownAction, "breakdownAction");
        Intrinsics.checkNotNullParameter(expandableDisclaimerAction, "expandableDisclaimerAction");
        this.f260213a = breakdownAction;
        this.f260214b = expandableDisclaimerAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f260213a, aVar.f260213a) && Intrinsics.f(this.f260214b, aVar.f260214b);
    }

    public final int hashCode() {
        return this.f260214b.hashCode() + (this.f260213a.hashCode() * 31);
    }
}
