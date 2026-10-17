package ll4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f196524a;

    public l(List options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f196524a = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f196524a, ((l) obj2).f196524a);
    }

    public final int hashCode() {
        return this.f196524a.hashCode();
    }
}
