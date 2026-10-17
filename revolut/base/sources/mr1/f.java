package mr1;

import aii.r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f208042a;

    public f(Map values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f208042a = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f208042a, ((f) obj2).f208042a);
    }

    public final int hashCode() {
        return this.f208042a.hashCode();
    }
}
