package wk2;

import com.revolut.feature.atm.api.model.Atm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Atm f298229a;

    public z(Atm atm) {
        Intrinsics.checkNotNullParameter(atm, "atm");
        this.f298229a = atm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f298229a, ((z) obj2).f298229a);
    }

    public final int hashCode() {
        return this.f298229a.hashCode();
    }
}
