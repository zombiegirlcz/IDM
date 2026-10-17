package xu4;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f308956a;

    public c(dj0.d overdueMoney) {
        Intrinsics.checkNotNullParameter(overdueMoney, "overdueMoney");
        this.f308956a = overdueMoney;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f308956a, ((c) obj2).f308956a);
    }

    public final int hashCode() {
        return this.f308956a.hashCode();
    }
}
