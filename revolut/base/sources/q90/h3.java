package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\r\u0010 ¨\u0006#"}, d2 = {"Lq90/h3;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "h", "title", "Lq90/t1;", "c", "Lq90/t1;", "()Lq90/t1;", "description", "d", "assetUrl", "Lq90/o;", "Lq90/o;", "()Lq90/o;", "icon", "", "Lq90/c2;", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "labels", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "ignoresSearch", "disabled", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final t1 description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("assetUrl")
    private final String assetUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("icon")
    private final o icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("labels")
    private final List<c2> labels;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ignoresSearch")
    private final Boolean ignoresSearch;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("disabled")
    private final Boolean disabled;

    public h3(String id10, String str, t1 t1Var, String str2, o oVar, ArrayList arrayList, Boolean bool, int i) {
        oVar = (i & 16) != 0 ? null : oVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.title = str;
        this.description = t1Var;
        this.assetUrl = str2;
        this.icon = oVar;
        this.labels = arrayList;
        this.ignoresSearch = null;
        this.disabled = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t1 getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.id, h3Var.id) && Intrinsics.f(this.title, h3Var.title) && Intrinsics.f(this.description, h3Var.description) && Intrinsics.f(this.assetUrl, h3Var.assetUrl) && Intrinsics.f(this.icon, h3Var.icon) && Intrinsics.f(this.labels, h3Var.labels) && Intrinsics.f(this.ignoresSearch, h3Var.ignoresSearch) && Intrinsics.f(this.disabled, h3Var.disabled);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getIgnoresSearch() {
        return this.ignoresSearch;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getLabels() {
        return this.labels;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        t1 t1Var = this.description;
        int iHashCode3 = (iHashCode2 + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        String str2 = this.assetUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        o oVar = this.icon;
        int iHashCode5 = (iHashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        List<c2> list = this.labels;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.ignoresSearch;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disabled;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
