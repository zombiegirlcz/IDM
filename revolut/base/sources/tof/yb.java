package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class yb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f273185a;

    public yb(Set types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.f273185a = types;
    }

    public final Set a() {
        return this.f273185a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof yb) && Intrinsics.f(this.f273185a, ((yb) obj2).f273185a);
    }

    public final int hashCode() {
        return this.f273185a.hashCode();
    }
}
