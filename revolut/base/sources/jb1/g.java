package jb1;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f172550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f172551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f172552c;
    public final PaymentMethod d;
    public final h e;
    public final int f;

    public g(Data productDetailsData, Data paymentMethodsAvailableData, Data quoteData, PaymentMethod paymentMethod, h hVar, int i) {
        Intrinsics.checkNotNullParameter(productDetailsData, "productDetailsData");
        Intrinsics.checkNotNullParameter(paymentMethodsAvailableData, "paymentMethodsAvailableData");
        Intrinsics.checkNotNullParameter(quoteData, "quoteData");
        this.f172550a = productDetailsData;
        this.f172551b = paymentMethodsAvailableData;
        this.f172552c = quoteData;
        this.d = paymentMethod;
        this.e = hVar;
        this.f = i;
    }

    public static g a(g gVar, Data data, Data data2, Data data3, PaymentMethod paymentMethod, h hVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            data = gVar.f172550a;
        }
        Data productDetailsData = data;
        if ((i2 & 2) != 0) {
            data2 = gVar.f172551b;
        }
        Data paymentMethodsAvailableData = data2;
        if ((i2 & 4) != 0) {
            data3 = gVar.f172552c;
        }
        Data quoteData = data3;
        if ((i2 & 8) != 0) {
            paymentMethod = gVar.d;
        }
        PaymentMethod paymentMethod2 = paymentMethod;
        if ((i2 & 16) != 0) {
            hVar = gVar.e;
        }
        h hVar2 = hVar;
        if ((i2 & 32) != 0) {
            i = gVar.f;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(productDetailsData, "productDetailsData");
        Intrinsics.checkNotNullParameter(paymentMethodsAvailableData, "paymentMethodsAvailableData");
        Intrinsics.checkNotNullParameter(quoteData, "quoteData");
        return new g(productDetailsData, paymentMethodsAvailableData, quoteData, paymentMethod2, hVar2, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f172550a, gVar.f172550a) && Intrinsics.f(this.f172551b, gVar.f172551b) && Intrinsics.f(this.f172552c, gVar.f172552c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f172552c, kii.e.c(this.f172551b, this.f172550a.hashCode() * 31, 31), 31);
        PaymentMethod paymentMethod = this.d;
        int iHashCode = (iC + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        h hVar = this.e;
        return Integer.hashCode(this.f) + ((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31);
    }
}
