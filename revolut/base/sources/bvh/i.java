package bvh;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lbvh/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getReason", "reason", "", "Ldvh/l;", "b", "Ljava/util/List;", "getDataPoints", "()Ljava/util/List;", "dataPoints", "c", "getConsents", "consents", "d", "getStepId", "stepId", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dataPoints")
    @NotNull
    private final List<dvh.l> dataPoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    private final List<String> consents;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("stepId")
    private final String stepId;

    public i(String str, ArrayList dataPoints, List list, int i) {
        list = (i & 4) != 0 ? null : list;
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        this.reason = str;
        this.dataPoints = dataPoints;
        this.consents = list;
        this.stepId = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.reason, iVar.reason) && Intrinsics.f(this.dataPoints, iVar.dataPoints) && Intrinsics.f(this.consents, iVar.consents) && Intrinsics.f(this.stepId, iVar.stepId);
    }

    public final int hashCode() {
        String str = this.reason;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.dataPoints);
        List<String> list = this.consents;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.stepId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
