package v61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286309a;

    public n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f286309a = name;
    }

    @Override // v61.o
    public final String b3() {
        return "";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f286309a, ((n) obj2).f286309a);
    }

    @Override // v61.o
    public final String getName() {
        return this.f286309a;
    }

    public final int hashCode() {
        return this.f286309a.hashCode();
    }
}
