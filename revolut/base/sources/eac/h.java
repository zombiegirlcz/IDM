package eac;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f124165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f124166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f124167c;
    public final Data d;
    public final Data e;
    public final boolean f;

    public h(Data promotedMerchants, Data revPointsFeatureState, Data selectedPaymentMethodData, Data selectedShippingContactData, Data biometricPaymentsSettings, boolean z) {
        Intrinsics.checkNotNullParameter(promotedMerchants, "promotedMerchants");
        Intrinsics.checkNotNullParameter(revPointsFeatureState, "revPointsFeatureState");
        Intrinsics.checkNotNullParameter(selectedPaymentMethodData, "selectedPaymentMethodData");
        Intrinsics.checkNotNullParameter(selectedShippingContactData, "selectedShippingContactData");
        Intrinsics.checkNotNullParameter(biometricPaymentsSettings, "biometricPaymentsSettings");
        this.f124165a = promotedMerchants;
        this.f124166b = revPointsFeatureState;
        this.f124167c = selectedPaymentMethodData;
        this.d = selectedShippingContactData;
        this.e = biometricPaymentsSettings;
        this.f = z;
    }

    public static h a(h hVar, Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            data = hVar.f124165a;
        }
        Data promotedMerchants = data;
        if ((i & 2) != 0) {
            data2 = hVar.f124166b;
        }
        Data revPointsFeatureState = data2;
        if ((i & 4) != 0) {
            data3 = hVar.f124167c;
        }
        Data selectedPaymentMethodData = data3;
        if ((i & 8) != 0) {
            data4 = hVar.d;
        }
        Data selectedShippingContactData = data4;
        if ((i & 16) != 0) {
            data5 = hVar.e;
        }
        Data biometricPaymentsSettings = data5;
        boolean z = hVar.f;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(promotedMerchants, "promotedMerchants");
        Intrinsics.checkNotNullParameter(revPointsFeatureState, "revPointsFeatureState");
        Intrinsics.checkNotNullParameter(selectedPaymentMethodData, "selectedPaymentMethodData");
        Intrinsics.checkNotNullParameter(selectedShippingContactData, "selectedShippingContactData");
        Intrinsics.checkNotNullParameter(biometricPaymentsSettings, "biometricPaymentsSettings");
        return new h(promotedMerchants, revPointsFeatureState, selectedPaymentMethodData, selectedShippingContactData, biometricPaymentsSettings, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f124165a, hVar.f124165a) && Intrinsics.f(this.f124166b, hVar.f124166b) && Intrinsics.f(this.f124167c, hVar.f124167c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f124167c, kii.e.c(this.f124166b, this.f124165a.hashCode() * 31, 31), 31), 31), 31);
    }
}
