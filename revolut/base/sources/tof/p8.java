package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f272995a;

    public p8(Set pocketIds) {
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        this.f272995a = pocketIds;
    }

    public final Set a() {
        return this.f272995a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p8) && Intrinsics.f(this.f272995a, ((p8) obj2).f272995a);
    }

    public final int hashCode() {
        return this.f272995a.hashCode();
    }
}
