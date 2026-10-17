package com.revolut.feature.bank_account_switching.impl.ui.payments_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wn2.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/payments_review/BankAccountSwitchingPaymentsReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankAccountSwitchingPaymentsReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BankAccountSwitchingPaymentsReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn2.a f63952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f63953c;
    public final BankInformation d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccountSwitchingPaymentsReviewScreenContract$InputData(parcel.readString(), mn2.a.valueOf(parcel.readString()), d.valueOf(parcel.readString()), BankInformation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankAccountSwitchingPaymentsReviewScreenContract$InputData[i];
        }
    }

    public BankAccountSwitchingPaymentsReviewScreenContract$InputData(String requestId, mn2.a serviceType, d switchPreference, BankInformation fromBank) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
        Intrinsics.checkNotNullParameter(fromBank, "fromBank");
        this.f63951a = requestId;
        this.f63952b = serviceType;
        this.f63953c = switchPreference;
        this.d = fromBank;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankAccountSwitchingPaymentsReviewScreenContract$InputData)) {
            return false;
        }
        BankAccountSwitchingPaymentsReviewScreenContract$InputData bankAccountSwitchingPaymentsReviewScreenContract$InputData = (BankAccountSwitchingPaymentsReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f63951a, bankAccountSwitchingPaymentsReviewScreenContract$InputData.f63951a) && this.f63952b == bankAccountSwitchingPaymentsReviewScreenContract$InputData.f63952b && this.f63953c == bankAccountSwitchingPaymentsReviewScreenContract$InputData.f63953c && Intrinsics.f(this.d, bankAccountSwitchingPaymentsReviewScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f63953c.hashCode() + ((this.f63952b.hashCode() + (this.f63951a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63951a);
        dest.writeString(this.f63952b.name());
        dest.writeString(this.f63953c.name());
        this.d.writeToParcel(dest, i);
    }
}
