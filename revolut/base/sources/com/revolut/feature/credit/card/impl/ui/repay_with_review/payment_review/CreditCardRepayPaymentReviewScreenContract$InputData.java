package com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardRepayPaymentReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardRepayPaymentReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69615b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardRepayPaymentReviewScreenContract$InputData((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardRepayPaymentReviewScreenContract$InputData[i];
        }
    }

    public CreditCardRepayPaymentReviewScreenContract$InputData(d moneyToRepay, String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(moneyToRepay, "moneyToRepay");
        this.f69614a = facilityId;
        this.f69615b = moneyToRepay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardRepayPaymentReviewScreenContract$InputData)) {
            return false;
        }
        CreditCardRepayPaymentReviewScreenContract$InputData creditCardRepayPaymentReviewScreenContract$InputData = (CreditCardRepayPaymentReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69614a, creditCardRepayPaymentReviewScreenContract$InputData.f69614a) && Intrinsics.f(this.f69615b, creditCardRepayPaymentReviewScreenContract$InputData.f69615b);
    }

    public final int hashCode() {
        return this.f69615b.hashCode() + (this.f69614a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69614a);
        dest.writeSerializable(this.f69615b);
    }
}
