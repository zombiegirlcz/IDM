package s14;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import nx4.m2;
import nx4.s;
import org.jetbrains.annotations.NotNull;
import t14.k;
import uz3.i;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u0004R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0006\u0010!R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b\u001e\u0010(R\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b\u0012\u0010!R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b\u0019\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0017\u0010\u0004¨\u00061"}, d2 = {"Ls14/d;", "", "", "toString", "()Ljava/lang/String;", "Lt14/k;", "a", "Lt14/k;", "n", "()Lt14/k;", "topItem", "b", "Ljava/lang/String;", "m", "title", "c", "j", "subtitle", "d", "e", "description", "l", "tag", "f", "backgroundImage", "g", "k", "subtitleImage", "", "Lnx4/m2;", "h", "Ljava/util/List;", "i", "()Ljava/util/List;", "secondSubtitles", "Lnx4/s;", "actionItems", "confirmButtonTitle", "Luz3/i;", "Luz3/i;", "()Luz3/i;", "primaryButton", "Lnx4/m0;", "contentItems", "Ls14/e;", "Ls14/e;", "()Ls14/e;", "parameters", "disclaimer", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("topItem")
    private final k topItem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("tag")
    private final String tag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("backgroundImage")
    private final String backgroundImage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitleImage")
    private final String subtitleImage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondSubtitles")
    private final List<m2> secondSubtitles;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("actionItems")
    private final List<s> actionItems;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmButtonTitle")
    private final String confirmButtonTitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("primaryButton")
    private final i primaryButton;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<m0> contentItems;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("parameters")
    private final e parameters;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getActionItems() {
        return this.actionItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getContentItems() {
        return this.contentItems;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.topItem, dVar.topItem) && Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.subtitle, dVar.subtitle) && Intrinsics.f(this.description, dVar.description) && Intrinsics.f(this.tag, dVar.tag) && Intrinsics.f(this.backgroundImage, dVar.backgroundImage) && Intrinsics.f(this.subtitleImage, dVar.subtitleImage) && Intrinsics.f(this.secondSubtitles, dVar.secondSubtitles) && Intrinsics.f(this.actionItems, dVar.actionItems) && Intrinsics.f(this.confirmButtonTitle, dVar.confirmButtonTitle) && Intrinsics.f(this.primaryButton, dVar.primaryButton) && Intrinsics.f(this.contentItems, dVar.contentItems) && Intrinsics.f(this.parameters, dVar.parameters) && Intrinsics.f(this.disclaimer, dVar.disclaimer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final i getPrimaryButton() {
        return this.primaryButton;
    }

    public final int hashCode() {
        k kVar = this.topItem;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundImage;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitleImage;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<m2> list = this.secondSubtitles;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<s> list2 = this.actionItems;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.confirmButtonTitle;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        i iVar = this.primaryButton;
        int iD = p.a.d((iHashCode10 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.contentItems);
        e eVar = this.parameters;
        int iHashCode11 = (iD + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str8 = this.disclaimer;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getSecondSubtitles() {
        return this.secondSubtitles;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSubtitleImage() {
        return this.subtitleImage;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final k getTopItem() {
        return this.topItem;
    }
}
