package zlj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumber f323289a;

    public e(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
        Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
        this.f323289a = esimSubscriptionPhoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f323289a, ((e) obj2).f323289a);
    }

    public final int hashCode() {
        return this.f323289a.hashCode();
    }
}
