package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ea implements ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da f209681a;

    public ea(da mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f209681a = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ea) && Intrinsics.f(this.f209681a, ((ea) obj2).f209681a);
    }

    public final int hashCode() {
        return this.f209681a.hashCode();
    }
}
