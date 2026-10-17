package qt1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.c f248927a;

    public l(k71.c info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f248927a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f248927a, ((l) obj2).f248927a);
    }

    public final int hashCode() {
        return this.f248927a.f181775b.hashCode();
    }
}
