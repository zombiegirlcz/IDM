package y1h;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f310381a;

    public d(Set assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f310381a = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f310381a, ((d) obj2).f310381a);
    }

    public final int hashCode() {
        return this.f310381a.hashCode();
    }
}
