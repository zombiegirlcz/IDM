package ti8;

import com.revolut.feature.junior_payment_links.api.navigation.JuniorPaymentLinksConsentInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorPaymentLinksConsentInput f271446a;

    public c(JuniorPaymentLinksConsentInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f271446a = input;
    }

    public final JuniorPaymentLinksConsentInput b() {
        return this.f271446a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f271446a, ((c) obj2).f271446a);
    }

    public final int hashCode() {
        return this.f271446a.hashCode();
    }
}
