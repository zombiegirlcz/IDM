package w3c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f294270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f294271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f294272c;
    public final Data d;
    public final Data e;
    public final Data f;

    public e(Data cart, Data accountSections, Data selectedAccount, Data deliveryAddress, Data shopVatType, Data validDeliveryAddresses) {
        Intrinsics.checkNotNullParameter(cart, "cart");
        Intrinsics.checkNotNullParameter(accountSections, "accountSections");
        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        Intrinsics.checkNotNullParameter(shopVatType, "shopVatType");
        Intrinsics.checkNotNullParameter(validDeliveryAddresses, "validDeliveryAddresses");
        this.f294270a = cart;
        this.f294271b = accountSections;
        this.f294272c = selectedAccount;
        this.d = deliveryAddress;
        this.e = shopVatType;
        this.f = validDeliveryAddresses;
    }

    public static e a(e eVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = eVar.f294270a;
        }
        Data cart = data;
        if ((i & 2) != 0) {
            data2 = eVar.f294271b;
        }
        Data accountSections = data2;
        if ((i & 4) != 0) {
            data3 = eVar.f294272c;
        }
        Data selectedAccount = data3;
        if ((i & 8) != 0) {
            data4 = eVar.d;
        }
        Data deliveryAddress = data4;
        if ((i & 16) != 0) {
            data5 = eVar.e;
        }
        Data shopVatType = data5;
        if ((i & 32) != 0) {
            data6 = eVar.f;
        }
        Data validDeliveryAddresses = data6;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(cart, "cart");
        Intrinsics.checkNotNullParameter(accountSections, "accountSections");
        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        Intrinsics.checkNotNullParameter(shopVatType, "shopVatType");
        Intrinsics.checkNotNullParameter(validDeliveryAddresses, "validDeliveryAddresses");
        return new e(cart, accountSections, selectedAccount, deliveryAddress, shopVatType, validDeliveryAddresses);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f294270a, eVar.f294270a) && Intrinsics.f(this.f294271b, eVar.f294271b) && Intrinsics.f(this.f294272c, eVar.f294272c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f294272c, kii.e.c(this.f294271b, this.f294270a.hashCode() * 31, 31), 31), 31), 31);
    }
}
