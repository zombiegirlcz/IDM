package e6b;

import com.revolut.feature.checkout.models.CheckoutParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutParams.CardOrder f122963a;

    public c(CheckoutParams.CardOrder params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f122963a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f122963a, ((c) obj2).f122963a);
    }

    public final int hashCode() {
        return this.f122963a.hashCode();
    }
}
