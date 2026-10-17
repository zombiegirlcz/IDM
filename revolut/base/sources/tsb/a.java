package tsb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f274059a;

    public a(dj0.d maximum) {
        Intrinsics.checkNotNullParameter(maximum, "maximum");
        this.f274059a = maximum;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f274059a, ((a) obj2).f274059a);
    }

    public final int hashCode() {
        return this.f274059a.hashCode();
    }
}
