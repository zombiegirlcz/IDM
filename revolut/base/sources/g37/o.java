package g37;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f140223a;

    public o(Set allowedTaxTypes) {
        Intrinsics.checkNotNullParameter(allowedTaxTypes, "allowedTaxTypes");
        this.f140223a = allowedTaxTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f140223a, ((o) obj2).f140223a);
    }

    public final int hashCode() {
        return this.f140223a.hashCode();
    }
}
