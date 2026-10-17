package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\u0005R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\u0005R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\u0005R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0010\u0010\u0005R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\n\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnx4/z1;", "Lnx4/m0;", "Lnx4/j0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getIcon", "icon", "b", "d", "title", "c", "subtitle", "buttonText", "e", "url", "", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "scrollToTheBottomRequired", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z1 implements m0, j0 {

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
    @lg.b("url")
    private final String url;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("scrollToTheBottomRequired")
    private final Boolean scrollToTheBottomRequired;

    public z1(String str, String title, Boolean bool, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = str;
        this.title = title;
        this.subtitle = str2;
        this.buttonText = str3;
        this.url = str4;
        this.scrollToTheBottomRequired = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getScrollToTheBottomRequired() {
        return this.scrollToTheBottomRequired;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return Intrinsics.f(this.icon, z1Var.icon) && Intrinsics.f(this.title, z1Var.title) && Intrinsics.f(this.subtitle, z1Var.subtitle) && Intrinsics.f(this.buttonText, z1Var.buttonText) && Intrinsics.f(this.url, z1Var.url) && Intrinsics.f(this.scrollToTheBottomRequired, z1Var.scrollToTheBottomRequired);
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
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.scrollToTheBottomRequired;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
