package wxd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f300858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f300859b;

    public f(g period, Set settings) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f300858a = period;
        this.f300859b = settings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f300858a, fVar.f300858a) && Intrinsics.f(this.f300859b, fVar.f300859b);
    }

    public final int hashCode() {
        return this.f300859b.hashCode() + (this.f300858a.hashCode() * 31);
    }
}
