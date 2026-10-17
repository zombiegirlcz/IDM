package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lq90/c0;", "", "", "toString", "()Ljava/lang/String;", "Lq90/o;", "a", "Lq90/o;", "()Lq90/o;", "icon", "Lq90/t1;", "b", "Lq90/t1;", "()Lq90/t1;", "textHtml", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "visible", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("icon")
    @NotNull
    private final o icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("textHtml")
    @NotNull
    private final t1 textHtml;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("visible")
    private final Boolean visible;

    public c0(o icon, t1 textHtml, Boolean bool) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(textHtml, "textHtml");
        this.icon = icon;
        this.textHtml = textHtml;
        this.visible = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t1 getTextHtml() {
        return this.textHtml;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.icon, c0Var.icon) && Intrinsics.f(this.textHtml, c0Var.textHtml) && Intrinsics.f(this.visible, c0Var.visible);
    }

    public final int hashCode() {
        int iHashCode = (this.textHtml.hashCode() + (this.icon.hashCode() * 31)) * 31;
        Boolean bool = this.visible;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
