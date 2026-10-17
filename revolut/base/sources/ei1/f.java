package ei1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126346a;

    public f(String str) {
        this.f126346a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f126346a, ((f) obj2).f126346a);
    }

    public final int hashCode() {
        String str = this.f126346a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
