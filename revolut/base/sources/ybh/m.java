package ybh;

import com.revolut.retail.trading.core.domain.PocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketInfo f312319a;

    public m(PocketInfo pocketInfo) {
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        this.f312319a = pocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f312319a, ((m) obj2).f312319a);
    }

    public final int hashCode() {
        return this.f312319a.hashCode();
    }
}
