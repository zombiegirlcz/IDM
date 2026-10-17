package nnd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f217525a;

    public b(Set selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f217525a = selection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f217525a, ((b) obj2).f217525a);
    }

    public final int hashCode() {
        return this.f217525a.hashCode();
    }
}
