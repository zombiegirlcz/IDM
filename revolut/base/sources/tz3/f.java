package tz3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Ltz3/f;", "", "", "toString", "()Ljava/lang/String;", "", "Ltz3/k;", "a", "Ljava/util/List;", "()Ljava/util/List;", "mandatoryReferralFlagsDetails", "b", "c", "optionalReferralFlagsDetails", "Ltz3/j;", "Ltz3/j;", "()Ltz3/j;", "optionalDocumentsContent", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("primary")
    private final List<k> mandatoryReferralFlagsDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("additional")
    private final List<k> optionalReferralFlagsDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalDocumentsContent")
    private final j optionalDocumentsContent;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getMandatoryReferralFlagsDetails() {
        return this.mandatoryReferralFlagsDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j getOptionalDocumentsContent() {
        return this.optionalDocumentsContent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getOptionalReferralFlagsDetails() {
        return this.optionalReferralFlagsDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.mandatoryReferralFlagsDetails, fVar.mandatoryReferralFlagsDetails) && Intrinsics.f(this.optionalReferralFlagsDetails, fVar.optionalReferralFlagsDetails) && Intrinsics.f(this.optionalDocumentsContent, fVar.optionalDocumentsContent);
    }

    public final int hashCode() {
        List<k> list = this.mandatoryReferralFlagsDetails;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<k> list2 = this.optionalReferralFlagsDetails;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        j jVar = this.optionalDocumentsContent;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }
}
