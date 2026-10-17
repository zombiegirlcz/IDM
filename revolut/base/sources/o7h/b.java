package o7h;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0011\u0010\u001aR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004¨\u0006 "}, d2 = {"Lo7h/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "key", "b", "k", "title", "c", "f", "description", "d", "backgroundImageLink", "e", "avatarImageLink", "i", "icon", "g", "additionalInfoLink", "", "h", "Ljava/util/List;", "()Ljava/util/List;", "collections", "Lo7h/c;", "entries", "category", "emoji", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("backgroundImageLink")
    private final String backgroundImageLink;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("avatarImageLink")
    private final String avatarImageLink;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("icon")
    private final String icon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInfoLink")
    private final String additionalInfoLink;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("collections")
    private final List<String> collections;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("entries")
    private final List<c> entries;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("category")
    private final String category;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("emoji")
    private final String emoji;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditionalInfoLink() {
        return this.additionalInfoLink;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvatarImageLink() {
        return this.avatarImageLink;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBackgroundImageLink() {
        return this.backgroundImageLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getCollections() {
        return this.collections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.key, bVar.key) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.backgroundImageLink, bVar.backgroundImageLink) && Intrinsics.f(this.avatarImageLink, bVar.avatarImageLink) && Intrinsics.f(this.icon, bVar.icon) && Intrinsics.f(this.additionalInfoLink, bVar.additionalInfoLink) && Intrinsics.f(this.collections, bVar.collections) && Intrinsics.f(this.entries, bVar.entries) && Intrinsics.f(this.category, bVar.category) && Intrinsics.f(this.emoji, bVar.emoji);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getEntries() {
        return this.entries;
    }

    public final int hashCode() {
        int iC = p.a.c(this.key.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundImageLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarImageLink;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.additionalInfoLink;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.collections;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<c> list2 = this.entries;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.category;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.emoji;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
