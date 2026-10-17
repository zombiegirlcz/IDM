package jhd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ogd.k f174207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f174208b;

    public f(ogd.k selected, List availableSortingTypes) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(availableSortingTypes, "availableSortingTypes");
        this.f174207a = selected;
        this.f174208b = availableSortingTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f174207a, fVar.f174207a) && Intrinsics.f(this.f174208b, fVar.f174208b);
    }

    public final int hashCode() {
        return this.f174208b.hashCode() + (this.f174207a.hashCode() * 31);
    }
}
