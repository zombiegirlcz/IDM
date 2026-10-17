package wk2;

import com.revolut.feature.atm.api.model.Atm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Atm f298181a;

    public d0(Atm atm) {
        Intrinsics.checkNotNullParameter(atm, "atm");
        this.f298181a = atm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f298181a, ((d0) obj2).f298181a);
    }

    public final int hashCode() {
        return this.f298181a.hashCode();
    }
}
