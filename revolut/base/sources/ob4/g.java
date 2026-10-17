package ob4;

import kotlin.jvm.internal.Intrinsics;
import xu3.y;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f223880a;

    public g(y configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f223880a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f223880a, ((g) obj2).f223880a);
    }

    public final int hashCode() {
        return this.f223880a.hashCode();
    }
}
