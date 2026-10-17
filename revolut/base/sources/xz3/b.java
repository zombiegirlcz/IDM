package xz3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Lxz3/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "displayName", "b", "g", "name", "c", "description", "d", "f", "htmlPath", "h", "pdfPath", "buttonText", "disclaimer", "", "Lnx4/d0;", "Ljava/util/List;", "()Ljava/util/List;", "checkboxes", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayName")
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("htmlPath")
    @NotNull
    private final String htmlPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pdfPath")
    @NotNull
    private final String pdfPath;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("buttonText")
    @NotNull
    private final String buttonText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkboxes")
    private final List<d0> checkboxes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCheckboxes() {
        return this.checkboxes;
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
    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.displayName, bVar.displayName) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.htmlPath, bVar.htmlPath) && Intrinsics.f(this.pdfPath, bVar.pdfPath) && Intrinsics.f(this.buttonText, bVar.buttonText) && Intrinsics.f(this.disclaimer, bVar.disclaimer) && Intrinsics.f(this.checkboxes, bVar.checkboxes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getHtmlPath() {
        return this.htmlPath;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPdfPath() {
        return this.pdfPath;
    }

    public final int hashCode() {
        int iC = p.a.c(this.displayName.hashCode() * 31, 31, this.name);
        String str = this.description;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.htmlPath), 31, this.pdfPath), 31, this.buttonText);
        String str2 = this.disclaimer;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<d0> list = this.checkboxes;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
