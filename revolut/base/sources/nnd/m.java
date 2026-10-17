package nnd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f217568a;

    public m(Set selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f217568a = selection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f217568a, ((m) obj2).f217568a);
    }

    public final int hashCode() {
        return this.f217568a.hashCode();
    }
}
