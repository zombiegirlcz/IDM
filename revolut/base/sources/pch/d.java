package pch;

import aii.r;
import com.revolut.retail.trading.core.domain.PocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketInfo f234911a;

    public d(PocketInfo selectedPocket) {
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        this.f234911a = selectedPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f234911a, ((d) obj2).f234911a);
    }

    public final int hashCode() {
        return this.f234911a.hashCode();
    }
}
