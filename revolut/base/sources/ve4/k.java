package ve4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy3.s f288118a;

    public k(yy3.s configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f288118a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f288118a, ((k) obj2).f288118a);
    }

    public final int hashCode() {
        return this.f288118a.hashCode();
    }
}
