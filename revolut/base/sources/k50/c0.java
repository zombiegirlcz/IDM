package k50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f181037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo0.e f181038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f181039c;

    public c0(UUID id10, xo0.e source, e0 type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f181037a = id10;
        this.f181038b = source;
        this.f181039c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f181037a, c0Var.f181037a) && this.f181038b == c0Var.f181038b && this.f181039c == c0Var.f181039c;
    }

    public final int hashCode() {
        return this.f181039c.hashCode() + ((this.f181038b.hashCode() + (this.f181037a.hashCode() * 31)) * 31);
    }
}
