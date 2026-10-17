package a48;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0012"}, d2 = {"La48/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "memberId", "b", "d", "walletId", "", "La48/e;", "c", "Ljava/util/List;", "()Ljava/util/List;", "members", "state", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("memberId")
    @NotNull
    private final String memberId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("walletId")
    @NotNull
    private final String walletId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("members")
    @NotNull
    private final List<e> members;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    public a(String memberId, String walletId, String str, ArrayList members) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(members, "members");
        this.memberId = memberId;
        this.walletId = walletId;
        this.members = members;
        this.state = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getMembers() {
        return this.members;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.memberId, aVar.memberId) && Intrinsics.f(this.walletId, aVar.walletId) && Intrinsics.f(this.members, aVar.members) && Intrinsics.f(this.state, aVar.state);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.memberId.hashCode() * 31, 31, this.walletId), 31, this.members);
        String str = this.state;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
