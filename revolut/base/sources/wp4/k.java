package wp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299071a;

    public k(String str) {
        this.f299071a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f299071a, ((k) obj2).f299071a);
    }

    public final int hashCode() {
        String str = this.f299071a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
