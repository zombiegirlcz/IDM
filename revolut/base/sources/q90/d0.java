package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010 R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006,"}, d2 = {"Lq90/d0;", "Lq90/m4;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "l", "previousViewId", "c", "n", "title", "Lq90/t1;", "d", "Lq90/t1;", "m", "()Lq90/t1;", "subtitleHtml", "Lq90/u1;", "e", "Lq90/u1;", "i", "()Lq90/u1;", "image", "", "Lq90/c0;", "f", "Ljava/util/List;", "j", "()Ljava/util/List;", "items", "Lq90/v;", "g", "componentItems", "Lq90/h4;", "h", "k", "next", "Lq90/a;", "actions", "analyticsName", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 extends m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousViewId")
    private final String previousViewId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtitleHtml")
    private final t1 subtitleHtml;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("image")
    private final u1 image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<c0> items;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("componentItems")
    private final List<v> componentItems;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("next")
    private final List<h4> next;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("actions")
    private final List<a> actions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("analyticsScreenName")
    private final String analyticsName;

    public d0(String id10, String str, String str2, t1 t1Var, u1 u1Var, ArrayList items, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = id10;
        this.previousViewId = str;
        this.title = str2;
        this.subtitleHtml = t1Var;
        this.image = u1Var;
        this.items = items;
        this.componentItems = arrayList;
        this.next = arrayList2;
        this.actions = arrayList3;
        this.analyticsName = str3;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // xl2.g0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.id, d0Var.id) && Intrinsics.f(this.previousViewId, d0Var.previousViewId) && Intrinsics.f(this.title, d0Var.title) && Intrinsics.f(this.subtitleHtml, d0Var.subtitleHtml) && Intrinsics.f(this.image, d0Var.image) && Intrinsics.f(this.items, d0Var.items) && Intrinsics.f(this.componentItems, d0Var.componentItems) && Intrinsics.f(this.next, d0Var.next) && Intrinsics.f(this.actions, d0Var.actions) && Intrinsics.f(this.analyticsName, d0Var.analyticsName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getComponentItems() {
        return this.componentItems;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.previousViewId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        t1 t1Var = this.subtitleHtml;
        int iHashCode4 = (iHashCode3 + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        u1 u1Var = this.image;
        int iD = p.a.d((iHashCode4 + (u1Var == null ? 0 : u1Var.hashCode())) * 31, 31, this.items);
        List<v> list = this.componentItems;
        int iHashCode5 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        List<h4> list2 = this.next;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<a> list3 = this.actions;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.analyticsName;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final u1 getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPreviousViewId() {
        return this.previousViewId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final t1 getSubtitleHtml() {
        return this.subtitleHtml;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
