package at;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8965a;

    public k(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8965a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f8965a, ((k) obj2).f8965a);
    }

    public final int hashCode() {
        return this.f8965a.hashCode();
    }
}
