package uk2;

import com.revolut.feature.atm.api.model.Atm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Atm f280653a;

    public j(Atm atm) {
        Intrinsics.checkNotNullParameter(atm, "atm");
        this.f280653a = atm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f280653a, ((j) obj2).f280653a);
    }

    public final int hashCode() {
        return this.f280653a.hashCode();
    }
}
