package jid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co3.a f174451a;

    public r(co3.a location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f174451a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f174451a, ((r) obj2).f174451a);
    }

    public final int hashCode() {
        return this.f174451a.hashCode();
    }
}
