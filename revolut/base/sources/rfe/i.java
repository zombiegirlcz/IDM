package rfe;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f253769a;

    public i(Set identifiers) {
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        this.f253769a = identifiers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f253769a, ((i) obj2).f253769a);
    }

    public final int hashCode() {
        return this.f253769a.hashCode();
    }
}
