package vi1;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289518a;

    public s(String streetTypeName) {
        Intrinsics.checkNotNullParameter(streetTypeName, "streetTypeName");
        this.f289518a = streetTypeName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f289518a, ((s) obj2).f289518a);
    }

    public final int hashCode() {
        return this.f289518a.hashCode();
    }
}
