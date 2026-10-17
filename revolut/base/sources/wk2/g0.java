package wk2;

import com.revolut.feature.atm.api.model.Atm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Atm f298187a;

    public g0(Atm atm) {
        Intrinsics.checkNotNullParameter(atm, "atm");
        this.f298187a = atm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f298187a, ((g0) obj2).f298187a);
    }

    public final int hashCode() {
        return this.f298187a.hashCode();
    }
}
