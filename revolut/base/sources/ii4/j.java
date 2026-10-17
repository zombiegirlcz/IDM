package ii4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f161531a;

    public j(it3.d creditApplicationPluginStatus) {
        Intrinsics.checkNotNullParameter(creditApplicationPluginStatus, "creditApplicationPluginStatus");
        this.f161531a = creditApplicationPluginStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f161531a, ((j) obj2).f161531a);
    }

    public final int hashCode() {
        return this.f161531a.hashCode();
    }
}
