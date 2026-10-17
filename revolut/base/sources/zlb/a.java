package zlb;

import com.revolut.feature.shared.savings.models.product.OnboardingConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OnboardingConfig f323210b;

    public a(List products, OnboardingConfig onboardingConfig) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.f323209a = products;
        this.f323210b = onboardingConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f323209a, aVar.f323209a) && Intrinsics.f(this.f323210b, aVar.f323210b);
    }

    public final int hashCode() {
        int iHashCode = this.f323209a.hashCode() * 31;
        OnboardingConfig onboardingConfig = this.f323210b;
        return iHashCode + (onboardingConfig == null ? 0 : onboardingConfig.hashCode());
    }
}
