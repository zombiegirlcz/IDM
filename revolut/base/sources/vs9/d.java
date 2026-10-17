package vs9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f291748a;

    public d(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f291748a = group;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f291748a, ((d) obj2).f291748a);
    }

    public final int hashCode() {
        return this.f291748a.hashCode();
    }
}
