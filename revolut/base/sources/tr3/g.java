package tr3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u0004R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"Ltr3/g;", "", "", "toString", "()Ljava/lang/String;", "Lfs3/b;", "a", "Lfs3/b;", "f", "()Lfs3/b;", "type", "b", "Ljava/lang/String;", "d", "title", "c", "subtitle", "icon", "e", "tutorialCampaign", "", "Ltr3/d;", "Ljava/util/List;", "()Ljava/util/List;", "tags", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("productEntry")
    @NotNull
    private final fs3.b type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("tutorialCampaign")
    private final String tutorialCampaign;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("tags")
    private final List<d> tags;

    public g(fs3.b type, String str, String str2, String str3, String str4, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.title = str;
        this.subtitle = str2;
        this.icon = str3;
        this.tutorialCampaign = str4;
        this.tags = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTutorialCampaign() {
        return this.tutorialCampaign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.type == gVar.type && Intrinsics.f(this.title, gVar.title) && Intrinsics.f(this.subtitle, gVar.subtitle) && Intrinsics.f(this.icon, gVar.icon) && Intrinsics.f(this.tutorialCampaign, gVar.tutorialCampaign) && Intrinsics.f(this.tags, gVar.tags);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final fs3.b getType() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tutorialCampaign;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<d> list = this.tags;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }
}
