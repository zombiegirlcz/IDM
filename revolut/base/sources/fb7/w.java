package fb7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133499a;

    public w(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f133499a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f133499a, ((w) obj2).f133499a);
    }

    public final int hashCode() {
        return this.f133499a.hashCode();
    }
}
