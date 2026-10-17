package qzf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0013"}, d2 = {"Lqzf/x;", "", "", "toString", "()Ljava/lang/String;", "Lqzf/a0;", "a", "Lqzf/a0;", "c", "()Lqzf/a0;", "location", "b", "Ljava/lang/String;", "description", "e", "minDuration", "d", "maxDuration", "admissionIncluded", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("location")
    @NotNull
    private final a0 location;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minDuration")
    private final String minDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxDuration")
    private final String maxDuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("admissionIncluded")
    private final String admissionIncluded;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdmissionIncluded() {
        return this.admissionIncluded;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a0 getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMaxDuration() {
        return this.maxDuration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMinDuration() {
        return this.minDuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.location, xVar.location) && Intrinsics.f(this.description, xVar.description) && Intrinsics.f(this.minDuration, xVar.minDuration) && Intrinsics.f(this.maxDuration, xVar.maxDuration) && Intrinsics.f(this.admissionIncluded, xVar.admissionIncluded);
    }

    public final int hashCode() {
        int iHashCode = this.location.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.minDuration;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxDuration;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.admissionIncluded;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
