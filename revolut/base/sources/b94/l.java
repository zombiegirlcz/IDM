package b94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f13652a;

    public l(it3.d nextPluginStatus) {
        Intrinsics.checkNotNullParameter(nextPluginStatus, "nextPluginStatus");
        this.f13652a = nextPluginStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f13652a, ((l) obj2).f13652a);
    }

    public final int hashCode() {
        return this.f13652a.hashCode();
    }
}
