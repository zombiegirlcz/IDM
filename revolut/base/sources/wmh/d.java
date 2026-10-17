package wmh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298670a;

    public d(List instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f298670a = instruments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f298670a, ((d) obj2).f298670a);
    }

    public final int hashCode() {
        return this.f298670a.hashCode();
    }
}
