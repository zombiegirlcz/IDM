package c04;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R$\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR$\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006#"}, d2 = {"Lc04/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "title", "b", "d", "currency", "c", "e", "description", "j", "tag", "Lc04/c;", "Lc04/c;", "()Lc04/c;", "amountSlider", "f", "g", "durationSlider", "i", "slidersOrder", "", "Lnx4/m0;", "h", "Ljava/util/List;", "()Ljava/util/List;", "items", "bottomItems", "disclaimer", "confirmButtonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("tag")
    private final String tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amountSlider")
    private final c amountSlider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("durationSlider")
    private final c durationSlider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("slidersOrder")
    private final String slidersOrder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    private final List<m0> items;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("bottomItems")
    private final List<m0> bottomItems;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("confirmButtonTitle")
    @NotNull
    private final String confirmButtonTitle;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getAmountSlider() {
        return this.amountSlider;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getBottomItems() {
        return this.bottomItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.tag, aVar.tag) && Intrinsics.f(this.amountSlider, aVar.amountSlider) && Intrinsics.f(this.durationSlider, aVar.durationSlider) && Intrinsics.f(this.slidersOrder, aVar.slidersOrder) && Intrinsics.f(this.items, aVar.items) && Intrinsics.f(this.bottomItems, aVar.bottomItems) && Intrinsics.f(this.disclaimer, aVar.disclaimer) && Intrinsics.f(this.confirmButtonTitle, aVar.confirmButtonTitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getDurationSlider() {
        return this.durationSlider;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public final int hashCode() {
        int iC = p.a.c(this.title.hashCode() * 31, 31, this.currency);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.amountSlider;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.durationSlider;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        String str3 = this.slidersOrder;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<m0> list = this.items;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<m0> list2 = this.bottomItems;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.disclaimer;
        return this.confirmButtonTitle.hashCode() + ((iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSlidersOrder() {
        return this.slidersOrder;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
