package qx1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0018\u0010\u000eR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001b"}, d2 = {"Lqx1/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "alias", "b", "e", "contactName", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "canBePayer", "d", "g", "identityType", "f", "identificationValue", "h", "issuingEntityName", "blockIncomingMoneyRequest", "i", "requestBlockingSupported", "contactChanged", "feature_apm_core_contacts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("alias")
    private final String alias;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactName")
    private final String contactName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("canBePayer")
    private final Boolean canBePayer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("identityType")
    private final String identityType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("identificationValue")
    private final String identificationValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("issuingEntityName")
    private final String issuingEntityName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("block_incoming_money_request")
    private final Boolean blockIncomingMoneyRequest;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("request_blocking_supported")
    private final Boolean requestBlockingSupported;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("contactChanged")
    private final Boolean contactChanged;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getBlockIncomingMoneyRequest() {
        return this.blockIncomingMoneyRequest;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getCanBePayer() {
        return this.canBePayer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getContactChanged() {
        return this.contactChanged;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getContactName() {
        return this.contactName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.alias, eVar.alias) && Intrinsics.f(this.contactName, eVar.contactName) && Intrinsics.f(this.canBePayer, eVar.canBePayer) && Intrinsics.f(this.identityType, eVar.identityType) && Intrinsics.f(this.identificationValue, eVar.identificationValue) && Intrinsics.f(this.issuingEntityName, eVar.issuingEntityName) && Intrinsics.f(this.blockIncomingMoneyRequest, eVar.blockIncomingMoneyRequest) && Intrinsics.f(this.requestBlockingSupported, eVar.requestBlockingSupported) && Intrinsics.f(this.contactChanged, eVar.contactChanged);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIdentificationValue() {
        return this.identificationValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getIdentityType() {
        return this.identityType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getIssuingEntityName() {
        return this.issuingEntityName;
    }

    public final int hashCode() {
        String str = this.alias;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contactName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.canBePayer;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.identityType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.identificationValue;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.issuingEntityName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.blockIncomingMoneyRequest;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.requestBlockingSupported;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.contactChanged;
        return iHashCode8 + (bool4 != null ? bool4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getRequestBlockingSupported() {
        return this.requestBlockingSupported;
    }
}
