package zdd;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\r\u0010\u0013R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\t\u0010\u0017¨\u0006\u0019"}, d2 = {"Lzdd/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "vaultId", "b", "e", "vaultName", "Lzdd/l;", "c", "Lzdd/l;", "()Lzdd/l;", "invitee", "Lzdd/p;", "Lzdd/p;", "()Lzdd/p;", "pocket", "", "Ljava/util/List;", "()Ljava/util/List;", "members", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String vaultId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String vaultName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("admin")
    @NotNull
    private final l invitee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pocket")
    @NotNull
    private final p pocket;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("members")
    @NotNull
    private final List<l> members;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getInvitee() {
        return this.invitee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getMembers() {
        return this.members;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final p getPocket() {
        return this.pocket;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVaultId() {
        return this.vaultId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getVaultName() {
        return this.vaultName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.vaultId, oVar.vaultId) && Intrinsics.f(this.vaultName, oVar.vaultName) && Intrinsics.f(this.invitee, oVar.invitee) && Intrinsics.f(this.pocket, oVar.pocket) && Intrinsics.f(this.members, oVar.members);
    }

    public final int hashCode() {
        return this.members.hashCode() + ((this.pocket.hashCode() + ((this.invitee.hashCode() + p.a.c(this.vaultId.hashCode() * 31, 31, this.vaultName)) * 31)) * 31);
    }
}
