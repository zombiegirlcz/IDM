package if6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0016"}, d2 = {"Lif6/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "pockets", "b", "c", "loans", "d", "permissions", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expiresAt", "Ljava/lang/String;", "jointDataSharingConsentState", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pockets")
    @NotNull
    private final List<String> pockets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("loans")
    @NotNull
    private final List<String> loans;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("permissions")
    @NotNull
    private final List<String> permissions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiresAt")
    private final Long expiresAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("jointObaDataSharingConsentState")
    private final String jointDataSharingConsentState;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getJointDataSharingConsentState() {
        return this.jointDataSharingConsentState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getLoans() {
        return this.loans;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getPermissions() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getPockets() {
        return this.pockets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.pockets, aVar.pockets) && Intrinsics.f(this.loans, aVar.loans) && Intrinsics.f(this.permissions, aVar.permissions) && Intrinsics.f(this.expiresAt, aVar.expiresAt) && Intrinsics.f(this.jointDataSharingConsentState, aVar.jointDataSharingConsentState);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.pockets.hashCode() * 31, 31, this.loans), 31, this.permissions);
        Long l2 = this.expiresAt;
        int iHashCode = (iD + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.jointDataSharingConsentState;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
