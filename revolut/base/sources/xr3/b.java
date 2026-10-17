package xr3;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f308204a;

    public b(Set values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f308204a = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f308204a, ((b) obj2).f308204a);
    }

    public final int hashCode() {
        return this.f308204a.hashCode();
    }
}
