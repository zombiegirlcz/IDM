package vrb;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f291545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f291546b;

    public a(Set selectedHoldings, boolean z) {
        Intrinsics.checkNotNullParameter(selectedHoldings, "selectedHoldings");
        this.f291545a = selectedHoldings;
        this.f291546b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f291545a, aVar.f291545a) && this.f291546b == aVar.f291546b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f291546b) + (this.f291545a.hashCode() * 31);
    }
}
