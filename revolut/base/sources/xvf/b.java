package xvf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309246a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f309246a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f309246a, ((b) obj2).f309246a);
    }

    public final int hashCode() {
        return this.f309246a.hashCode();
    }
}
