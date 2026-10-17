package mm0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207113a;

    public l(aim.e list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f207113a = list;
    }

    public final List a() {
        return this.f207113a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f207113a, ((l) obj2).f207113a);
    }

    public final int hashCode() {
        return this.f207113a.hashCode();
    }
}
