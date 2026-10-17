package bt9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f18465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oq9.i f18466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do3.n f18467c;
    public final boolean d;

    public k(PaymentGroup group, oq9.i bill, do3.n user, boolean z) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(bill, "bill");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f18465a = group;
        this.f18466b = bill;
        this.f18467c = user;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f18465a, kVar.f18465a) && Intrinsics.f(this.f18466b, kVar.f18466b) && Intrinsics.f(this.f18467c, kVar.f18467c) && this.d == kVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f18467c.hashCode() + ((this.f18466b.hashCode() + (this.f18465a.hashCode() * 31)) * 31)) * 31);
    }
}
