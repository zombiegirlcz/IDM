package xu6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f308964a;

    public d(List fees) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f308964a = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f308964a, ((d) obj2).f308964a);
    }

    public final int hashCode() {
        return this.f308964a.hashCode();
    }
}
