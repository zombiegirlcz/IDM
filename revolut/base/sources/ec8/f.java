package ec8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f124460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f124461c;
    public final List d;

    public f(List activeAllowances, List pausedAllowances, List failedAllowancesCreatedByCoparent, List failedAllowances) {
        Intrinsics.checkNotNullParameter(activeAllowances, "activeAllowances");
        Intrinsics.checkNotNullParameter(pausedAllowances, "pausedAllowances");
        Intrinsics.checkNotNullParameter(failedAllowancesCreatedByCoparent, "failedAllowancesCreatedByCoparent");
        Intrinsics.checkNotNullParameter(failedAllowances, "failedAllowances");
        this.f124459a = activeAllowances;
        this.f124460b = pausedAllowances;
        this.f124461c = failedAllowancesCreatedByCoparent;
        this.d = failedAllowances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f124459a, fVar.f124459a) && Intrinsics.f(this.f124460b, fVar.f124460b) && Intrinsics.f(this.f124461c, fVar.f124461c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f124459a.hashCode() * 31, 31, this.f124460b), 31, this.f124461c);
    }
}
