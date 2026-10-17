package x42;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302780a;

    public f(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f302780a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f302780a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f302780a, ((f) obj2).f302780a);
    }

    public final int hashCode() {
        return this.f302780a.hashCode();
    }
}
