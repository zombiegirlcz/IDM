package ot3;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lot3/c0;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "facilityId", "c", "facilityType", "", "Ljava/util/Map;", "()Ljava/util/Map;", "additionalParams", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityId")
    private final String facilityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityType")
    private final String facilityType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalParams")
    private final Map<String, String> additionalParams;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getAdditionalParams() {
        return this.additionalParams;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFacilityType() {
        return this.facilityType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.facilityId, c0Var.facilityId) && Intrinsics.f(this.facilityType, c0Var.facilityType) && Intrinsics.f(this.additionalParams, c0Var.additionalParams);
    }

    public final int hashCode() {
        String str = this.facilityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.facilityType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.additionalParams;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
