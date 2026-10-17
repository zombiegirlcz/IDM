package tk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co3.a f271836a;

    public c(co3.a location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f271836a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f271836a, ((c) obj2).f271836a);
    }

    public final int hashCode() {
        return this.f271836a.hashCode();
    }
}
