package auc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Lauc/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getMaxAmount", "()J", "maxAmount", "", "b", "Ljava/lang/Boolean;", "getStreetModeEnabled", "()Ljava/lang/Boolean;", "streetModeEnabled", "c", "Ljava/lang/String;", "getDurationCode", "durationCode", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxAmount")
    private final long maxAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetModeEnabled")
    private final Boolean streetModeEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("durationCode")
    private final String durationCode;

    public d(long j2, Boolean bool, String str) {
        this.maxAmount = j2;
        this.streetModeEnabled = bool;
        this.durationCode = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.maxAmount == dVar.maxAmount && Intrinsics.f(this.streetModeEnabled, dVar.streetModeEnabled) && Intrinsics.f(this.durationCode, dVar.durationCode);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.maxAmount) * 31;
        Boolean bool = this.streetModeEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.durationCode;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
