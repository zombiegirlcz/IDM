package xug;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f309063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f309064b;

    public g(a type, Set selected) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f309063a = type;
        this.f309064b = selected;
    }

    public static g a(g gVar, Set selected) {
        a type = gVar.f309063a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(selected, "selected");
        return new g(type, selected);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f309063a == gVar.f309063a && Intrinsics.f(this.f309064b, gVar.f309064b);
    }

    public final int hashCode() {
        return this.f309064b.hashCode() + (this.f309063a.hashCode() * 31);
    }
}
