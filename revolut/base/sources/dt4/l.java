package dt4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f117372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f117373b;

    public l(TextLocalisedClause title, ResourceImage naviIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(naviIcon, "naviIcon");
        this.f117372a = title;
        this.f117373b = naviIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f117372a.equals(lVar.f117372a) && this.f117373b.equals(lVar.f117373b);
    }

    public final int hashCode() {
        return this.f117373b.hashCode() + (this.f117372a.hashCode() * 31);
    }
}
