package k0h;

import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f180047a;

    public e(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f180047a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f180047a, ((e) obj2).f180047a);
    }

    public final int hashCode() {
        return this.f180047a.hashCode() * 31;
    }
}
