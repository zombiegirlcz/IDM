package ab;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u0003\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\b\u0010\u001e¨\u0006 "}, d2 = {"Lab/f;", "", "", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "title", "b", "f", "subtitle", "", "c", "Z", "d", "()Z", "showAvatar", "e", "showTabs", "", "Lab/e;", "Ljava/util/List;", "()Ljava/util/List;", "sections", "Lab/a;", "Lab/a;", "()Lab/a;", "confirmButton", "Lab/c;", "Lab/c;", "()Lab/c;", "consents", "feature_user_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("showAvatar")
    private final boolean showAvatar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("showTabs")
    private final boolean showTabs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("sections")
    @NotNull
    private final List<e> sections;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("confirmButton")
    @NotNull
    private final a confirmButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    private final c consents;

    public f(String title, String str, boolean z, boolean z3, ArrayList sections, a confirmButton, c cVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        this.title = title;
        this.subtitle = str;
        this.showAvatar = z;
        this.showTabs = z3;
        this.sections = sections;
        this.confirmButton = confirmButton;
        this.consents = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getConfirmButton() {
        return this.confirmButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getConsents() {
        return this.consents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowTabs() {
        return this.showTabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.subtitle, fVar.subtitle) && this.showAvatar == fVar.showAvatar && this.showTabs == fVar.showTabs && Intrinsics.f(this.sections, fVar.sections) && Intrinsics.f(this.confirmButton, fVar.confirmButton) && Intrinsics.f(this.consents, fVar.consents);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (this.confirmButton.hashCode() + p.a.d(j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.showAvatar), 31, this.showTabs), 31, this.sections)) * 31;
        c cVar = this.consents;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        boolean z = this.showAvatar;
        boolean z3 = this.showTabs;
        List<e> list = this.sections;
        a aVar = this.confirmButton;
        c cVar = this.consents;
        StringBuilder sbM = v0.a.m("UserDetailsDto(title=", str, ", subtitle=", str2, ", showAvatar=");
        t61.a.y(sbM, z, ", showTabs=", z3, ", sections=");
        sbM.append(list);
        sbM.append(", confirmButton=");
        sbM.append(aVar);
        sbM.append(", consents=");
        sbM.append(cVar);
        sbM.append(")");
        return sbM.toString();
    }
}
