package jeg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173389a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f173389a, ((d) obj2).f173389a);
    }

    public final int hashCode() {
        return this.f173389a.hashCode();
    }

    public d(List amenities) {
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        this.f173389a = amenities;
    }

    public d(int i) {
        this(f0.f322471a);
    }
}
