package bs8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18083a;

    public d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f18083a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f18083a, ((d) obj2).f18083a);
    }

    public final int hashCode() {
        return this.f18083a.hashCode();
    }
}
