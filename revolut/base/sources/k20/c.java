package k20;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u001c"}, d2 = {"Lk20/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "experience", "b", "f", "icon", "c", "asset", "i", "title", "e", "h", "tagsHeader", "", "Lk20/a;", "Ljava/util/List;", "g", "()Ljava/util/List;", "tags", "assetSymbol", "assetSymbolHighlighted", "feedbackRequirement", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("experience")
    @NotNull
    private final String experience;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("asset")
    private final String asset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("tagsHeader")
    private final String tagsHeader;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("tags")
    private final List<a> tags;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetSymbol")
    private final String assetSymbol;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetSymbolHighlighted")
    private final String assetSymbolHighlighted;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("feedbackRequirement")
    private final String feedbackRequirement;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAsset() {
        return this.asset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAssetSymbolHighlighted() {
        return this.assetSymbolHighlighted;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExperience() {
        return this.experience;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFeedbackRequirement() {
        return this.feedbackRequirement;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.experience, cVar.experience) && Intrinsics.f(this.icon, cVar.icon) && Intrinsics.f(this.asset, cVar.asset) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.tagsHeader, cVar.tagsHeader) && Intrinsics.f(this.tags, cVar.tags) && Intrinsics.f(this.assetSymbol, cVar.assetSymbol) && Intrinsics.f(this.assetSymbolHighlighted, cVar.assetSymbolHighlighted) && Intrinsics.f(this.feedbackRequirement, cVar.feedbackRequirement);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTagsHeader() {
        return this.tagsHeader;
    }

    public final int hashCode() {
        int iHashCode = this.experience.hashCode() * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.asset;
        int iC = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
        String str3 = this.tagsHeader;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<a> list = this.tags;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.assetSymbol;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.assetSymbolHighlighted;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.feedbackRequirement;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
