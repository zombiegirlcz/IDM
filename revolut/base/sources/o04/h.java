package o04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lo04/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "Lo04/j;", "Lo04/j;", "d", "()Lo04/j;", "parameters", "Lo04/g;", "c", "Lo04/g;", "()Lo04/g;", "offerContent", "Lo04/f;", "Lo04/f;", "()Lo04/f;", "benefitsContent", "Lo04/k;", "e", "Lo04/k;", "()Lo04/k;", "statementDueDaySelection", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("parameters")
    @NotNull
    private final j parameters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("offer")
    @NotNull
    private final g offerContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("benefits")
    @NotNull
    private final f benefitsContent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dueDaySelection")
    private final k statementDueDaySelection;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getBenefitsContent() {
        return this.benefitsContent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getOfferContent() {
        return this.offerContent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k getStatementDueDaySelection() {
        return this.statementDueDaySelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.id, hVar.id) && Intrinsics.f(this.parameters, hVar.parameters) && Intrinsics.f(this.offerContent, hVar.offerContent) && Intrinsics.f(this.benefitsContent, hVar.benefitsContent) && Intrinsics.f(this.statementDueDaySelection, hVar.statementDueDaySelection);
    }

    public final int hashCode() {
        int iHashCode = (this.benefitsContent.hashCode() + ((this.offerContent.hashCode() + ((this.parameters.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31;
        k kVar = this.statementDueDaySelection;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
