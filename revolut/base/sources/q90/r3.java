package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0010"}, d2 = {"Lq90/r3;", "Lq90/v;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "d", "subtitle", "c", "iconType", "section", "nextViewId", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r3 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("iconType")
    @NotNull
    private final String iconType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("section")
    @NotNull
    private final String section;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("nextViewId")
    @NotNull
    private final String nextViewId;

    public r3(String title, String subtitle, String iconType, String section, String nextViewId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(nextViewId, "nextViewId");
        this.title = title;
        this.subtitle = subtitle;
        this.iconType = iconType;
        this.section = section;
        this.nextViewId = nextViewId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIconType() {
        return this.iconType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextViewId() {
        return this.nextViewId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj2;
        return Intrinsics.f(this.title, r3Var.title) && Intrinsics.f(this.subtitle, r3Var.subtitle) && Intrinsics.f(this.iconType, r3Var.iconType) && Intrinsics.f(this.section, r3Var.section) && Intrinsics.f(this.nextViewId, r3Var.nextViewId);
    }

    public final int hashCode() {
        return this.nextViewId.hashCode() + p.a.c(p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.subtitle), 31, this.iconType), 31, this.section);
    }
}
