package b9d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13719a;

    public g(String str) {
        this.f13719a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f13719a, ((g) obj2).f13719a);
    }

    public final int hashCode() {
        String str = this.f13719a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
