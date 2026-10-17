package st3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\f\u0010!R\u001c\u0010'\u001a\u0004\u0018\u00010#8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010#8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\"\u00100\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0016\u0010/¨\u00061"}, d2 = {"Lst3/e0;", "Lst3/u;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "title", "b", "description", "Lst3/s;", "c", "Lst3/s;", "d", "()Lst3/s;", "link", "Lst3/t;", "Lst3/t;", "f", "()Lst3/t;", "media", "e", "assetId", "", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "revealAnimationDelay", "h", "theme", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hideNavigationIcon", "Lst3/c;", "Lst3/c;", "W", "()Lst3/c;", "primaryButton", "j", "T", "secondaryButton", "", "Lst3/b;", "k", "Ljava/util/List;", "()Ljava/util/List;", "links", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("link")
    private final s link;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("media")
    private final t media;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("image")
    private final String assetId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("revealAnimationDelay")
    private final Double revealAnimationDelay;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("theme")
    private final String theme;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("hideNavigationIcon")
    private final Boolean hideNavigationIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("primaryButton")
    private final c primaryButton;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryButton")
    private final c secondaryButton;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("links")
    private final List<b> links;

    @Override // st3.u
    /* JADX INFO: renamed from: T, reason: from getter */
    public final c getSecondaryButton() {
        return this.secondaryButton;
    }

    @Override // st3.u
    /* JADX INFO: renamed from: W, reason: from getter */
    public final c getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getHideNavigationIcon() {
        return this.hideNavigationIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final s getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getLinks() {
        return this.links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.title, e0Var.title) && Intrinsics.f(this.description, e0Var.description) && Intrinsics.f(this.link, e0Var.link) && Intrinsics.f(this.media, e0Var.media) && Intrinsics.f(this.assetId, e0Var.assetId) && Intrinsics.f(this.revealAnimationDelay, e0Var.revealAnimationDelay) && Intrinsics.f(this.theme, e0Var.theme) && Intrinsics.f(this.hideNavigationIcon, e0Var.hideNavigationIcon) && Intrinsics.f(this.primaryButton, e0Var.primaryButton) && Intrinsics.f(this.secondaryButton, e0Var.secondaryButton) && Intrinsics.f(this.links, e0Var.links);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t getMedia() {
        return this.media;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getRevealAnimationDelay() {
        return this.revealAnimationDelay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    public final int hashCode() {
        int iC = p.a.c(this.title.hashCode() * 31, 31, this.description);
        s sVar = this.link;
        int iHashCode = (iC + (sVar == null ? 0 : sVar.hashCode())) * 31;
        t tVar = this.media;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.assetId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.revealAnimationDelay;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.theme;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hideNavigationIcon;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        c cVar = this.primaryButton;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.secondaryButton;
        int iHashCode8 = (iHashCode7 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        List<b> list = this.links;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
