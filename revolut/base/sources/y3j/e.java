package y3j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310749a;

    public e(String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.f310749a = newValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f310749a, ((e) obj2).f310749a);
    }

    public final int hashCode() {
        return this.f310749a.hashCode();
    }
}
