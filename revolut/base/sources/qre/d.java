package qre;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lqre/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "h", "uri", "htmlUri", "d", "pdfUri", "", "e", "J", "()J", "createdDate", "f", "scope", "g", "templateId", "title", "i", "version", "feature_terms_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("uri")
    private final String uri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("html")
    private final String htmlUri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pdf")
    private final String pdfUri;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("scope")
    @NotNull
    private final String scope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("templateId")
    private final String templateId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("version")
    private final String version;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHtmlUri() {
        return this.htmlUri;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPdfUri() {
        return this.pdfUri;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.uri, dVar.uri) && Intrinsics.f(this.htmlUri, dVar.htmlUri) && Intrinsics.f(this.pdfUri, dVar.pdfUri) && this.createdDate == dVar.createdDate && Intrinsics.f(this.scope, dVar.scope) && Intrinsics.f(this.templateId, dVar.templateId) && Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.version, dVar.version);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.uri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.htmlUri;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pdfUri;
        int iC = p.a.c(a0.d.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.createdDate), 31, this.scope);
        String str4 = this.templateId;
        int iC2 = p.a.c((iC + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.title);
        String str5 = this.version;
        return iC2 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getVersion() {
        return this.version;
    }
}
