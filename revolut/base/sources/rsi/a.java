package rsi;

import com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupMemberClickData f257079a;

    public a(GroupMemberClickData memberData) {
        Intrinsics.checkNotNullParameter(memberData, "memberData");
        this.f257079a = memberData;
    }

    @Override // rsi.f
    public final GroupMemberClickData a() {
        return this.f257079a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f257079a, ((a) obj2).f257079a);
    }

    public final int hashCode() {
        return this.f257079a.hashCode();
    }
}
