package xq4;

import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDescriptionDestination.DescriptionConfig.Local f308106a;

    public d(CreditCardDescriptionDestination.DescriptionConfig.Local config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f308106a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f308106a, ((d) obj2).f308106a);
    }

    public final int hashCode() {
        return this.f308106a.hashCode();
    }
}
