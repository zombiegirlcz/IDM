package qre;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0016"}, d2 = {"Lqre/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "g", "uri", "c", "htmlUri", "d", "pdfUri", "e", "h", "version", "f", "scope", "templateId", "title", "feature_terms_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

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
    @lg.b("version")
    @NotNull
    private final String version;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String scope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("templateId")
    private final String templateId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    public e(String id10, String str, String str2, String str3, String version, String scope, String str4, String title) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id10;
        this.uri = str;
        this.htmlUri = str2;
        this.pdfUri = str3;
        this.version = version;
        this.scope = scope;
        this.templateId = str4;
        this.title = title;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHtmlUri() {
        return this.htmlUri;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPdfUri() {
        return this.pdfUri;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.uri, eVar.uri) && Intrinsics.f(this.htmlUri, eVar.htmlUri) && Intrinsics.f(this.pdfUri, eVar.pdfUri) && Intrinsics.f(this.version, eVar.version) && Intrinsics.f(this.scope, eVar.scope) && Intrinsics.f(this.templateId, eVar.templateId) && Intrinsics.f(this.title, eVar.title);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.uri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.htmlUri;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pdfUri;
        int iC = p.a.c(p.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.version), 31, this.scope);
        String str4 = this.templateId;
        return this.title.hashCode() + ((iC + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
