package rbh;

import com.revolut.retail.trading.core.domain.PocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketInfo f253068a;

    public f(PocketInfo pocketInfo) {
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        this.f253068a = pocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f253068a, ((f) obj2).f253068a);
    }

    public final int hashCode() {
        return this.f253068a.hashCode();
    }
}
