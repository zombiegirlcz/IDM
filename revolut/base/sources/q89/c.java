package q89;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f243046a;

    public c(f destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f243046a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f243046a == ((c) obj2).f243046a;
    }

    public final int hashCode() {
        return this.f243046a.hashCode();
    }
}
