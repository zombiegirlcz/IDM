package vr9;

import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f291533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GroupMemberSettleInfo f291534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f291535c;

    public p(l type, GroupMemberSettleInfo memberInfo, List settleMembers) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(memberInfo, "memberInfo");
        Intrinsics.checkNotNullParameter(settleMembers, "settleMembers");
        this.f291533a = type;
        this.f291534b = memberInfo;
        this.f291535c = settleMembers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f291533a, pVar.f291533a) && Intrinsics.f(this.f291534b, pVar.f291534b) && Intrinsics.f(this.f291535c, pVar.f291535c);
    }

    public final int hashCode() {
        return this.f291535c.hashCode() + ((this.f291534b.hashCode() + (this.f291533a.hashCode() * 31)) * 31);
    }
}
