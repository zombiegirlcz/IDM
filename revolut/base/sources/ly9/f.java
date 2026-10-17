package ly9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f200760a;

    public f(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f200760a = group;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f200760a, ((f) obj2).f200760a);
    }

    public final int hashCode() {
        return this.f200760a.hashCode();
    }
}
