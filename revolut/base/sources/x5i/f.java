package x5i;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302987a;

    public f(List bottomDisclaimer) {
        Intrinsics.checkNotNullParameter(bottomDisclaimer, "bottomDisclaimer");
        this.f302987a = bottomDisclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f302987a, ((f) obj2).f302987a);
    }

    public final int hashCode() {
        return this.f302987a.hashCode();
    }
}
