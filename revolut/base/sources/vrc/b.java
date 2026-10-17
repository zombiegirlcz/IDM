package vrc;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f291569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291570b;

    public b(UUID id10, String entityName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(entityName, "entityName");
        this.f291569a = id10;
        this.f291570b = entityName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f291569a, bVar.f291569a) && Intrinsics.f(this.f291570b, bVar.f291570b);
    }

    public final int hashCode() {
        return this.f291570b.hashCode() + (this.f291569a.hashCode() * 31);
    }
}
