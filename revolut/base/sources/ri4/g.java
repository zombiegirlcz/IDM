package ri4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f254541a;

    public g(it3.d nextPluginCreditApplicationStatus) {
        Intrinsics.checkNotNullParameter(nextPluginCreditApplicationStatus, "nextPluginCreditApplicationStatus");
        this.f254541a = nextPluginCreditApplicationStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f254541a, ((g) obj2).f254541a);
    }

    public final int hashCode() {
        return this.f254541a.hashCode();
    }
}
