package l8a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u001d"}, d2 = {"Ll8a/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "value", "b", "i", "type", "c", "h", "status", "d", "portabilityExpiryDate", "e", "portabilityCreationDate", "f", "g", "portabilityRole", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "portabilityCanFinish", "portabilityAcceptClaimDeadlineDate", "portabilityOperationId", "portabilityInstitutionName", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("portabilityExpiryDate")
    private final String portabilityExpiryDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("portabilityCreationDate")
    private final String portabilityCreationDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("portabilityRole")
    private final String portabilityRole;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("portabilityCanFinish")
    private final Boolean portabilityCanFinish;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("portabilityAcceptClaimDeadlineDate")
    private final String portabilityAcceptClaimDeadlineDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("portabilityOperationId")
    private final String portabilityOperationId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("portabilityInstitutionName")
    private final String portabilityInstitutionName;

    public u(Boolean bool, String value, String type, String status, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        this.value = value;
        this.type = type;
        this.status = status;
        this.portabilityExpiryDate = str;
        this.portabilityCreationDate = str2;
        this.portabilityRole = str3;
        this.portabilityCanFinish = bool;
        this.portabilityAcceptClaimDeadlineDate = str4;
        this.portabilityOperationId = str5;
        this.portabilityInstitutionName = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPortabilityAcceptClaimDeadlineDate() {
        return this.portabilityAcceptClaimDeadlineDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getPortabilityCanFinish() {
        return this.portabilityCanFinish;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPortabilityCreationDate() {
        return this.portabilityCreationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPortabilityExpiryDate() {
        return this.portabilityExpiryDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPortabilityInstitutionName() {
        return this.portabilityInstitutionName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.value, uVar.value) && Intrinsics.f(this.type, uVar.type) && Intrinsics.f(this.status, uVar.status) && Intrinsics.f(this.portabilityExpiryDate, uVar.portabilityExpiryDate) && Intrinsics.f(this.portabilityCreationDate, uVar.portabilityCreationDate) && Intrinsics.f(this.portabilityRole, uVar.portabilityRole) && Intrinsics.f(this.portabilityCanFinish, uVar.portabilityCanFinish) && Intrinsics.f(this.portabilityAcceptClaimDeadlineDate, uVar.portabilityAcceptClaimDeadlineDate) && Intrinsics.f(this.portabilityOperationId, uVar.portabilityOperationId) && Intrinsics.f(this.portabilityInstitutionName, uVar.portabilityInstitutionName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPortabilityOperationId() {
        return this.portabilityOperationId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPortabilityRole() {
        return this.portabilityRole;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.value.hashCode() * 31, 31, this.type), 31, this.status);
        String str = this.portabilityExpiryDate;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.portabilityCreationDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.portabilityRole;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.portabilityCanFinish;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.portabilityAcceptClaimDeadlineDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.portabilityOperationId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.portabilityInstitutionName;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
