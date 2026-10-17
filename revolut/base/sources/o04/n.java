package o04;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\t\u0010\u001b¨\u0006\u001d"}, d2 = {"Lo04/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "description", "c", "h", "videoBackgroundUrl", "d", "revealAnimationDelay", "e", "f", "theme", "Luz3/i;", "Luz3/i;", "()Luz3/i;", "primaryButton", "secondaryButton", "", "Lnx4/s0;", "Ljava/util/List;", "()Ljava/util/List;", "links", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("videoBackgroundUrl")
    @NotNull
    private final String videoBackgroundUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("revealAnimationDelay")
    private final String revealAnimationDelay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("theme")
    private final String theme;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("primaryButton")
    @NotNull
    private final uz3.i primaryButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryButton")
    @NotNull
    private final uz3.i secondaryButton;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("links")
    private final List<s0> links;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final uz3.i getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRevealAnimationDelay() {
        return this.revealAnimationDelay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final uz3.i getSecondaryButton() {
        return this.secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.title, nVar.title) && Intrinsics.f(this.description, nVar.description) && Intrinsics.f(this.videoBackgroundUrl, nVar.videoBackgroundUrl) && Intrinsics.f(this.revealAnimationDelay, nVar.revealAnimationDelay) && Intrinsics.f(this.theme, nVar.theme) && Intrinsics.f(this.primaryButton, nVar.primaryButton) && Intrinsics.f(this.secondaryButton, nVar.secondaryButton) && Intrinsics.f(this.links, nVar.links);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getVideoBackgroundUrl() {
        return this.videoBackgroundUrl;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.videoBackgroundUrl);
        String str = this.revealAnimationDelay;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.theme;
        int iHashCode2 = (this.secondaryButton.hashCode() + ((this.primaryButton.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        List<s0> list = this.links;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
