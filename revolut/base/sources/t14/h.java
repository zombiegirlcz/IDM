package t14;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import nx4.m2;
import org.jetbrains.annotations.NotNull;
import t14.k;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001f\u0010\u0004R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001c\u0010$R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b\u001a\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b\u000b\u0010,¨\u0006."}, d2 = {"Lt14/h;", "", "", "toString", "()Ljava/lang/String;", "Lt14/k;", "a", "Lt14/k;", "m", "()Lt14/k;", "topItem", "b", "Ljava/lang/String;", "k", "title", "c", "j", "tag", "Lt14/k$a;", "d", "Lt14/k$a;", "l", "()Lt14/k$a;", "titleValue", "e", "backgroundImage", "f", "description", "g", "h", "subtitle", "i", "subtitleImage", "", "Lnx4/m2;", "Ljava/util/List;", "()Ljava/util/List;", "secondSubtitles", "Lnx4/m0;", "items", "disclaimer", "buttonTitle", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "buttonAction", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("topItem")
    private final k topItem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tag")
    private final String tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("titleValue")
    private final k.a titleValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("backgroundImage")
    private final String backgroundImage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitleImage")
    private final String subtitleImage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("secondSubtitles")
    private final List<m2> secondSubtitles;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<m0> items;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b(alternate = {"confirmButtonTitle"}, value = "buttonTitle")
    private final String buttonTitle;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmButtonAction")
    private final nx4.n buttonAction;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final nx4.n getButtonAction() {
        return this.buttonAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.topItem, hVar.topItem) && Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.tag, hVar.tag) && Intrinsics.f(this.titleValue, hVar.titleValue) && Intrinsics.f(this.backgroundImage, hVar.backgroundImage) && Intrinsics.f(this.description, hVar.description) && Intrinsics.f(this.subtitle, hVar.subtitle) && Intrinsics.f(this.subtitleImage, hVar.subtitleImage) && Intrinsics.f(this.secondSubtitles, hVar.secondSubtitles) && Intrinsics.f(this.items, hVar.items) && Intrinsics.f(this.disclaimer, hVar.disclaimer) && Intrinsics.f(this.buttonTitle, hVar.buttonTitle) && Intrinsics.f(this.buttonAction, hVar.buttonAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getSecondSubtitles() {
        return this.secondSubtitles;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        k kVar = this.topItem;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tag;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        k.a aVar = this.titleValue;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.backgroundImage;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subtitle;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitleImage;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<m2> list = this.secondSubtitles;
        int iD = p.a.d((iHashCode8 + (list == null ? 0 : list.hashCode())) * 31, 31, this.items);
        String str7 = this.disclaimer;
        int iHashCode9 = (iD + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.buttonTitle;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        nx4.n nVar = this.buttonAction;
        return iHashCode10 + (nVar != null ? nVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtitleImage() {
        return this.subtitleImage;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final k.a getTitleValue() {
        return this.titleValue;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final k getTopItem() {
        return this.topItem;
    }
}
