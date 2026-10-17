package ip0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ho0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f164583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagViewData.TagBackground f164584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TagViewData.TagOutline f164585c;
    public final Clause d;
    public final TagViewData e;

    public ho0(Image icon, TagViewData.TagBackground background, TagViewData.TagOutline outline, TextClause textClause) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(outline, "outline");
        this.f164583a = icon;
        this.f164584b = background;
        this.f164585c = outline;
        this.d = textClause;
        this.e = new TagViewData(icon, null, background, null, outline, false, null, null, null, 0, null, 2024);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ho0)) {
            return false;
        }
        ho0 ho0Var = (ho0) obj2;
        return Intrinsics.f(this.f164583a, ho0Var.f164583a) && Intrinsics.f(this.f164584b, ho0Var.f164584b) && Intrinsics.f(this.f164585c, ho0Var.f164585c) && Intrinsics.f(this.d, ho0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f164585c.hashCode() + ((this.f164584b.hashCode() + (this.f164583a.hashCode() * 31)) * 31)) * 31;
        Clause clause = this.d;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
