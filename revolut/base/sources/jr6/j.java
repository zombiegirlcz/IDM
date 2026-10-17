package jr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177944a;

    public j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f177944a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f177944a, ((j) obj2).f177944a);
    }

    public final int hashCode() {
        return this.f177944a.hashCode();
    }
}
