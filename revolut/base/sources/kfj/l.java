package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\f¨\u0006\u0018"}, d2 = {"Lkfj/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "simProfileId", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "estimatedConnectivitySetupFinalisationDate", "c", "portingScheduledDate", "", "d", "Z", "()Z", "reissueAvailable", "e", "reissueRequested", "reissueAvailableAfterDate", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("simProfileId")
    @NotNull
    private final String simProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedConnectivitySetupFinalisationDate")
    private final Long estimatedConnectivitySetupFinalisationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("portingScheduledDate")
    private final Long portingScheduledDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("reissueAvailable")
    private final boolean reissueAvailable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("reissueRequested")
    private final boolean reissueRequested;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reissueAvailableAfterDate")
    private final Long reissueAvailableAfterDate;

    public l(String simProfileId, Long l2, Long l3, boolean z, boolean z3, Long l4) {
        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
        this.simProfileId = simProfileId;
        this.estimatedConnectivitySetupFinalisationDate = l2;
        this.portingScheduledDate = l3;
        this.reissueAvailable = z;
        this.reissueRequested = z3;
        this.reissueAvailableAfterDate = l4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getEstimatedConnectivitySetupFinalisationDate() {
        return this.estimatedConnectivitySetupFinalisationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getPortingScheduledDate() {
        return this.portingScheduledDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getReissueAvailable() {
        return this.reissueAvailable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getReissueAvailableAfterDate() {
        return this.reissueAvailableAfterDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getReissueRequested() {
        return this.reissueRequested;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.simProfileId, lVar.simProfileId) && Intrinsics.f(this.estimatedConnectivitySetupFinalisationDate, lVar.estimatedConnectivitySetupFinalisationDate) && Intrinsics.f(this.portingScheduledDate, lVar.portingScheduledDate) && this.reissueAvailable == lVar.reissueAvailable && this.reissueRequested == lVar.reissueRequested && Intrinsics.f(this.reissueAvailableAfterDate, lVar.reissueAvailableAfterDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSimProfileId() {
        return this.simProfileId;
    }

    public final int hashCode() {
        int iHashCode = this.simProfileId.hashCode() * 31;
        Long l2 = this.estimatedConnectivitySetupFinalisationDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.portingScheduledDate;
        int iC = j6.a.c(j6.a.c((iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.reissueAvailable), 31, this.reissueRequested);
        Long l4 = this.reissueAvailableAfterDate;
        return iC + (l4 != null ? l4.hashCode() : 0);
    }
}
