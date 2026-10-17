package j4c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f171336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f171337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f171338c;
    public final Data d;

    public g(Data order, Data cardReaderPaymentFeatureStatus, Data accounts, Data vatType) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(cardReaderPaymentFeatureStatus, "cardReaderPaymentFeatureStatus");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(vatType, "vatType");
        this.f171336a = order;
        this.f171337b = cardReaderPaymentFeatureStatus;
        this.f171338c = accounts;
        this.d = vatType;
    }

    public static g a(g gVar, Data order, Data cardReaderPaymentFeatureStatus, Data accounts, Data vatType, int i) {
        if ((i & 1) != 0) {
            order = gVar.f171336a;
        }
        if ((i & 2) != 0) {
            cardReaderPaymentFeatureStatus = gVar.f171337b;
        }
        if ((i & 4) != 0) {
            accounts = gVar.f171338c;
        }
        if ((i & 8) != 0) {
            vatType = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(cardReaderPaymentFeatureStatus, "cardReaderPaymentFeatureStatus");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(vatType, "vatType");
        return new g(order, cardReaderPaymentFeatureStatus, accounts, vatType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f171336a, gVar.f171336a) && Intrinsics.f(this.f171337b, gVar.f171337b) && Intrinsics.f(this.f171338c, gVar.f171338c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f171338c, kii.e.c(this.f171337b, this.f171336a.hashCode() * 31, 31), 31);
    }
}
