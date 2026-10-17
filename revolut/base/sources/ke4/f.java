package ke4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182988a;

    public f(List selectedLoans) {
        Intrinsics.checkNotNullParameter(selectedLoans, "selectedLoans");
        this.f182988a = selectedLoans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f182988a, ((f) obj2).f182988a);
    }

    public final int hashCode() {
        return this.f182988a.hashCode();
    }
}
