package yn4;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lyn4/f0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "eligibilityStatus", "Lyn4/f0$a;", "Lyn4/f0$a;", "c", "()Lyn4/f0$a;", "ineligibility", "Ljo3/a;", "Ljo3/a;", "d", "()Ljo3/a;", "minDownPayment", "", "Lyn4/c;", "Ljava/util/List;", "()Ljava/util/List;", "documents", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("eligibilityStatus")
    @NotNull
    private final String eligibilityStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ineligibility")
    private final a ineligibility;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minDownPayment")
    @NotNull
    private final jo3.a minDownPayment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<c> documents;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lyn4/f0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "reason", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("reason")
        @NotNull
        private final String reason;

        public a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.reason, ((a) obj2).reason);
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }
    }

    public f0(String eligibilityStatus, a aVar, jo3.a minDownPayment, ArrayList documents) {
        Intrinsics.checkNotNullParameter(eligibilityStatus, "eligibilityStatus");
        Intrinsics.checkNotNullParameter(minDownPayment, "minDownPayment");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.eligibilityStatus = eligibilityStatus;
        this.ineligibility = aVar;
        this.minDownPayment = minDownPayment;
        this.documents = documents;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getIneligibility() {
        return this.ineligibility;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getMinDownPayment() {
        return this.minDownPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.eligibilityStatus, f0Var.eligibilityStatus) && Intrinsics.f(this.ineligibility, f0Var.ineligibility) && Intrinsics.f(this.minDownPayment, f0Var.minDownPayment) && Intrinsics.f(this.documents, f0Var.documents);
    }

    public final int hashCode() {
        int iHashCode = this.eligibilityStatus.hashCode() * 31;
        a aVar = this.ineligibility;
        return this.documents.hashCode() + v7.j(this.minDownPayment, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
    }
}
