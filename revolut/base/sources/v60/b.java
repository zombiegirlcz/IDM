package v60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements d {
    public b() {
        Intrinsics.checkNotNullParameter("error.generic", "resKey");
    }

    @Override // v60.d
    public final String a() {
        return "error.generic";
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof b);
    }

    public final int hashCode() {
        return 1822778353;
    }
}
