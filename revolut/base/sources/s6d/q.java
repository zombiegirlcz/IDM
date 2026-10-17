package s6d;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6d.j f260251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f260252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f260253c;
    public final Address d;

    public q(k6d.j vendorSettings, Data brandingSettingsData, List allowedPaymentMethods, Address address) {
        Intrinsics.checkNotNullParameter(vendorSettings, "vendorSettings");
        Intrinsics.checkNotNullParameter(brandingSettingsData, "brandingSettingsData");
        Intrinsics.checkNotNullParameter(allowedPaymentMethods, "allowedPaymentMethods");
        this.f260251a = vendorSettings;
        this.f260252b = brandingSettingsData;
        this.f260253c = allowedPaymentMethods;
        this.d = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f260251a, qVar.f260251a) && Intrinsics.f(this.f260252b, qVar.f260252b) && Intrinsics.f(this.f260253c, qVar.f260253c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(kii.e.c(this.f260252b, this.f260251a.hashCode() * 31, 31), 31, this.f260253c);
        Address address = this.d;
        return iD + (address == null ? 0 : address.hashCode());
    }
}
