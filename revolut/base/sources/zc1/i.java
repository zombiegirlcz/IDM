package zc1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lzc1/i;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "managementEnabled", "Ljava/lang/String;", "defaultTaxRateId", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("managementEnabled")
    private final boolean managementEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultTaxRateId")
    private final String defaultTaxRateId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDefaultTaxRateId() {
        return this.defaultTaxRateId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getManagementEnabled() {
        return this.managementEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.managementEnabled == iVar.managementEnabled && Intrinsics.f(this.defaultTaxRateId, iVar.defaultTaxRateId);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.managementEnabled) * 31;
        String str = this.defaultTaxRateId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
