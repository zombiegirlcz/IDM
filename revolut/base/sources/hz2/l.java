package hz2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156998a;

    public l(String str) {
        this.f156998a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f156998a, ((l) obj2).f156998a);
    }

    public final int hashCode() {
        String str = this.f156998a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
