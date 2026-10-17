package fb7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f133494a;

    public r(Set selectedAccountIds) {
        Intrinsics.checkNotNullParameter(selectedAccountIds, "selectedAccountIds");
        this.f133494a = selectedAccountIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f133494a, ((r) obj2).f133494a);
    }

    public final int hashCode() {
        return this.f133494a.hashCode();
    }
}
