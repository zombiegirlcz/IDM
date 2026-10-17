package n3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, d2 = {"Ln3f/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "refundType", "b", "description", "", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "startedAt", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "autoTopup", "spareChange", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundType")
    private final String refundType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("startedAt")
    private final Long startedAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("autoTopup")
    private final Boolean autoTopup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("spareChange")
    private final Boolean spareChange;

    public v(String str, String str2, Long l2, Boolean bool, Boolean bool2) {
        this.refundType = str;
        this.description = str2;
        this.startedAt = l2;
        this.autoTopup = bool;
        this.spareChange = bool2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getAutoTopup() {
        return this.autoTopup;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRefundType() {
        return this.refundType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getSpareChange() {
        return this.spareChange;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.refundType, vVar.refundType) && Intrinsics.f(this.description, vVar.description) && Intrinsics.f(this.startedAt, vVar.startedAt) && Intrinsics.f(this.autoTopup, vVar.autoTopup) && Intrinsics.f(this.spareChange, vVar.spareChange);
    }

    public final int hashCode() {
        String str = this.refundType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.startedAt;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.autoTopup;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.spareChange;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
