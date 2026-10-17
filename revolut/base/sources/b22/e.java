package b22;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11857a;

    public e(List files) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.f11857a = files;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f11857a, ((e) obj2).f11857a);
    }

    public final int hashCode() {
        return this.f11857a.hashCode();
    }

    public e() {
        this(f0.f322471a);
    }
}
