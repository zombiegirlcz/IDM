package uk4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f280680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f280681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f280682c;

    public g(Clause title, Clause clause, ResourceImage navigationIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f280680a = title;
        this.f280681b = clause;
        this.f280682c = navigationIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f280680a, gVar.f280680a) && Intrinsics.f(this.f280681b, gVar.f280681b) && this.f280682c.equals(gVar.f280682c);
    }

    public final int hashCode() {
        int iHashCode = this.f280680a.hashCode() * 31;
        Clause clause = this.f280681b;
        return this.f280682c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
