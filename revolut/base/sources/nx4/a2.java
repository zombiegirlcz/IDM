package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\u0005R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u0005R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\n\u0010\u0005R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\r\u0010\u0005R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u001b"}, d2 = {"Lnx4/a2;", "Lnx4/m0;", "Lnx4/j0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getIcon", "icon", "b", "g", "title", "c", "f", "subtitle", "d", "buttonText", "e", "htmlLink", "pdfLink", "", "Z", "()Z", "requiredToSign", "h", "scrollToTheBottomRequired", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a2 implements m0, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("buttonText")
    private final String buttonText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("htmlLink")
    @NotNull
    private final String htmlLink;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pdfLink")
    private final String pdfLink;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiredToSign")
    private final boolean requiredToSign;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("scrollToTheBottomRequired")
    private final boolean scrollToTheBottomRequired;

    public a2(String str, String title, String str2, String str3, String htmlLink, String str4, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(htmlLink, "htmlLink");
        this.icon = str;
        this.title = title;
        this.subtitle = str2;
        this.buttonText = str3;
        this.htmlLink = htmlLink;
        this.pdfLink = str4;
        this.requiredToSign = z;
        this.scrollToTheBottomRequired = z3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHtmlLink() {
        return this.htmlLink;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPdfLink() {
        return this.pdfLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequiredToSign() {
        return this.requiredToSign;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getScrollToTheBottomRequired() {
        return this.scrollToTheBottomRequired;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return Intrinsics.f(this.icon, a2Var.icon) && Intrinsics.f(this.title, a2Var.title) && Intrinsics.f(this.subtitle, a2Var.subtitle) && Intrinsics.f(this.buttonText, a2Var.buttonText) && Intrinsics.f(this.htmlLink, a2Var.htmlLink) && Intrinsics.f(this.pdfLink, a2Var.pdfLink) && this.requiredToSign == a2Var.requiredToSign && this.scrollToTheBottomRequired == a2Var.scrollToTheBottomRequired;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // nx4.j0
    public final String getIcon() {
        return this.icon;
    }

    public final int hashCode() {
        String str = this.icon;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.subtitle;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int iC2 = p.a.c((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.htmlLink);
        String str4 = this.pdfLink;
        return Boolean.hashCode(this.scrollToTheBottomRequired) + j6.a.c((iC2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.requiredToSign);
    }
}
