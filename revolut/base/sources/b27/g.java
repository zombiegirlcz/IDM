package b27;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f11912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f11913b;

    public g(LinkedHashSet availableSaleTypes, Set additionalPaymentOption) {
        Intrinsics.checkNotNullParameter(availableSaleTypes, "availableSaleTypes");
        Intrinsics.checkNotNullParameter(additionalPaymentOption, "additionalPaymentOption");
        this.f11912a = availableSaleTypes;
        this.f11913b = additionalPaymentOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f11912a.equals(gVar.f11912a) && this.f11913b.equals(gVar.f11913b);
    }

    public final int hashCode() {
        return this.f11913b.hashCode() + (this.f11912a.hashCode() * 31);
    }
}
