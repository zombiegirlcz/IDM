package k9e;

import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f182320a;

    public c(p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f182320a = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f182320a, ((c) obj2).f182320a);
    }

    public final int hashCode() {
        return this.f182320a.hashCode();
    }
}
