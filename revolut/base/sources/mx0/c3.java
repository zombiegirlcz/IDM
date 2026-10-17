package mx0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209628a;

    public c3(List delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f209628a = delegates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c3) && Intrinsics.f(this.f209628a, ((c3) obj2).f209628a);
    }

    public final int hashCode() {
        return this.f209628a.hashCode();
    }
}
