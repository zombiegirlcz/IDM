package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lnx4/g;", "Lnx4/n;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "htmlUrl", "c", "pdfUrl", "documentName", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("htmlUrl")
    @NotNull
    private final String htmlUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pdfUrl")
    @NotNull
    private final String pdfUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentName")
    @NotNull
    private final String documentName;

    public g(String htmlUrl, String pdfUrl, String documentName) {
        Intrinsics.checkNotNullParameter(htmlUrl, "htmlUrl");
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        this.htmlUrl = htmlUrl;
        this.pdfUrl = pdfUrl;
        this.documentName = documentName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.htmlUrl, gVar.htmlUrl) && Intrinsics.f(this.pdfUrl, gVar.pdfUrl) && Intrinsics.f(this.documentName, gVar.documentName);
    }

    public final int hashCode() {
        return this.documentName.hashCode() + p.a.c(this.htmlUrl.hashCode() * 31, 31, this.pdfUrl);
    }

    @Override // nx4.n
    public final String j() {
        return p.a.p("ShowDocumentDto(name=", this.documentName, ")");
    }
}
