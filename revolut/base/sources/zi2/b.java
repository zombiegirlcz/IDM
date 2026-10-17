package zi2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322496a;

    public b(String str) {
        this.f322496a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f322496a, ((b) obj2).f322496a);
    }

    public final int hashCode() {
        String str = this.f322496a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
