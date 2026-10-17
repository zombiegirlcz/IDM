package fm5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f136024a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f136024a, ((d) obj2).f136024a);
    }

    public final int hashCode() {
        Boolean bool = this.f136024a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public d(Boolean bool) {
        this.f136024a = bool;
    }
}
