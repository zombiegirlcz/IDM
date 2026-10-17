package zlj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumber f323292a;

    public h(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
        Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
        this.f323292a = esimSubscriptionPhoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f323292a, ((h) obj2).f323292a);
    }

    public final int hashCode() {
        return this.f323292a.hashCode();
    }
}
