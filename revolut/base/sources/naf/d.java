package naf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213891a;

    public d(List positions) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.f213891a = positions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f213891a, ((d) obj2).f213891a);
    }

    public final int hashCode() {
        return this.f213891a.hashCode();
    }
}
