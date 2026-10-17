package os9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f229270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do3.n f229271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f229272c;

    public k(PaymentGroup group, do3.n user, List remindersInvite) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(remindersInvite, "remindersInvite");
        this.f229270a = group;
        this.f229271b = user;
        this.f229272c = remindersInvite;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f229270a, kVar.f229270a) && Intrinsics.f(this.f229271b, kVar.f229271b) && Intrinsics.f(this.f229272c, kVar.f229272c);
    }

    public final int hashCode() {
        return this.f229272c.hashCode() + ((this.f229271b.hashCode() + (this.f229270a.hashCode() * 31)) * 31);
    }
}
