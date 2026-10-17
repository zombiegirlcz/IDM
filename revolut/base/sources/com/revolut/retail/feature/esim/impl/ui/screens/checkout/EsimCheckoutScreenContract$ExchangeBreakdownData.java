package com.revolut.retail.feature.esim.impl.ui.screens.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ExchangeBreakdownData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimCheckoutScreenContract$ExchangeBreakdownData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimCheckoutScreenContract$ExchangeBreakdownData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f100905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimCheckoutPrice f100906b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimCheckoutScreenContract$ExchangeBreakdownData(parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), (EsimCheckoutPrice) parcel.readParcelable(EsimCheckoutScreenContract$ExchangeBreakdownData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimCheckoutScreenContract$ExchangeBreakdownData[i];
        }
    }

    public EsimCheckoutScreenContract$ExchangeBreakdownData(e eVar, EsimCheckoutPrice checkoutPrice) {
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        this.f100905a = eVar;
        this.f100906b = checkoutPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimCheckoutScreenContract$ExchangeBreakdownData)) {
            return false;
        }
        EsimCheckoutScreenContract$ExchangeBreakdownData esimCheckoutScreenContract$ExchangeBreakdownData = (EsimCheckoutScreenContract$ExchangeBreakdownData) obj2;
        return this.f100905a == esimCheckoutScreenContract$ExchangeBreakdownData.f100905a && Intrinsics.f(this.f100906b, esimCheckoutScreenContract$ExchangeBreakdownData.f100906b);
    }

    public final int hashCode() {
        e eVar = this.f100905a;
        return this.f100906b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        e eVar = this.f100905a;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        dest.writeParcelable(this.f100906b, i);
    }
}
