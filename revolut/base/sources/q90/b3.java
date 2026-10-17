package q90;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\f\u0010\u001bR\"\u0010'\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b\t\u0010&¨\u0006("}, d2 = {"Lq90/b3;", "Lq90/v;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "h", "title", "c", "g", "subtitle", "Lq90/f;", "d", "Lq90/f;", "()Lq90/f;", "asset", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "group", "", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "required", "Lq90/b0;", "Lq90/b0;", "i", "()Lq90/b0;", "value", "enabled", "", "Lq90/z;", "Ljava/util/List;", "()Ljava/util/List;", "badges", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b3 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("asset")
    @NotNull
    private final f asset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("group")
    private final Integer group;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("required")
    private final Boolean required;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final b0 value;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final Boolean enabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("badges")
    private final List<z> badges;

    public b3(String id10, String title, String subtitle, f asset, Integer num, Boolean bool, b0 b0Var, Boolean bool2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.id = id10;
        this.title = title;
        this.subtitle = subtitle;
        this.asset = asset;
        this.group = num;
        this.required = bool;
        this.value = b0Var;
        this.enabled = bool2;
        this.badges = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getAsset() {
        return this.asset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getBadges() {
        return this.badges;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.id, b3Var.id) && Intrinsics.f(this.title, b3Var.title) && Intrinsics.f(this.subtitle, b3Var.subtitle) && Intrinsics.f(this.asset, b3Var.asset) && Intrinsics.f(this.group, b3Var.group) && Intrinsics.f(this.required, b3Var.required) && Intrinsics.f(this.value, b3Var.value) && Intrinsics.f(this.enabled, b3Var.enabled) && Intrinsics.f(this.badges, b3Var.badges);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = (this.asset.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31;
        Integer num = this.group;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.required;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        b0 b0Var = this.value;
        int iHashCode4 = (iHashCode3 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        Boolean bool2 = this.enabled;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<z> list = this.badges;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b0 getValue() {
        return this.value;
    }
}
