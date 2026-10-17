package ku1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189616a;

    public k(String str) {
        this.f189616a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f189616a, ((k) obj2).f189616a);
    }

    public final int hashCode() {
        String str = this.f189616a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
