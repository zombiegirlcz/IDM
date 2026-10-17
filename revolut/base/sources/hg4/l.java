package hg4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f152096a;

    public l(it3.d nextPluginCreditApplicationStatus) {
        Intrinsics.checkNotNullParameter(nextPluginCreditApplicationStatus, "nextPluginCreditApplicationStatus");
        this.f152096a = nextPluginCreditApplicationStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f152096a, ((l) obj2).f152096a);
    }

    public final int hashCode() {
        return this.f152096a.hashCode();
    }
}
