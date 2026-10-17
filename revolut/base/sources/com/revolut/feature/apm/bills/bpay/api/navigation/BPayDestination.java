package com.revolut.feature.apm.bills.bpay.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/api/navigation/BPayDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BPayDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BPayDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn1.a f61187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentCounterpartyInfo f61188b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BPayDestination(pn1.a.valueOf(parcel.readString()), (PaymentCounterpartyInfo) parcel.readParcelable(BPayDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BPayDestination[i];
        }
    }

    public BPayDestination() {
        this((PaymentCounterpartyInfo) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BPayDestination)) {
            return false;
        }
        BPayDestination bPayDestination = (BPayDestination) obj2;
        return this.f61187a == bPayDestination.f61187a && Intrinsics.f(this.f61188b, bPayDestination.f61188b);
    }

    public final int hashCode() {
        int iHashCode = this.f61187a.hashCode() * 31;
        PaymentCounterpartyInfo paymentCounterpartyInfo = this.f61188b;
        return iHashCode + (paymentCounterpartyInfo == null ? 0 : paymentCounterpartyInfo.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61187a.name());
        dest.writeParcelable(this.f61188b, i);
    }

    public BPayDestination(pn1.a entryPoint, PaymentCounterpartyInfo paymentCounterpartyInfo) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f61187a = entryPoint;
        this.f61188b = paymentCounterpartyInfo;
    }

    public /* synthetic */ BPayDestination(PaymentCounterpartyInfo paymentCounterpartyInfo, int i) {
        this(pn1.a.DEFAULT, (i & 2) != 0 ? null : paymentCounterpartyInfo);
    }
}
