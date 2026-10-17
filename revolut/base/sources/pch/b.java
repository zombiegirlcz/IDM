package pch;

import com.revolut.retail.trading.core.domain.PocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketInfo f234909a;

    public b(PocketInfo pocketInfo) {
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        this.f234909a = pocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f234909a, ((b) obj2).f234909a);
    }

    public final int hashCode() {
        return this.f234909a.hashCode();
    }
}
