package s4f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259852a;

    public g(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f259852a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f259852a, ((g) obj2).f259852a);
    }

    public final int hashCode() {
        return this.f259852a.hashCode();
    }
}
