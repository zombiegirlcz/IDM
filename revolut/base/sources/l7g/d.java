package l7g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192597a;

    public d(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f192597a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f192597a, ((d) obj2).f192597a);
    }

    public final int hashCode() {
        return this.f192597a.hashCode();
    }
}
