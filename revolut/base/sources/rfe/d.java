package rfe;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f253762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f253763b;

    public d(Set excludedSubSpaces, Set excludedSources) {
        Intrinsics.checkNotNullParameter(excludedSubSpaces, "excludedSubSpaces");
        Intrinsics.checkNotNullParameter(excludedSources, "excludedSources");
        this.f253762a = excludedSubSpaces;
        this.f253763b = excludedSources;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f253762a, dVar.f253762a) && Intrinsics.f(this.f253763b, dVar.f253763b);
    }

    public final int hashCode() {
        return this.f253763b.hashCode() + (this.f253762a.hashCode() * 31);
    }
}
