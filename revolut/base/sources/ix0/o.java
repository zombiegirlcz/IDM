package ix0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169269a;

    public o(List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f169269a = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f169269a, ((o) obj2).f169269a);
    }

    public final int hashCode() {
        return this.f169269a.hashCode();
    }
}
