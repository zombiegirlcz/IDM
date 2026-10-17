package zp9;

import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitMemberType f324214a;

    public u(SplitMemberType member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f324214a = member;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f324214a, ((u) obj2).f324214a);
    }

    public final int hashCode() {
        return this.f324214a.hashCode();
    }
}
