package js1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\n\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u0019"}, d2 = {"Ljs1/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "status", "Ljs1/c;", "b", "Ljs1/c;", "()Ljs1/c;", "details", "Ljs1/f;", "Ljs1/f;", "d", "()Ljs1/f;", "terms", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "spanishIbanAdded", "e", "workflowId", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final c details;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    private final f terms;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("spanishIbanAdded")
    private final Boolean spanishIbanAdded;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("workflowId")
    private final String workflowId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getSpanishIbanAdded() {
        return this.spanishIbanAdded;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.status, eVar.status) && Intrinsics.f(this.details, eVar.details) && Intrinsics.f(this.terms, eVar.terms) && Intrinsics.f(this.spanishIbanAdded, eVar.spanishIbanAdded) && Intrinsics.f(this.workflowId, eVar.workflowId);
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        c cVar = this.details;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        f fVar = this.terms;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Boolean bool = this.spanishIbanAdded;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.workflowId;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
