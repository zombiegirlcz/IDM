package x5i;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f302988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f302989b;

    public g(Clause topDisclaimer, List bottomDisclaimer) {
        Intrinsics.checkNotNullParameter(topDisclaimer, "topDisclaimer");
        Intrinsics.checkNotNullParameter(bottomDisclaimer, "bottomDisclaimer");
        this.f302988a = topDisclaimer;
        this.f302989b = bottomDisclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f302988a, gVar.f302988a) && Intrinsics.f(this.f302989b, gVar.f302989b);
    }

    public final int hashCode() {
        return this.f302989b.hashCode() + (this.f302988a.hashCode() * 31);
    }
}
