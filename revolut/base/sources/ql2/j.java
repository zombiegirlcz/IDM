package ql2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lql2/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "Lql2/g;", "b", "Lql2/g;", "()Lql2/g;", "restrictedAmount", "Lql2/i;", "Lql2/i;", "()Lql2/i;", "detailedInfo", "feature_backend_driven_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("restrictedFunds")
    @NotNull
    private final g restrictedAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("detailedInfo")
    @NotNull
    private final i detailedInfo;

    public j(String title, g restrictedAmount, i detailedInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(restrictedAmount, "restrictedAmount");
        Intrinsics.checkNotNullParameter(detailedInfo, "detailedInfo");
        this.title = title;
        this.restrictedAmount = restrictedAmount;
        this.detailedInfo = detailedInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i getDetailedInfo() {
        return this.detailedInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getRestrictedAmount() {
        return this.restrictedAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.title, jVar.title) && Intrinsics.f(this.restrictedAmount, jVar.restrictedAmount) && Intrinsics.f(this.detailedInfo, jVar.detailedInfo);
    }

    public final int hashCode() {
        return this.detailedInfo.hashCode() + ((this.restrictedAmount.hashCode() + (this.title.hashCode() * 31)) * 31);
    }
}
