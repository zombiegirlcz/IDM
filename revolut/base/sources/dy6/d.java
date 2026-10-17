package dy6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f121065b;

    public d(Set paymentMethods) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.f121065b = paymentMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f121065b, ((d) obj2).f121065b);
    }

    public final int hashCode() {
        return this.f121065b.hashCode();
    }
}
