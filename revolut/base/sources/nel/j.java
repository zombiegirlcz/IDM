package nel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements Serializable {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214579b;

    public j(String value, String origin) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f214578a = value;
        this.f214579b = origin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f214578a, jVar.f214578a) && Intrinsics.f(this.f214579b, jVar.f214579b);
    }

    public final int hashCode() {
        return this.f214579b.hashCode() + (this.f214578a.hashCode() * 31);
    }
}
