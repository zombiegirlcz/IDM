package y5g;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f311082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f311083b;

    public i(a navBarModel, aim.e items) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f311082a = navBarModel;
        this.f311083b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f311083b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f311082a, iVar.f311082a) && Intrinsics.f(this.f311083b, iVar.f311083b);
    }

    public final int hashCode() {
        return this.f311083b.hashCode() + (this.f311082a.f311076a.hashCode() * 31);
    }
}
