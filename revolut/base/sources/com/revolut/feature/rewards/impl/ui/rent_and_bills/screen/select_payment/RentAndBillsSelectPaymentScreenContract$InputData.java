package com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rewards/impl/ui/rent_and_bills/screen/select_payment/RentAndBillsSelectPaymentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RentAndBillsSelectPaymentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RentAndBillsSelectPaymentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egc.a f84983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RentAndBillsConfigurations.Configuration f84984b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RentAndBillsSelectPaymentScreenContract$InputData(egc.a.valueOf(parcel.readString()), (RentAndBillsConfigurations.Configuration) parcel.readParcelable(RentAndBillsSelectPaymentScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RentAndBillsSelectPaymentScreenContract$InputData[i];
        }
    }

    public RentAndBillsSelectPaymentScreenContract$InputData(egc.a categoryType, RentAndBillsConfigurations.Configuration perkConfiguration) {
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        Intrinsics.checkNotNullParameter(perkConfiguration, "perkConfiguration");
        this.f84983a = categoryType;
        this.f84984b = perkConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RentAndBillsSelectPaymentScreenContract$InputData)) {
            return false;
        }
        RentAndBillsSelectPaymentScreenContract$InputData rentAndBillsSelectPaymentScreenContract$InputData = (RentAndBillsSelectPaymentScreenContract$InputData) obj2;
        return this.f84983a == rentAndBillsSelectPaymentScreenContract$InputData.f84983a && Intrinsics.f(this.f84984b, rentAndBillsSelectPaymentScreenContract$InputData.f84984b);
    }

    public final int hashCode() {
        return this.f84984b.hashCode() + (this.f84983a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84983a.name());
        dest.writeParcelable(this.f84984b, i);
    }
}
