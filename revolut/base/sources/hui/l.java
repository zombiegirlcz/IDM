package hui;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155684a;

    public l(String str) {
        this.f155684a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f155684a, ((l) obj2).f155684a);
    }

    public final int hashCode() {
        String str = this.f155684a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
