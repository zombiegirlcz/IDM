package e94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f123909a;

    public j(it3.d nextPluginStatus) {
        Intrinsics.checkNotNullParameter(nextPluginStatus, "nextPluginStatus");
        this.f123909a = nextPluginStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f123909a, ((j) obj2).f123909a);
    }

    public final int hashCode() {
        return this.f123909a.hashCode();
    }
}
