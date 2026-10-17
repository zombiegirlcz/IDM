package e9d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123957a;

    public m(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f123957a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f123957a, ((m) obj2).f123957a);
    }

    public final int hashCode() {
        return this.f123957a.hashCode();
    }
}
