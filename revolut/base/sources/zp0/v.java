package zp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324148a;

    public v(String str) {
        Intrinsics.checkNotNullParameter("", "minDateErrorLocalization");
        Intrinsics.checkNotNullParameter("", "maxDateErrorLocalization");
        this.f324148a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f324148a, ((v) obj2).f324148a);
    }

    public final int hashCode() {
        String str = this.f324148a;
        return (str == null ? 0 : str.hashCode()) * 961;
    }
}
