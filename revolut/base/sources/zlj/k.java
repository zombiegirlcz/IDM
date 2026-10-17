package zlj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumber f323295a;

    public k(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
        Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
        this.f323295a = esimSubscriptionPhoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f323295a, ((k) obj2).f323295a);
    }

    public final int hashCode() {
        return this.f323295a.hashCode();
    }
}
