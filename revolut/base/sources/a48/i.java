package a48;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\r\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0005\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006!"}, d2 = {"La48/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "d", "state", "", "La48/d;", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "users", "", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "isVulnerable", "La48/c;", "La48/c;", "()La48/c;", "inviteDetail", "", "f", "J", "()J", "expiresAt", "workflowId", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("users")
    @NotNull
    private final List<d> users;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("isVulnerable")
    private final Boolean isVulnerable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("details")
    private final c inviteDetail;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("expiresAt")
    private final long expiresAt;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("workflowId")
    private final String workflowId;

    public i(String id10, String state, ArrayList users, Boolean bool, c cVar, long j2, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(users, "users");
        this.id = id10;
        this.state = state;
        this.users = users;
        this.isVulnerable = bool;
        this.inviteDetail = cVar;
        this.expiresAt = j2;
        this.workflowId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getInviteDetail() {
        return this.inviteDetail;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getUsers() {
        return this.users;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.state, iVar.state) && Intrinsics.f(this.users, iVar.users) && Intrinsics.f(this.isVulnerable, iVar.isVulnerable) && Intrinsics.f(this.inviteDetail, iVar.inviteDetail) && this.expiresAt == iVar.expiresAt && Intrinsics.f(this.workflowId, iVar.workflowId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getIsVulnerable() {
        return this.isVulnerable;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.users);
        Boolean bool = this.isVulnerable;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        c cVar = this.inviteDetail;
        int iC = a0.d.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.expiresAt);
        String str = this.workflowId;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
