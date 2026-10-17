package chj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24265a;

    public k(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24265a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f24265a, ((k) obj2).f24265a);
    }

    public final int hashCode() {
        return this.f24265a.hashCode();
    }
}
