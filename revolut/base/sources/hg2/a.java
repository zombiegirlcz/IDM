package hg2;

import com.revolut.feature.apm.core.models.alias.beneficiary.AliasMerchant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasMerchant f152064a;

    public a(AliasMerchant destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f152064a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f152064a, ((a) obj2).f152064a);
    }

    public final int hashCode() {
        return this.f152064a.hashCode();
    }
}
