package fl1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135893a;

    public j(String str) {
        this.f135893a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f135893a, ((j) obj2).f135893a);
    }

    public final int hashCode() {
        String str = this.f135893a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
