package xvf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309247a;

    public c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f309247a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f309247a, ((c) obj2).f309247a);
    }

    public final int hashCode() {
        return this.f309247a.hashCode();
    }
}
