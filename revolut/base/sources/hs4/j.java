package hs4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f154992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f154993b;

    public j(TextLocalisedClause title, ResourceImage naviIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(naviIcon, "naviIcon");
        this.f154992a = title;
        this.f154993b = naviIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f154992a.equals(jVar.f154992a) && this.f154993b.equals(jVar.f154993b);
    }

    public final int hashCode() {
        return this.f154993b.hashCode() + (this.f154992a.hashCode() * 31);
    }
}
