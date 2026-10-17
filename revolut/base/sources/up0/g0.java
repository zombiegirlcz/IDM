package up0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f281714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f281715b;

    public g0(b configuration, p0 transition) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f281714a = configuration;
        this.f281715b = transition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f281714a, g0Var.f281714a) && this.f281715b == g0Var.f281715b;
    }

    public final int hashCode() {
        return this.f281715b.hashCode() + (this.f281714a.hashCode() * 31);
    }
}
