package ke4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182994a;

    public m(List selectedLoans) {
        Intrinsics.checkNotNullParameter(selectedLoans, "selectedLoans");
        this.f182994a = selectedLoans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f182994a, ((m) obj2).f182994a);
    }

    public final int hashCode() {
        return this.f182994a.hashCode();
    }
}
