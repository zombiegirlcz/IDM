package i7d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159266a;

    public c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f159266a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f159266a, ((c) obj2).f159266a);
    }

    public final int hashCode() {
        return this.f159266a.hashCode();
    }
}
