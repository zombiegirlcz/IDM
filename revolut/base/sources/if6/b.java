package if6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018¨\u0006$"}, d2 = {"Lif6/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "l", "type", "c", "j", "state", "d", "authorisedDate", "expiryDate", "f", "i", "revokedDate", "", "g", "Ljava/util/List;", "()Ljava/util/List;", "permissions", "Lif6/e;", "h", "Lif6/e;", "k", "()Lif6/e;", "thirdParty", "pockets", "loans", "amendedDate", "amendedData", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("authorisedDate")
    private final String authorisedDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("expiryDate")
    private final String expiryDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("revokedDate")
    private final String revokedDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("permissions")
    @NotNull
    private final List<String> permissions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("thirdParty")
    @NotNull
    private final e thirdParty;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("pockets")
    @NotNull
    private final List<String> pockets;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("loans")
    @NotNull
    private final List<String> loans;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("amendedDate")
    private final String amendedDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("amendedData")
    private final List<String> amendedData;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAmendedData() {
        return this.amendedData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAmendedDate() {
        return this.amendedDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAuthorisedDate() {
        return this.authorisedDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.authorisedDate, bVar.authorisedDate) && Intrinsics.f(this.expiryDate, bVar.expiryDate) && Intrinsics.f(this.revokedDate, bVar.revokedDate) && Intrinsics.f(this.permissions, bVar.permissions) && Intrinsics.f(this.thirdParty, bVar.thirdParty) && Intrinsics.f(this.pockets, bVar.pockets) && Intrinsics.f(this.loans, bVar.loans) && Intrinsics.f(this.amendedDate, bVar.amendedDate) && Intrinsics.f(this.amendedData, bVar.amendedData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getLoans() {
        return this.loans;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getPermissions() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getPockets() {
        return this.pockets;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.state);
        String str = this.authorisedDate;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expiryDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.revokedDate;
        int iD = p.a.d(p.a.d((this.thirdParty.hashCode() + p.a.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.permissions)) * 31, 31, this.pockets), 31, this.loans);
        String str4 = this.amendedDate;
        int iHashCode3 = (iD + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.amendedData;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRevokedDate() {
        return this.revokedDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final e getThirdParty() {
        return this.thirdParty;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
