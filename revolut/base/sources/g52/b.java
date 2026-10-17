package g52;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.c f140607a;

    public b(k71.c info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f140607a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f140607a, ((b) obj2).f140607a);
    }

    public final int hashCode() {
        return this.f140607a.f181775b.hashCode();
    }
}
