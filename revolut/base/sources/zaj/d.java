package zaj;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f320724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f320725b;

    public d(LayeredImage icon, TextClause title) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f320724a = icon;
        this.f320725b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f320724a.equals(dVar.f320724a) && this.f320725b.equals(dVar.f320725b);
    }

    public final int hashCode() {
        return this.f320725b.hashCode() + (this.f320724a.hashCode() * 31);
    }
}
