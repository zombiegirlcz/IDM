package rfe;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f253768a;

    public h(Set identifiers) {
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        this.f253768a = identifiers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f253768a, ((h) obj2).f253768a);
    }

    public final int hashCode() {
        return this.f253768a.hashCode();
    }
}
