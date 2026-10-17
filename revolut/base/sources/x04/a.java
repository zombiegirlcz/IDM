package x04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import st3.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"Lx04/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "documentId", "b", "h", "title", "c", "description", "Lx04/a$b;", "d", "Lx04/a$b;", "g", "()Lx04/a$b;", "secondDescription", "Lx04/a$a;", "Lx04/a$a;", "()Lx04/a$a;", "addDocumentItem", "f", "disclaimer", "buttonTitle", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "required", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("secondDescription")
    private final b secondDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("addDocumentItem")
    @NotNull
    private final C1671a addDocumentItem;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("buttonTitle")
    @NotNull
    private final String buttonTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final Boolean required;

    /* JADX INFO: renamed from: x04.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lx04/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "description", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1671a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1671a)) {
                return false;
            }
            C1671a c1671a = (C1671a) obj2;
            return Intrinsics.f(this.title, c1671a.title) && Intrinsics.f(this.description, c1671a.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lx04/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "text", "Lst3/u;", "b", "Lst3/u;", "()Lst3/u;", "info", "downloadPdfUrl", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("info")
        private final u info;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("downloadPdfUrl")
        private final String downloadPdfUrl;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDownloadPdfUrl() {
            return this.downloadPdfUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final u getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.text, bVar.text) && Intrinsics.f(this.info, bVar.info) && Intrinsics.f(this.downloadPdfUrl, bVar.downloadPdfUrl);
        }

        public final int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            u uVar = this.info;
            int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
            String str = this.downloadPdfUrl;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1671a getAddDocumentItem() {
        return this.addDocumentItem;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.documentId, aVar.documentId) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.secondDescription, aVar.secondDescription) && Intrinsics.f(this.addDocumentItem, aVar.addDocumentItem) && Intrinsics.f(this.disclaimer, aVar.disclaimer) && Intrinsics.f(this.buttonTitle, aVar.buttonTitle) && Intrinsics.f(this.required, aVar.required);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getSecondDescription() {
        return this.secondDescription;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.documentId.hashCode() * 31, 31, this.title), 31, this.description);
        b bVar = this.secondDescription;
        int iHashCode = (this.addDocumentItem.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        String str = this.disclaimer;
        int iC2 = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonTitle);
        Boolean bool = this.required;
        return iC2 + (bool != null ? bool.hashCode() : 0);
    }
}
