package evh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u0005\u0010\u001b¨\u0006\u001d"}, d2 = {"Levh/p;", "Levh/z;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "citizenshipSelectionTitle", "b", "d", "citizenshipSelectionSubtitle", "c", "citizenshipConfirmationSubtitle", "j", "documentSelectionTitle", "i", "documentSelectionSubtitle", "f", "h", "documentSelectionSubmitButton", "g", "documentSelectionSkipButton", "citizenshipsQuery", "applicableDocumentsQuery", "Levh/p$a;", "Levh/p$a;", "()Levh/p$a;", "alternativeDocuments", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("citizenshipSelectionTitle")
    @NotNull
    private final String citizenshipSelectionTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("citizenshipSelectionSubtitle")
    private final String citizenshipSelectionSubtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("citizenshipConfirmationSubtitle")
    private final String citizenshipConfirmationSubtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("documentSelectionTitle")
    @NotNull
    private final String documentSelectionTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("documentSelectionSubtitle")
    private final String documentSelectionSubtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("documentSelectionSubmitButton")
    @NotNull
    private final String documentSelectionSubmitButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentSelectionSkipButton")
    private final String documentSelectionSkipButton;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("citizenshipsQuery")
    @NotNull
    private final String citizenshipsQuery;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("applicableDocumentsQuery")
    @NotNull
    private final String applicableDocumentsQuery;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("alternativeDocuments")
    private final a alternativeDocuments;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000e"}, d2 = {"Levh/p$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "c", "subtitle", "alternativeMethodsLabel", "alternativeMethodsFaqDeeplink", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("alternativeMethodsLabel")
        @NotNull
        private final String alternativeMethodsLabel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("alternativeMethodsFaqDeeplink")
        @NotNull
        private final String alternativeMethodsFaqDeeplink;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAlternativeMethodsFaqDeeplink() {
            return this.alternativeMethodsFaqDeeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAlternativeMethodsLabel() {
            return this.alternativeMethodsLabel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.alternativeMethodsLabel, aVar.alternativeMethodsLabel) && Intrinsics.f(this.alternativeMethodsFaqDeeplink, aVar.alternativeMethodsFaqDeeplink);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return this.alternativeMethodsFaqDeeplink.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.alternativeMethodsLabel);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAlternativeDocuments() {
        return this.alternativeDocuments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApplicableDocumentsQuery() {
        return this.applicableDocumentsQuery;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCitizenshipConfirmationSubtitle() {
        return this.citizenshipConfirmationSubtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCitizenshipSelectionSubtitle() {
        return this.citizenshipSelectionSubtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCitizenshipSelectionTitle() {
        return this.citizenshipSelectionTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.citizenshipSelectionTitle, pVar.citizenshipSelectionTitle) && Intrinsics.f(this.citizenshipSelectionSubtitle, pVar.citizenshipSelectionSubtitle) && Intrinsics.f(this.citizenshipConfirmationSubtitle, pVar.citizenshipConfirmationSubtitle) && Intrinsics.f(this.documentSelectionTitle, pVar.documentSelectionTitle) && Intrinsics.f(this.documentSelectionSubtitle, pVar.documentSelectionSubtitle) && Intrinsics.f(this.documentSelectionSubmitButton, pVar.documentSelectionSubmitButton) && Intrinsics.f(this.documentSelectionSkipButton, pVar.documentSelectionSkipButton) && Intrinsics.f(this.citizenshipsQuery, pVar.citizenshipsQuery) && Intrinsics.f(this.applicableDocumentsQuery, pVar.applicableDocumentsQuery) && Intrinsics.f(this.alternativeDocuments, pVar.alternativeDocuments);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCitizenshipsQuery() {
        return this.citizenshipsQuery;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDocumentSelectionSkipButton() {
        return this.documentSelectionSkipButton;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDocumentSelectionSubmitButton() {
        return this.documentSelectionSubmitButton;
    }

    public final int hashCode() {
        int iHashCode = this.citizenshipSelectionTitle.hashCode() * 31;
        String str = this.citizenshipSelectionSubtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.citizenshipConfirmationSubtitle;
        int iC = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.documentSelectionTitle);
        String str3 = this.documentSelectionSubtitle;
        int iC2 = p.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.documentSelectionSubmitButton);
        String str4 = this.documentSelectionSkipButton;
        int iC3 = p.a.c(p.a.c((iC2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.citizenshipsQuery), 31, this.applicableDocumentsQuery);
        a aVar = this.alternativeDocuments;
        return iC3 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDocumentSelectionSubtitle() {
        return this.documentSelectionSubtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDocumentSelectionTitle() {
        return this.documentSelectionTitle;
    }
}
