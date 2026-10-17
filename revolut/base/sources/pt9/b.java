package pt9;

import aii.r;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f239633a;

    public b(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f239633a = group;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f239633a, ((b) obj2).f239633a);
    }

    public final int hashCode() {
        return this.f239633a.hashCode();
    }
}
