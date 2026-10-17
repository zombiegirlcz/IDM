package zlj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumber f323287a;

    public c(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
        Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
        this.f323287a = esimSubscriptionPhoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f323287a, ((c) obj2).f323287a);
    }

    public final int hashCode() {
        return this.f323287a.hashCode();
    }
}
