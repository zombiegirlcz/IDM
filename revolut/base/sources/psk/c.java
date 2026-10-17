package psk;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CounterTextDelegate f239495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RowLoadingDelegate f239496b;

    public c(CounterTextDelegate counterTextDelegate, RowLoadingDelegate rowLoadingDelegate) {
        Intrinsics.checkNotNullParameter(counterTextDelegate, "counterTextDelegate");
        Intrinsics.checkNotNullParameter(rowLoadingDelegate, "rowLoadingDelegate");
        this.f239495a = counterTextDelegate;
        this.f239496b = rowLoadingDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f239495a, cVar.f239495a) && Intrinsics.f(this.f239496b, cVar.f239496b);
    }

    public final int hashCode() {
        return this.f239496b.hashCode() + (this.f239495a.hashCode() * 31);
    }
}
