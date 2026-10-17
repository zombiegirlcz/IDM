package adg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3344a;

    public g(List roomsList) {
        Intrinsics.checkNotNullParameter(roomsList, "roomsList");
        this.f3344a = roomsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f3344a, ((g) obj2).f3344a);
    }

    public final int hashCode() {
        return this.f3344a.hashCode();
    }
}
