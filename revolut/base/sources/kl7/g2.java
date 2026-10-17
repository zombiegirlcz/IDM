package kl7;

import com.revolut.feature.address.models.Address;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f185325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f185326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2 f185327c;

    public g2(LocalDate activateBy, Address deliveryAddress, f2 trackingNumber) {
        Intrinsics.checkNotNullParameter(activateBy, "activateBy");
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        Intrinsics.checkNotNullParameter(trackingNumber, "trackingNumber");
        this.f185325a = activateBy;
        this.f185326b = deliveryAddress;
        this.f185327c = trackingNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj2;
        return Intrinsics.f(this.f185325a, g2Var.f185325a) && Intrinsics.f(this.f185326b, g2Var.f185326b) && Intrinsics.f(this.f185327c, g2Var.f185327c);
    }

    public final int hashCode() {
        return this.f185327c.hashCode() + ((this.f185326b.hashCode() + (this.f185325a.hashCode() * 31)) * 31);
    }
}
