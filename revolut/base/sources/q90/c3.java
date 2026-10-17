package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006("}, d2 = {"Lq90/c3;", "Lq90/m4;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "k", "previousViewId", "c", "m", "title", "Lq90/t1;", "d", "Lq90/t1;", "l", "()Lq90/t1;", "subtitleHtml", "Lq90/u1;", "e", "Lq90/u1;", "i", "()Lq90/u1;", "image", "", "Lq90/h4;", "f", "Ljava/util/List;", "j", "()Ljava/util/List;", "next", "Lq90/a;", "g", "actions", "h", "actionsOrientation", "analyticsName", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c3 extends m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousViewId")
    private final String previousViewId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtitleHtml")
    @NotNull
    private final t1 subtitleHtml;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("image")
    private final u1 image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("next")
    private final List<h4> next;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("actions")
    private final List<a> actions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("actionsOrientation")
    private final String actionsOrientation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("analyticsScreenName")
    private final String analyticsName;

    public c3(String id10, String str, String title, t1 subtitleHtml, u1 u1Var, ArrayList arrayList, ArrayList arrayList2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleHtml, "subtitleHtml");
        this.id = id10;
        this.previousViewId = str;
        this.title = title;
        this.subtitleHtml = subtitleHtml;
        this.image = u1Var;
        this.next = arrayList;
        this.actions = arrayList2;
        this.actionsOrientation = str2;
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
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.id, c3Var.id) && Intrinsics.f(this.previousViewId, c3Var.previousViewId) && Intrinsics.f(this.title, c3Var.title) && Intrinsics.f(this.subtitleHtml, c3Var.subtitleHtml) && Intrinsics.f(this.image, c3Var.image) && Intrinsics.f(this.next, c3Var.next) && Intrinsics.f(this.actions, c3Var.actions) && Intrinsics.f(this.actionsOrientation, c3Var.actionsOrientation) && Intrinsics.f(this.analyticsName, c3Var.analyticsName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getActionsOrientation() {
        return this.actionsOrientation;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.previousViewId;
        int iHashCode2 = (this.subtitleHtml.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title)) * 31;
        u1 u1Var = this.image;
        int iHashCode3 = (iHashCode2 + (u1Var == null ? 0 : u1Var.hashCode())) * 31;
        List<h4> list = this.next;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<a> list2 = this.actions;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.actionsOrientation;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.analyticsName;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final u1 getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPreviousViewId() {
        return this.previousViewId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final t1 getSubtitleHtml() {
        return this.subtitleHtml;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
