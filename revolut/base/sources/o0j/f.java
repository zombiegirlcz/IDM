package o0j;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f221233a;

    public f(Set set) {
        this.f221233a = set;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f221233a, ((f) obj2).f221233a);
    }

    public final int hashCode() {
        Set set = this.f221233a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }
}
