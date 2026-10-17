package d4c;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f111272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f111273b;

    public e(Data addressList, Address selectedAddress) {
        Intrinsics.checkNotNullParameter(addressList, "addressList");
        Intrinsics.checkNotNullParameter(selectedAddress, "selectedAddress");
        this.f111272a = addressList;
        this.f111273b = selectedAddress;
    }

    public static e a(e eVar, Data addressList, Address selectedAddress, int i) {
        if ((i & 1) != 0) {
            addressList = eVar.f111272a;
        }
        if ((i & 2) != 0) {
            selectedAddress = eVar.f111273b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(addressList, "addressList");
        Intrinsics.checkNotNullParameter(selectedAddress, "selectedAddress");
        return new e(addressList, selectedAddress);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f111272a, eVar.f111272a) && Intrinsics.f(this.f111273b, eVar.f111273b);
    }

    public final int hashCode() {
        return this.f111273b.hashCode() + (this.f111272a.hashCode() * 31);
    }
}
