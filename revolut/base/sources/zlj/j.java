package zlj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumber f323294a;

    public j(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
        Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
        this.f323294a = esimSubscriptionPhoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f323294a, ((j) obj2).f323294a);
    }

    public final int hashCode() {
        return this.f323294a.hashCode();
    }
}
