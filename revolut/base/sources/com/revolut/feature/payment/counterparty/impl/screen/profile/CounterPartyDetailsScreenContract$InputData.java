package com.revolut.feature.payment.counterparty.impl.screen.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payment/counterparty/impl/screen/profile/CounterPartyDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CounterPartyDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CounterPartyDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79049a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CounterPartyDetailsScreenContract$InputData(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CounterPartyDetailsScreenContract$InputData[i];
        }
    }

    public CounterPartyDetailsScreenContract$InputData(String paymentCounterPartyId) {
        Intrinsics.checkNotNullParameter(paymentCounterPartyId, "paymentCounterPartyId");
        this.f79049a = paymentCounterPartyId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CounterPartyDetailsScreenContract$InputData) && Intrinsics.f(this.f79049a, ((CounterPartyDetailsScreenContract$InputData) obj2).f79049a);
    }

    public final int hashCode() {
        return this.f79049a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79049a);
    }
}
