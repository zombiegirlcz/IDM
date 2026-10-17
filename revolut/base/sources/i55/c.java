package i55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Li55/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "htmlAgreementId", "b", "pdfAgreementId", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("htmlAgreementId")
    @NotNull
    private final String htmlAgreementId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pdfAgreementId")
    @NotNull
    private final String pdfAgreementId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHtmlAgreementId() {
        return this.htmlAgreementId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPdfAgreementId() {
        return this.pdfAgreementId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.htmlAgreementId, cVar.htmlAgreementId) && Intrinsics.f(this.pdfAgreementId, cVar.pdfAgreementId);
    }

    public final int hashCode() {
        return this.pdfAgreementId.hashCode() + (this.htmlAgreementId.hashCode() * 31);
    }
}
