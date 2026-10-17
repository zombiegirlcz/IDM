package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0017"}, d2 = {"Lq90/s1;", "Lq90/m4;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "g", "previousViewId", "c", "i", "title", "Lq90/r1;", "d", "Lq90/r1;", "f", "()Lq90/r1;", "htmlItem", "e", "analyticsName", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s1 extends m4 {

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
    @lg.b("content")
    @NotNull
    private final r1 htmlItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("analyticsScreenName")
    private final String analyticsName;

    public s1(String id10, String str, String title, r1 htmlItem, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(htmlItem, "htmlItem");
        this.id = id10;
        this.previousViewId = str;
        this.title = title;
        this.htmlItem = htmlItem;
        this.analyticsName = str2;
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
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.id, s1Var.id) && Intrinsics.f(this.previousViewId, s1Var.previousViewId) && Intrinsics.f(this.title, s1Var.title) && Intrinsics.f(this.htmlItem, s1Var.htmlItem) && Intrinsics.f(this.analyticsName, s1Var.analyticsName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final r1 getHtmlItem() {
        return this.htmlItem;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPreviousViewId() {
        return this.previousViewId;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.previousViewId;
        int iHashCode2 = (this.htmlItem.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title)) * 31;
        String str2 = this.analyticsName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
