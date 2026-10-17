package pde;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u001b"}, d2 = {"Lpde/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "outcome", "", "Lpde/i;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "sections", "Lpde/c;", "Lpde/c;", "()Lpde/c;", "estimation", "Lpde/k;", "Lpde/k;", "e", "()Lpde/k;", "warning", "action", "Companion", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("outcome")
    @NotNull
    private final String outcome;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sections")
    @NotNull
    private final List<i> sections;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimation")
    private final c estimation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("warning")
    private final k warning;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("action")
    private final String action;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getEstimation() {
        return this.estimation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k getWarning() {
        return this.warning;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.outcome, dVar.outcome) && Intrinsics.f(this.sections, dVar.sections) && Intrinsics.f(this.estimation, dVar.estimation) && Intrinsics.f(this.warning, dVar.warning) && Intrinsics.f(this.action, dVar.action);
    }

    public final int hashCode() {
        int iD = p.a.d(this.outcome.hashCode() * 31, 31, this.sections);
        c cVar = this.estimation;
        int iHashCode = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        k kVar = this.warning;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.action;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
