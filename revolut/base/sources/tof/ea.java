package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ea extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f272739a;

    public ea(Set values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f272739a = values;
    }

    public final Set a() {
        return this.f272739a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ea) && Intrinsics.f(this.f272739a, ((ea) obj2).f272739a);
    }

    public final int hashCode() {
        return this.f272739a.hashCode();
    }
}
