package pd7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235114a;

    public b(String str) {
        this.f235114a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f235114a, ((b) obj2).f235114a);
    }

    public final int hashCode() {
        String str = this.f235114a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
