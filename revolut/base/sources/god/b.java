package god;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f145134a;

    public b(Set countryCodes) {
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        this.f145134a = countryCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f145134a, ((b) obj2).f145134a);
    }

    public final int hashCode() {
        return this.f145134a.hashCode();
    }
}
