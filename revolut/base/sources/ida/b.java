package ida;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f160455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f160456b;

    public b(TextLocalisedClause title, LayeredImage icon) {
        Intrinsics.checkNotNullParameter("PocketsSummary", "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f160455a = icon;
        this.f160456b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f160455a.equals(bVar.f160455a) && this.f160456b.equals(bVar.f160456b);
    }

    public final int hashCode() {
        return t61.a.a(l.e(this.f160455a, 491755959, 31), 31, this.f160456b);
    }
}
