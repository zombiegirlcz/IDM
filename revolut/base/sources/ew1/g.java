package ew1;

import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f129989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f129990b;

    public g(Alias selectedAlias, List availabilities) {
        Intrinsics.checkNotNullParameter(selectedAlias, "selectedAlias");
        Intrinsics.checkNotNullParameter(availabilities, "availabilities");
        this.f129989a = selectedAlias;
        this.f129990b = availabilities;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f129989a, gVar.f129989a) && Intrinsics.f(this.f129990b, gVar.f129990b);
    }

    public final int hashCode() {
        return this.f129990b.hashCode() + (this.f129989a.hashCode() * 31);
    }
}
