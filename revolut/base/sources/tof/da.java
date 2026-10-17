package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class da extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f272698a;

    public da(Set pocketIds) {
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        this.f272698a = pocketIds;
    }

    public final Set a() {
        return this.f272698a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof da) && Intrinsics.f(this.f272698a, ((da) obj2).f272698a);
    }

    public final int hashCode() {
        return this.f272698a.hashCode();
    }
}
