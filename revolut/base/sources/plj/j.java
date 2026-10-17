package plj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f237426c;

    public j(List items, boolean z, f navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f237424a = items;
        this.f237425b = z;
        this.f237426c = navBarConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f237424a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f237424a, jVar.f237424a) && this.f237425b == jVar.f237425b && Intrinsics.f(this.f237426c, jVar.f237426c);
    }

    public final int hashCode() {
        return this.f237426c.hashCode() + j6.a.c(this.f237424a.hashCode() * 31, 31, this.f237425b);
    }
}
