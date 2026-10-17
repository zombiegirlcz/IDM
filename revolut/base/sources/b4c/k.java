package b4c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f12266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f12267c;
    public final Data d;
    public final Data e;
    public final Data f;

    public k(long j2, Data products, Data cardReaderPaymentFeatureStatus, Data ticketsWidgetState, Data vatType, Data isCardReaderSettingsAllowed) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(cardReaderPaymentFeatureStatus, "cardReaderPaymentFeatureStatus");
        Intrinsics.checkNotNullParameter(ticketsWidgetState, "ticketsWidgetState");
        Intrinsics.checkNotNullParameter(vatType, "vatType");
        Intrinsics.checkNotNullParameter(isCardReaderSettingsAllowed, "isCardReaderSettingsAllowed");
        this.f12265a = j2;
        this.f12266b = products;
        this.f12267c = cardReaderPaymentFeatureStatus;
        this.d = ticketsWidgetState;
        this.e = vatType;
        this.f = isCardReaderSettingsAllowed;
    }

    public static k a(k kVar, long j2, Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            j2 = kVar.f12265a;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            data = kVar.f12266b;
        }
        Data products = data;
        if ((i & 4) != 0) {
            data2 = kVar.f12267c;
        }
        Data cardReaderPaymentFeatureStatus = data2;
        if ((i & 8) != 0) {
            data3 = kVar.d;
        }
        Data ticketsWidgetState = data3;
        if ((i & 16) != 0) {
            data4 = kVar.e;
        }
        Data vatType = data4;
        if ((i & 32) != 0) {
            data5 = kVar.f;
        }
        Data isCardReaderSettingsAllowed = data5;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(cardReaderPaymentFeatureStatus, "cardReaderPaymentFeatureStatus");
        Intrinsics.checkNotNullParameter(ticketsWidgetState, "ticketsWidgetState");
        Intrinsics.checkNotNullParameter(vatType, "vatType");
        Intrinsics.checkNotNullParameter(isCardReaderSettingsAllowed, "isCardReaderSettingsAllowed");
        return new k(j3, products, cardReaderPaymentFeatureStatus, ticketsWidgetState, vatType, isCardReaderSettingsAllowed);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f12265a == kVar.f12265a && Intrinsics.f(this.f12266b, kVar.f12266b) && Intrinsics.f(this.f12267c, kVar.f12267c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f12267c, kii.e.c(this.f12266b, Long.hashCode(this.f12265a) * 31, 31), 31), 31), 31);
    }
}
