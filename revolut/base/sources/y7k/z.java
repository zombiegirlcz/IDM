package y7k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f311584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f311585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f311586c;

    public z(List items, t navBarConfig, q qVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f311584a = items;
        this.f311585b = navBarConfig;
        this.f311586c = qVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f311584a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f311584a, zVar.f311584a) && Intrinsics.f(this.f311585b, zVar.f311585b) && Intrinsics.f(this.f311586c, zVar.f311586c);
    }

    public final int hashCode() {
        int iHashCode = (this.f311585b.hashCode() + (this.f311584a.hashCode() * 31)) * 31;
        q qVar = this.f311586c;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }
}
