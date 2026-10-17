package ni5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f215653a;

    public b(a attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f215653a = attributes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f215653a, ((b) obj2).f215653a);
    }

    public final int hashCode() {
        return 0;
    }
}
