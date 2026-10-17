package buf;

import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupMemberSettleInfo f18790a;

    public c1(GroupMemberSettleInfo memberInfo) {
        Intrinsics.checkNotNullParameter(memberInfo, "memberInfo");
        this.f18790a = memberInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f18790a, ((c1) obj2).f18790a);
    }

    public final int hashCode() {
        return this.f18790a.hashCode();
    }
}
