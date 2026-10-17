package jhd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ogd.k f174209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f174210b;

    public g(ogd.k selected, List availableSortingTypes) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(availableSortingTypes, "availableSortingTypes");
        this.f174209a = selected;
        this.f174210b = availableSortingTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f174209a, gVar.f174209a) && Intrinsics.f(this.f174210b, gVar.f174210b);
    }

    public final int hashCode() {
        return this.f174210b.hashCode() + (this.f174209a.hashCode() * 31);
    }
}
