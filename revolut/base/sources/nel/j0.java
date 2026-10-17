package nel;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214580a;

    public j0(List codes) {
        Intrinsics.checkNotNullParameter(codes, "codes");
        this.f214580a = codes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f214580a, ((j0) obj2).f214580a);
    }

    public final int hashCode() {
        return this.f214580a.hashCode();
    }
}
