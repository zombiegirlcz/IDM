package aj7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Laj7/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "c", "description", "e", "merchantLogoUrl", "", "J", "()J", "createdDate", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "claimedAmount", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantLogoUrl")
    private final String merchantLogoUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("claimedAmount")
    @NotNull
    private final jo3.b claimedAmount;

    public j(String id10, String description, String str, long j2, jo3.b claimedAmount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(claimedAmount, "claimedAmount");
        this.id = id10;
        this.description = description;
        this.merchantLogoUrl = str;
        this.createdDate = j2;
        this.claimedAmount = claimedAmount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getClaimedAmount() {
        return this.claimedAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.id, jVar.id) && Intrinsics.f(this.description, jVar.description) && Intrinsics.f(this.merchantLogoUrl, jVar.merchantLogoUrl) && this.createdDate == jVar.createdDate && Intrinsics.f(this.claimedAmount, jVar.claimedAmount);
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.description);
        String str = this.merchantLogoUrl;
        return this.claimedAmount.hashCode() + a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.createdDate);
    }
}
