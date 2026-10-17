package i7d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159270a;

    public g(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f159270a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f159270a, ((g) obj2).f159270a);
    }

    public final int hashCode() {
        return this.f159270a.hashCode();
    }
}
