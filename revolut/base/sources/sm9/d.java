package sm9;

import com.revolut.feature.payees.api.models.PayeesTargetUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesTargetUser f264392a;

    public d(PayeesTargetUser targetUser) {
        Intrinsics.checkNotNullParameter(targetUser, "targetUser");
        this.f264392a = targetUser;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f264392a, ((d) obj2).f264392a);
    }

    public final int hashCode() {
        return this.f264392a.hashCode();
    }
}
