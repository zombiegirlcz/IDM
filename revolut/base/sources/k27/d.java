package k27;

import cli.j;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f180398a;

    public d(Set paymentOptions) {
        Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
        this.f180398a = paymentOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f180398a, ((d) obj2).f180398a);
    }

    public final int hashCode() {
        return this.f180398a.hashCode();
    }
}
