package vdd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Lvdd/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "vaultName", "c", "currency", "Lvdd/k;", "d", "Lvdd/k;", "()Lvdd/k;", "invitee", "", "Ljava/util/List;", "()Ljava/util/List;", "members", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("vaultName")
    @NotNull
    private final String vaultName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("invitee")
    @NotNull
    private final k invitee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("members")
    @NotNull
    private final List<k> members;

    public j(String id10, String vaultName, String currency, k invitee, ArrayList members) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(vaultName, "vaultName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        Intrinsics.checkNotNullParameter(members, "members");
        this.id = id10;
        this.vaultName = vaultName;
        this.currency = currency;
        this.invitee = invitee;
        this.members = members;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getInvitee() {
        return this.invitee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getMembers() {
        return this.members;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getVaultName() {
        return this.vaultName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.id, jVar.id) && Intrinsics.f(this.vaultName, jVar.vaultName) && Intrinsics.f(this.currency, jVar.currency) && Intrinsics.f(this.invitee, jVar.invitee) && Intrinsics.f(this.members, jVar.members);
    }

    public final int hashCode() {
        return this.members.hashCode() + ((this.invitee.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.vaultName), 31, this.currency)) * 31);
    }
}
