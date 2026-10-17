package com.revolut.feature.apm.bills.bpay.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/api/navigation/BPayEditRecurringDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BPayEditRecurringDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BPayEditRecurringDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn1.a f61189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentCounterpartyInfo f61190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f61191c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BPayEditRecurringDestination(pn1.a.valueOf(parcel.readString()), (PaymentCounterpartyInfo) parcel.readParcelable(BPayEditRecurringDestination.class.getClassLoader()), (p) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BPayEditRecurringDestination[i];
        }
    }

    public BPayEditRecurringDestination(pn1.a entryPoint, PaymentCounterpartyInfo counterparty, p recurringPayment) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(counterparty, "counterparty");
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f61189a = entryPoint;
        this.f61190b = counterparty;
        this.f61191c = recurringPayment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BPayEditRecurringDestination)) {
            return false;
        }
        BPayEditRecurringDestination bPayEditRecurringDestination = (BPayEditRecurringDestination) obj2;
        return this.f61189a == bPayEditRecurringDestination.f61189a && Intrinsics.f(this.f61190b, bPayEditRecurringDestination.f61190b) && Intrinsics.f(this.f61191c, bPayEditRecurringDestination.f61191c);
    }

    public final int hashCode() {
        return this.f61191c.hashCode() + ((this.f61190b.hashCode() + (this.f61189a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61189a.name());
        dest.writeParcelable(this.f61190b, i);
        dest.writeSerializable(this.f61191c);
    }
}
