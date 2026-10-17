package ovb;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.store.core.api.model.StoreProductVariantValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f230013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b f230014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f230015c;
    public final StoreProductVariantValue d;
    public final String e;
    public final Address f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f230016g;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data data, com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b bVar, Integer num, StoreProductVariantValue storeProductVariantValue, String str, Address address, boolean z, int i) {
        if ((i & 1) != 0) {
            data = eVar.f230013a;
        }
        Data product = data;
        if ((i & 2) != 0) {
            bVar = eVar.f230014b;
        }
        com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b bVar2 = bVar;
        if ((i & 4) != 0) {
            num = eVar.f230015c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            storeProductVariantValue = eVar.d;
        }
        StoreProductVariantValue storeProductVariantValue2 = storeProductVariantValue;
        if ((i & 16) != 0) {
            str = eVar.e;
        }
        String requestId = str;
        if ((i & 32) != 0) {
            address = eVar.f;
        }
        Address address2 = address;
        if ((i & 64) != 0) {
            z = eVar.f230016g;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return new e(product, bVar2, num2, storeProductVariantValue2, requestId, address2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f230013a, eVar.f230013a) && Intrinsics.f(this.f230014b, eVar.f230014b) && Intrinsics.f(this.f230015c, eVar.f230015c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && this.f230016g == eVar.f230016g;
    }

    public final int hashCode() {
        int iHashCode = this.f230013a.hashCode() * 31;
        com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b bVar = this.f230014b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num = this.f230015c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        StoreProductVariantValue storeProductVariantValue = this.d;
        int iC = p.a.c((iHashCode3 + (storeProductVariantValue == null ? 0 : storeProductVariantValue.hashCode())) * 31, 31, this.e);
        Address address = this.f;
        return Boolean.hashCode(this.f230016g) + ((iC + (address != null ? address.hashCode() : 0)) * 31);
    }

    public e(Data product, com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b bVar, Integer num, StoreProductVariantValue storeProductVariantValue, String requestId, Address address, boolean z) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f230013a = product;
        this.f230014b = bVar;
        this.f230015c = num;
        this.d = storeProductVariantValue;
        this.e = requestId;
        this.f = address;
        this.f230016g = z;
    }

    public /* synthetic */ e(int i) {
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this(data, null, null, null, "", null, false);
    }
}
