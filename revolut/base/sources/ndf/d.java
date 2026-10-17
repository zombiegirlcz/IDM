package ndf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214364a;

    public d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f214364a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f214364a, ((d) obj2).f214364a);
    }

    public final int hashCode() {
        return this.f214364a.hashCode();
    }
}
