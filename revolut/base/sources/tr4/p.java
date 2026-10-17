package tr4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f273740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f273741b;

    public p(TextLocalisedClause title, ResourceImage naviIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(naviIcon, "naviIcon");
        this.f273740a = title;
        this.f273741b = naviIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f273740a.equals(pVar.f273740a) && this.f273741b.equals(pVar.f273741b);
    }

    public final int hashCode() {
        return this.f273741b.hashCode() + (this.f273740a.hashCode() * 31);
    }
}
