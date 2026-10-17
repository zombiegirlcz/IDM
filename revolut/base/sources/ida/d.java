package ida;

import io3.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f160458a;

    public d(g pocketBalance) {
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        this.f160458a = pocketBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f160458a, ((d) obj2).f160458a);
    }

    public final int hashCode() {
        return this.f160458a.hashCode();
    }
}
