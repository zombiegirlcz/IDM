package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150148a;

    public j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f150148a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f150148a, ((j) obj2).f150148a);
    }

    public final int hashCode() {
        return this.f150148a.hashCode();
    }
}
