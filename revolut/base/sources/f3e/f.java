package f3e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f131968a;

    public f(c location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f131968a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f131968a, ((f) obj2).f131968a);
    }

    public final int hashCode() {
        return this.f131968a.hashCode();
    }
}
