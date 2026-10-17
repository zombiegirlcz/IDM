package ill;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162263a;

    public b(List challenges) {
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        this.f162263a = challenges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f162263a, ((b) obj2).f162263a);
    }

    public final int hashCode() {
        return this.f162263a.hashCode();
    }
}
