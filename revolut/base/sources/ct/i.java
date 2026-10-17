package ct;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108555a;

    public i(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f108555a = pin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f108555a, ((i) obj2).f108555a);
    }

    public final int hashCode() {
        return this.f108555a.hashCode();
    }
}
